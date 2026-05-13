package com.google.android.gms.internal.ads;

import com.ironsource.C3978d4;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes12.dex */
abstract class zzgyg extends zzgzf implements Runnable {
    public static final /* synthetic */ int zzd = 0;
    public c8.i zza;
    public Class zzb;
    public Object zzc;

    public zzgyg(c8.i iVar, Class cls, Object obj) {
        iVar.getClass();
        this.zza = iVar;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        c8.i iVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        if (((obj == null) || ((iVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = iVar instanceof zzhaq ? ((zzhaq) iVar).zzl() : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(iVar.getClass());
                String strValueOf2 = String.valueOf(e10.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 19 + strValueOf2.length() + 16);
                sb2.append("Future type ");
                sb2.append(strValueOf);
                sb2.append(" threw ");
                sb2.append(strValueOf2);
                sb2.append(" without a cause");
                cause = new NullPointerException(sb2.toString());
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        Object objZzs = th == null ? zzgzo.zzs(iVar) : null;
        if (th == null) {
            zza(objZzs);
            return;
        }
        if (!cls.isInstance(th)) {
            zzk(iVar);
            return;
        }
        try {
            Object objZzf = zzf(obj, th);
            this.zzb = null;
            this.zzc = null;
            zze(objZzf);
        } catch (Throwable th3) {
            try {
                zzhag.zza(th3);
                zzb(th3);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        String string;
        c8.i iVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String strZzd = super.zzd();
        if (iVar != null) {
            String string2 = iVar.toString();
            StringBuilder sb2 = new StringBuilder(string2.length() + 16);
            sb2.append("inputFuture=[");
            sb2.append(string2);
            sb2.append("], ");
            string = sb2.toString();
        } else {
            string = "";
        }
        if (cls == null || obj == null) {
            if (strZzd != null) {
                return string.concat(strZzd);
            }
            return null;
        }
        int length = string.length();
        String string3 = cls.toString();
        int length2 = string3.length();
        String string4 = obj.toString();
        StringBuilder sb3 = new StringBuilder(length + 15 + length2 + 13 + string4.length() + 1);
        sb3.append(string);
        sb3.append("exceptionType=[");
        sb3.append(string3);
        sb3.append("], fallback=[");
        sb3.append(string4);
        sb3.append(C3978d4.j.f31385e);
        return sb3.toString();
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Throwable th2) throws Exception;
}
