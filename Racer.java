
public class Racer implements Runnable {
	
	public class RaceDemo {

	}

	public static String winner;
	public void race(){
		int distance;
		
		for(distance=1; distance<=100; distance++){
			//Thread.currentThread().getName() -> gets name from RaceDemo that pass to Thread constructor
			System.out.println("Distance covered by "+Thread.currentThread().getName()+" is :"+distance+" meters");
			//check if race is complete by someone
			boolean isWon = this.isRaceWon(distance);
			if(isWon)
				break;
		}
	}
	
	private boolean isRaceWon(int distanceCoverd){
		boolean isWon = false;
		//AND -> if both operations true then true
		if((Racer.winner == null) && (distanceCoverd == 100)){
			String winnerName = Thread.currentThread().getName();
			//setting the winner name
			Racer.winner = winnerName;
			System.out.println("The winner is: "+Racer.winner);
			isWon = true;
		}
		else if(Racer.winner == null){
			isWon = false;
		}
		else if(Racer.winner != null){
			isWon = true;
		}
		
		return isWon;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.race();
	}

	
}
