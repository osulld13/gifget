package ie.donalosullivan.gifget.controller;

import ie.donalosullivan.gifget.data.gif.GifDataSource;
import ie.donalosullivan.gifget.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class GifController {

    @Autowired
    private GifDataSource gifDataSource;

    @RequestMapping(value = "/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap) {
        Gif gif = gifDataSource.findByName("android-explosion");
        modelMap.put("gif", gif);
        return "gif-details";
    }

}