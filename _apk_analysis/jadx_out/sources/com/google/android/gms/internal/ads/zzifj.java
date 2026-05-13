package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzifj extends zzibr implements zzidd {
    private static final zzifj zzd;
    private static volatile zzidk zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        zzifj zzifjVar = new zzifj();
        zzd = zzifjVar;
        zzibr.zzbu(zzifj.class, zzifjVar);
    }

    private zzifj() {
    }

    public static zzifi zzc() {
        return (zzifi) zzd.zzbn();
    }

    public final /* synthetic */ void zzd(int i10) {
        this.zza = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzifj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzifi(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zze;
        if (zzibmVar == null) {
            synchronized (zzifj.class) {
                zzibmVar = zze;
                if (zzibmVar == null) {
                    zzibmVar = new zzibm(zzd);
                    zze = zzibmVar;
                }
            }
        }
        return zzibmVar;
    }

    public final /* synthetic */ void zze(long j10) {
        this.zzb = j10;
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zzc = j10;
    }
}
