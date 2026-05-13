package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzfox extends zzibr implements zzidd {
    private static final zzfox zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzfou zzb;

    static {
        zzfox zzfoxVar = new zzfox();
        zzc = zzfoxVar;
        zzibr.zzbu(zzfox.class, zzfoxVar);
    }

    private zzfox() {
    }

    public static zzfow zza() {
        return (zzfow) zzc.zzbn();
    }

    public final /* synthetic */ void zzb(zzfou zzfouVar) {
        zzfouVar.getClass();
        this.zzb = zzfouVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfox();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfow(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zzd;
        if (zzibmVar == null) {
            synchronized (zzfox.class) {
                zzibmVar = zzd;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzc);
                    zzd = zzibmVar;
                }
            }
        }
        return zzibmVar;
    }
}
