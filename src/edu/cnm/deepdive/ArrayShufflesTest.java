package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;



class ArrayShufflesTest extends ArrayShuffles {
 	
	@Test
	void testStringShuffle() throws FileNotFoundException, IOException {
		String[] names = names("students.txt");
		System.out.println(Arrays.toString(names));
		ArrayShuffles.shuffle(names);
		System.out.println(Arrays.toString(names));
		ArrayShuffles.shuffle(names, new SecureRandom());
		System.out.println(Arrays.toString(names));
	}
	
	@Test
	private String[] names(String filename) throws FileNotFoundException, IOException {
		// try with resources. Resources implement AutoCloseable interface and will close with exception.
		try (
			InputStream input = new FileInputStream(filename); //open file
			Reader reader = new InputStreamReader(input); // read file contents char @ time
			BufferedReader buffer = new BufferedReader(reader); // read file line @ time
		){
			List<String> names = new LinkedList<>(); 
			for (String name = buffer.readLine(); name != null; name = buffer.readLine()) {
				name = name.trim();
				if (!name.isEmpty()) {
					names.add(name);
				}
			}
			return names.toArray(new String[names.size()]);
		} 
	}

}
