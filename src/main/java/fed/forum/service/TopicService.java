package fed.forum.service;

import fed.forum.model.Comment;
import fed.forum.model.Topic;
import fed.forum.repository.CommentRepository;
import fed.forum.repository.TopicRepository;
import org.springframework.stereotype.Service;

@Service
public
class TopicService {

    private final CommentRepository commentRepository;
    private final TopicRepository topicRepository;

    public TopicService(CommentRepository commentRepository, TopicRepository topicRepository) {
        this.commentRepository = commentRepository;
        this.topicRepository = topicRepository;
    }

    public void save(Topic topicDto) {
        Topic topicToSave = new Topic(topicDto.getTitle());
        Topic savedTopic = topicRepository.save(topicToSave);
        Comment firstComment = new Comment(savedTopic, topicDto.getComments().get(0).getContent());
        commentRepository.save(firstComment);
    }
}
