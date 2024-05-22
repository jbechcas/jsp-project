package transactions;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import crud.CRUD;

public class TransactionService implements CRUD<Transaction> {
    private Connection conn;

    public TransactionService(Connection conn) {
        this.conn = conn;
    }

    @Override
    public ArrayList<Transaction> query(String column, String value) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'query'");
    }

    @Override
    public ArrayList<Transaction> query(String column, long value) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'query'");
    }

    @Override
    public ArrayList<Transaction> requestAll(String sortedBy) throws SQLException {
         //Creamos el array que vamos a devolver
        ArrayList<Transaction> result = new ArrayList<Transaction>();
        //Construimos la consulta a realizar
        Statement statement = this.conn.createStatement();   
        String sql = String.format("SELECT * FROM transacciones ORDER BY %s",sortedBy);
        // Ejectuamos la consulta
        ResultSet querySet = statement.executeQuery(sql);
        // Recorremos cada uno de los registro devueltos por la consulta
        while(querySet.next()) {
            //Obtenemos los datos del Individuo
            long idTransaccion = querySet.getLong("id");
            long idCuenta = querySet.getLong("idCuentaOrigen");
            String tipo = querySet.getString("tipo");
            double cantidad = querySet.getDouble("cantidad");
            Date date = querySet.getDate("fecha");
            result.add(new Transaction(idTransaccion,idCuenta, tipo, cantidad, date));
        } 
        //Cerramos la consulta
        statement.close();

        //Devolvemos el array de individuoes
        return result;
    }

    @Override
    public Transaction requestById(long id) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'requestById'");
    }

    @Override
    public long create(Transaction model) throws SQLException {
    String tipo = model.getTipo();
    long idCuentaOrigen = model.getIdCuentaOrigen();
    double cantidad = model.getCantidad();

    String sql = "INSERT INTO transacciones(tipo, idCuentaOrigen, cantidad) VALUES (?, ?, ?)";
    
    try (PreparedStatement statement = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
        statement.setString(1, tipo);
        statement.setLong(2, idCuentaOrigen);
        statement.setDouble(3, cantidad);

        int affectedRows = statement.executeUpdate();

        if (affectedRows == 0) {
            throw new SQLException("Creating transaction failed, no rows affected.");
        }

        try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                return generatedKeys.getLong(1);
            } else {
                throw new SQLException("Creating transaction failed, no ID obtained.");
            }
        }
    }
}

@Override
public int update(Transaction object) throws SQLException {
    String sql = "UPDATE transacciones SET tipo=?, idCuentaOrigen=?, cantidad=? WHERE id=?";
    try (PreparedStatement statement = this.conn.prepareStatement(sql)) {
        statement.setString(1, object.getTipo());
        statement.setLong(2, object.getIdCuentaOrigen());
        statement.setDouble(3, object.getCantidad());
        statement.setLong(4, object.getIdTransaccion());

        // Debugging: Print values being set
        System.out.println("Executing update with values:");
        System.out.println("tipo: " + object.getTipo());
        System.out.println("idCuentaOrigen: " + object.getIdCuentaOrigen());
        System.out.println("cantidad: " + object.getCantidad());
        System.out.println("idTransaccion: " + object.getIdTransaccion());

        int affectedRows = statement.executeUpdate();

        if (affectedRows == 0) {
            throw new SQLException("Updating transaction failed, no rows affected.");
        }
        return affectedRows;
    }
}


    @Override
    public boolean delete(long id) throws SQLException{
        Statement statement = null;
        statement = this.conn.createStatement();    
        String sql = String.format("DELETE FROM transacciones WHERE id=%d", id);
        // Ejecución de la consulta
        int result = statement.executeUpdate(sql);
        statement.close();
        return result==1;
    }
    
    
}
