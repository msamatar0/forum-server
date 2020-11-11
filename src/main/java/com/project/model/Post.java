package com.project.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "timestamp")
    @CreationTimestamp
    private Date timestamp;
    
    @Column(name = "poster")
    private String poster;

    @Column(name = "subject")
    private String subject;

    @Column(name = "content")
    private String content;

    @Column(name = "path")
    private String path;

    public Post() {
        super();
    }
    public Post(int id, Date postDate, String postedBy, String subject, String content, String path) {
        this.id = id;
        this.timestamp = postDate;
        this.poster = postedBy;
        this.subject = subject;
        this.content = content;
        this.path = path;
    }

    public void setPostId(int id) {
        this.id = id;
    }
    public int getPostId() {
        return id;
    }
    public void setPostDate(Date postDate) {
        this.timestamp = postDate;
    }
    public Date getPostDate() {
        return timestamp;
    }
    public void setPostedBy(String postedBy) {
        this.poster = postedBy;
    }
    public String getPostedBy() {
        return poster;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public void setAncestorPath(String path) {
        this.path = path;
    }
    public String getAncestorPath() {
        return path;
    }
    
    @Override
    public String toString() {
        return id + ": " + subject + ", " + poster + ", " + content + ", [" + path + "]";
    }
}
