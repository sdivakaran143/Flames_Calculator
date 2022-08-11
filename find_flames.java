package flames;
import java.util.*;
public class find_flames {
    static Scanner in = new Scanner(System.in);
    static String n1 = "";
    static String n2 = "";
    public void result(char res){
        System.out.print("the relation between "+n1+" and "+n2+" is ends with relation : ");
        switch(res){
            case 'F':
            System.out.println("Friendship");
                break;
            case 'L':
                System.out.println("Love");
                break;
            case 'A':
                System.out.println("Affection");
                break;
            case 'M':
                System.out.println("Marriage");
                break;
            case 'E':
                System.out.println("Enemy");
                break;
            case 'S':
                System.out.println("Brother / Sister");
                break;
        }
    }

    public void output(int len) {
        String f = "FLAMES";
        int n =len;
        int k=0;

        String res="";
        for(int i=0;true;i++){
           if(Character.isAlphabetic(f.charAt(i))){
            k++;
            if(n==k){
                f=f.substring(0, i)+" "+f.substring(i+1);
                k=0;
            }
           }
           if(i+1==f.length()){
            i=-1;
            }
            res=f.replace(" ", "");
            if(res.length()==1){
                break;
            }

        }
        result(res.charAt(0));
        }

    public String getstring(String str1, String str2) {
        String output = "";
        String outputf = "";
        n1=str1;
        n2=str2;

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int pos = str2.indexOf(ch);
            if (pos == -1) {
                continue;
            }
            str2 = str2.substring(0, pos) + "8" + str2.substring(pos + 1);
            pos = str1.indexOf(ch);
            str1 = str1.substring(0, pos) + "8" + str1.substring(pos + 1);
        }
        output = str1 + str2;
        for (int i = 0; i < output.length(); i++) {
            char ch = output.charAt(i);
            if (Character.isAlphabetic(ch)) {
                outputf += ch;
            }
        }
        return outputf;
    }
}