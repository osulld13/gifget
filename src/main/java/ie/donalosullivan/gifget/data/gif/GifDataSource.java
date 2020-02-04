package ie.donalosullivan.gifget.data.gif;

import ie.donalosullivan.gifget.model.Gif;

import java.util.List;

public interface GifDataSource {
    public List<Gif> getGifs();
    public Gif findByName(String name);
}
