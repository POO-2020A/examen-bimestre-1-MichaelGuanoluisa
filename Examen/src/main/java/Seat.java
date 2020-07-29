
import java.util.Objects;

/**
 *
 * @author Michael Guanoluisa
 */
public class Seat {
    private int row;
    private String col;
    private Passenger passenger;

    public Seat(int row, String col, Passenger passenger) {
        this.row = row;
        this.col = col;
        this.passenger = passenger;
    }
    
    public boolean isFree(){
        if(this.passenger == null){
            return true;
        }else {
            return false;
        }
    }
    
    @Override
    public String toString(){
        String com = "Asiento: ";
        String con = ". Pasajero: ";
        if(isFree() == true){
            return com + this.row + this.col + ", libre";
        }else{
            return com + this.row + this.col + ", ocupado" + con + this.passenger;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.row;
        hash = 47 * hash + Objects.hashCode(this.col);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
            
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Seat other = (Seat) obj;
        if (this.row != other.row) {
            return false;
        }
        if (!Objects.equals(this.col, other.col)) {
            return false;
        }
        return true;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    
    
    
}
