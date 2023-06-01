package Inmuebles;

public class Apartaestudio extends Apartamento {
    
    protected static double ValorArea = 1500000;
    
    public Apartaestudio(int IdentificadorInmobiliario,int Area,String Direccion,int NumeroHabitaciones,int NumeroBaños){
        super(IdentificadorInmobiliario,Area,Direccion,1,1);
    }
    void Imprimir(){
        super.Imprimir();
        System.out.println();
    }
}
