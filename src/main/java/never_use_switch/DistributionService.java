package never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Service
public class DistributionService {


    @Autowired
    private Map<String, Sender> map;

   /* public DistributionService(List<Sender> senders) {
        map = senders.stream().collect(toMap(Sender::myType, a -> a));
    }*/

    public void sendMessage(Message message) {
        String type = message.getDistributionType();

        Sender sender = map.get(type);
        if (sender == null) {
            throw new UnsupportedOperationException(type + " not supported yet");
        }
        sender.send(message);
    }
}




