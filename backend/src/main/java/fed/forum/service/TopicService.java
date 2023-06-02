package fed.forum.service;

import fed.forum.model.Comment;
import fed.forum.model.Topic;
import fed.forum.repository.CommentRepository;
import fed.forum.repository.TopicRepository;
import jakarta.transaction.Transactional;
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

    @Transactional
    public void save(Topic topic) {
        Topic savedTopic = topicRepository.save(topic);
        Comment firstComment = new Comment(savedTopic, topic.getComments().get(0).getContent());
        commentRepository.save(firstComment);
    }
}
