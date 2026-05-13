package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ChannnelFilterEntry.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ChannnelFilterEntry {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44298id;

    @Nullable
    private String img;

    @Nullable
    private List<ChannelTypeItemEntry> msg;

    @Nullable
    private String name;

    public final int getId() {
        return this.f44298id;
    }

    @Nullable
    public final String getImg() {
        return this.img;
    }

    @Nullable
    public final List<ChannelTypeItemEntry> getMsg() {
        return this.msg;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setId(int i10) {
        this.f44298id = i10;
    }

    public final void setImg(@Nullable String str) {
        this.img = str;
    }

    public final void setMsg(@Nullable List<ChannelTypeItemEntry> list) {
        this.msg = list;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }
}
