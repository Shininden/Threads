package Threads.TiqueTaque;

public class Logic_TiqueTaque 
{
	boolean shouldTique;

	synchronized void tique(boolean isPlayingTique)
    {
		if (!isPlayingTique)
        {
			shouldTique = true;
			notify(); // notifies the other Thread
			return; //Stops execution
		}

		System.out.print("Tique ");

		shouldTique = true;

		notify(); // Taque can be executed now

		try 
        {
			while (shouldTique){
				wait(); // so that Taque can be run and turn shouldTique into false
			}
		} 
        catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized void taque(boolean isPlayingTaque)
    {
		if (!isPlayingTaque)
        {
			shouldTique = false;
			notify();
			return; //Stops execution
		}

		System.out.println("Taque");

		shouldTique = false;

		notify(); // Tique can be executed now

		try 
        {
			while (!shouldTique){
				wait();
			}
		} 

        catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}