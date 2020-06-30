

interface SortStudent {
   public void input(Student s);
   public void display();
   public void sort();
   public void sort(Student s,int low,int high);
}

public class BubbleSort implements SortStudent{
    
    public void input(Student s) {
      System.out.println("Jack");
   }

   public void display() {
      System.out.println("Jack");
   } 

   public void sort() {
        
 int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }        
                 }   
         } 

   public static void main(String args[]) {
      BubbleSort m = new Bubblesort();
      m.input();
      m.display();
      m.sort();
      m.sort(Student s,int low,int high);
   }  
} 

public class MergeSort implements SortStudent{
    
    public void input(Student s) {
      System.out.println("Jack");
   }

   public void display() {
      System.out.println("Jack");
   } 

   public void sort(Student s, int low, int high) 
    {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        // recursively sort 
        sort(a, low, mid); 
        sort(a, mid, high); 
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) 
        {
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < N; k++) 
            a[low + k] = temp[k];         
    } 
    
    
    
    
    
}