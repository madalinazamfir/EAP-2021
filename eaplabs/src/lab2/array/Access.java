package lab2.array;

import lab2.classes.AccessKeywords;

public class Access {

    public void hasAccess() {
        AccessKeywords x = new AccessKeywords();
        int publicResource = x.publicResource; // are acces doar la resursele publice
    }
}
