//:	holding/UniqueWords.java

package thinkingJava.holding;
import java.util.*;
import net.mindview.util.*;

public class UniqueWords {

	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>
		(new TextFile("src/thinkingJava/holding/SetOperations.java", "\\W+"));
		System.out.println(words);
	}
}/*output:
[A, B, C, Collections, D, E, F, G, H, HashSet, I, J, K, L, M, N, Print, Set, 
SetOperations, String, X, Y, add, addAll, added, args, class, contains, 
containsAll, false, from, holding, import, in, java, main, mindview, net, 
new, output, package, print, public, remove, removeAll, removed, set1, set2, 
split, static, thinkingJava, to, true, util, void]
*/