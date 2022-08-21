import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Set<Integer> listaAlunos = new HashSet<>();

        try{
            System.out.println("Quantos estudantes no curso A? ");
            int estudantesA = sc.nextInt();

            for (int i = 0; i < estudantesA; i++) {
                listaAlunos.add(sc.nextInt());

            }

            System.out.println("Quantos estudantes no curso B? ");
            int estudantesB = sc.nextInt();

            for (int i = 0; i < estudantesB; i++) {
                listaAlunos.add(sc.nextInt());
            }

            System.out.println("Quantos estudantes no curso C? ");
            int estudantesC = sc.nextInt();

            for (int i = 0; i < estudantesC; i++) {
                listaAlunos.add(sc.nextInt());
            }

            System.out.println("Total de alunos: " + listaAlunos.size());
        }
        catch(Exception e){
            System.out.println("ERRO! ");
        }
        finally{
            sc.close();
        }
    }
}
