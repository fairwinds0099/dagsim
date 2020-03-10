package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Edge {
    private boolean isInformation;
    private boolean isDecision;
    private int infoCapacity;
    private int instantenousInfo;
    private Node sourceNode;
    private Node destinationNode;
    private int attenuation;

    public Edge(Node commander, Node gOne) {
    }
}
