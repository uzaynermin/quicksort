
package quicksort;

public class Sort {
    public int Quicksort (int arr[], int low, int high){
        
        int pivot = arr[high];
        int i = low -1;
        int j=low;
        
        
        while (j<high-1){
            if (arr[j]<=pivot){
                i++;
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
                j++;
            }
            else{
                j++;
            }
        }
        
        int tmp = arr[i+1];
        arr[i+1]= arr[high];
        arr[high] = tmp;

        
        
        return i;
    }
    
    
    public void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
           
            int pi = Quicksort(arr,high,low);
 
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    
    public void print(int d[]) {
        for (int j = 0; j < d.length; j++) {
            System.out.print(d[j] + " ");
        }
        System.out.println();
    }
    
    
    
}
