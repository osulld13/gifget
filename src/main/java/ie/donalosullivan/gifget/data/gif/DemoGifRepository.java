package ie.donalosullivan.gifget.data.gif;

import ie.donalosullivan.gifget.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class DemoGifRepository implements GifDataSource{
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", LocalDate.of(2015,2,13), "Chris Ramacciotti", false),
            new Gif("ben-and-mike", LocalDate.of(2015,10,30), "Ben Jakuben", true),
            new Gif("book-dominos", LocalDate.of(2015,9,15), "Craig Dennis", false),
            new Gif("compiler-bot", LocalDate.of(2015,2,13), "Ada Lovelace", true),
            new Gif("cowboy-coder", LocalDate.of(2015,2,13), "Grace Hopper", false),
            new Gif("infinite-andrew", LocalDate.of(2015,8,23), "Marissa Mayer", true)
    );

    @Override
    public List<Gif> getGifs() {
        return ALL_GIFS;
    }

    @Override
    public Gif findByName(String name) {
        return ALL_GIFS.stream().filter(
                gif -> gif.getName().equals(name)
        ).findFirst()
        .orElse(null);
    }
}
