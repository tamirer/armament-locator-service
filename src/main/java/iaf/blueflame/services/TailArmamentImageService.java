package iaf.blueflame.services;

import iaf.blueflame.entities.TailArmamentImages;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface TailArmamentImageService {
    TailArmamentImages uploadPreflightImage(Long tailId, MultipartFile file) throws IOException;

    TailArmamentImages uploadPostflightImage(Long tailId, MultipartFile file) throws IOException;

    byte[] getPreflightImage(long tailId);

    byte[] getPostflightImage(long tailId);
}
