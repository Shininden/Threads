package Threads.TiqueTaque;

public class Logic_TiqueTaque 
{
	boolean shouldTick;

	synchronized void tique(boolean isPlayingTique)
    {
		if (isPlayingTique == false)
        {
			shouldTick = true;
			notify();
			return; //Stops execution
		}

		System.out.print("Tique ");

		shouldTick = true;

		notify(); // Taque can be executed now

		try 
        {
			while (shouldTick){
				wait();
			}
		} 
        catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized void taque(boolean isPlayingTaque)
    {
		if (isPlayingTaque == false)
        {
			shouldTick = false;
			notify();
			return; //Stops execution
		}

		System.out.println("Taque");

		shouldTick = false;

		notify(); // Tique can be executed now

		try 
        {
			while (shouldTick == false){
				wait();
			}
		} 

        catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}