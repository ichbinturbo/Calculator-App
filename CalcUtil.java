import java.util.Scanner;

public class CalcUtil {
Scanner scanner = new Scanner(System.in);

double height;
double width;

public void getHeight() {
	// TODO Auto-generated method stub
	System.out.println("please input height");
	height = scanner.nextDouble();
	System.out.println(height); 
	
}

public void getWidth() {
	// TODO Auto-generated method stub
	System.out.println("please input width");
	width = scanner.nextDouble();
	System.out.println(width);
}



public void calculate() {
	
	double ans = width * height;
	System.out.println("Answer in feet " + ans);
	ans = ans * 0.09290304;
	System.out.println("Answer in metres " + ans);
	
}
	
}