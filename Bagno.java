public class Bagno {
      
    public synchronized void Usabagno(String nome){

        System.out.println( nome + "è entrato in bagno");
    
        try {
            Thread.sleep((long)(Math.random()*1000));
        } catch (Exception e) {}
        System.out.println( nome + "è entrato in bagno");
        }
}
