package fed.forum.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comment {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private long id;
        @ManyToOne
        @JoinColumn(name = "topic_id", referencedColumnName = "id")
        @JsonIgnore
        private Topic topic;
        @Lob
        @Column(length = 100000)
        private String content;
        private LocalDateTime timestamp = LocalDateTime.now();

        public Comment() {
        }

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
