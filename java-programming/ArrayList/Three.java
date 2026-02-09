import java.util.*;
// import java.util.ArrayList;
public class Three {
        public static void main(String[] args) {
            ArrayList<String> CityName = new ArrayList<>(2);
            CityName.add("Vijayawada");
            CityName.add("Hyderabad");
            CityName.add("Vizag");
            // System.out.println(CityName);aa
            CityName.set(1,"Chennai");
            // System.out.println(CityName);
            CityName.remove(0);
            // System.out.println(CityName);
            for(int i =0;i<CityName.size();i++)
            {
                System.out.println(CityName);
            }
        }
        
}
