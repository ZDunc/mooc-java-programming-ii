public class Book {
    private String name;
    private int recommendedAge;

    public Book(String name, int recommendedAge) {
        this.name = name;
        this.recommendedAge = recommendedAge;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.recommendedAge;
    }

    public String toString() {
        return this.name + "(recommended for " + this.recommendedAge + 
            " year-olds or older)";
    }
}
