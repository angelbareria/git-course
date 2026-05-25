package ArrayQuestions.LB28ArrayManipulations;

/**
 * @author abareria
 **/
public class ShiftArrayByOnePos {
  public static void shiftByOne(int[] arr){
    int temp = arr[arr.length - 1];
    int i = arr.length - 1;
    while( i > 0){
      arr[i] = arr[i-1];
      i--;
    }
    arr[0] = temp;

    for (int j : arr){
      System.out.println(j);
    }
  }

  public static void shiftByKPos(int[] arr,int k) {
    int[] temp = new int[k];
    int i = arr.length -1;
    int j = k - 1;

    while(i >= arr.length-k && j >= 0){
      temp[j] = arr[i];
      i--;
      j--;
    }

    for (int t = arr.length - 1 ; t >= k ; t--){
      arr[t] = arr[t-k];
    }

    for(int t = 0 ; t < k ; t++){
      arr[t] = temp[t];
    }

    for(int a: arr){
      System.out.println(a);
    }

  }

  public static void main(String[] args) {
    int[] arr = {10,20,30,40,50,60,70};
//    shiftByOne(arr);
    shiftByKPos(arr,4);
  }
}
