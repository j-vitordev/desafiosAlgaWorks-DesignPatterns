package app;

public class Main {
    public static void main(String[] args) {

        NotificacaoFactory criadorEmail = new EmailFactory();
        criadorEmail.notificar("Bem-vindo ao sistema!");

        NotificacaoFactory criadorSms = new SmsFactory();
        criadorSms.notificar("Seu código é 1234");
    }
}
