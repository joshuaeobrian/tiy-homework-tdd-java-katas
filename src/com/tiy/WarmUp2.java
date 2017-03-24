package com.tiy;

/**
 * Created by josh on 3/22/17.
 */
public class WarmUp2 {



	public String stringYak(String str) {
		return str.replaceAll("yak","");
	}


	public String stringTimes(String str, int n) {
		String newString="";

		for(int i = 1; i <= n; i++){
			newString+=str;

		}
		return newString;
	}

	public String stringBits(String str) {
		String nString = "";
		for(int i = 0; i < str.length();i+=2){
			nString += str.charAt(i);
		}
		return nString;
	}

	public String stringSplosion(String str) {
		String nString = "";
		for(int i =  0; i <= str.length(); i++){
			nString += str.substring(0,i);
		}
		return nString;
	}

}
