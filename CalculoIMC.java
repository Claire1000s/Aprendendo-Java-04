package calculoimc;
import java.util.Scanner;

public class CalculoIMC
{
    public static float IMC(float p, float a)
    {
        float imc;
        imc = p / quadrado(a);
        return imc;
    }
    
    public static float quadrado(float num)
    {
        float q;
        q = num * num;
        return q;
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