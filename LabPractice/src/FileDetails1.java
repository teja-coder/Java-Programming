import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

class FileDemo1{
    static void p(String s){
        System.out.println(s);
    }
    void analyze(String s){
        File f = new File(s);
        if(f.exists()){
            System.out.println(f.getName() + "is a file");
            System.out.println(f.canRead());
            System.out.println(f.canWrite());
            System.out.println(f.length());
            System.out.println(f.lastModified());
        }
        if(f.isDirectory()){
            System.out.println(f.getName());
            String dir[] = f.list();
            for(int i=0;i<dir.length;i++){
                p(dir[i]);
            }
        }
    }
}
public class FileDetails1 {
    public static void main(String[] args) {
        FileDemo1 fd = new FileDemo1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name : ");
        try {
            String s = br.readLine();
            fd.analyze(s);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
