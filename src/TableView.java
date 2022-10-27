import java.util.HashMap;
import java.util.Map;

public class TableView extends View {

    @Override
    void show(HashMap<String, InfoModel> table) {
        System.out.println("Time    P      J    V    E    D    GP    GC    SG");
        for (Map.Entry<String, InfoModel> team : table.entrySet()) {
            System.out.println(team.getKey() + "\t"
                               + team.getValue().getScore() + "\t"
                               + team.getValue().getNumberOfGames() + "\t"
                               + team.getValue().getVictories() + "\t"
                               + team.getValue().getTies() + "\t"
                               + team.getValue().getDefeats() + "\t"
                               + team.getValue().getGoals() + "\t"
                               + team.getValue().getOwnGoals() + "\t"
                               + team.getValue().getGoalsBalance());
        }
    }
}
