/***********************************************
 * Star Trek Random Phrase Generator
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 * Enhancements:
 * 1. Read nouns, verbs, adjectives from text files.
 * 2. Add adverbs
 * 3. Deal with plural and singular nouns
 ***********************************************/

package edu.uc.IT2045C.randomStarTrekPhrases;

import java.util.ArrayList;
import java.util.Random;

public class RandonStarTrekPhrases {

	static ArrayList<String> verbs;
	static ArrayList<String> nouns;
	static ArrayList<String> adjectives;
	private Random random;
	
	public RandonStarTrekPhrases(Random random) {
		this.random = random;
		initWordLists();
	}
	
	public RandonStarTrekPhrases() {
		this.random = new Random();	// Truly random
		initWordLists();
	}
	
	public String buildPhrase() {
		String phrase;
		phrase = verbs.get(random.nextInt(verbs.size())) 
				 + " the " 
				 +  adjectives.get(random.nextInt(adjectives.size()))
				 + " " 
				 + nouns.get(random.nextInt(nouns.size()));
		return phrase;
	}
	private void initWordLists() {
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		initVerbs();
		initNouns();
		initAdjectives();
	}
	private void initVerbs(){
		verbs.add("calibrate");
		verbs.add("initialize"); 
		verbs.add("reset");
		verbs.add("repair");
		verbs.add("initiate");
		verbs.add("install");
		verbs.add("destroy");
		verbs.add("adjust");
		verbs.add("align");
		verbs.add("test");
		verbs.add("run full diagnostics on");
		verbs.add("eject");
		verbs.add("recalibrate");
		verbs.add("scan");
		verbs.add("reprogram");
	}
	
	private void initAdjectives(){
		adjectives.add("exterior");
		adjectives.add("interior");
		adjectives.add("phased");
		adjectives.add("pulsed");
		adjectives.add("aft");
		adjectives.add("forward");
		adjectives.add("subspace");
		adjectives.add("hyperspace");
		adjectives.add("top secret");
		adjectives.add("deep space");
		adjectives.add("digital");
	}
	private void initNouns(){
		nouns.add("thrusters");
		nouns.add("phasers");
		nouns.add("scanners");
		nouns.add("anteannas");
		nouns.add("tachyon particles");
		nouns.add("torpedoes");
		nouns.add("Captians Ready Room");
		nouns.add("transporter");
		nouns.add("photon torpedoes");
		nouns.add("plasma cannons");
		nouns.add("disruptors");
		nouns.add("saucer section");
		nouns.add("warp drive");
		nouns.add("beryllium sphere");
		nouns.add("dilithium crystals");
		nouns.add("holodeck");
		nouns.add("quantum singuilarity");
		nouns.add("shuttle craft");
		nouns.add("antenna array");
		nouns.add("sensor array");
		nouns.add("temporal anomalies");
		nouns.add("wormhole");
		nouns.add("tractor beam");
		nouns.add("universal translator");
		nouns.add("cloaking device");
		nouns.add("landing party");
		nouns.add("captian's log");
		nouns.add("Vulcan homeworld");
		nouns.add("Borg mothership");
		nouns.add("sickbay");
	}
	/**
	 * Return a representation of the current object in string form
	 * @return The string
	 */
	public String toString() {
		return verbs.size() + " verbs, " + adjectives.size() + " adjectives, " + nouns.size() + " nouns ."; 
	}
	
	/**
	 * ToDo Complete this
	 * @param noun
	 */
	public void addNoun(String noun) {
		
	}
	/**
	 * ToDo Complete this
	 * @param verb
	 */
	public void addVerb(String verb) {
		
	}
	/**
	 * ToDo Complete this
	 * @param adjective
	 */
	public void addAdjective(String adjective) {
		
	}
	/**
	 * Retrieve a copy of the list of nouns
	 * @return the copy of the list of nouns
	 */
	@SuppressWarnings("unchecked")		// We are absolutely certain that nouns is of type ArrayList<String>
	public static ArrayList<String> getNouns() {
		return (ArrayList<String>) RandonStarTrekPhrases.nouns.clone();	// A deep copy or a shallow copy?
	}
	/**
	 * ToDo complete this
	 * Retrieve a copy of the list of verbs
	 * @return the copy of the list of verbs
	 */
	@SuppressWarnings("unchecked")		// We are absolutely certain that nouns is of type ArrayList<String>
	public static ArrayList<String> getVerbs() {
		return null;
	}
	/**
	 * ToDo complete this
	 * Retrieve a copy of the list of adjectives
	 * @return the copy of the list of adjectives
	 */
	@SuppressWarnings("unchecked")		// We are absolutely certain that nouns is of type ArrayList<String>
	public static ArrayList<String> getAdjectives() {
		return null;
	}
}
