package com.unity3d.ads.core.extensions;

import com.google.protobuf.Timestamp;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: TimestampExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TimestampExtensionsKt {
    public static final long duration(long j10) {
        return System.nanoTime() - j10;
    }

    @NotNull
    public static final Timestamp fromMillis(long j10) {
        long j11 = 1000;
        Timestamp timestampBuild = Timestamp.newBuilder().setSeconds(j10 / j11).setNanos((int) ((j10 % j11) * ((long) 1000000))).build();
        p.j(timestampBuild, "newBuilder().setSeconds(…000000).toInt())).build()");
        return timestampBuild;
    }
}
