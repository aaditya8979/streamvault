package com.bytedance.sdk.component.le.ouw.yu.vt;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw {
    public int ouw;
    public int vt;

    public ouw(int i10) {
        if (100 < i10) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.ouw = i10;
        this.vt = 100;
    }

    public static ouw ouw() {
        return new ouw(1);
    }
}
