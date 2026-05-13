package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhpn extends zzibr implements zzidd {
    private static final zzhpn zzb;
    private static volatile zzidk zzc;
    private int zza;

    static {
        zzhpn zzhpnVar = new zzhpn();
        zzb = zzhpnVar;
        zzibr.zzbu(zzhpn.class, zzhpnVar);
    }

    private zzhpn() {
    }

    public static zzhpn zzb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpn) zzibr.zzbT(zzb, zzianVar, zzibbVar);
    }

    public static zzhpn zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhpn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhpm(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zzc;
        if (zzibmVar == null) {
            synchronized (zzhpn.class) {
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
