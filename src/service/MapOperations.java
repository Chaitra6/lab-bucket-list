package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.TouristPlace;

public class MapOperations{
    Map<Integer,String> map = new HashMap<Integer,String>();
    
	public Map<Integer,String> add(TouristPlace places) {
		 for(int i=0; i< map.size();i++) {
			 map.put(i, places);
			 return map;
		 }		 
	}
	
	
}

 