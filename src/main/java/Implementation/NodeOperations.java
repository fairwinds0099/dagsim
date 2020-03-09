package Implementation;

import model.Decision;
import model.Information;

public interface NodeOperations {

    public Information processInformation(Information info);

    public Decision convertInfoToDecision(Information info);

}
