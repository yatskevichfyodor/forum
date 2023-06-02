package fed.forum.controller;


import fed.forum.model.Comment;
import fed.forum.repository.CommentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
@CrossOrigin
public class CommentController {

    private final CommentRepository repository;

    public CommentController(CommentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    List<Comment> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    Comment get(@PathVariable("id") long id) {
        return repository.findById(id).get();
    }

    @GetMapping("/findByTopicId/{topicId}")
    List<Comment> findByTopicId(@PathVariable("topicId") long topicId) {
        return repository.findByTopicId(topicId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    void post(@RequestBody Comment comment) {
        repository.save(comment);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    void put(@RequestBody Comment comment) {
        repository.save(comment);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable("id") long id) {
        repository.deleteById(id);
    }
}

