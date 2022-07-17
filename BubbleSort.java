package com.jap.bubblesort;


public class BubbleSort {

    public int sortedDistances(int [] distances,String [] namesOfCities)
    {
        //write the logic to perform bubble sort on the distance
        //swap the namesOfCities also accordingly.
        // return 1 if the sorting is performed
		int temp;
        String temp2;
		int result=0;

        for (int i=0; i< distances.length; i++)
        {
            for (int j=0; j< distances.length-1; j++)
            {
                if (distances[j]>distances[j+1])
                {
                    temp=distances[j];
                    distances[j]=distances[j+1];
                    distances[j+1]=temp;

                    temp2=namesOfCities[j];
                    namesOfCities[j]=namesOfCities[j+1];
                    namesOfCities[j+1]=temp2;
                }
            }
        }
        int count=0;

		for (int i=0; i< distances.length;i++)
        {
            if (distances[i]>0)
            {
                count++;
			
            }

        }
		if (count==10)
		{
			result=1; 
		}
      return result;
        
    }

    public void printArray(int[] distances, String [] cityNames)
    {
        // iterate through the arrays and print the distance and 

		
		
		for (int i=0; i< distances.length; i++)
              {
                  System.out.println(distances[i]+" "+cityNames[i]);
              }

    }

    public static void main(String[] args) {
        //Declare the array with city names
        String[] citiesFromZurich = null;
        //Declare the array with distance from Zurich
        int[] distanceFromZurich = null;

        BubbleSort bubbleSort = new BubbleSort();

       // call the method 'sortedDistances' to sort the arrays based on distance
	   bubbleSort.sortedDistances(distanceFromZurich,citiesFromZurich);

       // call the method 'printArray' to print the sorted arrays
	   bubbleSort.printArray(distanceFromZurich,citiesFromZurich);
    }
}
