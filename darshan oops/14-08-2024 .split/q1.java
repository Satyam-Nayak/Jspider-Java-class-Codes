//write a java program to print the longest word present in the given string , if more same longest length word present print the first occured

public class q1 {
    public static void main(String[] args) {
        String s1= "hi helloooo welcomee bye";
        // String s1= "abc defg klo kj";
        String[] arr1=s1.split(" ");
        String ans=arr1[0];
        int max=ans.length();
        for(String ele :arr1){
            if(ele.length()>max){
                max=ele.length();
                ans=ele;
            }
        }
        System.out.println("longest word:- "+ans);
        
    }
}

// ...................... if you want last occurance just we have to do this (>=)..............

// if(ele.length()>=max){
//     max=ele.length();
//     ans=ele;
// }
