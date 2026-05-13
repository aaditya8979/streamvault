package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzikb {
    public final LinkedHashMap zza;

    public zzikb(int i10) {
        this.zza = zzikd.zzc(i10);
    }

    public final zzikb zza(Object obj, zzikp zzikpVar) {
        zziko.zza(obj, "key");
        zziko.zza(zzikpVar, IronSourceConstants.EVENTS_PROVIDER);
        this.zza.put(obj, zzikpVar);
        return this;
    }
}
