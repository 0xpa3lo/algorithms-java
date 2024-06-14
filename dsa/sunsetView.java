import java.util.ArrayList;
import java.util.Collections;


class sunsetView{

    public ArrayList<Integer> sunsetViews(int[] buildings, String direction){
        int buildingLength = buildings.length;
        ArrayList<Integer> viewIndexes = new ArrayList<Integer>();

        if(direction.equals("EAST")){
            int maxHeight = 0;
            for(int i = buildingLength - 1; i >= 0; i--){
                if(buildings[i] > maxHeight){
                    maxHeight = buildings[i];
                    viewIndexes.add(i);
                }
            }
        }
        if(direction.equals("WEST")){
            int maxHeight = 0;
            for(int i = 0; i < buildingLength; i++){
                if(buildings[i] > maxHeight){
                    maxHeight = buildings[i];
                    viewIndexes.add(i);
                }
            }
        }
        Collections.sort(viewIndexes);
        return viewIndexes;
    }
  
    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        System.err.println(new sunsetView().sunsetViews(buildings, "EAST"));
        return ;
    }
}
