package pl.patryk.hexbattle.Tokens;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Hex {
    private  List<Hex> neighbours;
    private  List<HexDirection> directionList;
    private float HexpositionX;
    private float HexpositionY;
    private boolean busy = false;



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


    public Hex(float hexpositionX, float hexpositionY) {
        HexpositionX = hexpositionX;
        HexpositionY = hexpositionY;

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

    public Hex getNeighbours( HexDirection hexDirection)
    {
        int kierunek = hexDirection.getDirectionValue();
        this.neighbours.get(kierunek);
        return this.neighbours.get(kierunek);
    }





    public Hex(List<Hex> neighbours, List<HexDirection> directionList, float hexpositionX, float hexpositionY) {
        this.neighbours = neighbours;
        this.directionList = directionList;
        HexpositionX = hexpositionX;
        HexpositionY = hexpositionY;
    }



    public String pokazSasiadaNaHExie(Hex nasz, HexDirection podajkierunek)
    {
        int kierunek = podajkierunek.getDirectionValue();
        String sasiad = Optional.ofNullable(neighbours.get(kierunek)).toString();
        System.out.println(Optional.of(sasiad).orElse("Brak sasiada"));
       return Optional.of(sasiad).orElse("Brak sasiada");
    }

    public float getHexpositionX() {
        return HexpositionX;
    }

    public void setHexpositionX(float hexpositionX) {
        HexpositionX = hexpositionX;
    }

    public float getHexpositionY() {
        return HexpositionY;
    }

    public void setHexpositionY(float hexpositionY) {
        HexpositionY = hexpositionY;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }


}
