package oscar;

import static java.lang.Integer.parseInt;

public class Oscar {
    Integer Index;
    Integer Year;
    Integer Age;
    String Name;
    String Movie;

    public Oscar(Integer Index, Integer Year, Integer Age, String Name, String Movie){
        this.Index = Index;
        this.Year = Year;
        this.Age = Age;
        this.Name = Name;
        this.Movie = Movie;
    } {
    }

    public static Oscar fromLine(String line){
        String[] split = line.split(",(?=\\S)");
        return new Oscar(
                parseInt(split[1]),
                parseInt(split[2]),
                parseInt(split[3]),
                split[4],
                split[5]
        );
    }
}
