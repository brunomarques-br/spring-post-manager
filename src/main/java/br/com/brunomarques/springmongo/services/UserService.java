package br.com.brunomarques.springmongo.services;

import br.com.brunomarques.springmongo.domain.User;
import br.com.brunomarques.springmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

}
