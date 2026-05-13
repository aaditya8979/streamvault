package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhit {
    public final Map zza = new HashMap();
    public final Map zzb = new HashMap();

    private zzhit() {
    }

    public /* synthetic */ zzhit(byte[] bArr) {
    }

    public final zzhit zza(Enum r22, Object obj) {
        this.zza.put(r22, obj);
        this.zzb.put(obj, r22);
        return this;
    }

    public final zzhiu zzb() {
        return new zzhiu(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }
}
