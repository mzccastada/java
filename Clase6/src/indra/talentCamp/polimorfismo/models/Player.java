package indra.talentCamp.polimorfismo.models;

public abstract class Player {
	private String name;
	private int hp;	
	private int strength;
	private int skill;
	private int strengthModifier;
	
//	private int playerType = 1;		//1 - Warrior, 2 - Priest, 3 - Wizard	
	
	public Player(String name) {
		this.name = name;
		this.hp = 50;
		this.strength = 50;
		this.skill = 50;		
//		this.playerType = playerType;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	protected void setHp(int hp) {
		this.hp = hp;
	}
	
	public boolean isAlive() {
		return (this.hp > 0);
	}

	public int getStrength() {
		return strength;
	}

	protected void setStrength(int strength) {
		this.strength = strength;
	}

	public int getSkill() {
		return skill;
	}

	protected void setSkill(int skill) {
		this.skill = skill;
	}
	
	public int getStrengthModifier() {
		return strengthModifier;
	}

	protected void setStrengthModifier(int strengthModifier) {
		this.strengthModifier = strengthModifier;
	}

	public abstract void action(Player enemy);
	
	@Override
	public String toString() {
		return String.format("Nuestro personaje %s, llamado %s \n Tiene una salud: %d \n Tiene una destreza: %d \n Tiene fuerza : %d"  ,
                this.getClass().getSimpleName(),
                this.name,
                this.hp,
                this.skill,
                this.strength);
	}
	
	public void endTurn() {
		//Restaura los stats a los valores iniciales
		this.strengthModifier = 0;		
	}
}