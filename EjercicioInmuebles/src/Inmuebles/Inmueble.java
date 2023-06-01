package Inmuebles;

public class Inmueble {
    
    protected int IdentificadorInmobiliario;
    protected int Area;
    protected String Direccion;
    protected double PrecioVenta;
    
    Inmueble(int IdentificadorInmobiliario,int Area,String Direccion){
        this.IdentificadorInmobiliario = IdentificadorInmobiliario;
        this.Area = Area;
        this.Direccion = Direccion;
    }
    
    double CalcularPrecioVenta(double ValorArea){
        PrecioVenta = Area * ValorArea;
        return PrecioVenta;
    }
    
    void Imprimir(){
        System.out.println("Identificador inmobiliario = " + IdentificadorInmobiliario);
        System.out.println("Area = " + Area);
        System.out.println("Direccion = " + Direccion);
        System.out.println("Precio de venta = " + PrecioVenta);
    }
}
