package lab4.exercitiu;

import lab4.exercitiu.dto.FormRegistration;
import lab4.exercitiu.service.FormValidation;
import lab4.exercitiu.service.TransformService;

public class Main {

    public static void main(String[] args) {
        /* Sa se realizeze un form prin care userii se pot inscrie la un concurs: nume, prenume, oras, strada, nr, nr de telefon, mail
        Se va crea un serviciu care valideaza corectitudinea datelor introduse:
            (*) numele si prenumele nu trebuie sa contina caractere speciale (inafara de " " si "-") si sa nu contina mai mult de 50 de caractere
            (*) nr de telefon (mobil) valid
            (*) adresa de email valida
            * nr - maxim 3 caractere si sa nu inceapa cu 0
            (*) orasul exista in "baza de date" - un array

        Se va crea un serviciu realizeaza cateva transformari:
               * prima litera din nume trebuie sa fie upper case, restul lower case
               * email - lower case
               * se va "mappa" la tipul de date Application: contact, address, name (optional)

        Se va crea un serviciu care:
                * salveaza aplicantii in baza de date(un array)
                * are o metoda care returneaza toti aplicantii sortati dupa nume
                * are o metoda care returneaza toti aplicantii dintr un anumit oras dat ca parametru

        * se vor suprascrie metodele toString din fiecare clasa DTO (Data transfer object)/ POJO (Plain old java object)
        */

        FormRegistration registration = new FormRegistration();
        registration.setName("Popescu-Georgescu");
        registration.setEmail("popescu_george@mail.com");
        registration.setPhone("0712345678");
        registration.setCity("Brasov");


        FormValidation validationService = new FormValidation();
        boolean isValid = validationService.validateCity(registration.getCity());
        System.out.println(isValid);

        TransformService transformService = new TransformService();
        System.out.println(transformService.capitalizeFirstLetter(registration.getName()));
    }
}
