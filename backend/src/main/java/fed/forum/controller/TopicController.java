package fed.forum.controller;


import fed.forum.model.Topic;
import fed.forum.repository.TopicRepository;
import fed.forum.service.TopicService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topic")
@CrossOrigin
public class TopicController {
    private final TopicService service;
    private final TopicRepository repository;

    public TopicController(TopicService service, TopicRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @GetMapping("/")
    public List<Topic> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Topic get(@PathVariable("id") long id) {
        return repository.findById(id).get();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void post(@RequestBody String topicName) {
        service.save(topicName);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public void put(@RequestBody Topic topic) {
        repository.save(topic);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") long id) {
        repository.deleteById(id);
    }
}
