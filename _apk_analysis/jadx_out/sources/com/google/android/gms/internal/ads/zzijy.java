package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzijy {
    public static zzijy zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzijt(cls.getSimpleName()) : new zzijv(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
