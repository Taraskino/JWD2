package Zajęcie_4.Laboratorium_17;

import pl.edu.wszib.WashingMachine;

import javax.naming.NamingEnumeration;

public enum CardinalPoint {
        N("Pl", "No", 0),
        E("wschód", "East", 90),
        S("Plo", "South", 180),
        W("Zachód", "West", 270),
        NE("PlWszh", "NorthEast", 45),
        SE("PolWszh", "SouthEast", 135),
        SW("Pol Zasch","SouthWest", 225),
        NW("Pol zachod", "NorthWest", 315);
        private String namePL;
        private String nameEn;
        private int rotation;

        @Override
        public String toString() {
                return "CardinalPoint{" +
                        "namePL='" + namePL + '\'' +
                        ", nameEn='" + nameEn + '\'' +
                        ", rotation=" + rotation +
                        '}';
        }

        public String getNamePL() {
                return namePL;
        }

        public void setNamePL(String namePL) {
                this.namePL = namePL;
        }

        public String getNameEn() {
                return nameEn;
        }

        public void setNameEn(String nameEn) {
                this.nameEn = nameEn;
        }

        public int getRotation() {
                return rotation;
        }

        public void setRotation(int rotation) {
                this.rotation = rotation;
        }

        CardinalPoint(String namePL, String nameEn, int rotation) {
                this.namePL = namePL;
                this.nameEn = nameEn;
                this.rotation = rotation;
        }
}
