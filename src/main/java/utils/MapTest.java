package utils;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap<String,String> seleniumTest = new LinkedHashMap<>();
			seleniumTest.put("1", "Testing1");
			
			seleniumTest.put("2", "Testing2");
			
			seleniumTest.put("1", "TestingOne");
			
			seleniumTest.entrySet();
			
			System.out.println(seleniumTest);
	}

}
