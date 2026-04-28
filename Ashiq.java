import java.io.*;

public class Ashiq {
    public static void main(String[] args) {
        File fileinit = new File("AEJ_1010");
        fileinit.mkdirs();
        String path = fileinit.getAbsolutePath();

        File f1 = new File(path, "data.txt");
        try {
            f1.createNewFile();
            FileWriter fw1 = new FileWriter(f1);
            fw1.write("Md Shoriful Islam Ashiq\nSummer");
            fw1.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

// ekta bank er jonne class create kora hoise , bank er modde kar koto amount tk ase oita hide kora ase. ar hocche oitar moddhe bole deya ase, 2 ta method ase. 2 ta method, salary acc, bounus acc, to build: bolbe salary 500000  and arekta method 500000 + 5%. output asbe 1 sec por por.

// use oop concept and thread combined to build