package com.ironsource;

import com.vungle.ads.internal.signals.SignalManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public enum N3 {
    Day("d", SignalManager.TWENTY_FOUR_HOURS_MILLIS),
    Hour("h", 3600000),
    Second("s", 1000);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f29877c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f29882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f29883b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final N3 a(@Nullable String str) {
            for (N3 n32 : N3.values()) {
                if (tn.p.f(n32.f29882a, str)) {
                    return n32;
                }
            }
            return null;
        }
    }

    N3(String str, long j10) {
        this.f29882a = str;
        this.f29883b = j10;
    }

    public static /* synthetic */ long a(N3 n32, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
        }
        if ((i10 & 1) != 0) {
            num = 1;
        }
        return n32.a(num);
    }

    public final long a(@Nullable Integer num) {
        return ((long) (num != null ? num.intValue() : 1)) * this.f29883b;
    }
}
