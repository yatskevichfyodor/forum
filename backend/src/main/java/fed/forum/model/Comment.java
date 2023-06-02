package fed.forum.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Comment {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private long id;
        @ManyToOne
        private Topic topic;
        private String content;
//        @Temporal(TemporalType.TIMESTAMP)
        private LocalDateTime timestamp = LocalDateTime.now();

        public Comment(Topic topic, String content) {
                this.topic = topic;
                this.content = content;
        }

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getContent() {
                return content;
        }

        public void setContent(String content) {
                this.content = content;
        }

        public LocalDateTime getCreationDateTime() {
                return timestamp;
        }

        public void setCreationDateTime(LocalDateTime creationDateTime) {
                this.timestamp = creationDateTime;
        }

        public Topic getTopic() {
                return topic;
        }

        public void setTopic(Topic topic) {
                this.topic = topic;
        }
}
