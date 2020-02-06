package ie.donalosullivan.gifget.controller;

import ie.donalosullivan.gifget.data.gif.CategoryDataSource;
import ie.donalosullivan.gifget.data.gif.GifDataSource;
import ie.donalosullivan.gifget.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryCotroller {

    @Autowired
    private CategoryDataSource categoryDataSource;
    @Autowired
    private GifDataSource gifDataSource;

    @RequestMapping("/categories")
    public String listCategories(ModelMap modelMap) {
        modelMap.put("categories", categoryDataSource.getCategories());
        return "categories";
    }

    @RequestMapping("category/{id}")
    public String category(@PathVariable int id, ModelMap modelMap) {
        modelMap.put("category", categoryDataSource.getCategory(id));
        modelMap.put("gifs", gifDataSource.findByCategoryId(id));
        return "category";
    }

}
