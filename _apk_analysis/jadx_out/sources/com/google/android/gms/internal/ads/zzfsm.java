package com.google.android.gms.internal.ads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public enum zzfsm {
    HTML(CreativeInfo.f52467al),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    private final String zzd;

    zzfsm(String str) {
        this.zzd = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
