
package javaapplication20;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaApplication20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(new NotEmail());     
        notificacoes.add(new NotSMS());       
        notificacoes.add(new NotWpp());  

        System.out.println("=== MENU DE NOTIFICACAO ===");
        System.out.println("1 - E-mail");
        System.out.println("2 - SMS");
        System.out.println("3 - WhatsApp");
        System.out.print("Escolha uma opcao: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao < 1 || opcao > 3) {
            System.out.println("Opcao invalida!");
            scanner.close();
            return;
        }

        System.out.print("Digite a mensagem: ");
        String mensagem = scanner.nextLine();

        ServicoNot servico = new ServicoNot();

        servico.notificarCliente(notificacoes.get(opcao - 1), mensagem);

        scanner.close();
    }
}