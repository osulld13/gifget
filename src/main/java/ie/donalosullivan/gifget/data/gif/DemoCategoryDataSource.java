package ie.donalosullivan.gifget.data.gif;

import ie.donalosullivan.gifget.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DemoCategoryDataSource implements CategoryDataSource {

    private static List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "funny"),
            new Category(2, "sad"),
            new Category(3, "happy")
    );

    @Override
    public List<Category> getCategories() {
        return ALL_CATEGORIES;
    }

    @Override
    public Category getCategory(int id) {
        return ALL_CATEGORIES.stream()
                .filter(category -> category.getId() == id)
                .findFirst()
                .orElse(null);
    }

}
