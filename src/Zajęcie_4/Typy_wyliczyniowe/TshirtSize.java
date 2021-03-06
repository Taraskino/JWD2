package Zajęcie_4.Typy_wyliczyniowe;

public enum TshirtSize {
    S(48,71,36),
    M(52, 74, 38),
    L(56, 76, 41),
    XL(61, 79, 41);

    private int chestWidth;
    private int shirtLength;
    private int sleeveLength;

    TshirtSize(int chestWidth, int shirtLength, int sleeveLength) {
        this.chestWidth = chestWidth;
        this.shirtLength = shirtLength;
        this.sleeveLength = sleeveLength;
    }

    public int getChestWidth() {
        return chestWidth;
    }

    public void setChestWidth(int chestWidth) {
        this.chestWidth = chestWidth;
    }

    public int getShirtLength() {
        return shirtLength;
    }

    public void setShirtLength(int shirtLength) {
        this.shirtLength = shirtLength;
    }

    public int getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(int sleeveLength) {
        this.sleeveLength = sleeveLength;
    }
}
