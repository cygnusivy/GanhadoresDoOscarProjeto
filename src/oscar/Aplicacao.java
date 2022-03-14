package oscar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aplicacao {
    private static ManipulacaoArquivo oscarmale;
    private static ManipulacaoArquivo oscarfemale;
    private Oscar rosterOscar;

    public static void main(String[] args) {

        oscarmale = new ManipulacaoArquivo("oscarmale.csv");
        oscarfemale = new ManipulacaoArquivo("oscarfemale.csv");

    }

    private void ganhadorMaisJovem() {
        List<Oscar> roster = oscarmale.getRoster();
        System.out.println("Ganhador mais Jovem: " + roster.stream().sorted(Comparator.comparing(Oscar::getAge)).findFirst());
    }

    private void ganhadoraMaisJovem() {
        List<Oscar> roster = oscarfemale.getRoster();
        System.out.println("Ganhadora mais jovem: "+ roster.stream().sorted(Comparator.comparing(Oscar::getAge)).findFirst());
    }
}