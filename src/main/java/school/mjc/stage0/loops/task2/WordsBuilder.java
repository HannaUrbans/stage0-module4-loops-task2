package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public static void buildPhrase(char... chars) {
        String result = "";
        int i = 0;
        while (i < chars.length) {
            result = result + chars[i];
            i++;
        }
        System.out.print(result);
    }
    public static void main(String[] args) {
        char[] chars = {'l', 'o', 'o', 'p', 's', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'o', 'l'};
        buildPhrase(chars);
    }
}
