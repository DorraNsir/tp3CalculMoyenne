package TD3EX2;

public class MotDico {
    static int num;
    private String mot;
    private String definition;

    public MotDico(String mot, String definition) {
        this.mot = mot;
        this.definition = definition;
        num++;
    }

    public  String getMot() {
        return mot;
    }

    public  String getDefinition() {
        return definition;
    }

    public void setMot(String mot) {
        this.mot = mot;

    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
    public  boolean synonyme (MotDico m){
        return (m.definition==this.definition);
    }

    @Override
    public String toString() {
        return "MotDico{" +
                "mot='" + mot + '\'' +
                ", definition='" + definition + '\'' +
                '}';
    }
}
