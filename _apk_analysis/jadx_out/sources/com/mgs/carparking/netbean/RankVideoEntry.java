package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RankVideoEntry.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class RankVideoEntry {

    @Nullable
    private String content;

    @Nullable
    private String icon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44305id;

    @Nullable
    private String name;

    @Nullable
    private String user_num;

    @Nullable
    private List<RecommandVideosEntity> vod_list;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.f44305id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getUser_num() {
        return this.user_num;
    }

    @Nullable
    public final List<RecommandVideosEntity> getVod_list() {
        return this.vod_list;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setId(int i10) {
        this.f44305id = i10;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setUser_num(@Nullable String str) {
        this.user_num = str;
    }

    public final void setVod_list(@Nullable List<RecommandVideosEntity> list) {
        this.vod_list = list;
    }
}
