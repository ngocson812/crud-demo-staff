public class Nvien {
    private int id;
    private String name;
    private int age;

    public static int tangid = 1;


    public Nvien() {
    }

    public Nvien(String name, int age) {
        this.name = name;
        this.id = tangid++;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nvien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
