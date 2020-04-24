package com.savan.utility;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author SAVAN
 *
 */
@Component
public class ClientUtility {
	
	/**
	*	This method will Sort the array 
	*/
	public void sort(List list){ 
        for(int element=1;element<list.size();element++){
            
            int key = (Integer) list.get(element);
            
            for(int element2= element-1; element2>=0; element2--){
                if(key<(Integer) list.get(element2)){
                    
                    list.set(element2+1,list.get(element2));		/* Shifting Each Element to its right as key is 
                    									less than the existing element at current index */
                    
                    
                    if(element2==0){			// Special case scenario when all elements are less than key,so placing key value at 0th Position 
                        list.set(0, key);				 
                    }
                }else{
                    
                    list.set(element2+1,key);				/* Putting Key value after element at current index as Key
                    								   value is no more less than the existing element at current index */

                    break;			// You need to break the loop to save unnecessary iteration
                }
            }
        }
	}
	
	/**
	*	This method will Insert The Element In Array At Particular Position
	*/
	public void addNumber(List list,int number,int insposition){
		System.out.println("addNumber Meathod");
	
		list.add(insposition-1,number);
	}

	/**
	*	This method will delete The Element In Array From a Particular Position
	*/
	public void delNumber(List list,int delposition){
		System.out.println("in delNumber");

		list.remove(delposition-1);
	}

	/**
	*	This is the Utility Method to print the array
	*/
	public void print(List list){

		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println(" ");

	}

}
