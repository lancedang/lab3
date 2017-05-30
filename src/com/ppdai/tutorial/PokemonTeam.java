package com.ppdai.tutorial;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PokemonTeam is a class that initializes every Pokemon object by reading every
 * line from external csv file and fill its internal list with every pokemon
 * 
 * @author Dangdang
 * @version 2017.5.21
 */
public final class PokemonTeam {
	private final List<Pokemon> creatures = new ArrayList<>();

	/**
	 * construct PokemonTeam by reading every line of given csv file
	 * @param filename
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public PokemonTeam(String filename) throws FileNotFoundException, IOException {
		// read external file, and fill the creatures
		BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
		String line = bufferedReader.readLine();
		line = bufferedReader.readLine();
		Pokemon pokemon;
		// split line and organize them to a Pokemen Object
		while (line != null) {
			// System.out.println(line);
			pokemon = new Pokemon(line);
			creatures.add(pokemon);
			line = bufferedReader.readLine();
		}

		bufferedReader.close();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String title1 = "First Generation Legendary Pokemon:\n\n";
		String title2 = "Third Generation Psychic Pokemon:\n\n";
		String title3 = "Legendary Water Pokemon:\n\n";

		StringBuilder item1 = new StringBuilder();
		StringBuilder item2 = new StringBuilder();
		StringBuilder item3 = new StringBuilder();
		for (Pokemon p : creatures) {
			if (p.isFirstGenLegendary()) {
				item1.append(p);
			}
			if (p.isThirdGenPsychic()) {
				item2.append(p);
			}
			if (p.isLegendayWater()) {
				item3.append(p);
			}
		}
		return title1 + item1 + "\n\n" + title2 + item2 + "\n\n" + title3 + item3;
	}

}
