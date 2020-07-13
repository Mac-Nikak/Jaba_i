import java.io.File;

public class FileTest {
    public static void main(String[] args)
    {
        File folder = new File("../Test");
         System.out.println(folder.delete());
        System.out.print(folder.exists());
    }
}
