package pl.bykowski.ksb2;

import org.springframework.stereotype.Component;

@Component
public class Start {

    private VideoDao videoDao;

    public Start(VideoDao videoDao) {
        this.videoDao = videoDao;
//        videoDao.saveVideo(2L, "Java", "bykowski.pl/java");
//        videoDao.saveVideo(3L, "Docker", "bykowski.pl/Docker");
//        videoDao.saveVideo(4L, "CI", "bykowski.pl/CI");


//        videoDao.updateVideo(new Video(4L, "CI/CD", "bykowski.pl/CI-CD"));

//        videoDao.deleteVideo(2L);
//        videoDao.findAll().forEach(System.out::println);

        System.out.println(videoDao.getOne(4L));
    }
}
