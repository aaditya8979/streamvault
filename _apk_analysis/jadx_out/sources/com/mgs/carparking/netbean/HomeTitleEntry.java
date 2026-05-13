package com.mgs.carparking.netbean;

import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HomeTitleEntry.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class HomeTitleEntry implements Serializable {

    @Nullable
    private String channel_name;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44303id;
    private int vod_type_id;

    @Nullable
    public final String getChannel_name() {
        return this.channel_name;
    }

    public final int getId() {
        return this.f44303id;
    }

    public final int getVod_type_id() {
        return this.vod_type_id;
    }

    public final void setChannel_name(@Nullable String str) {
        this.channel_name = str;
    }

    public final void setId(int i10) {
        this.f44303id = i10;
    }

    public final void setVod_type_id(int i10) {
        this.vod_type_id = i10;
    }
}
