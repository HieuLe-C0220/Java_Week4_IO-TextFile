import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
    public static void main(String[] args) {
        try {
            FileInputStream sourceFile = new FileInputStream("D:\\Codegym\\Module2-Java\\Week4\\IO-TextFile\\demo\\SourceFile.txt");
            FileOutputStream deskFile = new FileOutputStream("D:\\Codegym\\Module2-Java\\Week4\\IO-TextFile\\demo\\DeskFile.txt");
            int check;
            
            while ((check=sourceFile.read())!=-1) {
                deskFile.write(check);
            }
            sourceFile.close();
            deskFile.close();
        } catch (Exception e) {
            System.out.println("Tập nguồn không tồn tại");
            e.printStackTrace();
        }
    }
}
