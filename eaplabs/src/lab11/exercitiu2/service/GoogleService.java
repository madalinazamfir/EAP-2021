package lab11.exercitiu2.service;

import lab11.exercitiu2.dto.Mail;

import java.util.ArrayList;
import java.util.List;

import static lab11.exercitiu2.utils.Constants.*;

public class GoogleService {
    
    private List<Mail> allTheMailsInTheWorld = new ArrayList<>();

    public GoogleService() {
        this.initData();
    }

    // sa se returneze toate mailurile userului logat sortate (cele necitite primele, cele citite la final)

    // cate mailuri necitite are userul logat

    // search folosind "label" si textul cautat (ex: from: popescu@gmail.com, title: I need"). Daca labelul este null se vor intoarce mailurile care contin textul respectiv in component


    private void initData() {
        allTheMailsInTheWorld.add(buildMail(MAIL_QUEEN, "Hello",MAIL_POPESCU, true));
        allTheMailsInTheWorld.add(buildMail(MAIL_QUEEN, "Hello",MAIL_JONNY, false));
        allTheMailsInTheWorld.add(buildMail(MAIL_JONNY, "this is not spam",MAIL_POPESCU, false));
        allTheMailsInTheWorld.add(buildMail(MAIL_JONNY, "do you want to go out?",MAIL_POPESCU, false));
        allTheMailsInTheWorld.add(buildMail(MAIL_JONNY, "I need  charger",MAIL_POPESCU, true));

        allTheMailsInTheWorld.add(buildMail(MAIL_POPESCU, "Re: I need  charger",MAIL_JONNY, false));
        allTheMailsInTheWorld.add(buildMail(MAIL_POPESCU, "homework to do",MAIL_JONNY, true));
        allTheMailsInTheWorld.add(buildMail(MAIL_POPESCU, "concert tickets",MAIL_JONNY, false));

    }

    private Mail buildMail(String from, String to, String title, boolean read) {
        Mail mail = new Mail();
        mail.setFrom(MAIL_QUEEN);
        mail.setTitle("Hello");
        mail.setTo(MAIL_POPESCU);
        return mail;
    }
}
