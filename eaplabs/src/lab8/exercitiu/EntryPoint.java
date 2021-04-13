package lab8.exercitiu;

import lab8.exercitiu.service.ContactService;

public class EntryPoint {
    /* Sa se realizeze un serviciu de contacte care sa contina urmatoarele operatiuni:
        - sortare dupa email si oras
        - search by email startsWith
        - show details (System.out.println) in functie de parametru:
            - lipsa - show toate campurile
            - name - show name, surname, email
     */

    public static void main(String[] args) {
        ContactService service = new ContactService();
//        System.out.println(service.sortByEmailAndName());
        System.out.println(service.searchByEmail("pope"));
        service.showContacts("name");
    }
}
