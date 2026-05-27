package service;

import model.Music;

public class MusicURLService {

    private static final String URL_BASE = "https://music.poc.com/";

    public void buildURL(final Music music) {
        final String url = URL_BASE + music.title() + "/" + music.artist();

        System.out.println("URL: " + url);
    }

}
