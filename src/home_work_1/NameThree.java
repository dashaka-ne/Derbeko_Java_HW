package home_work_1;

public class NameThree implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {
        String greetingFinal;
        switch (name) {
            case "Вася":
                greetingFinal = GreetingWaitHello.getGreeting();
                break;
            case "Анастасия":
                greetingFinal = GreetingWait.getGreeting();
                break;
            default:
                greetingFinal = GreetingUnknownPerson.getGreeting();
        }
        return greetingFinal;
    }
}
