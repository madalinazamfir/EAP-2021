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

        String var1 = StaticAndFinal.campStatic;
        StaticAndFinal var2 = new StaticAndFinal();
        String var3 = var2.campStatic;
        StaticAndFinal.campStatic = "val";
        System.out.println(var2.campStatic);
    }

    public static void main(String[] args) {
        String var1 = StaticAndFinal.campStatic;
        StaticAndFinal var2 = new StaticAndFinal();
        String var3 = var2.campStatic;
        StaticAndFinal.campStatic = "val";
        System.out.println(var2.campStatic);
        var2.campStatic = "val2";
        System.out.println(StaticAndFinal.campStatic);
    }
}
