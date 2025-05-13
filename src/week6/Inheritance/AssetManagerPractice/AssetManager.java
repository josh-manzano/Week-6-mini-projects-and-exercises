package week6.Inheritance.AssetManagerPractice;

import java.util.ArrayList;
import java.util.List;

public class AssetManager {
    public static void main(String[] args) {
        List<Asset> assets = new ArrayList<>();
        House myHouse = new House("My House", "2019", 799000, "3457 SEEEYUH ave.", 1, 2230, 2342);
        assets.add(myHouse);



    }
}
