package Threads.SomadorThread;

public class MinhaThreadSoma implements Runnable 
{
	private String nome;
	private int[] nums;
	private static Somador calc = new Somador();
	
	public MinhaThreadSoma(String nome, int[] nums)
    {
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start();
	}

	@Override
	public void run() 
    {
		System.out.println(this.nome + " iniciada");
		
		int soma = calc.somaArray(this.nums);
		
		System.out.println("\nResultado da soma da thread " + this.nome + " = " + soma);
		
		System.out.println(this.nome + " terminada");
	}
}