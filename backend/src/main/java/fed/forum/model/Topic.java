package fed.forum.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
public class Topic {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String title;
        private LocalDateTime timestamp = LocalDateTime.now();
        @OneToMany(mappedBy = "topic")
        private List<Comment> comments;

        public Topic() {
        }

        public Topic(long id) {
                this.id = id;
        }

        public Topic(String title) {
                this.title = title;
        }

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public LocalDateTime getTimestamp() {
                return timestamp;
        }

        public void setTimestamp(LocalDateTime timestamp) {
                this.timestamp = timestamp;
        }

        public List<Comment> getComments() {
                return comments;
        }

        public void setComments(List<Comment> comments) {
                this.comments = comments;
        }
}
