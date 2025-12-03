package app;

public class SmsFactory extends NotificacaoFactory {

    @Override
    protected Notificador criarNotificacao() {
        return new NotificacaoSms();
    }
}
