package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ChannelTypeItemEntry.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ChannelTypeItemEntry {

    @Nullable
    private List<String> data;

    @Nullable
    private String name;

    @Nullable
    public final List<String> getData() {
        return this.data;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setData(@Nullable List<String> list) {
        this.data = list;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }
}
