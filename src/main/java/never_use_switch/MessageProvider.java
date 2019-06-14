package never_use_switch;

import com.github.javafaker.GameOfThrones;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;
import static never_use_switch.DistribConst.*;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public class MessageProvider {
    private final GameOfThrones gameOfThrones;
    private final Random random;
    private List<String> types = asList(SMS, WHATSAPP,TELEGRAM);
    private final DistributionService service;

    @Scheduled(fixedDelay = 500)
    public void generateRandomMessage() {
        Message message = Message.builder().content(gameOfThrones.quote())
                .distributionType(types.get(random.nextInt(types.size())))
                .build();

        service.sendMessage(message);

    }


}
