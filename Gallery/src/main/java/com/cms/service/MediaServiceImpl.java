package com.cms.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cms.entity.Media;
import com.cms.repo.MediaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class MediaServiceImpl implements MediaService {

    @Autowired
    private MediaRepository mediaRepository;

    @Override
    public Media saveMedia(MultipartFile file) throws Exception {
        String fileName = file.getOriginalFilename();
        Media media = new Media(fileName, file.getContentType(), file.getBytes(), LocalDateTime.now());
        return mediaRepository.save(media);
    }

    @Override
    public Media getMediaById(Long id) {
        Optional<Media> media = mediaRepository.findById(id);
        return media.orElse(null);
    }

    @Override
    public List<Media> getAllMedia() {
        return mediaRepository.findAll();
    }

    @Override
    public void deleteMedia(Long id) {
        mediaRepository.deleteById(id);
    }
}
