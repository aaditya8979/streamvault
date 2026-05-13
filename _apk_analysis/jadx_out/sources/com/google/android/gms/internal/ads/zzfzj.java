package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import p000do.l0;
import p000do.l1;
import tn.p;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfzj {
    @NotNull
    public static final zzfzh zza(@NotNull final ExecutorService executorService) {
        p.k(executorService, "executorService");
        return new zzfzh() { // from class: com.google.android.gms.internal.ads.zzfzi
            @Override // com.google.android.gms.internal.ads.zzfzh
            public final /* synthetic */ l0 zza() {
                return kotlinx.coroutines.d.a(l1.c(executorService));
            }
        };
    }
}
