package com.google.android.gms.internal.ads;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfza {

    @NotNull
    private final zzfyw zza;

    public final /* synthetic */ zzfyy zza() {
        zzibr zzibrVarZzbu = this.zza.zzbu();
        p.j(zzibrVarZzbu, "build(...)");
        return (zzfyy) zzibrVarZzbu;
    }

    public final /* synthetic */ zziev zzb() {
        Map mapZzb = this.zza.zzb();
        p.j(mapZzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zziev(mapZzb);
    }

    public final void zzc(@NotNull zziev zzievVar, @NotNull String str, @NotNull zzfyu zzfyuVar) {
        p.k(zzievVar, "<this>");
        p.k(str, "key");
        p.k(zzfyuVar, "value");
        this.zza.zzc(str, zzfyuVar);
    }

    public final /* synthetic */ void zzd(zziev zzievVar, String str) {
        p.k(zzievVar, "<this>");
        p.k(str, "key");
        this.zza.zza(str);
    }
}
