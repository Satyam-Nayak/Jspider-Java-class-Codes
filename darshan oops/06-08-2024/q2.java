// write a java program to sort the give string as alphabet then numeric then specail charater
public class q2 {
    public static void main(String[] args) {
        String s ="Ab1d8@!vk";
        String alpha="",num="",specialc="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if ((c>='A' && c<= 'Z') || (c>='a' && c<='z')) {
                alpha=alpha+c;
            }else 
            if ((c>='0' && c<='9')) {
                num=num+c;
                }
                else {
                    specialc=specialc+c;
                    }

        }
        System.out.println("==============");
        System.out.println("fisrt string: " + s);
        System.out.println("==============");
        System.out.println("after rearange: "+alpha+num+specialc);
        
    }
}
