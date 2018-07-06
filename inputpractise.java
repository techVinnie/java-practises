import java.util.*;

public class inputpractise {
public static void main(String [] args){
	
	
	Scanner sc = new Scanner(System.in);
	Scanner scc = new Scanner(System.in);
	
	System.out.println(" enter number of students" );
	int classs= sc.nextInt();
	while (classs>=1){
		
	
	
	System.out.println(" enter  marks for maths");
	int math= sc.nextInt();
	System.out.println(" enter  marks for english");
	int eng= sc.nextInt();
	System.out.println(" enter  marks for kiswahili");
	int kis= sc.nextInt();
	System.out.println(" enter  marks for chemisty");
	int che= sc.nextInt();
	System.out.println(" enter  marks for biology");
	int bio= sc.nextInt();
	System.out.println(" enter  marks for physics");
	int phy= sc.nextInt();
	System.out.println(" enter  marks for cre");
	int cre= sc.nextInt();
	System.out.println(" enter  marks for history");
	int his= sc.nextInt();
	System.out.println(" enter  marks for geography");
	int geo= sc.nextInt();
	
	

	float average;
	int sum;
	sum = math+eng+kis+che+bio+phy+cre+his+geo;
	average= sum/9;

	
	System.out.println(" your total marks are" + sum);
	System.out.println(" your average  marks is" + average);
	classs--;
}
	System.out.println(" done");	
sc.close();};
}

