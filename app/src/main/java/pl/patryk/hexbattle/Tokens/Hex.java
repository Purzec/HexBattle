package pl.patryk.hexbattle.Tokens;

import java.util.ArrayList;
import java.util.List;

public class Hex {

    private final List<Hex> neighbours;
    private final List<HexDirection> directionList;
/*    private HexDirection hexForward = HexDirection.FORWARD;
    private HexDirection forwardRight = HexDirection.FORWARD_RIGHT;
    private HexDirection forwardLeft = HexDirection.FORWARD_LEFT;
    private HexDirection back = HexDirection.BACK;
    private HexDirection backLeft = HexDirection.BACK_LEFT;
    private HexDirection backRight = HexDirection.BACK_RIGHT;*/




   public Hex(){
        this.directionList = new ArrayList<HexDirection>(6);
        this.neighbours = new ArrayList<Hex>(6);
        this.neighbours.add(null);
        this.neighbours.add(null);
        this.neighbours.add(null);
        this.neighbours.add(null);
        this.neighbours.add(null);
        this.neighbours.add(null);
        this.directionList.add(0,HexDirection.FORWARD);
        this.directionList.add(1,HexDirection.FORWARD_RIGHT);
        this.directionList.add(2,HexDirection.BACK_RIGHT);
        this.directionList.add(3,HexDirection.BACK);
        this.directionList.add(4,HexDirection.BACK_LEFT);
        this.directionList.add(5,HexDirection.FORWARD_LEFT);
    }

    public void addNeighbours(Hex hexNeighbour, HexDirection neighbourHexDirection) {
        this.neighbours.set(neighbourHexDirection.getDirectionValue(), hexNeighbour);
    }


}
