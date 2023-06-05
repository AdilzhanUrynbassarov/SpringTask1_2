package techboot.SpringTask1_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import techboot.SpringTask1_2.model.Items;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping(value="/")
    public String indexPage(Model model) {
        ArrayList<Items> itemsArrayList = DBManager.getItems();
        String someVariable = "Hello, World!";
        model.addAttribute("someVariable", someVariable);
        model.addAttribute("muzikalar", itemsArrayList);

        return "index";

    }
    @PostMapping(value = "/add-item")
    public String addItem(Items item) {
        DBManager.addItems(item);
        return "redirect:/";
    }


    @GetMapping(value = "/add-item")
    public String addItemPage(Model model){
        return "addItem";
    }

    @GetMapping(value = "/item-details")
    public String getItem(@RequestParam(name="itemId") Long id, Model model) {
        Items item = DBManager.getItem(id);
        model.addAttribute("vesh", item);
        return "details";
    }





}
