package Inmuebles;

public class Local extends Inmueble {
    
    enum tipo {INTERNO,CALLE};
    protected tipo TipoLocal;
    
    public Local(int IdentificadorInmobiliario,int Area,String Direccion,tipo TipoLocal){
        super(IdentificadorInmobiliario,Area,Direccion);
        this.TipoLocal = TipoLocal;
    }
    
    void Imprimir(){
        super.Imprimir();
        System.out.println("Tipo de local = " + TipoLocal);
    }
}
