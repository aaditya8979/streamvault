package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfyy extends zzibr implements zzidd {
    private static final zzfyy zzb;
    private static volatile zzidk zzc;
    private zzicw zza = zzicw.zza();

    static {
        zzfyy zzfyyVar = new zzfyy();
        zzb = zzfyyVar;
        zzibr.zzbu(zzfyy.class, zzfyyVar);
    }

    private zzfyy() {
    }

    public static zzfyy zzc(InputStream inputStream) throws IOException {
        return (zzfyy) zzibr.zzbW(zzb, inputStream);
    }

    public static zzfyy zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", zzfyx.zza});
        }
        if (iOrdinal == 3) {
            return new zzfyy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfyw(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zzc;
        if (zzibmVar == null) {
            synchronized (zzfyy.class) {
                zzibmVar = zzc;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzb);
                    zzc = zzibmVar;
                }
            }
        }
        return zzibmVar;
    }

    public final /* synthetic */ Map zze() {
        if (!this.zza.zze()) {
            this.zza = this.zza.zzc();
        }
        return this.zza;
    }
}
