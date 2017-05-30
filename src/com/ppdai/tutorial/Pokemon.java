package com.ppdai.tutorial;

/**
 * Pokemon is a entity class which stands for the game object unit
 * 
 * @author Dangdang
 * @version 2017.5.21
 */
public final class Pokemon {
	private final int number;
	private final String name;
	private final String type1;
	private final String type2;
	private final int total;
	private final int hp;
	private final int attack;
	private final int defense;
	private final int spAttack;
	private final int spDefense;
	private final int speed;
	private final int generation;
	private final boolean legendary;

	public Pokemon(String strg) {
		// TODO Auto-generated constructor stub
		String[] items = strg.split(",");
		this.number = Integer.valueOf(items[0]);
		this.name = items[1];
		this.type1 = items[2];
		this.type2 = items[3];
		this.total = Integer.valueOf(items[4]);
		this.hp = Integer.valueOf(items[5]);
		this.attack = Integer.valueOf(items[6]);
		this.defense = Integer.valueOf(items[7]);
		this.spAttack = Integer.valueOf(items[8]);
		this.spDefense = Integer.valueOf(items[9]);
		this.speed = Integer.valueOf(items[10]);
		this.generation = Integer.valueOf(items[11]);
		this.legendary = Boolean.valueOf(items[12]);
	}

	public boolean isFirstGenLegendary() {
		if (this.generation == 1 && this.legendary) {
			return true;
		}
		return false;
	}

	public boolean isThirdGenPsychic() {
		if (this.generation == 3 && (this.type1.equals("Psychic") || this.type2.equals("Psychic"))) {
			return true;
		}
		return false;

	}

	public boolean isLegendayWater() {
		if (this.legendary && (this.type1.equals("Water") || this.type2.equals("Water"))) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return String.format("%-25s %-12s %-12s Generation: %-6s%s\n", this.name, this.type1, this.type2,
				this.generation, this.legendary ? "Legendary" : "");
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String getType1() {
		return type1;
	}

	public String getType2() {
		return type2;
	}

	public int getTotal() {
		return total;
	}

	public int getHp() {
		return hp;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public int getSpAttack() {
		return spAttack;
	}

	public int getSpDefense() {
		return spDefense;
	}

	public int getSpeed() {
		return speed;
	}

	public int getGeneration() {
		return generation;
	}

	public boolean isLegendary() {
		return legendary;
	}
}
