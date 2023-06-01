package Inmuebles;

public class LocalComercial extends Local {
    
    protected static double valorArea = 3000000;
    protected String CentroComercial;
    
    public LocalComercial(int IdentificadorInmobiliario, int Area, String Direccion, tipo TipoLocal, String CentroComercial){
        super(IdentificadorInmobiliario,Area,Direccion,TipoLocal);
        this.CentroComercial = CentroComercial;
    }
    
    void Imprimir(){
        super.Imprimir();
        System.out.println("Centro comercial = " + CentroComercial);
        System.out.println();
        
    }
}
