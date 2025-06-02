// 1/50 question 
public class minmaxarray {


    public static void main(String[] args) {
        int[] arr = {59,7,99,3,5,1};
        int max=0;
        int min=arr[0];

              for(int i=0;i<arr.length;i++){
                   if (arr[i]>max){
                      max=arr[i];
                    }

                   if(min>arr[i]){
                     min=arr[i];
                    }
                }

                System.out.println("maximum element "+max);

                System.out.println("mimimum element "+min);
     }
    }
  
       