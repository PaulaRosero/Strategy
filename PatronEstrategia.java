import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PatronEstrategia {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  System.out.print("Ingrese el primer número: ");
		  float value1=Float.parseFloat(br.readLine());
		  System.out.print("Ingrese el segundo número: ");
		  float value2=Float.parseFloat(br.readLine());
	      Context context = new Context(new Suma());		
	      System.out.println("Suma = " + context.executeStrategy(value1, value2));

	      context = new Context(new Resta());		
	      System.out.println("Resta = " + context.executeStrategy(value1, value2));

	      context = new Context(new Multiplicacion());		
	      System.out.println("Multiplicacion = " + context.executeStrategy(value1, value2));
	   }

}
