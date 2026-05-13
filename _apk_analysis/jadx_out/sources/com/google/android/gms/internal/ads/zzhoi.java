package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhoi extends zzibr implements zzidd {
    private static final zzhoi zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzhok zzb;
    private int zzc;

    static {
        zzhoi zzhoiVar = new zzhoi();
        zzd = zzhoiVar;
        zzibr.zzbu(zzhoi.class, zzhoiVar);
    }

    private zzhoi() {
    }

    public static zzhoh zzc() {
        return (zzhoh) zzd.zzbn();
    }

    public static zzhoi zzd() {
        return zzd;
    }

    public final zzhok zza() {
        zzhok zzhokVar = this.zzb;
        return zzhokVar == null ? zzhok.zzc() : zzhokVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhoi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhoh(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zze;
        if (zzibmVar == null) {
            synchronized (zzhoi.class) {
                zzibmVar = zze;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzd);
                    zze = zzibmVar;
                }
            }
        }
        return zzibmVar;
    }

    public final /* synthetic */ void zze(zzhok zzhokVar) {
        zzhokVar.getClass();
        this.zzb = zzhokVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzg(int i10) {
        this.zzc = i10;
    }
}
