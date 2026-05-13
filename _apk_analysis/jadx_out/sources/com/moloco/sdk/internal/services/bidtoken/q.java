package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.internal.MolocoLogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final bn.g f47289a = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.services.bidtoken.p
        @Override // sn.a
        public final Object invoke() {
            return q.b();
        }
    });

    @NotNull
    public static final o a() {
        return c();
    }

    public static final m b() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "BidTokenService", "Creating BidTokenService instance", null, false, 12, null);
        return new m(b0.f47134a.a(), u.f47313a.a());
    }

    public static final m c() {
        return (m) f47289a.getValue();
    }
}
