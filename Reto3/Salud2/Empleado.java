package Salud2;

import java.util.Scanner;

public class Empleado extends Persona 
{
    Scanner leer = new Scanner(System.in);

    private String cargo;
    private String departamento;
    private int valorhora;
    private int horastrabajadas;

    public Empleado(String nombre, String apellido, String tipoDoc,int documento,String cargo,int valorhora, int horastrabajadas) {
        super(nombre, apellido, tipoDoc, documento);
        this.valorhora = valorhora;
        this.horastrabajadas = horastrabajadas;
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public int getValorhora() {
        return valorhora;
    }
    public void setValorhora(int valorhora) {
        this.valorhora = valorhora;
    }
    public int getHorastrabajadas() {
        return horastrabajadas;
    }
    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }


    public void calcularHonorarios()
    {
        System.out.println("------------------Empleado----------------");
        double valorhonorarios = (valorhora * horastrabajadas)/0.96;

        System.out.println("Tipo de Documento "+getTipoDoc());
        System.out.println("Numero de documento "+getDocumento());
        System.out.println("Nombre Completo "+getNombre()+" "+getApellido());
        System.out.println("Cargo empleado: "+cargo);
        System.out.println("Horas trabajadas "+horastrabajadas);
        System.out.println("Valor hora "+valorhora);
        System.out.println("Total a pagar "+valorhonorarios);
    }
}
