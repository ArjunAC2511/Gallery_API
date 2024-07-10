package com.cms.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cms.entity.Media;

@Repository
public interface MediaRepository extends JpaRepository<Media, Long> {
}
