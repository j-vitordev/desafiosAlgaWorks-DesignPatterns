package app;

public class EmailFactory extends NotificacaoFactory {
    @Override
    protected Notificador criarNotificacao() {
        return new NotificacaoEmail();
    }
}
