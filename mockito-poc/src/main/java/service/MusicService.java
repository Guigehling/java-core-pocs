package service;

import model.Music;
import repository.MusicRepository;

public class MusicService {

    private final MusicRepository musicRepository;
    private final MusicURLService musicURLService;

    public MusicService(MusicRepository musicRepository, MusicURLService musicURLService) {
        this.musicRepository = musicRepository;
        this.musicURLService = musicURLService;
    }

    public Music findById(final Long id) {
        return musicRepository.findById(id).orElseThrow();
    }

    public void register(final Music music) {
        musicRepository.save(music);

        musicURLService.buildURL(music);
    }

}
