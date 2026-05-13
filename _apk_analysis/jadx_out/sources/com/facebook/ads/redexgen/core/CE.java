package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CE {
    public static final AtomicLong A07 = new AtomicLong();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final AnonymousClass56 A05;
    public final Map<String, List<String>> A06;

    public CE(long j10, AnonymousClass56 anonymousClass56, long j11) {
        this(j10, anonymousClass56, anonymousClass56 != null ? anonymousClass56.A06 : null, Collections.emptyMap(), j11, 0L, 0L);
    }

    public CE(long j10, AnonymousClass56 anonymousClass56, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.A03 = j10;
        this.A05 = anonymousClass56;
        this.A04 = uri;
        this.A06 = map;
        this.A01 = j11;
        this.A02 = j12;
        this.A00 = j13;
    }

    public static long A00() {
        return A07.getAndIncrement();
    }
}
