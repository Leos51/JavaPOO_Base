import training.afpa.cda24060.poobase.exercices.part2.ex1.Person;
import training.afpa.cda24060.poobase.exercices.part2.ex1.Staff;
import training.afpa.cda24060.poobase.exercices.part2.ex1.Student;
import training.afpa.cda24060.poobase.exercices.part2.ex2.Capitale;
import training.afpa.cda24060.poobase.exercices.part2.ex2.Ville;
import training.afpa.cda24060.poobase.exercices.utils.Clavier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.run();

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
    private static void run(){
        /*PARTIE 2 */
       /* Exercice 1 */
//        Person person1 = new Person("Abraham Lincoln","us");
//        Student student1 = new Student("robert C martin","UK", "CDA",2025,1000);
//        Staff staff1 = new Staff("A2","fr","AFPA",2500);
//        System.out.println(person1.toString());
//        System.out.println(student1.toString());
//        System.out.println(staff1.toString());


        /*Exercice 2*/
//        Ville v1 = new Ville("Lyon", 1500000);
//        Ville v2 = new Ville("Bobigny");
//
//        Capitale c1 = new Capitale("Paris","France",10000000);
//        Capitale c2 = new Capitale("Ouagadougou","Burkina-Faso");
//
//        System.out.println(v1.afficheToi());
//        System.out.println(v2.afficheToi());
//        System.out.println(c1.afficheToi());
//        System.out.println(c2.afficheToi());



/*Test classe clavier*/


System.out.println("entrer valeur");
        Clavier c = new Clavier();
        String red =c.lireString();
        System.out.println(red);
        }

    }
