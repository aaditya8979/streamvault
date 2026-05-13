package com.mgs.carparking.netbean;

import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShortVideoListEntry.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ShortVideoListEntry implements Serializable {

    @Nullable
    private String click_count;
    private int collection;

    @Nullable
    private String describe;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44311id;

    @Nullable
    private String name;

    @Nullable
    private String pic_url;

    @Nullable
    private String play_url;

    @Nullable
    private String vod_douban_score;
    private int vod_id;

    @Nullable
    private String vod_pic;

    @Nullable
    public final String getClick_count() {
        return this.click_count;
    }

    public final int getCollection() {
        return this.collection;
    }

    @Nullable
    public final String getDescribe() {
        return this.describe;
    }

    public final int getId() {
        return this.f44311id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPic_url() {
        return this.pic_url;
    }

    @Nullable
    public final String getPlay_url() {
        return this.play_url;
    }

    @Nullable
    public final String getVod_douban_score() {
        return this.vod_douban_score;
    }

    public final int getVod_id() {
        return this.vod_id;
    }

    @Nullable
    public final String getVod_pic() {
        return this.vod_pic;
    }

    public final void setClick_count(@Nullable String str) {
        this.click_count = str;
    }

    public final void setCollection(int i10) {
        this.collection = i10;
    }

    public final void setDescribe(@Nullable String str) {
        this.describe = str;
    }

    public final void setId(int i10) {
        this.f44311id = i10;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPic_url(@Nullable String str) {
        this.pic_url = str;
    }

    public final void setPlay_url(@Nullable String str) {
        this.play_url = str;
    }

    public final void setVod_douban_score(@Nullable String str) {
        this.vod_douban_score = str;
    }

    public final void setVod_id(int i10) {
        this.vod_id = i10;
    }

    public final void setVod_pic(@Nullable String str) {
        this.vod_pic = str;
    }
}
