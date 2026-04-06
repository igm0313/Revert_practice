import java.util.Scanner;

public class revert {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int year,month,day;
        String birth;
        String name;

        birth = s.nextLine();
        name = s.nextLine();
        year = Integer.parseInt(birth)/10000;
        month = Integer.parseInt(birth)/100%100;
        day = Integer.parseInt(birth)%100;

    }
}
