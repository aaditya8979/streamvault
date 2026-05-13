package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhyi extends zzibr implements zzidd {
    private static final zzhyi zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzian zzb = zzian.zza;
    private String zzc = "";
    private zzicd zzd = zzibr.zzbM();
    private boolean zze;

    static {
        zzhyi zzhyiVar = new zzhyi();
        zzf = zzhyiVar;
        zzibr.zzbu(zzhyi.class, zzhyiVar);
    }

    private zzhyi() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzd", "zze", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhyi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhyh(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zzg;
        if (zzibmVar == null) {
            synchronized (zzhyi.class) {
                zzibmVar = zzg;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzf);
                    zzg = zzibmVar;
                }
            }
        }
        return zzibmVar;
    }
}
