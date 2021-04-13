package lab8.exercitiu.service;

import lab8.exercitiu.dto.Contact;

import java.util.Comparator;

public class CompareByName implements Comparator<Contact> {

    @Override
    public int compare(Contact o1, Contact o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
