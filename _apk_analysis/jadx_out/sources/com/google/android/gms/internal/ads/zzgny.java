package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgny implements AppOpsManager$OnOpActiveChangedListener {
    public final /* synthetic */ zzgoa zza;

    public zzgny(zzgoa zzgoaVar) {
        Objects.requireNonNull(zzgoaVar);
        this.zza = zzgoaVar;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        zzgoa zzgoaVar = this.zza;
        synchronized (zzgoaVar) {
            if (z10) {
                zzgoaVar.zzg(System.currentTimeMillis());
                zzgoaVar.zzj(true);
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zzgoaVar.zzh() > 0 && jCurrentTimeMillis >= zzgoaVar.zzh()) {
                    zzgoaVar.zzi(jCurrentTimeMillis - zzgoaVar.zzh());
                }
                zzgoaVar.zzj(false);
            }
        }
    }
}
