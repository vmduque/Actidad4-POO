package Inmuebles;

public class CasaRural extends Casa{
    
    protected static double ValorArea = 150000;
    protected int DistanciaCabera;
    protected int Altitud;
    
    public CasaRural(int IdentificadorInmobiliario,int Area,String Direccion,int NumeroHabitaciones,int NumeroBaños,int NumeroPisos,int DistanciaCabera,int Altitud){
        super(IdentificadorInmobiliario,Area,Direccion,NumeroHabitaciones,NumeroBaños,NumeroPisos);
        this.DistanciaCabera = DistanciaCabera;
        this.Altitud = Altitud;
    }
    
    void Imprimir(){
        super.Imprimir();
        System.out.println("Distancia la cabecera municipal = " + NumeroHabitaciones + "km");
        System.out.println("Altitud sobre el nivel del mar = " + Altitud + "metros");
        System.out.println();
    }
}
