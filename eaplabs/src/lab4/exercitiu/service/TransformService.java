package lab4.exercitiu.service;

public class TransformService {


    public String capitalizeFirstLetter(String name) {
       String capitalized = name.replace(name.substring(0,1), name.substring(0,1).toUpperCase());
       return capitalized.replace(capitalized.substring(1), capitalized.substring(1).toLowerCase());
    }
}
