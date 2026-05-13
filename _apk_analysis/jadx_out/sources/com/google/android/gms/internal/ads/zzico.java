package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzico {
    public static final List zza(Object obj, long j10) {
        zzicd zzicdVar = (zzicd) zziem.zzn(obj, j10);
        if (zzicdVar.zza()) {
            return zzicdVar;
        }
        int size = zzicdVar.size();
        zzicd zzicdVarZzh = zzicdVar.zzh(size == 0 ? 10 : size + size);
        zziem.zzo(obj, j10, zzicdVarZzh);
        return zzicdVarZzh;
    }
}
