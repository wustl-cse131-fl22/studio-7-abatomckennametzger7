package studio7;

public class Die {
	
	private int n;
	
	public Die(int initn) {
		n=initn;
	}
	public int getN() {
		return n;
	}
	public int throwDie() {
		int random = (int)(Math.random()*n)+1;
		return random;
	}

	public static void main(String[] args) {
		Die throw1 = new Die(6);
		System.out.println("First roll:" + throw1.throwDie());
	}

}
