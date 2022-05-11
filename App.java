public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inizio programma");

    Bagno bagnomaschi = new Bagno();
    Bagno bagnofemmine = new Bagno();
    Persona p1 = new Persona("Dario ", bagnomaschi);
    Persona p2 = new Persona("Roberto ", bagnomaschi);
    Persona p3 = new Persona("Nando ", bagnomaschi);
   
    Persona p4 = new Persona("Silvia ", bagnofemmine);
    Persona p5 = new Persona("Marianna ", bagnofemmine);
    Persona p6 = new Persona("Nadia ", bagnofemmine);


    p1.start();
    p2.start();
    p3.start();
    p4.start();
    p5.start();
    p6.start();

    p1.join();
    p2.join();
    p3.join();
    p4.join();
    p5.join();
    p6.join();
    System.out.println("tutti sono usciti dai bagni");
    }
}
