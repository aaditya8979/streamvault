package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.MolocoInitializationListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 {
    public static final void a(@NotNull final MolocoInitializationListener molocoInitializationListener, @NotNull final MolocoInitStatus molocoInitStatus) {
        tn.p.k(molocoInitializationListener, "<this>");
        tn.p.k(molocoInitStatus, "initStatus");
        com.moloco.sdk.internal.scheduling.d.a(new sn.a() { // from class: com.moloco.sdk.internal.publisher.u0
            @Override // sn.a
            public final Object invoke() {
                return v0.b(molocoInitializationListener, molocoInitStatus);
            }
        });
    }

    public static final bn.r b(MolocoInitializationListener molocoInitializationListener, MolocoInitStatus molocoInitStatus) {
        molocoInitializationListener.onMolocoInitializationStatus(molocoInitStatus);
        return bn.r.f5635a;
    }
}
