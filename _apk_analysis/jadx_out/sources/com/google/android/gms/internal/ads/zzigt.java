package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzigt extends zzibr implements zzidd {
    private static final zzigt zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzd;

    static {
        zzigt zzigtVar = new zzigt();
        zze = zzigtVar;
        zzibr.zzbu(zzigt.class, zzigtVar);
    }

    private zzigt() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzibx zzibxVar = zzigr.zza;
            return zzibr.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", zzibxVar, "zzc", "zzd", zzibxVar});
        }
        if (iOrdinal == 3) {
            return new zzigt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzigs(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zzf;
        if (zzibmVar == null) {
            synchronized (zzigt.class) {
                zzibmVar = zzf;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zze);
                    zzf = zzibmVar;
                }
            }
        }
        return zzibmVar;
    }
}
