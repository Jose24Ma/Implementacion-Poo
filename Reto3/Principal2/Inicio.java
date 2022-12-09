package Principal2;

import Salud2.Persona;
import Salud2.Empleado;

public class Inicio 
{
    public static void main(String[] args) 
    {
        Persona persona = new Persona();

        persona.pedirDatos();
        persona.mostrarPersona();
        if(persona.calcularImc() <20)
        {
            System.out.println("PESOBAJO");
        }
        else if(persona.calcularImc() > 20 && persona.calcularImc() < 25)
        {
            System.out.println("PESOIDEAL");
        }
        else if(persona.calcularImc() > 25)
        {
            System.out.println("SOBREPESO");

        }
        persona.mayorEdad();

        Empleado empleado = new Empleado(persona.getNombre(), persona.getApellido(),persona.getTipoDoc(), persona.getDocumento(),"Operario" ,2000, 2);
        empleado.calcularHonorarios();
        
    }    
}
