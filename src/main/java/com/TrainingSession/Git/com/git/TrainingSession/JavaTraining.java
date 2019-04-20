package com.TrainingSession.Git.com.git.TrainingSession;

import java.util.HashMap;
import java.util.Map;

public class JavaTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void findDuplicateCharacter(String str){
		Map<Character, Integer> map= new HashMap<Character,Integer>();
		int count=0;
		char[] ch=str.toCharArray();
		for(char ch1:ch){
			if(map.containsKey(ch1)){
				map.get(ch1);
				count++;
				map.put(ch1, count);
			}
			
			
		}
		
		
		
		
	}

}
