package Inmuebles;

public class ApartamentoFamiliar extends Apartamento {
    
    protected static double ValorArea = 2000000;
    protected int ValorAdministracion;
    
    public ApartamentoFamiliar(int IdentificadorInmobiliario,int Area,String Direccion,int NumeroHabitaciones,int NumeroBaños,int ValorAdministracion){
        super(IdentificadorInmobiliario,Area,Direccion,NumeroHabitaciones,NumeroBaños);
        this.ValorAdministracion = ValorAdministracion;
    }
    
    void imprimir(){
        super.Imprimir();
        System.out.println("Valor de la administracion = " + ValorAdministracion);
        System.out.println();
    }
}
