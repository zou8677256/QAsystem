package com.ryz.qasystem.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ryz.qasystem.model.User;

import java.util.Date;

public class QuestionDTO {
    private Integer id;

    private String title;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "Asia/Shanghai")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "Asia/Shanghai")
    private Date updateTime;

    private Integer commentCount;

    private Integer viewCount;

    private Integer likeCount;

    private String[] tag;

    private Integer userId;

    private String description;

    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public String[] getTag() {
        return tag;
    }

    public void setTag(String[] tag) {
        this.tag = tag;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
