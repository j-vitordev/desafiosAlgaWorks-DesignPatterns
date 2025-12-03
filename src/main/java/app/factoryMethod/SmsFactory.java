    package app.factoryMethod;

    public class SmsFactory extends NotificacaoFactory {

        @Override
        protected Notificador criarNotificacao() {
            return new NotificacaoSms();
        }
    }
