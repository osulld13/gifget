package ie.donalosullivan.gifget.data.gif;

import ie.donalosullivan.gifget.model.Category;
import ie.donalosullivan.gifget.model.Gif;

import java.util.List;

public interface CategoryDataSource {
    public List<Category> getCategories();
    public Category getCategory(int id);
}
