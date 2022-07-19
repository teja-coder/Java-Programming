import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

class FileDemo {
    public static void p(String s){
        System.out.println(s);
    }
    public static void analyze(String s){
        File f = new File(s);
        if(f.exists()){
            p(f.getName() + " is a file");
            p(f.canRead() ? "is readable":"is not readable");
            p(f.canWrite()?"is writable":"is writable");
            p("FileSize: " + f.length() + "bytes");
            p("File last modified : " + f.lastModified());
        }
        if(f.isDirectory()){
            p(f.getName() + " is a directory");
            p("list of files");
            String dir[] = f.list();
            for(int i=0;i<dir.length;i++){
                p(dir[i]);
            }

        }
    }

}
public class FileDetails{
    public static void main(String[] args) {
        FileDemo fd = new FileDemo();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name : ");
        try{
        String s = br.readLine();
            fd.analyze(s);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
