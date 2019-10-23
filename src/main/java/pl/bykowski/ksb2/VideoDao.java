package pl.bykowski.ksb2;

import java.util.List;

// CRUD
public interface VideoDao {

    void saveVideo(long id, String title, String url);

    List<Video> findAll();

    Video getOne(long id);

    void updateVideo(Video newVideo);

    void deleteVideo(long id);
}
