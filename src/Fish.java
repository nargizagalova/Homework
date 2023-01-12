public class Fish {
    private String type;
    private int weight;
    private String located;

    public Fish(String type, int weight, String located) {
        this.type = type;
        this.weight = weight;
        this.located = located;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getLocated() {
        return located;
    }

    public void setLocated(String located) {
        this.located = located;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", located='" + located + '\'' +
                '}';
    }
}
