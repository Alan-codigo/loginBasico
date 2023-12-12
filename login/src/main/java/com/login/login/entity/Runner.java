package com.login.login.entity;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.login.login.repository.AutorithyRepository;
import com.login.login.repository.UserRepository;


@Component
public class Runner implements CommandLineRunner {

    private final UserRepository userRepository;
    private final AutorithyRepository authorityRepository;

    public Runner(UserRepository userRepository, AutorithyRepository authorityRepository){
        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        if(this.authorityRepository.count() == 0){
            this.authorityRepository.saveAll(List.of(
                new Authority(AuthorityName.ADMIN),
                new Authority(AuthorityName.READ),
                new Authority(AuthorityName.WRITE)
            )) ;
        }

        if(this.userRepository.count() == 0){
            this.userRepository.saveAll(List.of(
                new User("uncledave","uncledave",List.of(this.authorityRepository.findByName(AuthorityName.ADMIN).get())),
                new User("uncledave2","uncledave2",List.of(this.authorityRepository.findByName(AuthorityName.READ).get())),
                new User("uncledave3","uncledave3",List.of(this.authorityRepository.findByName(AuthorityName.WRITE).get()))
            ));
        }


    }

}
