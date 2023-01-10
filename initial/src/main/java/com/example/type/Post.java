package com.example.type;

import java.util.UUID;

public class Post {

    private final UUID id;
    private final UUID userId;
    private final long createTime;
    private final long updateTime;
    private final int likeCount;
    private final String content;

    public Post(
            UUID id,
            UUID userId,
            long createTime,
            long updateTime,
            int likeCount,
            String content) {
        this.id = id;
        this.userId = userId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.likeCount = likeCount;
        this.content = content;
    }

    public UUID getId() {
        return id;
    }

    public UUID getUserId() {
        return userId;
    }

    public long getCreateTime() {
        return createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public long getLikeCount() {
        return likeCount;
    }

    public String getContent() {
        return content;
    }
}