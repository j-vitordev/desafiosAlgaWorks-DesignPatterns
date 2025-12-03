package app.factoryMethod;


public class NotificacaoSms implements Notificador {
    @Override
    public void enviar(String msg) {
        System.out.println("Enviando mensagem via SMS" + msg);

    }
}