package Threads.Semaforo;

public enum CorSemaforo 
{
    VERDE(1000), AMARELO(300), VERMELHO(2000);
	
	private int delayTime;
	
	CorSemaforo(int tempoEspera){
		this.delayTime = tempoEspera;
	}

	public int getDelayTime() {
		return delayTime;
	}
}