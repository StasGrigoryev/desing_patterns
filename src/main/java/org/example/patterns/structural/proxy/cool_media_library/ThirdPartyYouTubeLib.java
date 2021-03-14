package org.example.patterns.structural.proxy.cool_media_library;

import java.util.HashMap;

//Common interface for service and proxy
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
