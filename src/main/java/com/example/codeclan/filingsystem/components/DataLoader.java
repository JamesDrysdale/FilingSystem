package com.example.codeclan.filingsystem.components;

import com.example.codeclan.filingsystem.models.File;
import com.example.codeclan.filingsystem.models.Folder;
import com.example.codeclan.filingsystem.models.User;
import com.example.codeclan.filingsystem.repositories.FileRepository;
import com.example.codeclan.filingsystem.repositories.FolderRepository;
import com.example.codeclan.filingsystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    //empty dataloader constructor
    public DataLoader() {
    }


    @Override
    public void run(ApplicationArguments args) {

        User bob = new User("Bob Winkleman");
        userRepository.save(bob);


        Folder pictures = new Folder("Pictures", bob);
        folderRepository.save(pictures);


        File photo1 = new File("Beach", ".jpg", 512, pictures);
        fileRepository.save(photo1);

        File photo2 = new File("Forest", ".jpg", 512, pictures);
        fileRepository.save(photo2);

        File photo3 = new File("Mountains", ".jpg", 512, pictures);
        fileRepository.save(photo3);


    }
}
