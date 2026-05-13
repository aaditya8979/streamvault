package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbog {
    public static final zzboh zza = new zzboh() { // from class: com.google.android.gms.internal.ads.zzbof
        @Override // com.google.android.gms.internal.ads.zzboh
        public final /* synthetic */ void zza(Object obj, Map map) {
            zzckx zzckxVar = (zzckx) obj;
            zzboh zzbohVar = zzbog.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(StringUtils.COMMA);
            HashMap map2 = new HashMap();
            PackageManager packageManager = zzckxVar.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                boolean z10 = true;
                if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z10 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z10);
                map2.put(str2, boolValueOf);
                StringBuilder sb2 = new StringBuilder(str2.length() + 14 + boolValueOf.toString().length());
                sb2.append("/canOpenURLs;");
                sb2.append(str2);
                sb2.append(";");
                sb2.append(boolValueOf);
                com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            }
            ((zzbrd) zzckxVar).zze("openableURLs", map2);
        }
    };
    public static final zzboh zzb = new zzboh() { // from class: com.google.android.gms.internal.ads.zzbnw
        @Override // com.google.android.gms.internal.ads.zzboh
        public final /* synthetic */ void zza(Object obj, Map map) {
            zzckx zzckxVar = (zzckx) obj;
            zzboh zzbohVar = zzbog.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjA)).booleanValue()) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(zzckxVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 13 + boolValueOf.toString().length());
            sb2.append("/canOpenApp;");
            sb2.append(str);
            sb2.append(";");
            sb2.append(boolValueOf);
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            ((zzbrd) zzckxVar).zze("openableApp", map2);
        }
    };
    public static final zzboh zzc = new zzboh() { // from class: com.google.android.gms.internal.ads.zzbnx
        @Override // com.google.android.gms.internal.ads.zzboh
        public final /* synthetic */ void zza(Object obj, Map map) {
            zzbog.zze((zzckx) obj, map);
        }
    };
    public static final zzboh zzd = new zzbno();
    public static final zzboh zze = new zzbnp();
    public static final zzboh zzf = new zzboh() { // from class: com.google.android.gms.internal.ads.zzboc
        @Override // com.google.android.gms.internal.ads.zzboh
        public final /* synthetic */ void zza(Object obj, Map map) {
            zzckx zzckxVar = (zzckx) obj;
            zzboh zzbohVar = zzbog.zza;
            String str = (String) map.get("u");
            if (str == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzg)).booleanValue() && str.isEmpty()) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty from httpTrack GMSG.");
            } else {
                zzcjc zzcjcVar = (zzcjc) zzckxVar;
                new com.google.android.gms.ads.internal.util.zzbt(zzckxVar.getContext(), ((zzclf) zzckxVar).zzs().afmaVersion, str, null, zzcjcVar.zzC() != null ? zzcjcVar.zzC().zzax : null).zzb();
            }
        }
    };
    public static final zzboh zzg = new zzbnq();
    public static final zzboh zzh = new zzbnr();
    public static final zzboh zzi = new zzboh() { // from class: com.google.android.gms.internal.ads.zzbod
        @Override // com.google.android.gms.internal.ads.zzboh
        public final /* synthetic */ void zza(Object obj, Map map) {
            zzcle zzcleVar = (zzcle) obj;
            zzboh zzbohVar = zzbog.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i10 = Integer.parseInt(str);
                int i11 = Integer.parseInt(str2);
                int i12 = Integer.parseInt(str3);
                zzazh zzazhVarZzS = zzcleVar.zzS();
                if (zzazhVarZzS != null) {
                    zzazhVarZzS.zzb().zze(i10, i11, i12);
                }
            } catch (NumberFormatException unused) {
                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzboh zzj = new zzbns();
    public static final zzboh zzk = new zzbnt();
    public static final zzboh zzl = new zzchf();
    public static final zzboh zzm = new zzchg();
    public static final zzboh zzn = new zzbna();
    public static final zzboy zzo = new zzboy();
    public static final zzboh zzp = new zzbnu();
    public static final zzboh zzq = new zzbnv();
    public static final zzboh zzr = new zzbnb();
    public static final zzboh zzs = new zzbnc();
    public static final zzboh zzt = new zzbnd();
    public static final zzboh zzu = new zzbne();
    public static final zzboh zzv = new zzbnf();
    public static final zzboh zzw = new zzbng();
    public static final zzboh zzx = new zzbnh();
    public static final zzboh zzy = new zzbni();
    public static final zzboh zzz = new zzbnj();
    public static final zzboh zzA = new zzbnk();
    public static final zzboh zzB = new zzbnm();
    public static final zzboh zzC = new zzbnn();

    public static c8.i zza(zzcjl zzcjlVar, String str) {
        Uri uriZzd = Uri.parse(str);
        try {
            zzazh zzazhVarZzS = zzcjlVar.zzS();
            zzfjo zzfjoVarZzT = zzcjlVar.zzT();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() || zzfjoVarZzT == null) {
                if (zzazhVarZzS != null && zzazhVarZzS.zza(uriZzd)) {
                    uriZzd = zzazhVarZzS.zzd(uriZzd, zzcjlVar.getContext(), zzcjlVar.zzE(), zzcjlVar.zzj());
                }
            } else if (zzazhVarZzS != null && zzazhVarZzS.zza(uriZzd)) {
                uriZzd = zzfjoVarZzT.zza(uriZzd, zzcjlVar.getContext(), zzcjlVar.zzE(), zzcjlVar.zzj());
            }
        } catch (zzazi unused) {
            String strConcat = "Unable to append parameter to URL: ".concat(str);
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        }
        Map map = new HashMap();
        if (zzcjlVar.zzC() != null) {
            map = zzcjlVar.zzC().zzaw;
        }
        final String strZzb = zzccs.zzb(uriZzd, zzcjlVar.getContext(), map);
        long jLongValue = ((Long) zzbjd.zze.zze()).longValue();
        if (jLongValue <= 0 || jLongValue > 254715000) {
            return zzgzo.zza(strZzb);
        }
        zzgzg zzgzgVarZzw = zzgzg.zzw(zzcjlVar.zzaF());
        zzbny zzbnyVar = new zzgqt() { // from class: com.google.android.gms.internal.ads.zzbny
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th2 = (Throwable) obj;
                zzboh zzbohVar = zzbog.zza;
                if (!((Boolean) zzbjd.zzi.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        zzgzy zzgzyVar = zzcei.zzg;
        return (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzg(zzgzgVarZzw, Throwable.class, zzbnyVar, zzgzyVar), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzbnz
            /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            @Override // com.google.android.gms.internal.ads.zzgqt
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r6 = (java.lang.String) r6
                    com.google.android.gms.internal.ads.zzboh r0 = com.google.android.gms.internal.ads.zzbog.zza
                    java.lang.String r0 = r1
                    if (r6 != 0) goto L9
                    goto L74
                L9:
                    com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbjd.zzf
                    java.lang.Object r1 = r1.zze()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L18
                    goto L39
                L18:
                    java.lang.String r1 = ".doubleclick.net"
                    java.lang.String r2 = ".googleadservices.com"
                    java.lang.String r3 = ".googlesyndication.com"
                    java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
                    android.net.Uri r2 = android.net.Uri.parse(r0)
                    java.lang.String r2 = r2.getHost()
                    r3 = 0
                L2b:
                    r4 = 3
                    if (r3 >= r4) goto L74
                    r4 = r1[r3]
                    boolean r4 = r2.endsWith(r4)
                    if (r4 != 0) goto L39
                    int r3 = r3 + 1
                    goto L2b
                L39:
                    com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbjd.zza
                    java.lang.Object r1 = r1.zze()
                    java.lang.String r1 = (java.lang.String) r1
                    com.google.android.gms.internal.ads.zzbio r2 = com.google.android.gms.internal.ads.zzbjd.zzb
                    java.lang.Object r2 = r2.zze()
                    java.lang.String r2 = (java.lang.String) r2
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L53
                    java.lang.String r0 = r0.replace(r1, r6)
                L53:
                    boolean r1 = android.text.TextUtils.isEmpty(r2)
                    if (r1 != 0) goto L74
                    android.net.Uri r1 = android.net.Uri.parse(r0)
                    java.lang.String r3 = r1.getQueryParameter(r2)
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L74
                    android.net.Uri$Builder r0 = r1.buildUpon()
                    android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
                    java.lang.String r6 = r6.toString()
                    return r6
                L74:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbnz.apply(java.lang.Object):java.lang.Object");
            }
        }, zzgzyVar), Throwable.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzboa
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th2 = (Throwable) obj;
                zzboh zzbohVar = zzbog.zza;
                if (((Boolean) zzbjd.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, zzgzyVar);
    }

    public static zzboh zzb(final zzdjm zzdjmVar, final zzcrv zzcrvVar) {
        return new zzboh() { // from class: com.google.android.gms.internal.ads.zzbob
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcjl zzcjlVar = (zzcjl) obj;
                zzbog.zzc(map, zzdjmVar);
                final String str = (String) map.get("u");
                if (str == null) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                final zzcrv zzcrvVar2 = zzcrvVar;
                zzgzg zzgzgVarZzw = zzgzg.zzw(zzbog.zza(zzcjlVar, str));
                zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzboe
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ c8.i zza(Object obj2) {
                        zzcrv zzcrvVar3;
                        String str2 = (String) obj2;
                        zzboh zzbohVar = zzbog.zza;
                        return (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzly)).booleanValue() && (zzcrvVar3 = zzcrvVar2) != null && zzcrv.zzc(str)) ? zzcrvVar3.zzb(str2, com.google.android.gms.ads.internal.client.zzbb.zzh()) : zzgzo.zza(str2);
                    }
                };
                zzgzy zzgzyVar = zzcei.zza;
                zzgzo.zzr((zzgzg) zzgzo.zzj(zzgzgVarZzw, zzgywVar, zzgzyVar), new zzbnl(zzcjlVar), zzgzyVar);
            }
        };
    }

    public static void zzc(Map map, zzdjm zzdjmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmi)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdjmVar != null) {
            zzdjmVar.zzdu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void zze(com.google.android.gms.internal.ads.zzckx r16, java.util.Map r17) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbog.zze(com.google.android.gms.internal.ads.zzckx, java.util.Map):void");
    }
}
