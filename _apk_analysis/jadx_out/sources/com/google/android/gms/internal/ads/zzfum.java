package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfum implements Runnable {
    public final /* synthetic */ zzfur zza;

    public zzfum(zzfur zzfurVar) {
        Objects.requireNonNull(zzfurVar);
        this.zza = zzfurVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzh().zzc();
    }
}
