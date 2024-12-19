/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg1.pkg2.pkg3.pkg4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tdahi
 */
public class HeroService {

    private ArrayList<Hero> list = new ArrayList<>();

    public HeroService() {
        list.add(new Hero("Ashe", 99, "Trợ thủ", false));
        list.add(new Hero("Caitlyn", 120, "Xạ thủ", false));
        list.add(new Hero("Garen", 110, "Đỡ đòn", true));
        list.add(new Hero("Ezreal", 130, "Pháp sư", false));
        list.add(new Hero("Ryze", 120, "Pháp sư", true));

    }
    
    public List<Hero> getAll() {
        return list;
    }
    
    public String them(Hero hero) {
        if (hero != null) {
            list.add(hero);
            return "Add Success";
        }else {
            return "Add Failed !";
        }
    }
}
