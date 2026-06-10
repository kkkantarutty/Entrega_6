
package javaapplication20;


public class NotEmail implements Notificacao {
    
     @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
