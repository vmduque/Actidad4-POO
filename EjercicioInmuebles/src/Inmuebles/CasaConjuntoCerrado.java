package Inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana {
    
    protected static double ValorArea = 2500000;
    protected int ValorAdministracion;
    protected boolean TienePiscina;
    protected boolean TieneCamposDeportivos;
    
    public CasaConjuntoCerrado(int IdentificadorInmobiliario,int Area,String Direccion,int NumeroHabitaciones,int NumeroBaños,int NumeroPisos,int ValorAdministracion,boolean TienePiscina,boolean TieneCamposDeportivos){
        super(IdentificadorInmobiliario,Area,Direccion,NumeroHabitaciones,NumeroBaños,NumeroPisos);
        this.ValorAdministracion = ValorAdministracion;
        this.TienePiscina = TienePiscina;
        this.TieneCamposDeportivos = TieneCamposDeportivos;
    }
    
    void Imprimir(){
        super.Imprimir();
        System.out.println("Valor de la administracion = " + ValorAdministracion);
        System.out.println("Tiene piscina? = " + TienePiscina);
        System.out.println("Tiene campos deportivos? = " + TieneCamposDeportivos);
        System.out.println();
    }
    
}
