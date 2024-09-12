package abstracao;
import java.util.Scanner;
public class helicoptero {
	Scanner scan = new Scanner(System.in);
	public double peso;
	public double tamanho;
	public String marca;
	public String cor;
	
	public helicoptero(double kilos, double comprimento, String fabricante) {
		this.peso = kilos;
		this.tamanho = comprimento;
		this.marca = fabricante;
	}
	public void voar(boolean subir, boolean descer) {
		if(subir == true) {	
			System.out.println("subiu");
		}else if(subir == false) {
			System.out.println("não subiu");
		}
		else if(descer == true){
			System.out.println("Desceu");
		}else if(descer == false){
			System.out.println("não desceu");
		}else{
			System.out.println("digite uma opção valida");
		}
	}
	
}
