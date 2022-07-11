import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> hash;

    public Abbreviations() {
        hash = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        hash.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.hash.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        if (this.hasAbbreviation(abbreviation))
            return hash.get(abbreviation);
        else
            return null;
    }
}
