package ejerciciocuenta;

public class CuentaCorriente extends Cuenta{
    
    float Sobregiro;
    
    public CuentaCorriente(float saldo,float tasa){
        super(saldo,tasa);
        Sobregiro = 0;
    }
    
    public void Retirar(float Cantidad){
        float Resultado = saldo - Cantidad;
        
        if (Resultado < 0){
            Sobregiro = Sobregiro - Resultado;
            saldo = 0;
        }
        else {
            super.Retirar(Cantidad);
        }
    }
    
    public void Consignar(float Cantidad){
        float Residuo = Sobregiro - Cantidad;
        
        if (Sobregiro > 0){
            Sobregiro = 0;
            saldo = Residuo;
        }
        
        else{
            super.Consignar(Cantidad);
        }
    }
    
    public void ExtractoMensual(){
        super.ExtractoMensual();
    }
    
    public void Imprimir(){
        System.out.println("Saldo = $" + saldo);
        System.out.println("Cargo mensual = $" + ComisionMensual);
        System.out.println("Numero de transacciones = " + (NumeroConsignaciones + NumeroRetiros));
        System.out.println("Valor de sobregiro = S" + (NumeroConsignaciones + NumeroRetiros));
        System.out.println();
    }
}
