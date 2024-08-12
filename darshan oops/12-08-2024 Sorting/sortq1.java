//Write a java program to sort the given array like this
// input {5,2,3,4,1}
// output: 55,52,53,54,51,25,22,23,24,21,35,32,33,34,31,45,42,43,41,15,12,13,14,11

public class sortq1 {
    public static void main(String[] args) {
        int[] arr={5,2,3,4,1};
        int c=0;
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length; j++){
                System.out.println(arr[i]+ " " + arr[j]);
                c++;
                }
            }
            System.out.println("====================");
            System.out.println("total number:- "+c);
        }
    }

