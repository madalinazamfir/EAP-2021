package lab2.classes;

public class AccessKeywords {

    /*
    /Modificator de access / Nivel acces / Membrul este vizibil in afara obiectului? / Membrul e vizil in subclasa? /
    / public              / public      / DA                                        /DA                             /
    / private             / private     / NU                                        /NU                             /
    /protected            / protected   / DA in acelasi pachet, NU in rest          / DA                            /
    / lipsa               / default     / DA in acelasi pachet, NU in rest          / DA in acelasi pachet, NU in rest /
     */


    protected int protectedResource;
    int defaultResource;
    private int privateResource;
    public int publicResource;

    public void accessPublicResourceMethod() {
        System.out.println("I have access to public resource");
    }

    protected void accessToProtectedResourceMethos() {
        System.out.println("I have access to protected resource");
    }

    void accessTODefaultResourceMethod() {
        System.out.println("I have access to default resource");
    }

    private void accessToPrivateResourceMethod() {
        System.out.println("this one is accessible only from this class");
    }
}
