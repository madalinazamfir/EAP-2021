package lab4.exercitiu.dto;

public class FormRegistration {

    private String name;
    private String surname;
    private String phone;
    private String email;
    private String city;
    private String street;
    private String streetNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder();
        message.append("name=")
                .append(name)
                .append(", surname=")
                .append(surname)
                .append(", phone=")
                .append(phone)
                .append(", email=")
                .append(email)
                .append(", city=")
                .append(city);
        return message.toString();
    }
}
