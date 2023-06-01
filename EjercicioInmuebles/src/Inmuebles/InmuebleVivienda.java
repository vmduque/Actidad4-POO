package Inmuebles;

public class InmuebleVivienda extends Inmueble{
    
    protected int NumeroHabitaciones;
    protected int NumeroBaños;
    
    public InmuebleVivienda(int IdentificadorInmobiliario,int Area,String Direccion,int NumeroHabitaciones,int NumeroBaños){
        super(IdentificadorInmobiliario,Area,Direccion);
        this.NumeroHabitaciones = NumeroHabitaciones;
        this.NumeroBaños = NumeroBaños;
    }
    
    void Imprimir(){
        super.Imprimir();
        System.out.println("Numero de habitaciones = " + NumeroHabitaciones);
        System.out.println("Numero de baños = " + NumeroBaños);
    }
}
