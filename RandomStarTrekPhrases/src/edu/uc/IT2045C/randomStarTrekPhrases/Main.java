/***********************************************
 * Random Phrase Generator
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 ***********************************************/
package edu.uc.IT2045C.randomStarTrekPhrases;


public class Main {

	public static void main(String[] args) {
		RandonStarTrekPhrases rstp = new RandonStarTrekPhrases();
		
		String phrase = rstp.buildPhrase();
		
		System.out.println(phrase);

	}

}
