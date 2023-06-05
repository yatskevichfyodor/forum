package fed.forum.dto;

import fed.forum.model.Topic;

public class CommentDto {
    private Topic topic;
    private String content;

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
