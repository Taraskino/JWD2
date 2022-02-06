package Zajęcie_4.Laboratorium_17;

public enum Computation {
    ADD{
        @Override
        public double perfoorm(double x, double y) {
            return x + y;
        }
    },
    SUBTRACT{
        @Override
        public double perfoorm(double x, double y) {
            return x - y;
        }
    },
    MULTIPLY{
        @Override
        public double perfoorm(double x, double y) {
            return x * y;
        }
    },
    DIVIDE{
        @Override
        public double perfoorm(double x, double y) {
            return x / y;
        }
    };

    public abstract double perfoorm(double x, double y);
}
