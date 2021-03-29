package lab6.exceptii.exercitiu;

public class EntryPoint {

    /*
    Sa se creeze 3 tipuri custom de runtime exceptions pe care sa le folosim in serviciu AuthService:
        * WrongCredentialsException
        * ResourceNotFoundException
        * UserNotAuthorizedException
   UserNotAuthorizedException si WrongCredentialsException vor avea un parinte comun: UnauthorizedException
   Toate exceptiile vor avea un mesaj si un cod de eroare: 401, 404, 403
   Se vor prinde aceste exceptii:
        - pentru WrongCredentialsException si UserNotAuthorizedException se va afisa acelasi mesaj (Unauthorized) + codul
        - pentru ResourceNotFoundException se va afisa "Not found" + codul
     */

    public static void main(String[] args) {

    }
}
