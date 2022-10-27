import java.util.HashMap;

public class Model {
    private HashMap<String, InfoModel> table = new HashMap<>();

    public void update(String firstTeam, int firstTeamGoals, String secondTeam, int secondTeamGoals) {
        updateTeamInfo(firstTeam, firstTeamGoals, secondTeamGoals);
        updateTeamInfo(secondTeam, secondTeamGoals, firstTeamGoals);
    }

    private void updateTeamInfo(String team, int teamGoals, int ownGoals) {
        InfoModel firstTeamInfo = table.get(team);
        if (firstTeamInfo == null) {
            firstTeamInfo = new InfoModel();
            table.put(team, firstTeamInfo);
        }
        firstTeamInfo.setInfo(teamGoals, ownGoals);
    }
}
