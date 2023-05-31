package indra.talentCamp.polimorfismo.models;

public class Wizard extends Player {
	
	private int magicPower;
	private int mana;

	public Wizard(String name) {
		super(name);
		this.magicPower = 10;
		this.mana = 100;
	}
	
	@Override
	public void action(Player enemy) {
		System.out.format("%s lanza un hechizo a %s y modifica sus stats\n",
				this.getName(),
				enemy.getName());
		
		if(mana > magicPower) {
			enemy.setStrengthModifier(-this.magicPower);
			this.mana -= magicPower;
		}
	}
	
	@Override
	public void endTurn() {
		super.endTurn();
		this.mana += 1;		
	}
}