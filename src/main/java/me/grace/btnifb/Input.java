package me.grace.btnifb;


import org.springframework.beans.factory.annotation.Value;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Input {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uuid;

    @NotNull
    @Size(min=2)
    private String username;

    @NotNull
    @Min(10)@Max(1000)
    private int innum;


    private String output;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getInnum() {
        return innum;
    }

    public void setInnum(int innum) {
        this.innum = innum;
    }


    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = printout(innum);
    }


     public String printout(int inputnum) {

         String finalprintout = null;

         // loop from number 1 to inputnum
         for (int counter = 1; counter <= inputnum; counter++) {
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

             finalprintout += PrintOut;

         }

         return finalprintout;
     }


}
