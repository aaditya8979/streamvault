package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhre extends zzibr implements zzidd {
    private static final zzhre zzb;
    private static volatile zzidk zzc;
    private int zza;

    static {
        zzhre zzhreVar = new zzhre();
        zzb = zzhreVar;
        zzibr.zzbu(zzhre.class, zzhreVar);
    }

    private zzhre() {
    }

    public static zzhrd zzb() {
        return (zzhrd) zzb.zzbn();
    }

    public static zzhre zzc() {
        return zzb;
    }

    public final zzhpt zza() {
        zzhpt zzhptVarZzb = zzhpt.zzb(this.zza);
        return zzhptVarZzb == null ? zzhpt.UNRECOGNIZED : zzhptVarZzb;
    }

    public final /* synthetic */ void zzd(zzhpt zzhptVar) {
        this.zza = zzhptVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhre();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrd(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zzc;
        if (zzibmVar == null) {
            synchronized (zzhre.class) {
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
