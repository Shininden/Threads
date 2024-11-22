package Threads.TiqueTaque;

public class Teste 
{
	public static void main(String[] args) 
    {
		Logic_TiqueTaque logicTT = new Logic_TiqueTaque();
		ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", logicTT);
		ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", logicTT);
		
		try 
        {
			tique.thread.join();
			taque.thread.join();
		} 
        catch (InterruptedException e) {
			e.printStackTrace();
		}

		
	}
}