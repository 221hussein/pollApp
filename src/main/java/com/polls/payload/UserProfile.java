package com.polls.payload;

import java.time.Instant;

public class UserProfile {

    private Long id;
    private String username;
    private String name;
    private Instant joinedAt;
    private long pollCount;
    private long voteCount;

    public UserProfile(Long id, String username, String name, Instant joinedAt, long pollCount, long voteCount) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.joinedAt = joinedAt;
        this.pollCount = pollCount;
        this.voteCount = voteCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(Instant joinedAt) {
        this.joinedAt = joinedAt;
    }

    public long getPollCount() {
        return pollCount;
    }

    public void setPollCount(long pollCount) {
        this.pollCount = pollCount;
    }

    public long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(long voteCount) {
        this.voteCount = voteCount;
    }
}
