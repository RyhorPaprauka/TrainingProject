package by.itacademy.web.controller;


import by.itacademy.database.entity.enam.Genre;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static by.itacademy.web.path.UrlPath.CATALOG;

@Controller
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class StaticController {

    @GetMapping(CATALOG)
    public String getPage(Model model) {
        model.addAttribute("genres", Genre.values());
        return "catalog";
    }
}
