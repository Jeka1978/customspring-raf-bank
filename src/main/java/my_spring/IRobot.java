package my_spring;


/**
 * @author Evgeny Borisov
 */
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    public void cleanRoom() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }










    public static void main(String[] args) {
       ObjectFactory.getInstance().createObject(IRobot.class).cleanRoom();
    }
}







