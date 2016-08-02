package calculoimc;
import java.util.Scanner;

public class CalculoIMC
{
    public static float IMC(float p, float a)
    {
        float imc;
        imc = p / (float) Math.pow(a, 2);
        return imc;
    }
    
    public static void main(String[] args)
    {
        float peso, altura, imc;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite seu peso: ");
        peso = entrada.nextFloat();
        
        System.out.print("Digite sua altura: ");
        altura = entrada.nextFloat();
        
        imc = IMC(peso, altura);
        
        System.out.printf("Seu IMC é %.2f!\n\n", imc);
    }
}
