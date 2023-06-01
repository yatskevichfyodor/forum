package fed.forum.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "topics")
public class Topic {
        @Id
        @GeneratedValue
        private
        long id;
        private String title;
        private Date timestamp;
        @OneToMany(mappedBy = "topic")
        private
        List<Comment> comments;

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

        public Date getTimestamp() {
                return timestamp;
        }

        public void setTimestamp(Date timestamp) {
                this.timestamp = timestamp;
        }

        public List<Comment> getComments() {
                return comments;
        }

        public void setComments(List<Comment> comments) {
                this.comments = comments;
        }
}
