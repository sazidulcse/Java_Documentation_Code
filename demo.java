import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;
class coustom {

String me = "emon hasan ";

}
public class demo{
    public static void main(String[] args)throws IOException {
        coustom personal  =new coustom();
        String name = personal.me="sazidul rahman";
        System.out.println(name);

        String s ; 
        int num, roll, sum; 
        
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter num : ");
s = br.readLine();
num = Integer.parseInt(s);
System.out.print("Enter roll : ");

s = br.readLine();
roll = Integer.parseInt(s);
sum = num +roll;
System.out.println(sum );




    }
}