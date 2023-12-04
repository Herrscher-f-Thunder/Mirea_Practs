package Pract21;

import java.io.File;

public class N4 {
    public static void filesToList(String path){
        File[] files = new File(path).listFiles();
        if (files == null)
            System.out.println("Пусто");
        else{
            for (int i = 0; i < 5; ++i)
                System.out.println(files);
        }
    }

    public static void main(String[] args) {
        filesToList("src/Pract5");
    }
}
