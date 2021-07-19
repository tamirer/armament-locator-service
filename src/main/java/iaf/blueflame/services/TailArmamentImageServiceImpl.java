package iaf.blueflame.services;

import iaf.blueflame.entities.Tail;
import iaf.blueflame.entities.TailArmamentImages;
import iaf.blueflame.repositories.TailArmamentImagesRepository;
import iaf.blueflame.repositories.TailRepository;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class TailArmamentImageServiceImpl implements TailArmamentImageService {
    private final TailRepository tailRepository;
    private final TailArmamentImagesRepository tailArmamentImagesRepository;

    public TailArmamentImageServiceImpl(TailRepository tailRepository,
                                        TailArmamentImagesRepository tailArmamentImagesRepository) {
        this.tailRepository = tailRepository;
        this.tailArmamentImagesRepository = tailArmamentImagesRepository;
    }


    public TailArmamentImages uploadPostflightImage(Long tailId, MultipartFile file) throws IOException {
        Tail tail = tailRepository.findById(tailId).orElseThrow(ResourceNotFoundException::new);
        TailArmamentImages tailArmamentImages = TailArmamentImages.builder()
                .tail(tail)
                .afterFlightImage(file.getBytes())
                .build();
        return tailArmamentImagesRepository.save(tailArmamentImages);
    }

    public TailArmamentImages uploadPreflightImage(Long tailId, MultipartFile file) throws IOException {
        Tail tail = tailRepository.findById(tailId).orElseThrow(ResourceNotFoundException::new);
        TailArmamentImages tailArmamentImages = TailArmamentImages.builder()
                .tail(tail)
                .preflightImage(file.getBytes())
                .build();
        return tailArmamentImagesRepository.save(tailArmamentImages);
    }

    @Override
    public byte[] getPreflightImage(long tailId) {
        return tailArmamentImagesRepository.findByTailId(tailId).getPreflightImage();
    }

    @Override
    public byte[] getPostflightImage(long tailId) {
        return tailArmamentImagesRepository.findByTailId(tailId).getAfterFlightImage();
    }
}
