
package hbqdung.utils;

public class API {
    public static String getName(String fullname){
        String s="";
        for(int i=fullname.length()-1;i>=0;i--)    {
            if(fullname.charAt(i)==' ')break;
            s=fullname.charAt(i)+s;
        }
        return s;
    }
}