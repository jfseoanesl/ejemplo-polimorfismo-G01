package test;

import Dominio.*;

public class Test {
    public static void main(String[] args) {
        
        Empleado listaEmpleado[] = new Empleado[6];
        
        // upcasting y DownCasting
        
        Empleado juan = new EmpleadoAsalariado("Juan", 700); // upcasting
        listaEmpleado[0]=juan;
        
        EmpleadoAsalariado yo = (EmpleadoAsalariado)juan; // Downcasting
       
                
        Empleado luis = new EmpladoPorHora("Luis", 100, 150, 39);
        listaEmpleado[1]=luis;
        
        Empleado pedro = new EmpleadoAsalariado("pedro",1000); // upcasting
        listaEmpleado[2]=pedro;
        
        Empleado mary = new EmpladoPorHora("Mary",100, 150, 50);
        listaEmpleado[3]=mary;
        
        Empleado luisa = new EmpleadoComision("Luisa",0.2, 10000);
        listaEmpleado[4]=luisa;
        
        Empleado pepe = new EmpleadoBaseComision("Pepe", 1000, 0.2, 10000);
        listaEmpleado[5]=pepe;
        
        imprimirNominaMes(listaEmpleado);
    }
    
    
    public static void imprimirNominaMes(Empleado lista[]){
        double totalNomina = 0;
        double totalAsalariado=0;
        double totalHoras=0;
        double totalComision=0;
        
        for(Empleado e:lista){
            totalNomina += e.getLiquidacion();
            if(e instanceof EmpleadoAsalariado){
                totalAsalariado+=e.getLiquidacion();
            }
            else if(e instanceof EmpladoPorHora){
                totalHoras+= e.getLiquidacion();
            }
            else{
                totalComision+=e.getLiquidacion();
            }
            imprimirLiquidacion(e);
        }
        System.out.println("-----------------------------------");
        System.out.println("Nomina asalariado: " + totalAsalariado);
        System.out.println("Nomina por hora: " + totalHoras);
        System.out.println("Nomina por comision: " + totalComision);
        System.out.println("-----------------------------------");
        System.out.println("Nomina Total: " + totalNomina);
    }
    
    public static void imprimirLiquidacion(Empleado e){
        System.out.println("Liquidacion de " + e.getNombre() +" = "+ e.getLiquidacion());
    }
}
