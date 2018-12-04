package monsters;

public class Poring extends Monster {
	
	int[] aux = {4, 2, 6, 2, 4, 2};
	
	public Poring(String name) {
		super(name);
		int[] attr = { 7, 5, 10, 2, 4, 5 };
		this.attr.setAttributes(attr);
		this.base_attr = aux;
		
		this.exp = 5;
		
		updateStats();
	}
}
