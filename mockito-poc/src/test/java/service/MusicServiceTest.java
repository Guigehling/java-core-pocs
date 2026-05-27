package service;

import model.Music;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import repository.MusicRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class MusicServiceTest {

    @Test
    void shouldFindUser() {

        MusicRepository mockMusicRepository = Mockito.mock(MusicRepository.class);
        MusicURLService mockMusicURLService = Mockito.mock(MusicURLService.class);

        MusicService musicService = new MusicService(mockMusicRepository, mockMusicURLService);

        Music music = new Music(1L, "Hangfire", "Wind Walkers");

        Mockito.when(mockMusicRepository.findById(1L)).thenReturn(Optional.of(music));

        final var output = musicService.findById(1L);

        assertEquals(music.id(), output.id());

    }

    @Test
    void shouldBuildURL() {

        MusicRepository mockMusicRepository = Mockito.mock(MusicRepository.class);
        MusicURLService mockMusicURLService = Mockito.mock(MusicURLService.class);

        MusicService musicService = new MusicService(mockMusicRepository, mockMusicURLService);

        Music music = new Music(1L, "The Pretender", "Foo Fighters");

        musicService.register(music);

        verify(mockMusicRepository, atLeastOnce()).save(music);
        verify(mockMusicURLService).buildURL(music);

    }

    @Test
    void shouldNeverCallEmail() {

        MusicURLService mockMusicURLService = Mockito.mock(MusicURLService.class);

        verify(mockMusicURLService, never()).buildURL(Mockito.any());

    }

    @Test
    void shouldUseSpy() {

        MusicURLService spyMusicURLService = Mockito.spy(MusicURLService.class);

        spyMusicURLService.buildURL(new Music(1L, "The Price of Agony", "Fit for a King"));

        verify(spyMusicURLService, atLeastOnce()).buildURL(Mockito.any());

    }

    @Test
    void shouldThrowException() {

        MusicURLService mockMusicURLService = Mockito.mock(MusicURLService.class);

        Music music = new Music(1L, "Decadence", "Disturbed");

        doThrow(new RuntimeException())
                .when(mockMusicURLService)
                .buildURL(Mockito.any(Music.class));

        assertThrows(RuntimeException.class,
                () -> mockMusicURLService.buildURL(music));

    }

    @Test
    void shouldCaptureArgument() {

        MusicRepository mockMusicRepository = Mockito.mock(MusicRepository.class);
        MusicURLService mockMusicURLService = Mockito.mock(MusicURLService.class);

        MusicService musicService = new MusicService(mockMusicRepository, mockMusicURLService);

        Music music = new Music(1L, "Lighthouse", "Mallory Knox");

        musicService.register(music);

        ArgumentCaptor<Music> argumentCaptor = ArgumentCaptor.forClass(Music.class);

        verify(mockMusicURLService).buildURL(argumentCaptor.capture());

        System.out.println(argumentCaptor.getValue());

    }


}