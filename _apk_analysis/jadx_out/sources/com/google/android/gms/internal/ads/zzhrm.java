package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhrm extends zzibr implements zzidd {
    private static final zzhrm zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhrm zzhrmVar = new zzhrm();
        zzd = zzhrmVar;
        zzibr.zzbu(zzhrm.class, zzhrmVar);
    }

    private zzhrm() {
    }

    public static zzhrl zzd() {
        return (zzhrl) zzd.zzbn();
    }

    public static zzhrm zze() {
        return zzd;
    }

    public final zzhpt zza() {
        zzhpt zzhptVarZzb = zzhpt.zzb(this.zza);
        return zzhptVarZzb == null ? zzhpt.UNRECOGNIZED : zzhptVarZzb;
    }

    public final zzhpt zzb() {
        zzhpt zzhptVarZzb = zzhpt.zzb(this.zzb);
        return zzhptVarZzb == null ? zzhpt.UNRECOGNIZED : zzhptVarZzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhrm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrl(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zze;
        if (zzibmVar == null) {
            synchronized (zzhrm.class) {
                zzibmVar = zze;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzd);
                    zze = zzibmVar;
                }
            }
        }
        return zzibmVar;
    }

    public final /* synthetic */ void zzg(zzhpt zzhptVar) {
        this.zza = zzhptVar.zza();
    }

    public final /* synthetic */ void zzh(zzhpt zzhptVar) {
        this.zzb = zzhptVar.zza();
    }

    public final /* synthetic */ void zzi(int i10) {
        this.zzc = i10;
    }
}
