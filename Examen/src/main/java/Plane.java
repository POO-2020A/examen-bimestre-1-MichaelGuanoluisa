
import java.util.ArrayList;

/**
 *
 * @author Michael Guanoluisa
 */
public class Plane {
    private int rows;
    private int cols;
    private ArrayList<Seat> seats;
    
    public Plane(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.seats = new ArrayList<>();
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }
    
    
    
    @Override
    public String toString(){
        String[] list = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S"};
        String x="";
        for(int i=0; i< this.rows; i++){
            x = x + list[i];
        }
        for(int i=0; i<this.cols; i++){
            return i+1 + " " + x + "/n";
        }
        return "/n";
    }
}
