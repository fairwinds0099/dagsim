import ImplementationDag.NodeOperations;
import model.Decision;
import model.Edge;
import model.Information;
import model.Node;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class test {


    @Test
    public void testMe() {
        Node commander = new Node();
        commander.setLabel("JFC");

        Node gOne = new Node();

        Edge fromCommanderToGone = new Edge(commander, gOne);

        Information information = new Information();
        information.setEssentiality(80);
        information.setUsefulness(70);
        information.setHarmfulness(10);
        information.setUselessness(35);



        Information processedInfo = commander.processInformation(information);

        System.out.println( commander.getLabel() + "ara isareti  " +

                processedInfo.getEssentiality());


    }

}
