package Inmuebles;

public class Oficina extends Local {
    
    protected static double valorArea = 3500000;
    protected boolean EsGobierno;

    public Oficina(int IdentificadorInmobiliario,int Area,String Direccion,tipo TipoLocal,boolean EsGobierno) {
        super(IdentificadorInmobiliario,Area,Direccion,TipoLocal);
        this.EsGobierno = EsGobierno;
    }
    
    void Imprimir(){
        super.Imprimir();
        System.out.println("Es oficina gubernamental = " + EsGobierno);
        System.out.println();
    }
}
