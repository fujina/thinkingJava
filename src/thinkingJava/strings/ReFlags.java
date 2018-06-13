//: strings/ReFlags.java

package thinkingJava.strings;
import java.util.regex.*;

public class ReFlags {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("(\\w+)?able", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
		Matcher m  = p.matcher("able unable enable ability be able to do..  enable sb to do sth "
			+ "disabled about about Daround move about above below    "
			+ "above the sea level above the clouds abroad go abroad live abroad absence "
			+ "after a long absence after ten years¡¯ absence absent be absent from class "
			+ "be present at the meeting accident have an accident accurately accurate "
			+ "with great accuracy achieve -d achievement achieve great success  Dgain get "
			+ "great success across go across the river go across the bridge cross cross the "
			+ "road Dgo across the bridge crossing at the crossing act act as a reporter action "
			+ "take action active take an active part in ..  actively activity activities outdoor "
			+ "activities actor actress actors and actresses add added addition additional in addition "
			+ "add¡­to¡­ address  -es What¡¯s your address F an advertisement advertise advice a piece of ");
		while(m.find())
			System.out.println(m.group());
	}

}
