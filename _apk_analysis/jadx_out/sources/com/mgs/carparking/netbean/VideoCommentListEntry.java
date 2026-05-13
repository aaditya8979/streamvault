package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VideoCommentListEntry.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class VideoCommentListEntry {

    @Nullable
    private List<Children> children;
    private long createTime;

    @Nullable
    private String fromHeadImg;
    private int fromUserId;

    @Nullable
    private String fromUserName;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44316id;
    private int parentId;
    private int praiseNum;
    private int replyNum;
    private int rootCommentId;

    @Nullable
    private String toHeadImg;
    private int toUserId;

    @Nullable
    private String toUserName;
    private int videoId;

    @Nullable
    private String words;

    /* JADX INFO: compiled from: VideoCommentListEntry.kt */
    public final class Children {

        @Nullable
        private List<Children> children;
        private long createTime;

        @Nullable
        private String fromHeadImg;
        private int fromUserId;

        @Nullable
        private String fromUserName;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private int f44317id;
        private int parentId;
        private int praiseNum;
        private int replyNum;
        private int rootCommentId;
        private int staticFromUserId;

        @Nullable
        private String staticFromUserName;

        @Nullable
        private String toHeadImg;
        private int toUserId;

        @Nullable
        private String toUserName;
        private int videoId;

        @Nullable
        private String words;

        public Children() {
        }

        @Nullable
        public final List<Children> getChildren() {
            return this.children;
        }

        public final long getCreateTime() {
            return this.createTime;
        }

        @Nullable
        public final String getFromHeadImg() {
            return this.fromHeadImg;
        }

        public final int getFromUserId() {
            return this.fromUserId;
        }

        @Nullable
        public final String getFromUserName() {
            return this.fromUserName;
        }

        public final int getId() {
            return this.f44317id;
        }

        public final int getParentId() {
            return this.parentId;
        }

        public final int getPraiseNum() {
            return this.praiseNum;
        }

        public final int getReplyNum() {
            return this.replyNum;
        }

        public final int getRootCommentId() {
            return this.rootCommentId;
        }

        public final int getStaticFromUserId() {
            return this.staticFromUserId;
        }

        @Nullable
        public final String getStaticFromUserName() {
            return this.staticFromUserName;
        }

        @Nullable
        public final String getToHeadImg() {
            return this.toHeadImg;
        }

        public final int getToUserId() {
            return this.toUserId;
        }

        @Nullable
        public final String getToUserName() {
            return this.toUserName;
        }

        public final int getVideoId() {
            return this.videoId;
        }

        @Nullable
        public final String getWords() {
            return this.words;
        }

        public final void setChildren(@Nullable List<Children> list) {
            this.children = list;
        }

        public final void setCreateTime(long j10) {
            this.createTime = j10;
        }

        public final void setFromHeadImg(@Nullable String str) {
            this.fromHeadImg = str;
        }

        public final void setFromUserId(int i10) {
            this.fromUserId = i10;
        }

        public final void setFromUserName(@Nullable String str) {
            this.fromUserName = str;
        }

        public final void setId(int i10) {
            this.f44317id = i10;
        }

        public final void setParentId(int i10) {
            this.parentId = i10;
        }

        public final void setPraiseNum(int i10) {
            this.praiseNum = i10;
        }

        public final void setReplyNum(int i10) {
            this.replyNum = i10;
        }

        public final void setRootCommentId(int i10) {
            this.rootCommentId = i10;
        }

        public final void setStaticFromUserId(int i10) {
            this.staticFromUserId = i10;
        }

        public final void setStaticFromUserName(@Nullable String str) {
            this.staticFromUserName = str;
        }

        public final void setToHeadImg(@Nullable String str) {
            this.toHeadImg = str;
        }

        public final void setToUserId(int i10) {
            this.toUserId = i10;
        }

        public final void setToUserName(@Nullable String str) {
            this.toUserName = str;
        }

        public final void setVideoId(int i10) {
            this.videoId = i10;
        }

        public final void setWords(@Nullable String str) {
            this.words = str;
        }
    }

    @Nullable
    public final List<Children> getChildren() {
        return this.children;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getFromHeadImg() {
        return this.fromHeadImg;
    }

    public final int getFromUserId() {
        return this.fromUserId;
    }

    @Nullable
    public final String getFromUserName() {
        return this.fromUserName;
    }

    public final int getId() {
        return this.f44316id;
    }

    public final int getParentId() {
        return this.parentId;
    }

    public final int getPraiseNum() {
        return this.praiseNum;
    }

    public final int getReplyNum() {
        return this.replyNum;
    }

    public final int getRootCommentId() {
        return this.rootCommentId;
    }

    @Nullable
    public final String getToHeadImg() {
        return this.toHeadImg;
    }

    public final int getToUserId() {
        return this.toUserId;
    }

    @Nullable
    public final String getToUserName() {
        return this.toUserName;
    }

    public final int getVideoId() {
        return this.videoId;
    }

    @Nullable
    public final String getWords() {
        return this.words;
    }

    public final void setChildren(@Nullable List<Children> list) {
        this.children = list;
    }

    public final void setCreateTime(long j10) {
        this.createTime = j10;
    }

    public final void setFromHeadImg(@Nullable String str) {
        this.fromHeadImg = str;
    }

    public final void setFromUserId(int i10) {
        this.fromUserId = i10;
    }

    public final void setFromUserName(@Nullable String str) {
        this.fromUserName = str;
    }

    public final void setId(int i10) {
        this.f44316id = i10;
    }

    public final void setParentId(int i10) {
        this.parentId = i10;
    }

    public final void setPraiseNum(int i10) {
        this.praiseNum = i10;
    }

    public final void setReplyNum(int i10) {
        this.replyNum = i10;
    }

    public final void setRootCommentId(int i10) {
        this.rootCommentId = i10;
    }

    public final void setToHeadImg(@Nullable String str) {
        this.toHeadImg = str;
    }

    public final void setToUserId(int i10) {
        this.toUserId = i10;
    }

    public final void setToUserName(@Nullable String str) {
        this.toUserName = str;
    }

    public final void setVideoId(int i10) {
        this.videoId = i10;
    }

    public final void setWords(@Nullable String str) {
        this.words = str;
    }
}
