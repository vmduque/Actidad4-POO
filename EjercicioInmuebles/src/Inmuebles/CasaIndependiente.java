package Inmuebles;

public class CasaIndependiente extends CasaUrbana {
    
    protected static double ValorArea = 3000000;
    
    public CasaIndependiente(int IdentificadorInmobiliario,int Area,String Direccion,int NumeroHabitaciones,int NumeroBaños,int NumeroPisos){
        super(IdentificadorInmobiliario,Area,Direccion,NumeroHabitaciones,NumeroBaños,NumeroPisos);
    }
    
    void Imprimir(){
        super.Imprimir();
        System.out.println();
    }
}
