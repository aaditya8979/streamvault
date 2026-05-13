package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DiscussListEntry.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DiscussListEntry {

    @Nullable
    private String content;

    @Nullable
    private String create_at;

    @Nullable
    private String head_img;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44302id;

    @Nullable
    private String nickname;
    private int pid;
    private int user_id;
    private int vod_id;

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

    public final int getId() {
        return this.f44302id;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    public final int getPid() {
        return this.pid;
    }

    public final int getUser_id() {
        return this.user_id;
    }

    public final int getVod_id() {
        return this.vod_id;
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

    public final void setId(int i10) {
        this.f44302id = i10;
    }

    public final void setNickname(@Nullable String str) {
        this.nickname = str;
    }

    public final void setPid(int i10) {
        this.pid = i10;
    }

    public final void setUser_id(int i10) {
        this.user_id = i10;
    }

    public final void setVod_id(int i10) {
        this.vod_id = i10;
    }
}
