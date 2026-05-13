package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SpecialListEnntry.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SpecialListEnntry {

    @Nullable
    private String content;

    @Nullable
    private String icon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44313id;

    @Nullable
    private String name;
    private int type_id;

    @Nullable
    private String user_num;

    @Nullable
    private String vod_num;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.f44313id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getType_id() {
        return this.type_id;
    }

    @Nullable
    public final String getUser_num() {
        return this.user_num;
    }

    @Nullable
    public final String getVod_num() {
        return this.vod_num;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setId(int i10) {
        this.f44313id = i10;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setType_id(int i10) {
        this.type_id = i10;
    }

    public final void setUser_num(@Nullable String str) {
        this.user_num = str;
    }

    public final void setVod_num(@Nullable String str) {
        this.vod_num = str;
    }
}
