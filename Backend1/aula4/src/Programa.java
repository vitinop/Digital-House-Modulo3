import entities.CheckMail;
import entities.Mail;

public class Programa {
    public static void main(String[] args) {
        CheckMail verificaMail = new CheckMail();

        verificaMail.verificarCheck (
                new Mail("email@email.com", "tecnica@dh.com.br", "aula")
                );

        verificaMail.verificarCheck(
                new Mail("email@email.com", "tecnica@dh.com.br", "Gerencia")
        );

        verificaMail.verificarCheck(
                new Mail("email@email.com", "tecnica@dh.com.br", "Comercial")
        );

        verificaMail.verificarCheck(
                new Mail("email@email.com", "tecnica@dh.com.br", "Tecnica")
        );

    }
}
