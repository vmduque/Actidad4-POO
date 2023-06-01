package Inmuebles;

public class Casa extends InmuebleVivienda{
    
    protected int NumeroPisos;
    
    public Casa(int IdentificadorInmobiliario,int Area,String Direccion,int NumeroHabitaciones,int NumeroBaños,int NumeroPisos){
        super(IdentificadorInmobiliario,Area,Direccion,NumeroHabitaciones,NumeroBaños);
        this.NumeroPisos = NumeroPisos;
    }
    
    void Imprimir(){
        super.Imprimir();
        System.out.println("Numero de pisos = " + NumeroPisos);
    }  
}
