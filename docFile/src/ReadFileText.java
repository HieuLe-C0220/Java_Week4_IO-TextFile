import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileText {
    public static void main(String[] args) {
        String csvFile = "D:\\Codegym\\Module2-Java\\Week4\\IO-TextFile\\docFile\\BT.txt";
        BufferedReader br = null;
        String line = "";
        FileReader fileReader = null;
        String[] country;
        try {
            fileReader = new FileReader(csvFile);
            br = new BufferedReader(fileReader);
            while ((line = br.readLine())!=null) {
                //Sử dụng dấu phẩy làm dấu phân cách
                country = line.split(",");
                System.out.println(country[0]+" , "+country[5]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
