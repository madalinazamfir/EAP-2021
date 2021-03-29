package lab6.exceptii.exercitiu.service;

public interface AuthService {

    // sa arunce o exceptie WrongCredentialsException
    public void login();

    // sa arunce ResourceNotFoundException sau UserNotAuthorizedException
    public void accessResource(String resource);

    /* Mostenirea si exceptiile declarate in semnatura
     In cazul exceptiilor checked subclasa care suprascrie o metoda nu are voie sa:
        - genereze tipuri suplimentare de exceptii fata de metoda parinte
                -> exceptie: metoda in parinte arunca Exception si metoda suprascrisa in copil arunca IOException si SQLException - este permis pentru ca ambele "incap" in Exception
        - sa arunce exceptii mai generale decat cele din metoda parinte

     */
}
