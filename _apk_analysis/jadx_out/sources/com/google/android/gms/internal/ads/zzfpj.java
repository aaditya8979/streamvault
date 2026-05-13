package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzfpj extends zzibr implements zzidd {
    private static final zzfpj zzb;
    private static volatile zzidk zzc;
    private boolean zza;

    static {
        zzfpj zzfpjVar = new zzfpj();
        zzb = zzfpjVar;
        zzibr.zzbu(zzfpj.class, zzfpjVar);
    }

    private zzfpj() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzfpj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfpi(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zzc;
        if (zzibmVar == null) {
            synchronized (zzfpj.class) {
                zzibmVar = zzc;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzb);
                    zzc = zzibmVar;
                }
            }
        }
        return zzibmVar;
    }
}
