package fed.forum.service;

import fed.forum.dto.CommentDto;
import fed.forum.model.Comment;
import fed.forum.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void save(CommentDto commentDto) {
        Comment comment = new Comment();
        comment.setTopic(commentDto.getTopic());
        comment.setContent(commentDto.getContent());
        commentRepository.save(comment);
    }

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }


}
