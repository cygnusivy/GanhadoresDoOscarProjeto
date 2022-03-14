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
    private void ganhadorMaisJovem(){
        System.out.println("Ganhador mais Jovem: ");
        List<Oscar> roster = ManipulacaoArquivo.getRoster();
        roster.stream().sorted(Comparator.comparing(Oscar.getAge)).findFirst();
    }














    private void atrizMaisJovemGanhouOscar() {
    }

    private void atorMaisJovemGanhouOscar() {
    }


    public void abrindoArquivoParaLeitura(){
            try (Stream<String> stream = Files.lines(Paths.get(System.getProperty("Users.nasci"), "oscarfemale.csv"))) {
                List<String> linhas = stream.collect(Collectors.toList());
                List<Oscar> oscars = converteEmObjeto(linhas);
                oscars.forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    private static List<Oscar> converteEmObjeto(List<String> linhas) {
        List<Oscar> resultado = new ArrayList<>();
        for (String linha : linhas) {
            String[] campos = linha.split(";");
            Oscar novoOscar = new Oscar(
                    Integer.parseInt(campos[2]),
                    Integer.parseInt(campos[1]),
                    Integer.parseInt(campos[3]),
                    campos[4],
                    campos[5]
            );
            resultado.add(novoOscar);
        }
        return resultado;
    }
}
