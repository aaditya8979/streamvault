package com.mgs.carparking.netbean;

import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BlockListEntry.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class BlockListEntry implements Serializable {

    @Nullable
    private String banner_pic;

    @Nullable
    private String block_name;

    @Nullable
    private String content;
    private int data_id;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44295id;
    private int jump_type;

    @Nullable
    private String jump_url;
    private int topic_id;

    @Nullable
    private RecommandVideosEntity vod_info;

    @Nullable
    private List<RecommandVideosEntity> vod_list;

    @Nullable
    public final String getBanner_pic() {
        return this.banner_pic;
    }

    @Nullable
    public final String getBlock_name() {
        return this.block_name;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    public final int getData_id() {
        return this.data_id;
    }

    public final int getId() {
        return this.f44295id;
    }

    public final int getJump_type() {
        return this.jump_type;
    }

    @Nullable
    public final String getJump_url() {
        return this.jump_url;
    }

    public final int getTopic_id() {
        return this.topic_id;
    }

    @Nullable
    public final RecommandVideosEntity getVod_info() {
        return this.vod_info;
    }

    @Nullable
    public final List<RecommandVideosEntity> getVod_list() {
        return this.vod_list;
    }

    public final void setBanner_pic(@Nullable String str) {
        this.banner_pic = str;
    }

    public final void setBlock_name(@Nullable String str) {
        this.block_name = str;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setData_id(int i10) {
        this.data_id = i10;
    }

    public final void setId(int i10) {
        this.f44295id = i10;
    }

    public final void setJump_type(int i10) {
        this.jump_type = i10;
    }

    public final void setJump_url(@Nullable String str) {
        this.jump_url = str;
    }

    public final void setTopic_id(int i10) {
        this.topic_id = i10;
    }

    public final void setVod_info(@Nullable RecommandVideosEntity recommandVideosEntity) {
        this.vod_info = recommandVideosEntity;
    }

    public final void setVod_list(@Nullable List<RecommandVideosEntity> list) {
        this.vod_list = list;
    }
}
