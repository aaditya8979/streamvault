package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhqt extends zzibr implements zzidd {
    private static final zzhqt zzb;
    private static volatile zzidk zzc;
    private String zza = "";

    static {
        zzhqt zzhqtVar = new zzhqt();
        zzb = zzhqtVar;
        zzibr.zzbu(zzhqt.class, zzhqtVar);
    }

    private zzhqt() {
    }

    public static zzhqt zzb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhqt) zzibr.zzbT(zzb, zzianVar, zzibbVar);
    }

    public static zzhqs zzc() {
        return (zzhqs) zzb.zzbn();
    }

    public static zzhqt zzd() {
        return zzb;
    }

    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhqt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqs(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zzc;
        if (zzibmVar == null) {
            synchronized (zzhqt.class) {
                zzibmVar = zzc;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzb);
                    zzc = zzibmVar;
                }
            }
        }
        return zzibmVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza = str;
    }
}
