
class Human{
    public char name;
    public char company;

    Human(char n , char c ){
        this.nam


    }

   

   


    void Displayinfo(){
        System.out.println("Enter your name: " + name);
        System.out.println("Enter company name: " + company);
    }   
    }


    public class Humaninfo{
        public static void main(String[]Args){
            
            Human Human1 = new Human('p','f');
            Human Human2 =new Human('i','b');

            //info Human1 = new Human("Paval", "Finzly");
            //info Human2 = new Human(Indhu, Finzly);
            //info Human3 = new Human(Prarthana, Finzly);

            System.out.println("Human 1 name: " + Human1.name);
            System.out.println("Human 1 company:" + Human1.company);
            Human1.Displayinfo();

            //System.out.println("Human 2 name: " + Human2.name);
            //System.out.println("Human 2 company:" + Human2.company);

            //System.out.println("Human 2 name: " + Human2.name);
            //System.out.println("Human 2 company:" + Human2.company);

            
        }

    }