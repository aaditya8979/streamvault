package com.mgs.carparking.netbean;

import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SpecialList.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class SpecialList implements Serializable {

    @Nullable
    private String content;

    @Nullable
    private String icon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44312id;

    @Nullable
    private String name;
    private int vod_num;
    private int weight;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.f44312id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getVod_num() {
        return this.vod_num;
    }

    public final int getWeight() {
        return this.weight;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setId(int i10) {
        this.f44312id = i10;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setVod_num(int i10) {
        this.vod_num = i10;
    }

    public final void setWeight(int i10) {
        this.weight = i10;
    }
}
