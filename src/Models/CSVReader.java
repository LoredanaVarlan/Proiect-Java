package Models;

import java.time.LocalDate;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {




    public static List<Carte> citesteCartiCSV(String fileName)
    {
        Carte carteaux= new Carte();
        List<Carte> carti = new ArrayList<>();
        int i=0;
        Path pathToFile = Paths.get(fileName);
        System.out.println(pathToFile.toAbsolutePath());
        try (BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII)) {
            String line = br.readLine();

            while (line != null) {
                String[] atribute = line.split(",");
                carteaux.setDenumire(atribute[0]);
                carteaux.setGen(atribute[1]);
                carteaux.setData_publicare(LocalDate.parse(atribute[2]));
                carteaux.setNr_bucati(Integer.parseInt(atribute[3]));
                carti.add(carteaux);
                line = br.readLine(); }
            } catch (IOException ioe) { ioe.printStackTrace(); }
            return carti; }
        }


