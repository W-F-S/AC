
import java.util.Scanner;

public class base4{

public static void conversor (int base , int x){

	if(x >= base){
		conversor(base, x/base);
		System.out.print(x%base);
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	else{
		System.out.print(x);
	}

}                                                                                                                                                                                                                                                    
public static void main(String[] args){

	Scanner in = new Scanner(System.in);

	System.out.print("digite a base:");
	int base = in.nextInt();

	System.out.print("digite o numero a ser convertido: ");
	int x = in.nextInt();

	System.out.print("resposta: ");

	conversor(base, x);

	System.out.print("\n\n");

}





}
