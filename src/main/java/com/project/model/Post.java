package com.project.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private int id;

    @Column(name = "post_date")
    @CreationTimestamp
    private Date postDate;
    
    @Column(name = "posted_by")
    private String postedBy;

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
        this.postDate = postDate;
        this.postedBy = postedBy;
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
        this.postDate = postDate;
    }
    public Date getPostDate() {
        return postDate;
    }
    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }
    public String getPostedBy() {
        return postedBy;
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
        return id + ": " + subject + ", " + postedBy + ", " + content + ", [" + path + "]";
    }
}
