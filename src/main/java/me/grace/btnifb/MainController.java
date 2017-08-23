package me.grace.btnifb;



import me.grace.btnifb.repositories.FizzbuzzRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.ArrayList;


@Controller
public class MainController {
    @Autowired
    FizzbuzzRepo fizzbuzzRepo;

    @GetMapping("/")
    public String showIndex(@ModelAttribute("inputNum") Fizzbuzz fizzbuzz){

        return "welcome";
    }


    @PostMapping("/")
    public String showResult(@Valid @ModelAttribute("inputNum") Fizzbuzz fizzbuzz, BindingResult bindingResult, Model model)
    {
        if(bindingResult.hasErrors())
        {
            System.out.println(bindingResult.toString());
            return "welcome";
        }
        fizzbuzzRepo.save(fizzbuzz);
        ArrayList<String> fBResults = fizzbuzz.printout();

        for(String item:fBResults)
        {
            System.out.println(item);
        }

        model.addAttribute("fBR",fBResults);
        return "fizzbuzzresult";
    }
    @GetMapping("/displayalluser")
    public String showIndex(Model model)
    {

        model.addAttribute("userList",fizzbuzzRepo.findAll());
        return "listusers";
    }





}
