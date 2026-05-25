package ArrayQuestions.LB28ArrayManipulations;

/**
 * @author abareria
 **/
public class ReverseArray {
  public static void main(String[] args) {
    int[] arr = {2,4,6,8,9};
    int[] revArr = reverse(arr);
    for (int i: revArr){
      System.out.println(i);
    }
  }

  static int[] reverse(int[] arr){
    int i = 0;
    int j = arr.length - 1;
    while(i < j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
    return arr;
  }


}


