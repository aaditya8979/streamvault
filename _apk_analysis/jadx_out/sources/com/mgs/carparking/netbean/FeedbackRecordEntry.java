package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FeedbackRecordEntry.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackRecordEntry {

    @Nullable
    private String content;

    @Nullable
    private String create_at;

    @Nullable
    private String head_img;
    private int is_read;

    @Nullable
    private String nickname;

    @Nullable
    private String reply_at;

    @Nullable
    private String reply_content;

    @Nullable
    private String tags;
    private int type;
    private int user_id;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getCreate_at() {
        return this.create_at;
    }

    @Nullable
    public final String getHead_img() {
        return this.head_img;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final String getReply_at() {
        return this.reply_at;
    }

    @Nullable
    public final String getReply_content() {
        return this.reply_content;
    }

    @Nullable
    public final String getTags() {
        return this.tags;
    }

    public final int getType() {
        return this.type;
    }

    public final int getUser_id() {
        return this.user_id;
    }

    public final int is_read() {
        return this.is_read;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setCreate_at(@Nullable String str) {
        this.create_at = str;
    }

    public final void setHead_img(@Nullable String str) {
        this.head_img = str;
    }

    public final void setNickname(@Nullable String str) {
        this.nickname = str;
    }

    public final void setReply_at(@Nullable String str) {
        this.reply_at = str;
    }

    public final void setReply_content(@Nullable String str) {
        this.reply_content = str;
    }

    public final void setTags(@Nullable String str) {
        this.tags = str;
    }

    public final void setType(int i10) {
        this.type = i10;
    }

    public final void setUser_id(int i10) {
        this.user_id = i10;
    }

    public final void set_read(int i10) {
        this.is_read = i10;
    }
}
