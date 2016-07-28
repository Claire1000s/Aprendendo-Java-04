package metodos_01;

public class Metodos_01
{
    public static void mensagem()
    {
        System.out.println("Hello World!");
    }
    public static void main(String[] args)
    {
        int i;
        
        System.out.println("Exibindo a mensagem uma vez:");
        mensagem();
        
        System.out.println("Exibindo a mensagem três vezes:");
        
        for(i = 1; i <= 3; i++)
        {
            mensagem();
        }
    }
}