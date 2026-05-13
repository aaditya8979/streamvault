package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzeyy implements zzfav {
    private final zzfjk zza;

    @Nullable
    private final PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzeyy(zzfjk zzfjkVar, @Nullable PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfjkVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    private final void zzc(Bundle bundle) {
        int i10;
        zzbkh zzbkhVar = this.zza.zzj;
        if (zzbkhVar == null || (i10 = zzbkhVar.zzi) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", zzbkhVar.zzj);
        bundle.putInt("sccg_dir", i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    @Override // com.google.android.gms.internal.ads.zzfav
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeyy.zza(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = this.zza.zzh;
        zzdah zzdahVar = (zzdah) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zzc(zzdahVar.zzb);
    }
}
