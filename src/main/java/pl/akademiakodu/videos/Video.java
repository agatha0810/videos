package pl.akademiakodu.videos;

public class Video {

    private String name;

    private String iframeCode;

    public Video(){}

    public Video(String name, String iframeCode) {
        this.name = name;
        this.iframeCode = iframeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIframeCode() {
        return iframeCode;
    }

    public void setIframeCode(String iframeCode) {
        this.iframeCode = iframeCode;
    }
}
