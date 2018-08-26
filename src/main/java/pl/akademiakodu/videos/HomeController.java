package pl.akademiakodu.videos;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private VideoDao staticDao = new DoubleStaticDao();

    @GetMapping("/")
    public String index(){
        return "index";
    }
    /*
        public String create(
        @RequestParam String name, @RequestParam String embedCode){
            Video video = new Video(name,embedCode);
        }
     */
    // Video video = new Video(name,embedCode);
    @PostMapping("/videos")
    public String create(@ModelAttribute Video video,
                         ModelMap modelMap){
        modelMap.put("video",video);
        staticDao.add(video);
        return "show";
    }
    /*
        /all wyświetla wszystkie dodane videa
     */

    @GetMapping("/all")
    public String all(ModelMap modelMap){
        modelMap.put("videos",staticDao.findAll());
        return "all";
    }


}
