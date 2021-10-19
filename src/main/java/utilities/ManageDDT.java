package utilities;



    import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

    public class ManageDDT extends CommonOps{


        @DataProvider(name = "data-provider loan Amount and down payment")
        public static Object[][] getDataFromCsv()
        {
            return
                    getDataFromCsv(getData("DDTFile"));
        }


        public static List<String> readCSV(String csvFile) {
            List<String> lines = null;
            File file = new File(csvFile);
            try {
                lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            } catch (IOException e) {
                System.out.println("faild : see details" + e);


            }
            return lines;
        }
        public static Object[][] getDataFromCsv(String filePath) {
            Object[][] data = new Object[2][2];
            List<String> cvsData = readCSV(filePath);
            for (int i = 0; i < cvsData.size(); i++) {
                data[i][0] = cvsData.get(i).split(",")[0];
                data[i][1] = cvsData.get(i).split(",")[1];



            }
            return data;
        }
    }


