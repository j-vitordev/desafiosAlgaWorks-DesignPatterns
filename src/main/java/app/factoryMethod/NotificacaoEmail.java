package app.factoryMethod;

public class NotificacaoEmail implements Notificador {

    @Override
    public void enviar(String msg){
        System.out.println("Enviando mensagem via email" + msg);
    }
}

