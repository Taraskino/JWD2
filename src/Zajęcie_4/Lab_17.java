package Zajęcie_4;

public enum Lab_17 {
    N("North", "Pólnoc"),
    E("East", "Wschód"),
    W("West", "Zachód"),
    S("South", "Poluden"),
    NE("North East", "Pólnocny wschód"),
    NW("Torth west", "Pólnocny zachód"),
    SE("South east", "Poludniowy wschód"),
    SW("South west", "Poludniowy zachód");

    private String CardinalDirection;
    private String CardinalDirectionPl;

    Lab_17(String cardinalDirection, String cardinalDirectionPl) {
        CardinalDirection = cardinalDirection;
        CardinalDirectionPl = cardinalDirectionPl;
    }

    public String getCardinalDirection() {
        return CardinalDirection;
    }

    public void setCardinalDirection(String cardinalDirection) {
        CardinalDirection = cardinalDirection;
    }

    public String getCardinalDirectionPl() {
        return CardinalDirectionPl;
    }

    public void setCardinalDirectionPl(String cardinalDirectionPl) {
        CardinalDirectionPl = cardinalDirectionPl;
    }
}
