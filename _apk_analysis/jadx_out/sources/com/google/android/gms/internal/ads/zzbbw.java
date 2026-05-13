package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes12.dex */
final class zzbbw implements Runnable {
    public final /* synthetic */ zzbbx zza;

    public zzbbw(zzbbx zzbbxVar) {
        Objects.requireNonNull(zzbbxVar);
        this.zza = zzbbxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
