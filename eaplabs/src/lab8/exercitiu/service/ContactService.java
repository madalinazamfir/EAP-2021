package lab8.exercitiu.service;

import lab8.exercitiu.dto.Contact;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ContactService {

    List<Contact> contacts = new ArrayList<>();

    public ContactService() {
        this.initData();
    }

    public List<Contact> sortByEmailAndName() {
        Comparator<Contact> byCity = (contact1, contact2) -> contact1.getCity().compareTo(contact2.getCity());
        Comparator<Contact> byEmail = Comparator.comparing(Contact::getEmail);
        Comparator<Contact> composed = byCity.thenComparing(byEmail);
        contacts.sort(composed);
        return contacts;
    }

    public List<Contact> searchByEmail(String emailSubstring) {
        Predicate<Contact> checkEmailStartsWith = param -> param.getEmail().startsWith(emailSubstring);
        return contacts.stream()
                .filter(checkEmailStartsWith)
                .collect(Collectors.toList());
    }

    public void showContacts() {
        Consumer<Contact> showFunction = contact -> System.out.println(contact.getName() + " | "
                + contact.getSurname() + " | "
                + contact.getEmail() + " | "
                + contact.getCity());
        contacts.forEach(showFunction);
    }

    public void showContacts(String type) {
        BiConsumer<Contact, String> showFunction = (contact, showType) -> {
            switch (showType) {
                case "name": System.out.println(contact.getName() + " | "
                        + contact.getSurname() + " | "
                        + contact.getEmail());
                break;
                default:
                    System.out.println("Type not found");
            }
        };
        for (Contact contact: contacts) {
            showFunction.accept(contact, type);
        }
    }

    private void initData() {
        contacts.add(new Contact("Popescu", "Andrei", "popescu_andrei@gmail.com", "Bucuresti"));
        contacts.add(new Contact("Popescu", "Ciprian", "popescuc@gmail.com", "Constanta"));
        contacts.add(new Contact("Dumitru", "Alexandru", "dumitru@gmail.com", "Bucuresti"));
        contacts.add(new Contact("Ionescu", "Maria", "maria.ionescu@gmail.com", "Timisoara"));
    }
}
