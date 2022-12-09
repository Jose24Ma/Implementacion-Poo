package Salud;

import java.util.Scanner;

public class Persona 
{
    Scanner leer = new Scanner(System.in);

    public String sexo;
    public String nombre;
    public String apellido;
    public String tipoDoc;
    public int peso;
    public int edad;
    public Double estatura;
    public int documento;
   

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
        System.out.println("Nombre completo: "+nombre+" "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Tipo de documentp: "+tipoDoc);
        System.out.println("Numero de documento: "+documento);
        System.out.println("Sexo del paciente: "+sexo);
        System.out.println("Peso del paciente: "+peso+" Kg");
        System.out.println("Estatura del paciente: "+estatura+" M");
    }

    public void calcularImc()
    {
        int pesoActual = (int) (peso / Math.pow(estatura,2));

        if(pesoActual < 20){
            System.out.println("el peso está por debajo de lo ideal");
        }
        else if(pesoActual> 20 && pesoActual< 25){
            System.out.println("el peso es ideal");
        }
        else if(pesoActual > 25){
            System.out.println("Tiene sobrepeso");
        }
    }
    
    public int calcularImc2()
    {   
        int pesoActual = (int) (peso / Math.pow(estatura,2));
        System.out.println(pesoActual);
        return pesoActual;
    }

    public void mayorEdad()
    {
        if(edad >=18)
        {
            System.out.println("Es mayor de edad");
        }
        else
        {
            System.out.println("Es menor de edad");
        }
    }
}
