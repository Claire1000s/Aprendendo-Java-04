package metodos_02;
import java.util.Scanner;

public class Metodos_02 
{
    public static void menu()
    {
        System.out.print("Cadastro de clientes\n\n1. Inclui\n2. Altera\n3. Exclui\n4. Consulta\n0. Fim\n\nOpção:");
    }
    
    public static void inclui()
    {
        System.out.println("Você escolheu  a opção \"Incluir\"");
    }
    
    public static void altera()
    {
        System.out.println("Você escolheu a opção \"Alterar\"");
    }
    
    public static void exclui()
    {
        System.out.println("Você escolheu a opção \"Excluir\"");
    }
    
    public static void consulta()
    {
        System.out.println("Você esoclheu a opção \"Consultar\"");
    }
    
    public static void main(String[] args)
    {
        int opcao;
        
        Scanner entrada = new Scanner (System.in);
        
        do
        {
            menu();
            
            opcao = entrada.nextInt();
            switch(opcao)
            {
                case 1: inclui();
                break;
                
                case 2: altera();
                break;
                
                case 3: exclui();
                break;
                
                case 4: consulta();
                break;
                
                default: System.out.println("Opção inválida!");
                break;
            }
        }
        while(opcao != 0);
    } 
}