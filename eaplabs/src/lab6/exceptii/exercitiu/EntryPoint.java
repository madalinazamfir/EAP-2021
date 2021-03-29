package lab6.exceptii.exercitiu;

import lab6.exceptii.exercitiu.exception.ResourceNotFoundException;
import lab6.exceptii.exercitiu.exception.UnauthorizedException;
import lab6.exceptii.exercitiu.exception.UserNotAuthorizedException;
import lab6.exceptii.exercitiu.exception.WrongCredentialsException;
import lab6.exceptii.exercitiu.service.AuthService;
import lab6.exceptii.exercitiu.service.AuthServiceImpl;

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
        AuthService authService = new AuthServiceImpl();
        try {
//            authService.login();
            authService.accessResource("/settins");
        } catch (UnauthorizedException e) {
            System.out.println("Unauthorized " + e.getCode());
        } catch (ResourceNotFoundException e) {
            System.out.println("Not found " + e.getCode());
        } catch (RuntimeException e) {
            System.out.println("Something went wrong");

        }
    }
}
