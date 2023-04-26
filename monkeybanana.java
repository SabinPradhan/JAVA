public class MonkeyBananaProblem {

    public static void main(String[] args) {
        int[] bananas = {3, 6, 2, 8, 4}; 
        int poleHeight = bananas.length; 

        int level = 0; 
        int bananasEaten = 0;

        while (level < poleHeight) { 
            int bananasOnThisLevel = bananas[level]; 

            if (bananasOnThisLevel > 0) {
                bananasEaten += bananasOnThisLevel; 
                bananas[level] = 0; 
            }

            level++; // move up one level
        }

        System.out.println("The monkey ate " + bananasEaten + " bananas.");
    }

}
