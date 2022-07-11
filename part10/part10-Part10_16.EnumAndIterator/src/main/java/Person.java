public class Person {
    private String name;
    private Education highest;

    public Person(String name, Education highest) {
        this.name = name;
        this.highest = highest;
    }

    public Education getEducation() {
        return this.highest;
    }

    public String toString() {
        return this.name + ", " + this.highest;
    }
}
