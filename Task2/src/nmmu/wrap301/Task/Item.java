package nmmu.wrap301.Task;

/**
 * Created by s2133 on 2017/04/19.
 */
public class Item {
    private float value;

    public void setValue(float value){
        this.value = value;
    }

    public float getValue(){
        return value;
    }

    public void display(){
        System.out.println("Value of item: "+value);
    }
}
