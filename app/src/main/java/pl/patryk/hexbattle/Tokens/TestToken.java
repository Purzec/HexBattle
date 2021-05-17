package pl.patryk.hexbattle.Tokens;

public class TestToken {

    private HexagonMaskView hexagonMaskView;
    private String nazwa;

    public TestToken(HexagonMaskView hexagonMaskView, String nazwa) {
        this.hexagonMaskView = hexagonMaskView;
        this.nazwa = nazwa;
    }

    public TestToken() {
    }

    public HexagonMaskView getHexagonMaskView() {
        return hexagonMaskView;
    }

    public void setHexagonMaskView(HexagonMaskView hexagonMaskView) {
        this.hexagonMaskView = hexagonMaskView;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
