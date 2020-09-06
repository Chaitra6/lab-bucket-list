package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.TouristPlace;

public class ListOperations{
	static List<TouristPlace> list=new ArrayList<TouristPlace>();
	
    public List<TouristPlace> add(TouristPlace places) {    	
    	list.add(places);    
    	return list;
   }
    
    public List<TouristPlace> remove(TouristPlace places) {    	
    	list.remove(places);    
    	return list;    	
    }
    
    public Object sortByDestination(List places) {
    	
        places.sort((TouristPlace p1,TouristPlace p2)-> p1.getDestination().compareTo(p2.getDestination()));
        return places;
    }
    
    public Object sortByRank(List places) {
    	places.sort((TouristPlace p1,TouristPlace p2)-> p1.getRank().compareTo(p2.getRank()));
        return places;
    }
    
    public Object reset(List places) {
    	places.clear();
    	return places;
    }
    
    
    
}
