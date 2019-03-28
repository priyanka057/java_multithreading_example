
public class RaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Racer racer = new Racer();
		//cretaing two threads that runs simultaneously
		//Thread(Runnable targer, String Name)
		Thread tortoiseThread = new Thread(racer, "Tortoise");
		Thread hareThread = new Thread(racer, "Rabbit");
		//tell threads to start
		tortoiseThread.start();
		hareThread.start();
	}

}
