//: strings/Splitting.java

package thinkingJava.strings;

import java.util.*;

public class Splitting {
	public static String knights = "able unable enable ability be able to do..  enable sb to do sth "
			+ "disabled about about Daround move about above below    "
			+ "above the sea level above the clouds abroad go abroad live abroad absence "
			+ "after a long absence after ten years’ absence absent be absent from class "
			+ "be present at the meeting accident have an accident accurately accurate "
			+ "with great accuracy achieve -d achievement achieve great success  Dgain get "
			+ "great success across go across the river go across the bridge cross cross the "
			+ "road Dgo across the bridge crossing at the crossing act act as a reporter action "
			+ "take action active take an active part in ..  actively activity activities outdoor "
			+ "activities actor actress actors and actresses add added addition additional in addition "
			+ "add…to… address  -es What’s your address F an advertisement advertise advice a piece of ";


	public static void split(String regex) {
		System.out.println(Arrays.toString(knights.split(regex)));
	}

	public static void main(String[] args) {
		//split(" ");
		//split("\\W+");
		split("\\W+\\w+^(able)\\w+\\W+");
		//split("n\\W+");
	}
}
