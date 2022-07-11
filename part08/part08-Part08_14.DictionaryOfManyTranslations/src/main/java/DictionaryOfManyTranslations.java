import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dict;

    public DictionaryOfManyTranslations() {
        this.dict = new HashMap<>();
    }

    public void add(String word, String translation) {
        // if word not yet in dict, initialize new ArrayList
        this.dict.putIfAbsent(word, new ArrayList<>());

        // retrieve list
        ArrayList<String> t = this.dict.get(word);
        t.add(translation);
    }

    public ArrayList<String> translate(String word) {
        // retrieve list
        ArrayList<String> t = this.dict.get(word);

        // check if list exists
        if (t == null)
            return new ArrayList<>();
    
        return t;
    }

    public void remove(String word) {
        dict.remove(word);
    }
}
