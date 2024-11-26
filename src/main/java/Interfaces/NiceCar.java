package Interfaces;

public class NiceCar
{
   private Engine e1;
   private Media m1;
   NiceCar(Engine e1,Media m1)
   {
       this.e1=e1;
       this.m1=m1;
   }
   public void startMusic()
   {
       m1.start();
   }
    public void startEngine()
    {
        e1.start();
    }

    public static void main(String[] args) {
       PetrolEngine p1= new PetrolEngine();
       MusicPlayer m1=new MusicPlayer();
       NiceCar n1=new NiceCar(p1,m1);
       n1.startEngine();
       n1.startMusic();

    }
}
