package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzbqc implements Runnable {
    public final /* synthetic */ zzbqf zza;

    public zzbqc(zzbqf zzbqfVar) {
        Objects.requireNonNull(zzbqfVar);
        this.zza = zzbqfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
