package pl.bykowski.ksb2;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/videos")
public class VideoApi {

    private List<Video> videoList;

    public VideoApi() {
        this.videoList = new ArrayList<>();
        videoList.add(new Video(1L, "WPROWADZENIE DO ARCHITEKTURY MIKROSERWISÓW - WYKŁAD", "https://youtu.be/ImKvgCMJ_ro"));
        videoList.add(new Video(2L, "KOŃCZYMY APLIKACJE CHATU W SPRINGU I WDRAŻAMY JĄ NA SERWER VPS", "https://youtu.be/vKtFeOXCkHM"));
    }

    @GetMapping(produces = {
            MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Video>> getVideos() {
        return new ResponseEntity<>(videoList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Video> getVideoById(@PathVariable long id) {
        Optional<Video> first = videoList.stream().filter(video -> video.getId() == id).findFirst();
        if (first.isPresent()) {
            return new ResponseEntity<>(first.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity addVideo(@RequestBody Video video) {
        boolean add = videoList.add(video);
        if (add) {
            return new ResponseEntity(HttpStatus.CREATED);
        }
        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping
    public ResponseEntity modVideo(@RequestBody Video newVideo) {
        Optional<Video> first = videoList.stream().filter(video -> video.getId() == newVideo.getId()).findFirst();
        if (first.isPresent()) {
            videoList.remove(first.get());
            videoList.add(newVideo);
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity removeVideo(@PathVariable long id) {
        Optional<Video> first = videoList.stream().filter(video -> video.getId() == id).findFirst();
        if (first.isPresent()) {
            videoList.remove(first.get());
            return new ResponseEntity<>(first.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
