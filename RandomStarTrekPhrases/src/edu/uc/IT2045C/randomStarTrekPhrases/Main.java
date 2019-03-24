/***********************************************
 * Star Trek Random Phrase Generator
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 ***********************************************/
package edu.uc.IT2045C.randomStarTrekPhrases;

public class Main {

	public static void main(String[] args) {
		RandomStarTrekPhrases rstp = new RandomStarTrekPhrases();
		
		String phrase = rstp.buildPhrase();
		
		System.out.println(phrase);

	}
}
