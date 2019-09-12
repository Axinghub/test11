import java.io.Console;

public class Main {

    public static void main(String[] args) {
        int p3 = 0;
        int p4 = 0;
        for(int i=0;i<=1000;i++){
            String s = i+"";
            for (int j=0;j<s.length();j++){
                if(s.charAt(j)=='3'){
                    p3++;
                }
                if(s.charAt(j)=='4'){
                    p4++;
                }
//                if (p4==325 && p3 ==334){
//                    System.out.println(i);
//                    return;
//                }
            }


        }
        System.out.println(p3 + " "+ p4);
    }

}
