package my_spring;


import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    @PostConstruct
    public void init() {
        System.out.println(cleaner.getClass());
    }

    public void cleanRoom() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }










    public static void main(String[] args) {
       ObjectFactory.getInstance().createObject(IRobot.class).cleanRoom();
    }
}







