package service;

import model.Music;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import repository.MusicRepository;

@ExtendWith(MockitoExtension.class)
class MusicServiceAnnotationTest {

    @Mock
    MusicRepository mockMusicRepository;

    @Mock
    MusicURLService mockMusicURLService;

    @InjectMocks
    MusicService musicService;

    @Test
    void shouldRegisterUser() {

        final var music = new Music(1L, "Go to Hell, For Heaven's Sake", "Bring Me The Horizon");

        musicService.register(music);

        Mockito.verify(mockMusicRepository).save(music);

    }

    @Test
    void shouldValidateExecutionOrder() {

        final var music = new Music(1L, "", "Bring Me The Horizon");

        musicService.register(music);

        InOrder inOrder = Mockito.inOrder(mockMusicRepository, mockMusicURLService);

        inOrder.verify(mockMusicRepository).save(music);

        inOrder.verify(mockMusicURLService).buildURL(music);

    }

}
