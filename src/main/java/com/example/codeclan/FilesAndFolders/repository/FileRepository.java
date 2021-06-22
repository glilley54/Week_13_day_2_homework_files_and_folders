package com.example.codeclan.FilesAndFolders.repository;

import com.example.codeclan.FilesAndFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class FileRepository extends JpaRepository<File, Long> {
}