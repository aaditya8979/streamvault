package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VideoMoreEntry.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoMoreEntry {

    @Nullable
    private String icon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44319id;

    @Nullable
    private String name;

    @Nullable
    private List<RecommandVideosEntity> vod_list;

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.f44319id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<RecommandVideosEntity> getVod_list() {
        return this.vod_list;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setId(int i10) {
        this.f44319id = i10;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setVod_list(@Nullable List<RecommandVideosEntity> list) {
        this.vod_list = list;
    }
}
