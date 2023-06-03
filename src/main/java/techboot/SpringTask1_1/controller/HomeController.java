package techboot.SpringTask1_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import techboot.SpringTask1_1.model.Items;

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

}
