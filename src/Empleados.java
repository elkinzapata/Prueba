public class Empleados {
    // Requiero que me crees los atributos de la clase empleados
    // con los siguientes nombres y tipos de datos:
    // nombre, apellido, edad, salario, fecha de ingreso
    //
    // Tu código aquí
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    private String fechaIngreso;
    // Fin de tu código
    public Empleados(String nombre, String apellido, int edad, double salario, String fechaIngreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public double getSalario() {
        return salario;
    }
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nSalario: " + salario + "\nFecha de ingreso: " + fechaIngreso;
    }



}
