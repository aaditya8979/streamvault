package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgry {
    public static zzgru zza(zzgru zzgruVar) {
        return ((zzgruVar instanceof zzgrx) || (zzgruVar instanceof zzgrv)) ? zzgruVar : zzgruVar instanceof Serializable ? new zzgrv(zzgruVar) : new zzgrx(zzgruVar);
    }
}
