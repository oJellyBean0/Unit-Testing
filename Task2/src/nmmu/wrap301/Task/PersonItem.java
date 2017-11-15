package nmmu.wrap301.Task;



/**
 * Created by s2133 on 2017/04/19.
 */
public class PersonItem extends Item {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return  name;
    }

    public void setValue( float value){
        super.setValue(value);
    }

    public void display(){
        System.out.println("Name of item: "+name);
        super.display();
    }
}
