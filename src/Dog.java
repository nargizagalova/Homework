public class Dog {
    private String breed;
    private String sound;
    private int age;

    public Dog(String breed, String sound, int age) {
        this.breed = breed;
        this.sound = sound;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", sound='" + sound + '\'' +
                ", age=" + age +
                '}';
    }
}
