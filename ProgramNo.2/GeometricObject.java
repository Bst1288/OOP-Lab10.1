import java.util.Date;
public class GeometricObject {
    private String color = "white";
	private boolean filled;
	private Date dateCreated;

    //---Construct---//
    public GeometricObject(){
		dateCreated = new java.util.Date();
	}

    public GeometricObject(String color, boolean filled){
		this.color = color;
		this.filled = filled;
        dateCreated = new Date();
    }

    //---set color---//
    public void setColor(String color){
		this.color = color;
	}

    //---get color---//
    public String getColor(){
		return color;
	}

    //---set filled---//
    public void setFilled(boolean filled){
		this.filled = filled;
	}

    //---is filled---//
    public boolean isFilled(){
		return filled;
	}

    //---get dataCreated---//
    public Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + 
			    " and filled: " + filled;
    }
}