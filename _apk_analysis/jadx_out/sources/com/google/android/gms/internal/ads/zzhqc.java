package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhqc extends zzibr implements zzidd {
    private static final zzhqc zzd;
    private static volatile zzidk zze;
    private String zza = "";
    private zzian zzb = zzian.zza;
    private int zzc;

    static {
        zzhqc zzhqcVar = new zzhqc();
        zzd = zzhqcVar;
        zzibr.zzbu(zzhqc.class, zzhqcVar);
    }

    private zzhqc() {
    }

    public static zzhqa zzd() {
        return (zzhqa) zzd.zzbn();
    }

    public static zzhqc zze() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzian zzb() {
        return this.zzb;
    }

    public final zzhqb zzc() {
        int i10 = this.zzc;
        zzhqb zzhqbVar = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? null : zzhqb.REMOTE : zzhqb.ASYMMETRIC_PUBLIC : zzhqb.ASYMMETRIC_PRIVATE : zzhqb.SYMMETRIC : zzhqb.UNKNOWN_KEYMATERIAL;
        return zzhqbVar == null ? zzhqb.UNRECOGNIZED : zzhqbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhqc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqa(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zze;
        if (zzibmVar == null) {
            synchronized (zzhqc.class) {
                zzibmVar = zze;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzd);
                    zze = zzibmVar;
                }
            }
        }
        return zzibmVar;
    }

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzh(zzian zzianVar) {
        zzianVar.getClass();
        this.zzb = zzianVar;
    }

    public final /* synthetic */ void zzi(zzhqb zzhqbVar) {
        this.zzc = zzhqbVar.zza();
    }
}
