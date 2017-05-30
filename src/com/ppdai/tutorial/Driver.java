package com.ppdai.tutorial;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Driver {
	private static PokemonTeam team;
	public static void main(String[] args) throws FileNotFoundException, IOException {
		team = new PokemonTeam("Pokemon.csv");
		System.out.println(team);
	}
}
