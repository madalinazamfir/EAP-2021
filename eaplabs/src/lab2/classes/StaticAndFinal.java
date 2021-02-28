package lab2.classes;

public class StaticAndFinal {

    // un camp/metoda statica este accesibila fara a crea un obiect in felul urmator "NumeClasa.numeField/numeMetoda"
    static String staticFiel = "I am a static field";

    // o variabila de tip obiect, care este final nu-si mai poate schimba referinta
    final static String constanta = "I am global variable";

    // o variabila de tip primitiva, care este final nu-si mai poate schimba valoarea
    final static int today = 29;

    // metodele final nu se pot suprascrie
    // clasele final nu se pot extinde
    // nu exista clase statice
}
