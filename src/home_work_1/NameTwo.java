package home_work_1;

import home_work_1.texts.Names;

import java.util.Objects;


public class NameTwo implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {
        String greetingFinal;
        if (!Objects.equals(name, Names.getName1()) && !Objects.equals(name, Names.getName2())) {
            greetingFinal = GreetingUnknownPerson.getGreeting();
        } else if (Objects.equals(name, Names.getName1())) {
            greetingFinal = GreetingWaitHello.getGreeting();
        } else {
            greetingFinal = GreetingWait.getGreeting();
        }
        return greetingFinal;
    }
}
