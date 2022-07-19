import java.io.FileOutputStream;
import java.io.IOException;
public class FileCreation {
    public static void main(String[] args) {
        String fileContent = "Hello world";
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("file.txt");
            byte[] strToBytes = fileContent.getBytes();
            outputStream.write(strToBytes);
            System.out.println("FIle is successfully created with the content");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            if(outputStream!=null){
                try{
                    outputStream.close();
                }
                catch(IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
