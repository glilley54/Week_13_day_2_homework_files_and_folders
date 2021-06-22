package com.example.codeclan.FilesAndFolders.repository;

import com.example.codeclan.FilesAndFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class FolderRepository extends JpaRepository<Folder, Long> {
}
