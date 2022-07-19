import java.io.FileOutputStream;
import java.io.IOException;

public class CreateWriteFile {
    public static void main(String[] args) {
        String fileContent = "Hello World";
        FileOutputStream outputStream = null;
        try{
            outputStream = new FileOutputStream("file.txt");
            byte[] strToBytes = fileContent.getBytes();
            outputStream.write(strToBytes);
            System.out.println("File is created successfully and data is written");
        }
        catch(Exception e){
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
