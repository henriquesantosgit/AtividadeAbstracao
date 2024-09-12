import java.util.Scanner;

public class barco
{
    Scanner scan = new Scanner(System.in);
 
   public double tamanho;
    public double peso;

    public String nome;
    public String ano;
    public boolean ancorado;

    public barco(double tam, double pe, String no, String an){

        this.tamanho = tam;

        this.peso = pe;

        this.nome = no;

        this.ano = an;

    }

    public barco() {

        this.tamanho = 0;

        this.peso = 0;

        this.nome = "";

        this.ano = "";

        this.ancorado = true;

    }

      public void subirAncoras(boolean subir) {

        if (subir) {

            System.out.println("Subindo âncoras...");

            this.ancorado = false;

        } else {

            System.out.println("Deixando âncoras...");

            this.ancorado = true;

        }

    }
    
      public void Navegar(){

        
if(!ancorado){

            System.out.println("Navegando");

        }else{

            System.out.println("Parado");

        }
    
}

}
