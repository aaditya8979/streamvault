package com.mgs.carparking.netbean;

import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VideoInfoModel.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class VideoInfoModel implements Serializable {

    @Nullable
    private String author;

    @Nullable
    private String author_description;

    @Nullable
    private String author_icon;

    @Nullable
    private String category;

    @Nullable
    private String cover;

    @Nullable
    private String date;

    @Nullable
    private String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44318id;

    @Nullable
    private String play_url;

    @Nullable
    private String title;

    @Nullable
    public final String getAuthor() {
        return this.author;
    }

    @Nullable
    public final String getAuthor_description() {
        return this.author_description;
    }

    @Nullable
    public final String getAuthor_icon() {
        return this.author_icon;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    @Nullable
    public final String getDate() {
        return this.date;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.f44318id;
    }

    @Nullable
    public final String getPlay_url() {
        return this.play_url;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setAuthor(@Nullable String str) {
        this.author = str;
    }

    public final void setAuthor_description(@Nullable String str) {
        this.author_description = str;
    }

    public final void setAuthor_icon(@Nullable String str) {
        this.author_icon = str;
    }

    public final void setCategory(@Nullable String str) {
        this.category = str;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setDate(@Nullable String str) {
        this.date = str;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setId(int i10) {
        this.f44318id = i10;
    }

    public final void setPlay_url(@Nullable String str) {
        this.play_url = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
