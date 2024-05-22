package transactions;

import java.sql.Date;

public class Transaction {
    private long idTransaccion = 0;
    private long idCuentaOrigen;
    private String tipo;
    private double cantidad;
    private Date fecha;

    public Transaction(long idTransaccion,long idCuentaOrigen, String tipo, double cantidad, Date fecha) {
        this.idTransaccion = idTransaccion;
        this.idCuentaOrigen = idCuentaOrigen;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public Transaction(long idCuentaOrigen, String tipo, double cantidad) {
        this.idCuentaOrigen = idCuentaOrigen;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fecha = null;
    }

    public Transaction(long idTransaccion,long idCuentaOrigen, String tipo, double cantidad) {
        this.idTransaccion = idTransaccion;
        this.idCuentaOrigen = idCuentaOrigen;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fecha = null;
    }

    public long getIdCuentaOrigen() {
        return idCuentaOrigen;
    }

    public void setIdCuentaOrigen(long idCuentaOrigen) {
        this.idCuentaOrigen = idCuentaOrigen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    @Override
    public String toString() {
        return String.format("idtransaccion: %d idcuenta: %d tipo: %s cantidad: %s fecha: %s", getIdTransaccion(),getIdCuentaOrigen(),getTipo(),getCantidad(),getFecha());
    }

    public long getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(long idTransaccion) {
        this.idTransaccion = idTransaccion;
    }
    
    
}
