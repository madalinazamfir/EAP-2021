package lab11.exercitiu2;

import lab11.exercitiu2.service.AuthorizationService;
import lab11.exercitiu2.service.GoogleService;

import static lab11.exercitiu2.utils.Constants.MAIL_POPESCU;

public class EntryPoint {

    public static void main(String[] args) {
        GoogleService googleService = new GoogleService();
        AuthorizationService authorizationService = AuthorizationService.getInstance();

        authorizationService.login(MAIL_POPESCU, "parola");
        System.out.println(googleService.getAllEmails());
    }
}
