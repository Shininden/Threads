package Threads.Semaforo;

public class Sinal implements Runnable
{
    private CorSemaforo cor;
	private boolean shouldStop;
	private boolean mudouCor;

	public Sinal()
    {
		this.cor = CorSemaforo.VERMELHO;
		this.shouldStop = false;
		this.mudouCor = false;

		new Thread(this).start();
	}

	@Override
	public void run() 
    {
		while(!shouldStop)
        {
			try 
            {
				Thread.sleep(this.cor.getDelayTime());
				this.mudarCor();
			} 
            catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private synchronized void mudarCor()
    {
		switch (this.cor) 
        {
            case VERDE:
			    this.cor = CorSemaforo.AMARELO;
            break;
            
            case AMARELO:
			    this.cor = CorSemaforo.VERMELHO;
			break;

		    case VERMELHO:
			    this.cor = CorSemaforo.VERDE;
			break;
		}
		this.mudouCor = true;
		notify();
	}
	
	public synchronized void esperaCorMudar()
    {
		while(!this.mudouCor)
        {
			try 
            {
				wait();
			} 
            catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.mudouCor = false;
	}
	
	public synchronized void desligarSemafaro(){
		this.shouldStop = true;
	}

	public CorSemaforo getCor() {
		return cor;
	}
}