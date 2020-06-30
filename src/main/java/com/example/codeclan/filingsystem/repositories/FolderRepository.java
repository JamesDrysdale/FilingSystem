package com.example.codeclan.filingsystem.repositories;

import com.example.codeclan.filingsystem.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface FolderRepository extends JpaRepository<Folder, Long>{

    }


