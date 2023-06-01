package ejerciciocuenta;

public class CuentaAhorros extends Cuenta{
    
    private boolean Activa;
    
    public CuentaAhorros(float saldo,float tasa){
        super(saldo,tasa);
        if (saldo < 10000)
            Activa = false;
        
        else
            Activa = true;
    }
    
    public void Retirar(float Cantidad){
        if(Activa)
            super.Retirar(Cantidad);
    }
    
    public void Consignar(float Cantidad){
        if(Activa)
            super.Consignar(Cantidad);
    }
    
    public void ExtractoMensual(){
        if (NumeroRetiros > 4){
            ComisionMensual += (NumeroRetiros - 4) * 1000;
        }
        super.ExtractoMensual();
        if (saldo < 10000)
            Activa = false;
    }
    
    public void Imprimir(){
        System.out.println("Saldo = $" + saldo);
        System.out.println("Comision mensual = $" + ComisionMensual);
        System.out.println("Numero de transacciones = " + (NumeroConsignaciones + NumeroRetiros));
        System.out.println();
    }
    
}
