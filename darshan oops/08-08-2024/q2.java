//write a java program to print how many times cat repeat in this string "abcathcathjcaktcat"

public class q2 {
    public static void main(String[] args) {
        String str = "abcathcathjcaktcat";
        int count = 0;
        for (int i = 0; i < str.length()-2 ; i++) {

            //darshans method
            if(str.charAt(i)=='c' && str.charAt(i+1)=='a' && str.charAt(i+2)=='t'){
                count++;
            }

            //========= Chintu's method=========
            // if(str.charAt(i)=='c'){
            //     if(str.charAt(i+1)=='a'){
            //         if(str.charAt(i+2)=='t'){
            //             count++;
            //         }
            //     }
            // }                
            }
            System.out.println( "cat reapeted "+count );
        }
        

    }
    

