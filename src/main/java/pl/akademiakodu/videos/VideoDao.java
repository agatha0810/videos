package pl.akademiakodu.videos;


import java.util.List;

public interface VideoDao {
    /*
        standardowo w intefejsie metoda publiczna i abstrakcyjna
        public abstract
     */
    void add(Video video);

    List<Video> findAll();

}
