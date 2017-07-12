package cz.vutbr.feec.utko;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Vector;

public class ExampleSet {
	private Vector<Example> examples = new Vector<Example>();

	public static ExampleSet read(String fileName) {
		ExampleSet es = new ExampleSet();
		try {
			FileInputStream in = new FileInputStream(fileName);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			String strLine; 
			while ((strLine = br.readLine()) != null) {
				Example e = new Example(strLine);
				es.add(e);
			}
			return es;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public void add(Example e) {
		examples.add(e);
	}
	
	public Example get(int index) {
		return examples.get(index);
	}
	
	public int size() {
		return examples.size();
	}

}
