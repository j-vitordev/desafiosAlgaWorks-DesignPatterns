package app;

public abstract class NotificacaoFactory {

    public void notificar(String msg) {
        Notificador notificador = criarNotificacao();
        notificador.enviar(msg);
    }

    protected abstract Notificador criarNotificacao();
}

