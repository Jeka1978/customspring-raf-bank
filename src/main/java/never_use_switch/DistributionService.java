package never_use_switch;

import org.springframework.stereotype.Service;

import static never_use_switch.DistribConst.SMS;
import static never_use_switch.DistribConst.WHATSAPP;

/**
 * @author Evgeny Borisov
 */
@Service
public class DistributionService {


    public void sendMessage(Message message) {
        String type = message.getDistributionType();
        switch (type) {
            case SMS:
                //20 lines of code
                System.out.println("sms was sent " + message.getContent());
                break;
            case WHATSAPP:
                System.out.println("whatsapp was sent " + message.getContent());
                break;
            default:
                throw new UnsupportedOperationException(type + " not supported yet");
        }
    }
}
