package fed.forum.controller;


import fed.forum.dto.CommentDto;
import fed.forum.model.Comment;
import fed.forum.repository.CommentRepository;
import fed.forum.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
@CrossOrigin
public class CommentController {

    private final CommentService service;

    public CommentController(CommentService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Comment> getAll() {
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void post(@RequestBody CommentDto commentDto) {
        service.save(commentDto);
    }
}

