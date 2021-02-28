package lab2.classes;

public class Access {

    public void hasAccess() {
        AccessKeywords x = new AccessKeywords();
        int publicRes = x.publicResource;
        int defaultResource = x.defaultResource;
        int protectedResource = x.protectedResource;

        x.accessPublicResourceMethod();
        x.accessTODefaultResourceMethod();
        x.accessToProtectedResourceMethos();
    }
}
