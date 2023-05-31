package indra.talentCamp.polimorfismo.models;

public class Warrior extends Player{

	public Warrior(String name) {
		super(name);

	}
	
	@Override
	public void action(Player enemy) {
		System.out.format("%s ataca a %s y hace %d de daño\n", 
				this.getName(),
				enemy.getName(),
				this.getStrength());
		
		enemy.setHp(enemy.getHp() - this.getStrength());
	}
}