package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfyw extends zzibl implements zzidd {
    private zzfyw() {
        throw null;
    }

    public /* synthetic */ zzfyw(byte[] bArr) {
        super(zzfyy.zzb);
    }

    public final zzfyw zza(String str) {
        str.getClass();
        zzbg();
        ((zzfyy) this.zza).zze().remove(str);
        return this;
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(((zzfyy) this.zza).zzb());
    }

    public final zzfyw zzc(String str, zzfyu zzfyuVar) {
        str.getClass();
        zzfyuVar.getClass();
        zzbg();
        ((zzfyy) this.zza).zze().put(str, zzfyuVar);
        return this;
    }
}
