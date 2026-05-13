package com.google.common.collect;

/* JADX INFO: loaded from: classes12.dex */
public enum BoundType {
    OPEN(false),
    CLOSED(true);

    public final boolean inclusive;

    BoundType(boolean z10) {
        this.inclusive = z10;
    }

    public static BoundType forBoolean(boolean z10) {
        return z10 ? CLOSED : OPEN;
    }
}
