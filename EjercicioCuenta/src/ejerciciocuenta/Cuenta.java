package ejerciciocuenta;

public class Cuenta {
    
    protected float saldo;
    protected int NumeroConsignaciones = 0;
    protected int NumeroRetiros = 0;
    protected float TasaAnual;
    protected float ComisionMensual = 0;
    
    public Cuenta(float saldo,float TasaAnual){
        this.saldo = saldo;
        this.TasaAnual = TasaAnual;
    }
    
    public void Consignar(float cantidad){
        saldo = saldo + cantidad;
        NumeroConsignaciones = NumeroConsignaciones + 1;
    }
    
    public void Retirar(float cantidad){
        float NuevoSaldo = saldo - cantidad;
        
        if (NuevoSaldo >=0){
            saldo = saldo - cantidad;
            NumeroRetiros = NumeroRetiros + 1;
        }
        else{
            System.out.println("La cantidad a retirar excede el saldo actual");
        }
    }
    
    public void CalcularInteres(){
        float TasaMensual = TasaAnual / 12;
        float InteresMensual = saldo * TasaMensual;
        saldo = saldo + InteresMensual;
    }
    
    public void ExtractoMensual(){
        saldo = saldo - ComisionMensual;
        CalcularInteres();
    }
}
