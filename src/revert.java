import java.util.Scanner;

public class revert {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int year,month,day;
        String birth;
        String name;
        String male;

        System.out.print("Input your name : ");
        name = s.nextLine();
        System.out.print("Input your birthday : ");
        birth = s.nextLine();
        System.out.print("Input your Sexual : ");
        male = s.nextLine();
        year = Integer.parseInt(birth)/10000;
        month = Integer.parseInt(birth)/100%100;
        day = Integer.parseInt(birth)%100;

        System.out.printf("%s : %d, %d, %d, %s",name,year,month,day,male);
    }
}
