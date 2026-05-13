import java.util.Scanner;
public class Main {
    public static void Main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Motorista moto1 = new Motorista();

        System.out.println("Nome do Motorista:");
        Scanner nome = entrada.nextline();

        System.out.println("Cpf do Motorista:");
        Scanner cpf = entrada.nextline();

        System.out.println("CNH do Motorista:");
        Scanner cnh = entrada.nextline();

        System.out.println("Validade da CNH:");
        Scanner ValidadeCnh = entrada.nextline();


    }
}
