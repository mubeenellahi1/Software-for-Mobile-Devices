//Author Mubeen Ellahi
//l154077 Section B

//The following code is for a Cricket Game.

//abstract class
abstract class Cricketer{
	
	int shirtNumber;
	String name;
	int age;
	String playerState;
	
	
	//non abstract methods
	public Cricketer(int shirtNumber,int age,String name,String playerState){
		
		this.shirtNumber=shirtNumber;
		this.age=age;
		this.name=name;
		this.playerState=playerState;
	}
	
	public void tagAsInjured(){
		playerState="Injured";
	}
	
	public void tagAsFit(){
		playerState="Fit";
	}
	
	
	//abstract method
	public abstract void  celebrate();
	
}

interface batsmanInterface {
	
	public abstract void pullShot();
	public abstract void drive();
	
}

interface bowlerInterface {
	
	public abstract void bouncer();
	public abstract void yorker();
	
}


class AllArounder extends Cricketer implements batsmanInterface,bowlerInterface {
    
    //non static nested class
    class CareerBestStats{
        
        int bowling_wickets;
        int bowling_runsConceded;
        int bowling_overs;
        
        
        int batting_ballsFaced;
        int batting_runsScored;
        
        public void updateBowlingStats(int wickets,int runs,int overs){
            
            bowling_wickets=wickets;
            bowling_runsConceded=runs;
            bowling_overs=overs;
        }
        
        public void updateBattingStats(int balls,int runs){
            
            batting_ballsFaced=balls;
            batting_runsScored=runs;
        }
    }
    
    
    AllArounder(int shirtNumber,int age,String name,String playerState){
        
        super(shirtNumber,age,name,playerState);
    }
    
    
    //static nested class
    static class AllArounderRankingTable{
        
        String[] rankings;
        
        AllArounderRankingTable(){
            
            rankings=new String[4];
            
            
        }
        
        public void printRanking(){
            
            System.out.println("****All Arounder Rankings****\n");
            for (int i=0;i<3;i++){
                int j=i+1;
                System.out.println(j+". "+rankings[i]+"\n");
            }
        }
        
        public void addPlayer(String name,int rankingNumber){
            rankings[rankingNumber-1]=name;
        }
    }
    
    
    
    
	
	public void pullShot(){
		System.out.println("Pull Shot Played\n");
	}
	
	public void drive(){
		System.out.println("drive shot Played\n");
	}
	
	public void bouncer(){
		System.out.println("bouncer bowled!!\n");
	}
	
	public void yorker(){
		System.out.println("yorker bowled\n");
	}
	
	public void celebrate(){	
		System.out.println("Celebrating\n");
	}
	
}

public class mainClass{
    
    public static void main(String args[]){
	
	    AllArounder ShahidAfridi = new AllArounder(11,22,"Shahid Afridi","fit");
	    
	    //interface class functions
	    ShahidAfridi.pullShot();
	    ShahidAfridi.drive();
	    ShahidAfridi.yorker();
	    ShahidAfridi.bouncer();
	    
	    //abstract parent class functions
	    ShahidAfridi.celebrate();
	    
	    
	    //static nested class and it's fuctions
	    AllArounder.AllArounderRankingTable rankings = new AllArounder.AllArounderRankingTable();
	    rankings.addPlayer("Shahid Afridi",1);
	    rankings.addPlayer("Abdur Razzaq",2);
	    rankings.addPlayer("Mubeen Ellahi",3);
	    rankings.printRanking();
	    
	    
    }    
    
}
