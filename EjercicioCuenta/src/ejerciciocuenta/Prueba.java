package ejerciciocuenta;
import java.util.Scanner;

public class Prueba {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Cuenta de ahorros");
    System.out.println("Ingrese saldo inicial = $");
    float saldoInicialAhorros = input.nextFloat(); 
    System.out.print("Ingrese tasa de interes = ");
    float tasaAhorros = input.nextFloat();
    CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);
    System.out.print("Ingresar cantidad a consignar: $");
    float cantidadDepositar = input.nextFloat();
    cuenta1.Consignar(cantidadDepositar);
    System.out.print("Ingresar cantidad a retirar: $");
    float cantidadRetirar = input.nextFloat();
    cuenta1.Retirar(cantidadRetirar);
    cuenta1.ExtractoMensual();
    cuenta1.Imprimir();
    
    }
}
