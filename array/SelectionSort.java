public class SelectionSort{
 public static void selectionSort(int[] ar){
  for(int i=0;i<ar.length;i++){
   int min = ar[i];
   int minIndex=i;

    for(int j=i+1;j<ar.length;j++){
     if(ar[j]<min){
      min=ar[j];
      minIndex=j;
     }
    }
   if(minIndex!=i)
   {
    ar[minIndex]=ar[i];
    ar[i]=min;
   }
  }
 }
}
