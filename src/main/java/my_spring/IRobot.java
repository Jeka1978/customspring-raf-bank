package my_spring;


/**
 * @author Evgeny Borisov
 */
public class IRobot {
    private Speaker speaker = new ConsoleSpeaker();
    private Cleaner cleaner = new CleanerImpl();

    public void cleanRoom() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }

    public static void main(String[] args) {
        new IRobot().cleanRoom();
    }
}
