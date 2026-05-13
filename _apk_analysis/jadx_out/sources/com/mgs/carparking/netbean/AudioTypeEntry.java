package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AudioTypeEntry.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AudioTypeEntry {
    private int type;

    @Nullable
    private String type_name;

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getType_name() {
        return this.type_name;
    }

    public final void setType(int i10) {
        this.type = i10;
    }

    public final void setType_name(@Nullable String str) {
        this.type_name = str;
    }
}
