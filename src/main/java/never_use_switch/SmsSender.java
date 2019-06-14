package never_use_switch;

import org.springframework.stereotype.Component;

import static never_use_switch.DistribConst.SMS;

/**
 * @author Evgeny Borisov
 */
@Component(SMS)
public class SmsSender implements Sender {
    @Override
    public void send(Message message) {
        //20 lines code
        System.out.println("sms was sent "+message.getContent());
    }
}
