package Principal;
import Salud.Persona;

public class Inicio 
{
    public static void main(String[] args) 
    {
        Persona persona = new Persona();
        persona.pedirDatos();
        persona.mostrarPersona();

        if(persona.calcularImc2() < 20){
            System.out.println("PESOBAJO");
        }
        else if(persona.calcularImc2() > 20 && persona.calcularImc2() < 25){
            System.out.println("PESOIDEAL");
        }
        else if(persona.calcularImc2() > 25){
            System.out.println("SOBREPESO");
        }
        
        persona.mayorEdad();
    }
}
