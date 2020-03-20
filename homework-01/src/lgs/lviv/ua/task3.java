package lgs.lviv.ua;

public class task3 {
	public static void main(String[] args) {
				
		
        int [] array = new int [10];
        int max = array[0], min = array[0];
        
        for (int i = 0; i < array.length; i++)
        	array[i] = i;
		
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) 
                max = array[i];

            if(array[i] < min) 
                min = array[i];
        }    
        
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        
	}
}
