package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhqr extends zzibr implements zzidd {
    private static final zzhqr zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private zzhqt zzc;

    static {
        zzhqr zzhqrVar = new zzhqr();
        zzd = zzhqrVar;
        zzibr.zzbu(zzhqr.class, zzhqrVar);
    }

    private zzhqr() {
    }

    public static zzhqr zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhqr) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhqq zzd() {
        return (zzhqq) zzd.zzbn();
    }

    public static zzidk zze() {
        return zzd.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhqt zzb() {
        zzhqt zzhqtVar = this.zzc;
        return zzhqtVar == null ? zzhqt.zzd() : zzhqtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhqr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqq(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zze;
        if (zzibmVar == null) {
            synchronized (zzhqr.class) {
                zzibmVar = zze;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzd);
                    zze = zzibmVar;
                }
            }
        }
        return zzibmVar;
    }

    public final /* synthetic */ void zzg(zzhqt zzhqtVar) {
        zzhqtVar.getClass();
        this.zzc = zzhqtVar;
        this.zza |= 1;
    }
}
