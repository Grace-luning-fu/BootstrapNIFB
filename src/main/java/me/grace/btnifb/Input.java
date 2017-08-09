package me.grace.btnifb;


import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Input {

    //private String username;

    @NotNull
    @Min(2)@Max(1000)
    private int input;


}
