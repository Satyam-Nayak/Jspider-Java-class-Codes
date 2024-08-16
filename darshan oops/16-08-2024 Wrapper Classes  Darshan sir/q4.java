//ip address 
//it must contains 4 segments number. All numbers should in the range of 0 to 225.
//"123.56.78.142"
//valid
//"56.32.365.78"
//Invalid
//"6.45.88"
//invalid

public class q4 {
    public static void main(String[] args) {
        String s = "23.26.45.88";
        String[] arr = s.split("[.]");
        if(arr.length==4){
            boolean flag=true;
            for(String ele:arr){
                int n=Integer.parseInt(ele);
                if(n<0||n>255){
                    flag=false;  
                    break;       
                }
            }
            System.out.println(flag==true?"valid":"Invalid");
        }else{
            System.out.println("Invalid");
        }
    }
}

