import models.Order;
import models.Tshirt;

public class Main {
    public static void main(String[] args) {

      String[]  size =  {"XL", "Medium", "Large" };

       int[] Items= {572,681};
        int[] Price = {1235,1780};

        ///////



Tshirt a = new Tshirt("Gorkhali bats", " 572Brand: Karuna", "Juju Tees",1235,"Graphic text: You either die a hero or live long enough to see yourself be a villain", 3, size);

a.displayInformation();

Tshirt b = new Tshirt("Hero villain", "391Brand: Karuna", "Juju tees", 1780, "Graphic text: Youa re the hero in your life", 2, size);

   b.displayInformation();

Order x = new Order("Gopal Sharma", 2, "0486756465", new String[]{"572","681"} , new int[]{1235,1780});
    }

}
