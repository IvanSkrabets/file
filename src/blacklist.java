import java.io.*;
import java.util.Arrays;

public class blacklist {
    public static void main(String[] args) {
        blacklist blacklist = new blacklist();
        blacklist.censorship—heck();
    }
    public void censorship—heck (){
        try (BufferedReader blacklist = new BufferedReader(new FileReader("blacklist.txt"));
             BufferedReader text = new BufferedReader(new FileReader("text.txt"));) {
            String valye;
            String textSort;
            String [] myArray = new String[10];
//            while ((valye = blacklist.readLine()) != null){
//                System.out.println(Arrays.toString(valye.split(" ")));
            for (int i = 0; (valye = blacklist.readLine()) != null; i++ ) {
                myArray[i] = valye;
                }
            System.out.println(Arrays.toString(myArray));
            while ((textSort = text.readLine()) != null){
                if (comparison(myArray, textSort) == true) {
                    System.out.println(textSort);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean comparison (String[] myArray, String textsort){
        int a = 0;
        String[] words = textsort.split(" ");
        for (String word : words) {
            for (int i = 0; myArray[i] != null;i++)
                if (word.equals(myArray[i])) {
                    return true;
                }
            }
        return false;
    }


}
