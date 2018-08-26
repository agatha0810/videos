package pl.akademiakodu.videos;

import java.util.ArrayList;
import java.util.List;


public class StaticDao implements VideoDao {

    private static List<Video> videoList = new ArrayList<>();

    @Override
    public void add(Video video) {
        videoList.add(video);
    }

    @Override
    public List<Video> findAll() {
        return videoList;
    }
}
