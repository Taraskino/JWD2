package Zajęcie_4.Typy_wyliczyniowe;

public enum Formatter {
    CALM{
        public String format(String message){
            return "Here is your message: " + message;
        }
    },
    NERVOUS{
        public String format(String message){
            return "ARGH! STOP bpthering me with your message!!!" + message;
        }
    };

    public abstract String format(String message);

}
