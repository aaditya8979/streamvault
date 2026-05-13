package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CommentListVideoEntry.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CommentListVideoEntry {

    @Nullable
    private String content;

    @Nullable
    private String create_at;
    private int discuss_count;

    @Nullable
    private List<DiscussListEntry> discuss_list;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44299id;
    private int is_up;
    private int pid;
    private int user_id;

    @Nullable
    private UserInfoEntry user_info;
    private int vod_id;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getCreate_at() {
        return this.create_at;
    }

    public final int getDiscuss_count() {
        return this.discuss_count;
    }

    @Nullable
    public final List<DiscussListEntry> getDiscuss_list() {
        return this.discuss_list;
    }

    public final int getId() {
        return this.f44299id;
    }

    public final int getPid() {
        return this.pid;
    }

    public final int getUser_id() {
        return this.user_id;
    }

    @Nullable
    public final UserInfoEntry getUser_info() {
        return this.user_info;
    }

    public final int getVod_id() {
        return this.vod_id;
    }

    public final int is_up() {
        return this.is_up;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setCreate_at(@Nullable String str) {
        this.create_at = str;
    }

    public final void setDiscuss_count(int i10) {
        this.discuss_count = i10;
    }

    public final void setDiscuss_list(@Nullable List<DiscussListEntry> list) {
        this.discuss_list = list;
    }

    public final void setId(int i10) {
        this.f44299id = i10;
    }

    public final void setPid(int i10) {
        this.pid = i10;
    }

    public final void setUser_id(int i10) {
        this.user_id = i10;
    }

    public final void setUser_info(@Nullable UserInfoEntry userInfoEntry) {
        this.user_info = userInfoEntry;
    }

    public final void setVod_id(int i10) {
        this.vod_id = i10;
    }

    public final void set_up(int i10) {
        this.is_up = i10;
    }
}
