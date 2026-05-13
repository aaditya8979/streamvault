package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcgg implements Runnable {
    private final zzcfs zza;
    private boolean zzb = false;

    public zzcgg(zzcfs zzcfsVar) {
        this.zza = zzcfsVar;
    }

    private final void zzc() {
        zzfyn zzfynVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzfynVar.removeCallbacks(this);
        zzfynVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzF();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzF();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
