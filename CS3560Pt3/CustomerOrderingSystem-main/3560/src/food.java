import java.sql.Blob;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleLongProperty;


public class food 
{
	private SimpleStringProperty name;
    private SimpleFloatProperty price;
    private Blob image;
    private SimpleStringProperty type;

    public food(String name, Float price, Blob image, String type){
        this.name = new SimpleStringProperty(name);
        this.price = new SimpleFloatProperty(price);
        this.image = image;
        this.type = new SimpleStringProperty(type);
    }

    public void setName(String name){
        this.name.set(name);
    }

    public String getName(){
        return name.get();
    }

    public void setPrice(Float price){
        this.price.set(price);
    }

    public Float getPrice(){
        return price.get();
    }

    public void setImage(Blob image){
        this.image = image;
    }

    public Blob getImage(){
        return image;
    }

    public void setType(String type){
        this.type.set(type);
    }

    public String getType(){
        return type.get();
    }
}