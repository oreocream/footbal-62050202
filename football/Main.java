package football;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ScoreBorad obj1 = new ScoreBorad();
        HeadQuater obj = new HeadQuater();              
        obj.register(obj1);             
        while(true){
            String str = input.nextLine();
            if(!str.isEmpty()){
                obj.setscore(str);
            }else return;
        }    
    }
}