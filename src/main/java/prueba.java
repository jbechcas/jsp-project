import java.sql.SQLException;
import java.util.ArrayList;

import connectionpool.ConnectionPool;
import transactions.Transaction;
import transactions.TransactionService;
import users.AuthService;
import users.User;

public class prueba {
    public static void main(String[] args) {
        String dbuser = "juan";
        //Contraseña de la base de datos
        String dbpassword = "12345678";
        //Pool de conexiones a la base de datos
        ConnectionPool pool = new ConnectionPool("jdbc:mysql://localhost:3306/banco", dbuser, dbpassword);
        TransactionService stransaction = new TransactionService(pool.getConnection());


        try {
            TransactionService transactions = new TransactionService(pool.getConnection());
            long id = 63;
            long cuenta = 2;
            String movimiento = "Ingreso";
            double cantidad = 800;
            Transaction transaction = new Transaction(63,2,"Ingreso",20000.0); 
            transactions.update(transaction);
        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
        }
        
        
    }
}
