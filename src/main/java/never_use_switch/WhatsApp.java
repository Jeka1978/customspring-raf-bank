package never_use_switch;

import org.springframework.stereotype.Component;

import static never_use_switch.DistribConst.SMS;
import static never_use_switch.DistribConst.WHATSAPP;

/**
 * @author Evgeny Borisov
 */
@Component(WHATSAPP)
public class WhatsApp implements Sender {
    @Override
    public void send(Message message) {
        //20 lines code
        System.out.println("whatsapp was sent "+message.getContent());
    }

}
