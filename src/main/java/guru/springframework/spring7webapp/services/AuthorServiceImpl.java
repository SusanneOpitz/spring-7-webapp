package guru.springframework.spring7webapp.services;

import guru.springframework.spring7webapp.domain.Author;
import guru.springframework.spring7webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

/**
 * Created by myself.
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
        public Iterable<Author> findAll() {
            return authorRepository.findAll();
        }

    }
