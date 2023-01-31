import java.io.*;
//import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;

public class main {
    public static void main(String[] args) {
//        FileInputStream fileInputStream = null;
//        try {
//            fileInputStream = new FileInputStream("file.txt");
//            int a;
//            while ((a = fileInputStream.read()) != -1) {
//                System.out.print((char) a); // ??????????????? ?????
//            }
////        } catch (FileNotFoundException e) {
////            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if(fileInputStream != null) {
//                try {
//                    fileInputStream.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }
//        // считывает побайтно каждый символ
//        try ( FileInputStream fileInputStream = new FileInputStream("file.txt")) {
//            int a;
//            while ((a = fileInputStream.read()) != -1) {
//                System.out.print((char) a);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        // считывает целую строку как масив байтов
//        try ( FileInputStream fileInputStream = new FileInputStream("file.txt")) {
//            byte[] bytesArray = fileInputStream.readAllBytes();
//            String valye = new String(bytesArray);
//            System.out.println(valye);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        // записываем инфу в файл
//        try(FileOutputStream fileOutputStream = new FileOutputStream("file1.txt")) {
//            String somevalye = "Hello World";
//            fileOutputStream.write(somevalye.getBytes(StandardCharsets.UTF_8));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        // 16-ти битные значения
////        FileWriter; - записываем
////        FileReader; - считываем
//        try(FileReader fileReader = new FileReader("file1.txt")) {
//            int a;
//            while ((a = fileReader.read()) != -1) {
//                System.out.println((char) a);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        try(FileWriter fileWriter = new FileWriter("file3.txt")) {
//            String somevalye = "Hello World";
//            fileWriter.write(somevalye);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//считывается 1 строка
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"))){
//            System.out.println(bufferedReader.readLine());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        vse stroki
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"))){
//            String valye;
//            while ((valye = bufferedReader.readLine()) != null) {
//                System.out.println(valye);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
// zapisivaem ifo
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text4.txt")) ){
//            String valye = "Hello World" ;
//            bufferedWriter.write(valye);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//      второе задание
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"))) {
//            String valye;
//            TextFormater textFormater = new TextFormater();
//            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file1.txt"))) {
//                while ((valye = bufferedReader.readLine()) != null){
//                    if (textFormater.checkingForPolydromes(valye) == true ) {
//                        bufferedWriter.write(valye);
//                        bufferedWriter.write("\n");
//                    }
//                    if (textFormater.numberOfWords(valye) < 5 && textFormater.numberOfWords(valye) > 3 ){
//                        bufferedWriter.write(valye);
//                        bufferedWriter.write("\n");
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        первое задание
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Polyndrom.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file2.txt"))) {
                String valye;
                TextFormater textFormater = new TextFormater();
                while ((valye = bufferedReader.readLine()) != null) {
                    if (textFormater.checkingForPolydromes(valye) == true) {
                        bufferedWriter.write(valye);
                        bufferedWriter.write("\n");
                    }
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    try with resource
}
