package Listas;

public class Team implements Comparable<Team> {

    private String teamName;
    private int wins;

    public Team(String teamName, int wins) {
        this.teamName = teamName;
        this.wins = wins;
    }


    public void setTeamname(String teamName){
        this.teamName=teamName;
    }

    public String getTeamname() {
        return teamName;
    }


    public int getWins() {
        return wins;
    }


    public void setWins(int wins) {
        this.wins = wins;
    }

@Override
public int compareTo(Team o){
    if (this.wins<o.getWins()){
        return -1;
    }else if(this.wins== o.getWins()){
        return 0;
    }else {
        return 1;
    }
}



    

    
    
    
}
