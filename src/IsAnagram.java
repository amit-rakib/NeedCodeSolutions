import java.util.Arrays;

public class IsAnagram {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "racecar";
		String t = "carrace";
		
		boolean is = isAnagram(s, t);
		System.out.println(is);

	}

	private static boolean isAnagram(String s, String t) {
		// TODO Auto-generated method stub
		
		
		if(s.length() != t.length()) {
			return false;
		}
		
		char[] sortS = s.toCharArray();
		Arrays.sort(sortS);
		
		char[] sortT = t.toCharArray();
		Arrays.sort(sortT);
		
		
		return Arrays.equals(sortS, sortT);
		
	}

}
