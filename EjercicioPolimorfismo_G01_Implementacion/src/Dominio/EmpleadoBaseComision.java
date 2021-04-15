package Dominio;

public class EmpleadoBaseComision extends EmpleadoComision {
    private double salarioBase;

    public EmpleadoBaseComision(String nombre, double salarioBase, double pComision, double totalVentas) {
        super(nombre, pComision, totalVentas);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    @Override
    public double getLiquidacion(){
        return this.salarioBase + super.getLiquidacion();
    }
    
}
