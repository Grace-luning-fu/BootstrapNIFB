package me.grace.btnifb;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.ArrayList;

@Entity
public class Fizzbuzz {

    public long getUuid() {
        return uuid;
    }

    public void setUuid(long uuid) {
        this.uuid = uuid;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uuid;



    @NotEmpty
    private String userName;

    @Min(value=10)@Max(value=1000)
    private int innum;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getInnum() {
        return innum;
    }

    public void setInnum(int innum) {
        this.innum = innum;
    }




    public ArrayList<String> printout() {

        ArrayList finalprintout = new ArrayList();

        for (int counter = 1; counter <= this.getInnum(); counter++) {
            //Initialize an empty string
            String PrintOut = "";

            // If the number is a multiple of 2, display "Copy"
            if (counter % 2 == 0) {
                PrintOut += "Copy";
            }

            // If the number is a multiple of 3, also display "Fizz"
            if (counter % 3 == 0) {
                PrintOut += "Fizz";
            }

            // If the number is a multiple of 5, also display "Buzz"
            if (counter % 5 == 0) {
                PrintOut += "Buzz";
            }

            // If the number is a multiple of 10, also display "Cat"
            if (counter % 10 == 0) {
                PrintOut += "Cat";
            }

            // If not the above conditions, convert the integer into string and
            if (counter % 2 != 0 && counter % 3 != 0 && counter % 5 != 0 && counter % 10 != 0) {
                PrintOut = "" + counter;
            }

            finalprintout.add(PrintOut);

        }

        return finalprintout;
    }


}

