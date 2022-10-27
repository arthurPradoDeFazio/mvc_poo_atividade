public class InfoModel {
    private int victories, ties, defeats, goals, ownGoals;

    public int getNumberOfGames() { return victories + ties + defeats; }
    public int getScore() { return 3 * victories + ties; }
    public int getGoalsBalance() { return goals - ownGoals; }
    public int getVictories() { return victories; }
    public int getTies() { return ties; }
    public int getDefeats() { return defeats; }
    public int getGoals() { return goals; }
    public int getOwnGoals() { return ownGoals; }

    public void setInfo(int newGoals, int newOwnGoals) {
        goals += newGoals;
        ownGoals += newOwnGoals;
        if (newGoals > newOwnGoals) {
            victories += 1;
        }
        else if (newGoals < newOwnGoals) {
            defeats += 1;
        }
        else {
            ties += 1;
        }
    }
}
