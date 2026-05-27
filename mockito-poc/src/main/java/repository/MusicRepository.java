package repository;

import model.Music;

import java.util.Optional;

public interface MusicRepository {

    Optional<Music> findById(Long id);

    void save(Music music);

}
