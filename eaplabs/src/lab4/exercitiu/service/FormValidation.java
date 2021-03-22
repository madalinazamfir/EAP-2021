package lab4.exercitiu.service;

import java.util.Arrays;

public class FormValidation {

    String[] countries = {"Bucuresti", "Brasov", "Pitesti"};

    public boolean validateName(String name) {
        return name.matches("^[a-zA-Z- ]+$") && name.length() <= 50;
    }

    public boolean validateMail(String email) {
        return email.matches("^[a-zA-Z0-9_]+@[a-zA-Z]+[.]+[a-zA-Z]{2,3}$");
    }

    public boolean validatePhone(String phone) {
        boolean startsWith = phone.startsWith("07");
        for (char x: phone.toCharArray() ) {
            if(!(startsWith && phone.length() == 10 && Character.isDigit(x))) {
                return false;
            }
        }
        return true;
    }

    public boolean validateCity(String country) {
        boolean exists = false;
        for (String city: countries) {
            if(city.equalsIgnoreCase(country)) {
                exists = true;
            }
        }
        return exists;
    }

}
