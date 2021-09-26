package utils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String input = "nithin";
			
 						
 			
 			Map<Character, Integer> output = new LinkedHashMap<Character, Integer>();
 	        for (int i = 0; i < input.length(); i++) {
 	            char ch = input.charAt(i);
 	            if (output.containsKey(ch)) {
 	            	
 	            	 System.out.println(output.get(ch));
 	                output.put(ch, output.get(ch) + 1);
 	            } else {
 	                output.put(ch, 1);
 	            }

 	        }

 	        System.out.println(output);
			
 			System.out.println(output.entrySet());
			
	}

}
