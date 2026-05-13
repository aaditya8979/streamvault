package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhoo extends zzibr implements zzidd {
    private static final zzhoo zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzhoq zzb;
    private int zzc;

    static {
        zzhoo zzhooVar = new zzhoo();
        zzd = zzhooVar;
        zzibr.zzbu(zzhoo.class, zzhooVar);
    }

    private zzhoo() {
    }

    public static zzhoo zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhoo) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhon zzd() {
        return (zzhon) zzd.zzbn();
    }

    public final zzhoq zza() {
        zzhoq zzhoqVar = this.zzb;
        return zzhoqVar == null ? zzhoq.zzc() : zzhoqVar;
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
            return new zzhoo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhon(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zze;
        if (zzibmVar == null) {
            synchronized (zzhoo.class) {
                zzibmVar = zze;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzd);
                    zze = zzibmVar;
                }
            }
        }
        return zzibmVar;
    }

    public final /* synthetic */ void zze(zzhoq zzhoqVar) {
        zzhoqVar.getClass();
        this.zzb = zzhoqVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzg(int i10) {
        this.zzc = i10;
    }
}
