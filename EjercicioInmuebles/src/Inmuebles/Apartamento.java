package Inmuebles;

public class Apartamento extends InmuebleVivienda{
    
    public Apartamento(int IdentificadorInmobiliario,int Area,String Direccion,int NumeroHabitaciones,int NumeroBaños){
        super(IdentificadorInmobiliario,Area,Direccion,NumeroHabitaciones,NumeroBaños);
    }
    
    void Imprimir(){
        super.Imprimir();
    }
}
