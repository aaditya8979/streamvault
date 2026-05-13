package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzeha implements zzfmu {
    public final Context zza;
    public final String zzb;

    @Nullable
    private final String zzc;

    public zzeha(Context context, String str, zzcac zzcacVar, int i10, @Nullable String str2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzegz zza(zzegy zzegyVar) throws zzecr {
        return zzc(zzegyVar.zza, zzegyVar.zzb, zzegyVar.zzc, zzegyVar.zzd, zzegyVar.zze, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x023a, code lost:
    
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r4.append("Received error HTTP response code: ");
        r4.append(r0);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(r4.toString());
        r8 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r8.append("Received error HTTP response code: ");
        r8.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0274, code lost:
    
        throw new com.google.android.gms.internal.ads.zzecr(1, r8.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzegz zzc(java.lang.String r18, int r19, java.util.Map r20, byte[] r21, java.lang.String r22, long r23) throws java.net.MalformedURLException, com.google.android.gms.internal.ads.zzecr {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeha.zzc(java.lang.String, int, java.util.Map, byte[], java.lang.String, long):com.google.android.gms.internal.ads.zzegz");
    }
}
