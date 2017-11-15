package nmmu.wrap301.Task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by s2133 on 2017/04/19.
 */
public class Analyser {
    ArrayList<Item> items = new ArrayList();
    public void add(Item item){
        items.add(item);
    }

    public Item getValue(int index){
        return items.get(index);
    }

    public void sort(){
        items = quickSort(items);
    }

    private ArrayList<Item> quickSort(ArrayList<Item> list) {
        if (list.size() == 0)
            return list;
        ArrayList<Item> listSmall = new ArrayList<>();
        ArrayList<Item> listBig = new ArrayList<>();

        Item midItem = list.get(list.size() / 2);

        for (Item cur : list) {
            if (cur.equals(midItem))
                continue;
            if (cur.getValue() < midItem.getValue())
                listSmall.add(cur);
            else
                listBig.add(cur);
        }

        listSmall = quickSort(listSmall);
        listBig = quickSort(listBig);

        ArrayList<Item> sortedList = new ArrayList<>();
        sortedList.addAll(listSmall);
        sortedList.add(midItem);
        sortedList.addAll(listBig);

        return sortedList;
    }

    public int size(){

        return items.size();
    }

    public float average(){
        if (items.size()==0)
            return 0;
        float total = 0;
        for (int ii = 0; ii< items.size(); ii++){
            total+=items.get(ii).getValue();
        }
        return total/items.size();

    }

    public Item min(){
        if (items.size() == 0)
            return null;
        Item minItem = items.get(0);
        for (int ii = 1; ii< items.size(); ii++){
            if(minItem.getValue()>items.get(ii).getValue())
                minItem=items.get(ii);
        }
        return  minItem;
    }

    public Item max(){
        if (items.size() == 0)
            return null;
        Item maxItem = items.get(0);
        for (int ii = 1; ii< items.size(); ii++){
            if(maxItem.getValue()<items.get(ii).getValue())
                maxItem=items.get(ii);
        }
        return  maxItem;
    }

    public Item percentile(int p){
        sort();
        int position = (int)Math.ceil(p/100.0*items.size());
        if(position==0)
            return items.get(position);
        else return items.get(position-1);

    }

    public Analyser percentile(int pStart, int pEnd){
        sort();
        Analyser newAnalyzer = new Analyser();
        int startPos, endPos;
        startPos = (int)Math.ceil(pStart/100.0*items.size());
        endPos = (int)Math.ceil(pEnd/100.0*items.size());

        if(startPos==0){
            for (int ii= startPos; ii<endPos; ii++){
                newAnalyzer.add(items.get(ii));
            }

        }
        else {
            for (int ii= startPos-1; ii<=endPos-1; ii++){
                newAnalyzer.add(items.get(ii));
            }
        }

        return newAnalyzer;
    }
}
