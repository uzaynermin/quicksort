
package quicksort;

public class QuickSortt {
    public int partition (int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1;
        int j = low;
        
        
        while(j< high){
            if(arr[j]>pivot){
                
                
                j++;
            }
            else{
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
                
            }
        }
        
        int tmp = arr[i+1];
        arr[i+1]= arr[j];
        arr[j] = tmp;
       
        return i+1;
    }
    
    
    public void sort(int arr[],int low,int high){
        if (low < high){
        int ref = partition(arr, low, high);
        sort(arr, low, ref-1);
        sort(arr, ref+1, high);
        
        }
    }
    
    public void print(int d[]) {
        for (int j = 0; j < d.length; j++) {
            System.out.print(d[j] + " ");
        }
        System.out.println();
    }
    
    
    
}



