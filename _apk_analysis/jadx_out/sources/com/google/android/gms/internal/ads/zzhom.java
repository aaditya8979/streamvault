package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhom extends zzibr implements zzidd {
    private static final zzhom zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzhoq zzc;
    private zzian zzd = zzian.zza;

    static {
        zzhom zzhomVar = new zzhom();
        zze = zzhomVar;
        zzibr.zzbu(zzhom.class, zzhomVar);
    }

    private zzhom() {
    }

    public static zzhom zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhom) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhol zze() {
        return (zzhol) zze.zzbn();
    }

    public static zzidk zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhoq zzb() {
        zzhoq zzhoqVar = this.zzc;
        return zzhoqVar == null ? zzhoq.zzc() : zzhoqVar;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhom();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhol(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zzf;
        if (zzibmVar == null) {
            synchronized (zzhom.class) {
                zzibmVar = zzf;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zze);
                    zzf = zzibmVar;
                }
            }
        }
        return zzibmVar;
    }

    public final /* synthetic */ void zzh(zzhoq zzhoqVar) {
        zzhoqVar.getClass();
        this.zzc = zzhoqVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzi(zzian zzianVar) {
        this.zzd = zzianVar;
    }
}
