package Dominio;

public class EmpleadoComision extends Empleado {
    private double pComision, totalVentas;

    public EmpleadoComision(String nombre, double pComision, double totalVentas) {
        super(nombre);
        this.pComision = pComision;
        this.totalVentas = totalVentas;
    }

    /**
     * @return the pComision
     */
    public double getpComision() {
        return pComision;
    }

    /**
     * @param pComision the pComision to set
     */
    public void setpComision(double pComision) {
        this.pComision = pComision;
    }

    /**
     * @return the totalVentas
     */
    public double getTotalVentas() {
        return totalVentas;
    }

    /**
     * @param totalVentas the totalVentas to set
     */
    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    @Override
    public double getLiquidacion() {
        return this.totalVentas * this.pComision;
    }
    
    
}
