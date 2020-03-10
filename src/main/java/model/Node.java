package model;

import ImplementationDag.NodeOperations;

import java.time.Duration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Node implements NodeOperations {

    private int level;
    private String nodeType;
    private String label;

    @Override
    public Information processInformation(Information info) {
        info.setHarmfulness(info.getHarmfulness()*2);
        info.setEssentiality(info.getEssentiality()+5);
        return info;
    }

    @Override
    public Information processInformation(Information info, Duration duration) {
        return null;
    }

    @Override
    public Decision convertInfoToDecision(Information info) {
        return null;
    }


}
