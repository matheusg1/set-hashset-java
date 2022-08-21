import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramaAprimorado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> listaAlunos = new HashSet<>();
        String[] curso = {"A", "B", "C"};

        try{
            for (int i = 0; i < 3; i++){
                System.out.print("Quantos estudantes no curso " + curso[i] + "? ");
                int quantidadeEstudantes = sc.nextInt();
    
                for (int j = 0; j < quantidadeEstudantes; j++) {
                    int estudantes = sc.nextInt();
                    listaAlunos.add(estudantes);
                }
                
            }
            System.out.println("Total de alunos " + listaAlunos.size());
        }
        catch(Exception e){
            System.out.println("ERRO!");
        }
        finally{
            sc.close();
        }
    }
}