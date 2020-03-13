package it.polito.tdp.parole.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Parole {
	private Map<String, String> elenco;  
		
	public Parole() {
	 elenco = new TreeMap <String, String>(); 
	}
	
	public void addParola(String p) {
		elenco.put(p, p); 
		//TODO
	}
	
	public List<String> getElenco() {
		LinkedList<String> elencotemp = new LinkedList<String>(elenco.values()); 
		//TODO
		return elencotemp;
	}
	
	public void reset() {
		elenco.clear();
		// TODO
	}
	/*@Override
	public String toString() {
		LinkedList<String> elencotemp =new LinkedList<String> (elenco.values()); 
		String tot= ""; 
		for (String s :elencotemp) {
			if(s!=null) {
				tot = tot +" "+ s+" \n";
			}
		}
		return null;
		
	}*/

}
