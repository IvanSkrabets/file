import com.sun.jdi.Value;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TextFormater {
    private boolean aBoolean;

    public int numberOfWords(String valye) {
                int a = 0;
                String[] words = valye.split(" ");
                for (String word : words) {
                    a++;
                }
        return a;
    }

    public boolean checkingForPolydromes(String valye) {

        int a = 0;
                String[] words = valye.split(" ");
                for (String word : words) {
                    for (int i = 0; i < word.length() / 2; ++i) {
                        if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                           a ++;
                        } else {
                          a = a - i;
                           break;
                        }
                    }
                }
                if (a > 0) {
                    return true;
                }
        return false;
    }
}
