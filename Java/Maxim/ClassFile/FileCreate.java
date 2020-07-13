import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate {
    public static void showExistence(File f, File g)
    {
        System.out.printf("Existence: %s = %s %s = %s %n", f.getName(), f.exists(), g.getName(), g.exists());
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 2 file path.");
        String p1 = keyboard.nextLine();
        String p2 = keyboard.nextLine();
        try{
            creationPlay(new File( p1), new File( p2));
            System .out. println ( " Operations completed without errors " );
        }catch (IOException io){
            io.printStackTrace();
            System.out.println("Program terminated");
        }
    }

    public static void creationPlay(File f, File g) throws IOException
    {
        System .out. println ( " The two input files " );
        System .out. println ( " File1 = " + f. getCanonicalPath () );
        System .out. println ( " File2 = " + g. getCanonicalPath () );
        System .out. println ( " ---- Their initial state " );
        showExistence ( f, g );
        System . out. print ( " ---- Create File1 -> " );
        System .out. println ( f. createNewFile () );
        System . out. print ( " ---- Create File2 -> " );
        System .out. println ( g. createNewFile () );
        showExistence ( f, g );
        System . out. print ( " ---- Rename File1 to File1 -> " );
        System .out. println ( f. renameTo ( f ) );
        System . out. print ( " ---- Rename File1 to File2 -> " );
        System .out. println ( f. renameTo ( g ) );
        showExistence ( f, g );
        System . out. print ( " ---- Create File1 as a folder -> " );
        System .out. println ( f. mkdir () );
        System . out. print ( " ---- Create File2 as a folder -> " );
        System .out. println ( g. mkdir () );
        showExistence ( f, g );
        System . out. print ( " ---- Delete File1 -> " );
        System .out. println ( f. delete () );
        System . out. print ( " ---- Delete File2 -> " );
        System .out. println ( g. delete () );
        showExistence ( f, g );
    }
}
