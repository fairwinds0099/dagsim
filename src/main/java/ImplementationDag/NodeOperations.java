package ImplementationDag;

import model.Decision;
import model.Information;

import java.time.Duration;

public interface NodeOperations {

    public Information processInformation(Information info);
    public Information processInformation(Information info, Duration duration);

    public Decision convertInfoToDecision(Information info);

}
