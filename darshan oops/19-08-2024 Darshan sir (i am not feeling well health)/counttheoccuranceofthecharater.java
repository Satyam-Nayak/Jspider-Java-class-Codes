//write a  java program to print the occurance of the charater in the given string 
//Input:- "hello"
//output:- 
//h-1
//e-1
//l-2
//o-1

public class counttheoccuranceofthecharater {
    public static void main(String[] args) {
        String s="hello";
        char[] arr1=s.toCharArray();
        char[] arr2=s.toCharArray();
        for(int i = 0; i<arr1.length;i++){
            int c= 0;
            for(int j = 0; j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    c++;
                    arr2[j]='\0';
                }
            }
            if(c>0){
                //if you need uniqe charater  if(c==1) 
                //if you need to print only the duplicate chataraters then if(c>1)

                System.out.println(arr1[i]+" :- "+c);
            }
        }
    }
}

// without using ascii values