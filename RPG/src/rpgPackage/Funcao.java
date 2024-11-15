package rpgPackage;
import java.util.Scanner;

public class Funcao {
	Scanner sc = new Scanner(System.in);
	
	public void confirmarLeitura () {
		 try {
	            Thread.sleep(1500);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		System.out.println("Para continuar aperte ENTER\n");
		sc.nextLine();
	}
	
	public void Leitura () {
		 try {
	            Thread.sleep(1500);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}
}
