package model;

public class Cliente {
    private String nombreCliente;
    private int edadCliente;
    private int cedulaCliente;
    private Cuenta [] cuentas;



    public Cliente(String nombreCliente, int edadCliente, int cedulaCliente){
        this.nombreCliente=nombreCliente;
        this.edadCliente=edadCliente;
        this.cedulaCliente=cedulaCliente; 
        this.cuentas=new Cuenta[10]
    }

    public String getnombreCliente(){
        return nombreCliente;
    } 
    
    public void setnombreCliente(String nombreCliente){
        this.nombreCliente=nombreCliente;

    }

    public int getedadCliente(){
        return edadCliente;
    }

    public void setedadCliente(int edadCliente){
        this.edadCliente=edadCliente;
    }

    public int getcedulaCliente(){
        return cedulaCliente;
    }

    public void setcedulaCliente(int cedulaCliente){
        this.cedulaCliente=cedulaCliente;

    }

    public Cuenta[] getCuentasList() {
        return cuentas;

    }

}
