package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfad implements zzfax {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfae zzc = new zzfae(new JSONArray().toString(), new Bundle(), "");
    public final String zza;
    private final zzgzy zzd;
    private final ScheduledExecutorService zze;
    private final zzeqk zzf;
    private final Context zzg;
    private final zzfjk zzh;
    private final zzeqf zzi;
    private final zzdvp zzj;
    private final zzeam zzk;
    private final int zzl;

    public zzfad(zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, String str, zzeqk zzeqkVar, Context context, zzfjk zzfjkVar, zzeqf zzeqfVar, zzdvp zzdvpVar, zzeam zzeamVar, int i10) {
        this.zzd = zzgzyVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzeqkVar;
        this.zzg = context;
        this.zzh = zzfjkVar;
        this.zzi = zzeqfVar;
        this.zzj = zzdvpVar;
        this.zzk = zzeamVar;
        this.zzl = i10;
    }

    private final void zzf(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzeqo zzeqoVar = (zzeqo) ((Map.Entry) it.next()).getValue();
            String str = zzeqoVar.zza;
            list.add(zzh(str, Collections.singletonList(zzeqoVar.zze), zzg(str), zzeqoVar.zzb, zzeqoVar.zzc));
        }
    }

    @Nullable
    private final Bundle zzg(String str) {
        Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgzg zzh(final String str, final List list, final Bundle bundle, final boolean z10, final boolean z11) {
        zzgyv zzgyvVar = new zzgyv() { // from class: com.google.android.gms.internal.ads.zzezy
            @Override // com.google.android.gms.internal.ads.zzgyv
            public final /* synthetic */ c8.i zza() {
                return this.zza.zzd(str, list, bundle, z10, z11);
            }
        };
        zzgzy zzgzyVar = this.zzd;
        zzgzg zzgzgVarZzw = zzgzg.zzw(zzgzo.zzf(zzgyvVar, zzgzyVar));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcf)).booleanValue()) {
            zzgzgVarZzw = (zzgzg) zzgzo.zzi(zzgzgVarZzw, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbY)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzgzg) zzgzo.zzg(zzgzgVarZzw, Throwable.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzezz
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th2 = (Throwable) obj;
                int i10 = zzfad.zzb;
                String str2 = str;
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoz)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, zzgzyVar);
    }

    private final void zzi(zzbvs zzbvsVar, Bundle bundle, @NonNull List list, zzeqn zzeqnVar) throws RemoteException {
        zzbvsVar.zze(ObjectWrapper.wrap(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zzf, zzeqnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final c8.i zza() {
        if (this.zzl == 2) {
            return zzgzo.zza(zzc);
        }
        zzfjk zzfjkVar = this.zzh;
        if (zzfjkVar.zzs) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcl)).split(StringUtils.COMMA)).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfjkVar.zzd)))) {
                return zzgzo.zza(zzc);
            }
        }
        return zzgzo.zzf(new zzgyv() { // from class: com.google.android.gms.internal.ads.zzfab
            @Override // com.google.android.gms.internal.ads.zzgyv
            public final /* synthetic */ c8.i zza() {
                return this.zza.zzc();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 32;
    }

    public final /* synthetic */ c8.i zzc() {
        final String str;
        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmr)).booleanValue() ? this.zzh.zzg.toLowerCase(Locale.ROOT) : this.zzh.zzg;
        final Bundle bundleZzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcj)).booleanValue() ? this.zzk.zzg() : new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfc)).booleanValue()) {
            int iZzk = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzk();
            str = iZzk != 1 ? iZzk != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcs)).booleanValue()) {
            zzf(arrayList, this.zzf.zzd(this.zza, lowerCase));
        } else {
            zzeqk zzeqkVar = this.zzf;
            for (Map.Entry entry : zzeqkVar.zzc(this.zza, lowerCase).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzh(str2, (List) entry.getValue(), zzg(str2), true, true));
            }
            zzf(arrayList, zzeqkVar.zzb());
        }
        return zzgzo.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzezx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i10 = zzfad.zzb;
                JSONArray jSONArray = new JSONArray();
                for (c8.i iVar : arrayList) {
                    if (((JSONObject) iVar.get()) != null) {
                        jSONArray.put(iVar.get());
                    }
                }
                String str3 = str;
                Bundle bundle = bundleZzg;
                if (jSONArray.length() != 0) {
                    return new zzfae(jSONArray.toString(), bundle, str3);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfc)).booleanValue()) {
                    return new zzfae(new JSONArray().toString(), bundle, str3);
                }
                return null;
            }
        }, this.zzd);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ c8.i zzd(java.lang.String r9, final java.util.List r10, final android.os.Bundle r11, boolean r12, boolean r13) throws android.os.RemoteException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzcen r7 = new com.google.android.gms.internal.ads.zzcen
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L24
            com.google.android.gms.internal.ads.zzbgv r13 = com.google.android.gms.internal.ads.zzbhe.zzck
            com.google.android.gms.internal.ads.zzbhc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r13 = r1.zzd(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L24
            com.google.android.gms.internal.ads.zzeqf r13 = r8.zzi
            r13.zza(r9)
            com.google.android.gms.internal.ads.zzbvs r13 = r13.zzb(r9)
            goto L32
        L24:
            com.google.android.gms.internal.ads.zzdvp r13 = r8.zzj     // Catch: android.os.RemoteException -> L2b
            com.google.android.gms.internal.ads.zzbvs r13 = r13.zzb(r9)     // Catch: android.os.RemoteException -> L2b
            goto L32
        L2b:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r13)
            r13 = r0
        L32:
            if (r13 != 0) goto L4c
            com.google.android.gms.internal.ads.zzbgv r10 = com.google.android.gms.internal.ads.zzbhe.zzca
            com.google.android.gms.internal.ads.zzbhc r11 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r10 = r11.zzd(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4b
            com.google.android.gms.internal.ads.zzeqn.zzd(r9, r7)
            goto Lb8
        L4b:
            throw r0
        L4c:
            com.google.android.gms.internal.ads.zzeqn r6 = new com.google.android.gms.internal.ads.zzeqn
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzt.zzk()
            long r4 = r0.elapsedRealtime()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbgv r9 = com.google.android.gms.internal.ads.zzbhe.zzcf
            com.google.android.gms.internal.ads.zzbhc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r9 = r0.zzd(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8b
            java.util.concurrent.ScheduledExecutorService r9 = r8.zze
            com.google.android.gms.internal.ads.zzfac r0 = new com.google.android.gms.internal.ads.zzfac
            r0.<init>()
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzbY
            com.google.android.gms.internal.ads.zzbhc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L8b:
            if (r12 == 0) goto Lb5
            com.google.android.gms.internal.ads.zzbgv r9 = com.google.android.gms.internal.ads.zzbhe.zzcm
            com.google.android.gms.internal.ads.zzbhc r12 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r9 = r12.zzd(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb1
            com.google.android.gms.internal.ads.zzgzy r9 = r8.zzd
            com.google.android.gms.internal.ads.zzfaa r12 = new com.google.android.gms.internal.ads.zzfaa
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r10
            r5 = r6
            r6 = r7
            r0.<init>()
            r9.submit(r12)
            goto Lb8
        Lb1:
            r8.zzi(r13, r11, r10, r6)
            goto Lb8
        Lb5:
            r6.zzb()
        Lb8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfad.zzd(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):c8.i");
    }

    public final /* synthetic */ void zze(zzbvs zzbvsVar, Bundle bundle, List list, zzeqn zzeqnVar, zzcen zzcenVar) {
        try {
            zzi(zzbvsVar, bundle, list, zzeqnVar);
        } catch (RemoteException e10) {
            zzcenVar.zzd(e10);
        }
    }
}
