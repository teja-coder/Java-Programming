import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        String fileContent = "Hello World";
        FileOutputStream outputStream = null;
        try{
            outputStream = new FileOutputStream("file.txt");
            byte[] strToByte = fileContent.getBytes();
            outputStream.write(strToByte);
            System.out.println("File written");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            if(outputStream!=null){
                try{
                    outputStream.close();
                }
                catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
