package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import androidx.annotation.VisibleForTesting;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final bn.g f50976a = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c
        @Override // sn.a
        public final Object invoke() {
            return d.b();
        }
    });

    @NotNull
    public static final a a() {
        return c();
    }

    public static final b b() {
        return d();
    }

    public static final b c() {
        return (b) f50976a.getValue();
    }

    @VisibleForTesting
    @NotNull
    public static final b d() {
        f fVarB;
        try {
            fVarB = b.i.f47671a.c();
        } catch (Exception e10) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "BestAttemptHttpRequest", "Failed to create PersistentHttpRequest, invoking NonPersistendHttpRequest", e10, false, 8, null);
            fVarB = k.b();
        }
        return new b(fVarB);
    }
}
