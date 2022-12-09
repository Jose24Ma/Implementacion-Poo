package Salud2;

import java.util.Scanner;

public class Persona 
{
    Scanner leer = new Scanner(System.in);

    private String sexo;
    private String nombre;
    private String apellido;
    private String tipoDoc;
    private int peso;
    private int edad;
    private double estatura;
    private int documento;

    public Persona()
    {}
    public Persona(String nombre, String apellido, String tipoDoc,int documento)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDoc = tipoDoc;
        this.documento = documento;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }


    public void pedirDatos()
    {
        System.out.println("Nombre del paciente");
        nombre = leer.next();

        System.out.println("Apellido del paciente");
        apellido = leer.next();

        System.out.println("Edad del paciente");
        edad = leer.nextInt();

        System.out.println("Tipo de documento del paciente");
        tipoDoc = leer.next();

        System.out.println("Numero de documento del paciente");
        documento = leer.nextInt();

        System.out.println("Sexo del paciente");
        sexo = leer.next();
        
        System.out.println("Peso del paciente");
        peso = leer.nextInt();

        System.out.println("Estatura del paciente");
        estatura = leer.nextDouble();
    }

    public void mostrarPersona()
    {
        System.out.println("Datos registrados del paciente:");
        System.out.println("-----------------------------------");
        System.out.println("Nombre completo: "+getNombre()+" "+getApellido());
        System.out.println("Edad: "+getEdad());
        System.out.println("Tipo de documentp: "+getTipoDoc());
        System.out.println("Numero de documento: "+getDocumento());
        System.out.println("Sexo del paciente: "+getSexo());
        System.out.println("Peso del paciente: "+getPeso()+" Kg");
        System.out.println("Estatura del paciente: "+getEstatura()+" M");
    }

    public int calcularImc()
    {
        int pesoActual;
        pesoActual = (int) (getPeso()/Math.pow(getEstatura(),2));
        return pesoActual;
    }
    public void mayorEdad()
    {
        if(getEdad() >=18)
        {
            System.out.println("Es mayor de edad");
        }
        else
        {
            System.out.println("Es menor de edad");
        }
    }
}
