package home_work_1;

import home_work_1.texts.Names;

import java.util.Objects;

public class NameOne implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {
        String greetingFinal = null;
        if (Objects.equals(name, Names.getName1())) {
           greetingFinal=GreetingWaitHello.getGreeting();
        }
        if (Objects.equals(name, Names.getName2())) {
            greetingFinal=GreetingWait.getGreeting();
        }
        if (!Objects.equals(name, Names.getName1()) && !Objects.equals(name, Names.getName2())) {
           greetingFinal=GreetingUnknownPerson.getGreeting();
        }
        return greetingFinal;
    }
}
