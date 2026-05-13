package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BarrageListEntry.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BarrageListEntry {
    private int collectionId;

    @Nullable
    private String content;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Nullable
    private String f44294id;

    @Nullable
    private String issueContent;
    private long issueTime;
    private int send_time;

    @Nullable
    private String textColor;
    private int textSize;
    private int user_id;
    private int vod_id;

    public final int getCollectionId() {
        return this.collectionId;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getId() {
        return this.f44294id;
    }

    @Nullable
    public final String getIssueContent() {
        return this.issueContent;
    }

    public final long getIssueTime() {
        return this.issueTime;
    }

    public final int getSend_time() {
        return this.send_time;
    }

    @Nullable
    public final String getTextColor() {
        return this.textColor;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final int getUser_id() {
        return this.user_id;
    }

    public final int getVod_id() {
        return this.vod_id;
    }

    public final void setCollectionId(int i10) {
        this.collectionId = i10;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setId(@Nullable String str) {
        this.f44294id = str;
    }

    public final void setIssueContent(@Nullable String str) {
        this.issueContent = str;
    }

    public final void setIssueTime(long j10) {
        this.issueTime = j10;
    }

    public final void setSend_time(int i10) {
        this.send_time = i10;
    }

    public final void setTextColor(@Nullable String str) {
        this.textColor = str;
    }

    public final void setTextSize(int i10) {
        this.textSize = i10;
    }

    public final void setUser_id(int i10) {
        this.user_id = i10;
    }

    public final void setVod_id(int i10) {
        this.vod_id = i10;
    }
}
