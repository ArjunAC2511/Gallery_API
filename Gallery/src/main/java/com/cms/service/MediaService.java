package com.cms.service;



import org.springframework.web.multipart.MultipartFile;

import com.cms.entity.Media;

import java.util.List;

public interface MediaService {
    Media saveMedia(MultipartFile file) throws Exception;
    Media getMediaById(Long id);
    List<Media> getAllMedia();
    void deleteMedia(Long id);
}

