package sampleProj.javaAssignments.assignment6;

import java.util.Map.Entry;
import java.util.TreeMap;

import sampleProj.javaAssignments.assignment6.Contact.Gender;

public class TestTreeMap {
	public static void main(String args[]){  
		TreeMap<Integer,Contact> map=new TreeMap<Integer,Contact>();
		for (int i = 11111116; i > 11111111; i--) {
			Contact c = new Contact();
			if(i>11111113)
				c.setGender(Gender.female);
			else
				c.setGender(Gender.male);
			c.setName("java"+i);
			c.setEmail("java"+i+".com");
			c.setPhoneNumber(i);
			map.put(i, c);
		}

		for(Entry<Integer, Contact> m:map.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}    
	}  
}
