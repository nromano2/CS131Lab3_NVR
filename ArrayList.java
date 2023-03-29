/**
 * Module 3 Programming Lab Starter Code
 * @version 1.0
 */
public class ArrayList<T> {
	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{                                                               	    	                                      				 		                                                                                         		
   		arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

   	@SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor

   	/**
   	 * addItem method takes in a generic object and checks to see if there is space within the array to add that item. 
   	 * @param item
   	 * @return boolean value based on whether the object was added.
   	 */
   	public boolean addItem(T item)
   	{
   		boolean itemAdded = false;
   		
   		if(currentItem < arList.length)
   		{
   			arList[currentItem] = item;
   			currentItem++;
   			itemAdded = true;
   		}
   		
   		return itemAdded;
   	}
   	
	@Override
	public String toString() {
		String obj = "";
		for(T element : arList)
		{
			obj = obj.concat(element.toString() + "\n");
		}
		return obj;
	}
	
   	
   	
}//end class

