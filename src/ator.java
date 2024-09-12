import java.util.Scanner;

public class Ator{

    Scanner scan = new Scanner(System.in);

    public String nome;

    public String papel;

    public int idade;

    
    public Ator(String nm, String pp, int  idd){

        this.nome = nm;

        this.papel = pp;

        this.idade idd;

    }

    
    public Ator(){

        this.nome = "";

        this.papel = "";

        this.idade = 0;

    }

    public void atuar(String papel, String ator){

        System.out.println("O ator: "+ator+ " esta fazendo o papel de: "+papel);

    }

}
