package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzaaa extends zzaag implements zzmm {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgvz zzc = zzgvz.zzc(new Comparator() { // from class: com.google.android.gms.internal.ads.zzzg
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj2;
            Integer num2 = (Integer) obj;
            int i10 = zzaaa.zzb;
            if (num2.intValue() == -1) {
                return num.intValue() == -1 ? 0 : -1;
            }
            if (num.intValue() == -1) {
                return 1;
            }
            return num2.intValue() - num.intValue();
        }
    });

    @Nullable
    public final Context zza;
    private final Object zzd;

    @GuardedBy("lock")
    private zzzl zze;

    @Nullable
    @GuardedBy("lock")
    private Thread zzf;

    @Nullable
    private zzzp zzg;
    private zzd zzh;
    private Boolean zzi;
    private final zzyt zzj;

    public zzaaa(Context context) {
        zzyt zzytVar = new zzyt();
        zzzl zzzlVar = zzzl.zzJ;
        this.zzd = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzytVar;
        if (zzzlVar instanceof zzzl) {
            this.zze = zzzlVar;
        } else {
            zzzk zzzkVar = new zzzk(zzzlVar, null);
            zzzkVar.zzx((zzbl) zzzlVar);
            this.zze = new zzzl(zzzkVar, null);
        }
        this.zzh = zzd.zza;
        if (this.zze.zzU && context == null) {
            zzee.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Nullable
    public static String zzi(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int zzj(zzv zzvVar, @Nullable String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.zzd)) {
            return 4;
        }
        String strZzi = zzi(str);
        String strZzi2 = zzi(zzvVar.zzd);
        if (strZzi2 == null || strZzi == null) {
            return (z10 && strZzi2 == null) ? 1 : 0;
        }
        if (strZzi2.startsWith(strZzi) || strZzi.startsWith(strZzi2)) {
            return 3;
        }
        String str2 = zzfj.zza;
        return strZzi2.split("-", 2)[0].equals(strZzi.split("-", 2)[0]) ? 2 : 0;
    }

    public static /* synthetic */ int zzm(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ int zzn(com.google.android.gms.internal.ads.zzv r5, com.google.android.gms.internal.ads.zzguf r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L2a
            r2 = r0
        L9:
            java.util.List r3 = r5.zzc
            int r4 = r3.size()
            if (r2 >= r4) goto L27
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.zzx r3 = (com.google.android.gms.internal.ads.zzx) r3
            java.lang.String r3 = r3.zzb
            java.lang.Object r4 = r6.get(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            goto L2d
        L24:
            int r2 = r2 + 1
            goto L9
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaa.zzn(com.google.android.gms.internal.ads.zzv, com.google.android.gms.internal.ads.zzguf):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final void zzl() {
        boolean z10;
        zzzp zzzpVar;
        synchronized (this.zzd) {
            z10 = false;
            if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null && zzzpVar.zza()) {
                z10 = true;
            }
        }
        if (z10) {
            zzs();
        }
    }

    private static void zzv(zzyn zzynVar, zzbl zzblVar, Map map) {
        for (int i10 = 0; i10 < zzynVar.zzb; i10++) {
            if (((zzbh) zzblVar.zzH.get(zzynVar.zza(i10))) != null) {
                throw null;
            }
        }
    }

    @Nullable
    private static final Pair zzw(int i10, zzaaf zzaafVar, int[][][] iArr, zzzr zzzrVar, Comparator comparator) {
        RandomAccess randomAccessZzj;
        boolean z10;
        zzaaf zzaafVar2 = zzaafVar;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < 2) {
            if (i10 == zzaafVar2.zza(i11)) {
                zzyn zzynVarZzb = zzaafVar2.zzb(i11);
                for (int i12 = 0; i12 < zzynVarZzb.zzb; i12++) {
                    zzbg zzbgVarZza = zzynVarZzb.zza(i12);
                    List listZza = zzzrVar.zza(i11, zzbgVarZza, iArr[i11][i12]);
                    int i13 = zzbgVarZza.zza;
                    boolean[] zArr = new boolean[i13];
                    int i14 = 0;
                    while (i14 < i13) {
                        int i15 = i14 + 1;
                        zzzs zzzsVar = (zzzs) listZza.get(i14);
                        int iZza = zzzsVar.zza();
                        if (!zArr[i14] && iZza != 0) {
                            if (iZza == 1) {
                                randomAccessZzj = zzguf.zzj(zzzsVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzzsVar);
                                for (int i16 = i15; i16 < i13; i16++) {
                                    zzzs zzzsVar2 = (zzzs) listZza.get(i16);
                                    if (zzzsVar2.zza() == 2 && zzzsVar.zzc(zzzsVar2)) {
                                        arrayList2.add(zzzsVar2);
                                        z10 = true;
                                        zArr[i16] = true;
                                    } else {
                                        z10 = true;
                                    }
                                }
                                randomAccessZzj = arrayList2;
                            }
                            arrayList.add(randomAccessZzj);
                        }
                        i14 = i15;
                    }
                }
            }
            i11++;
            zzaafVar2 = zzaafVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((zzzs) list.get(i17)).zzc;
        }
        zzzs zzzsVar3 = (zzzs) list.get(0);
        return Pair.create(new zzaab(zzzsVar3.zzb, iArr2, 0), Integer.valueOf(zzzsVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void zza(zzml zzmlVar) {
        synchronized (this.zzd) {
            boolean z10 = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final void zzb() {
        zzzp zzzpVar;
        synchronized (this.zzd) {
            Thread thread = this.zzf;
            if (thread != null) {
                zzgrc.zzj(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null) {
            zzzpVar.zze();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzzl zzc() {
        zzzl zzzlVar;
        synchronized (this.zzd) {
            zzzlVar = this.zze;
        }
        return zzzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final void zze(zzd zzdVar) {
        if (this.zzh.equals(zzdVar)) {
            return;
        }
        this.zzh = zzdVar;
        zzl();
    }

    public final void zzf(zzzk zzzkVar) {
        boolean z10;
        zzzl zzzlVar = new zzzl(zzzkVar, null);
        synchronized (this.zzd) {
            z10 = !this.zze.equals(zzzlVar);
            this.zze = zzzlVar;
        }
        if (z10) {
            if (zzzlVar.zzU && this.zza == null) {
                zzee.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    @Nullable
    public final zzmm zzg() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzaag
    public final Pair zzh(zzaaf zzaafVar, int[][][] iArr, final int[] iArr2, zzwk zzwkVar, zzbf zzbfVar) throws zziw {
        final zzzl zzzlVar;
        int i10;
        final boolean z10;
        final String str;
        final String languageTag;
        int[] iArr3;
        int length;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        Context context3;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzzlVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzfj.zzM(context3));
        }
        if (zzzlVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzzp(this.zza, this, this.zzi);
        }
        int i11 = 2;
        zzaab[] zzaabVarArr = new zzaab[2];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= 2) {
                z10 = false;
                break;
            }
            if (zzaafVar.zza(i13) == 2 && zzaafVar.zzb(i13).zzb > 0) {
                z10 = true;
                break;
            }
            i13++;
        }
        Pair pairZzw = zzw(1, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzc
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i14, zzbg zzbgVar, int[] iArr4) {
                zzzc zzzcVar = this;
                final zzaaa zzaaaVar = zzzcVar.zza;
                final zzzl zzzlVar2 = zzzlVar;
                zzgrd zzgrdVar = new zzgrd() { // from class: com.google.android.gms.internal.ads.zzzf
                    @Override // com.google.android.gms.internal.ads.zzgrd
                    public final /* synthetic */ boolean zza(Object obj) {
                        return zzaaaVar.zzk(zzzlVar2, (zzv) obj);
                    }
                };
                int i15 = iArr2[i14];
                int i16 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                int i17 = 0;
                while (i17 < zzbgVar.zza) {
                    zzgucVar.zzf(new zzyx(i14, zzbgVar, i17, zzzlVar2, iArr4[i17], z10, zzgrdVar, i15));
                    i17++;
                    zzzcVar = this;
                }
                return zzgucVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyy
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((zzyx) Collections.max((List) obj)).zzb((zzyx) Collections.max((List) obj2));
            }
        });
        if (pairZzw != null) {
            zzaabVarArr[((Integer) pairZzw.second).intValue()] = (zzaab) pairZzw.first;
        }
        if (pairZzw == null) {
            str = null;
        } else {
            Object obj = pairZzw.first;
            str = ((zzaab) obj).zza.zza(((zzaab) obj).zzb[0]).zzd;
        }
        int i14 = zzzlVar.zzw.zzb;
        final Point pointZzO = (!zzzlVar.zzk || (context2 = this.zza) == null) ? null : zzfj.zzO(context2);
        Pair pairZzw2 = zzw(2, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzh
            /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
            @Override // com.google.android.gms.internal.ads.zzzr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* synthetic */ java.util.List zza(int r20, com.google.android.gms.internal.ads.zzbg r21, int[] r22) {
                /*
                    Method dump skipped, instruction units count: 214
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzh.zza(int, com.google.android.gms.internal.ads.zzbg, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzzb
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj2, Object obj3) {
                List list = (List) obj3;
                List list2 = (List) obj2;
                return zzgts.zzg().zza((zzzz) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzzy
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(Object obj4, Object obj5) {
                        return zzzz.zzi((zzzz) obj4, (zzzz) obj5);
                    }
                }), (zzzz) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzzt
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(Object obj4, Object obj5) {
                        return zzzz.zzi((zzzz) obj4, (zzzz) obj5);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzzu
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(Object obj4, Object obj5) {
                        return zzzz.zzi((zzzz) obj4, (zzzz) obj5);
                    }
                }).zzb(list2.size(), list.size()).zza((zzzz) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzzv
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(Object obj4, Object obj5) {
                        return zzzz.zzj((zzzz) obj4, (zzzz) obj5);
                    }
                }), (zzzz) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzzw
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(Object obj4, Object obj5) {
                        return zzzz.zzj((zzzz) obj4, (zzzz) obj5);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzzx
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(Object obj4, Object obj5) {
                        return zzzz.zzj((zzzz) obj4, (zzzz) obj5);
                    }
                }).zze();
            }
        });
        int i15 = 4;
        Pair pairZzw3 = pairZzw2 == null ? zzw(4, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzze
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i16, zzbg zzbgVar, int[] iArr4) {
                int i17 = zzaaa.zzb;
                int i18 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                for (int i19 = 0; i19 < zzbgVar.zza; i19++) {
                    zzgucVar.zzf(new zzzi(i16, zzbgVar, i19, zzzlVar, iArr4[i19]));
                }
                return zzgucVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyz
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj2, Object obj3) {
                return ((zzzi) ((List) obj2).get(0)).compareTo((zzzi) ((List) obj3).get(0));
            }
        }) : null;
        if (pairZzw3 != null) {
            zzaabVarArr[((Integer) pairZzw3.second).intValue()] = (zzaab) pairZzw3.first;
        } else if (pairZzw2 != null) {
            zzaabVarArr[((Integer) pairZzw2.second).intValue()] = (zzaab) pairZzw2.first;
        }
        if (!zzzlVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str2 = zzfj.zza;
            languageTag = locale.toLanguageTag();
        }
        int i16 = 3;
        Pair pairZzw4 = zzw(3, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzd
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i17, zzbg zzbgVar, int[] iArr4) {
                int i18 = zzaaa.zzb;
                int i19 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                for (int i20 = 0; i20 < zzbgVar.zza; i20++) {
                    String str3 = languageTag;
                    int i21 = i20;
                    zzgucVar.zzf(new zzzq(i17, zzbgVar, i21, zzzlVar, iArr4[i20], str, str3));
                }
                return zzgucVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzza
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj2, Object obj3) {
                return ((zzzq) ((List) obj2).get(0)).zzb((zzzq) ((List) obj3).get(0));
            }
        });
        if (pairZzw4 != null) {
            zzaabVarArr[((Integer) pairZzw4.second).intValue()] = (zzaab) pairZzw4.first;
        }
        int i17 = 0;
        while (i17 < i11) {
            int iZza = zzaafVar.zza(i17);
            if (iZza != i11 && iZza != i10 && iZza != i16 && iZza != i15) {
                zzyn zzynVarZzb = zzaafVar.zzb(i17);
                int[][] iArr4 = iArr[i17];
                int i18 = i12;
                int i19 = i18;
                zzbg zzbgVar = null;
                zzzj zzzjVar = null;
                while (i18 < zzynVarZzb.zzb) {
                    zzbg zzbgVarZza = zzynVarZzb.zza(i18);
                    int[] iArr5 = iArr4[i18];
                    zzzj zzzjVar2 = zzzjVar;
                    for (int i20 = i12; i20 < zzbgVarZza.zza; i20++) {
                        if (zzmn.zzaa(iArr5[i20], zzzlVar.zzV)) {
                            zzzj zzzjVar3 = new zzzj(zzbgVarZza.zza(i20), iArr5[i20]);
                            if (zzzjVar2 == null || zzzjVar3.compareTo(zzzjVar2) > 0) {
                                zzzjVar2 = zzzjVar3;
                                zzbgVar = zzbgVarZza;
                                i19 = i20;
                            }
                        }
                    }
                    i18++;
                    zzzjVar = zzzjVar2;
                    i12 = 0;
                }
                zzaabVarArr[i17] = zzbgVar == null ? null : new zzaab(zzbgVar, new int[]{i19}, 0);
            }
            i17++;
            i11 = 2;
            i12 = 0;
            i16 = 3;
            i10 = 1;
            i15 = 4;
        }
        HashMap map = new HashMap();
        int i21 = 2;
        for (int i22 = 0; i22 < 2; i22++) {
            zzv(zzaafVar.zzb(i22), zzzlVar, map);
        }
        zzv(zzaafVar.zze(), zzzlVar, map);
        for (int i23 = 0; i23 < 2; i23++) {
            if (((zzbh) map.get(Integer.valueOf(zzaafVar.zza(i23)))) != null) {
                throw null;
            }
        }
        int i24 = 0;
        while (i24 < i21) {
            zzyn zzynVarZzb2 = zzaafVar.zzb(i24);
            if (zzzlVar.zzb(i24, zzynVarZzb2)) {
                if (zzzlVar.zzc(i24, zzynVarZzb2) != null) {
                    throw null;
                }
                zzaabVarArr[i24] = null;
            }
            i24++;
            i21 = 2;
        }
        int i25 = 0;
        for (int i26 = i21; i25 < i26; i26 = 2) {
            int iZza2 = zzaafVar.zza(i25);
            if (zzzlVar.zza(i25) || zzzlVar.zzI.contains(Integer.valueOf(iZza2))) {
                zzaabVarArr[i25] = null;
            }
            i25++;
        }
        zzyt zzytVar = this.zzj;
        zzaas zzaasVarZzt = zzt();
        zzguf zzgufVarZzd = zzyu.zzd(zzaabVarArr);
        int i27 = 2;
        zzaac[] zzaacVarArr = new zzaac[2];
        int i28 = 0;
        while (i28 < i27) {
            zzaab zzaabVar = zzaabVarArr[i28];
            if (zzaabVar != null && (length = (iArr3 = zzaabVar.zzb).length) != 0) {
                zzaacVarArr[i28] = length == 1 ? new zzaad(zzaabVar.zza, iArr3[0], 0, 0, null) : zzytVar.zza(zzaabVar.zza, iArr3, 0, zzaasVarZzt, (zzguf) zzgufVarZzd.get(i28));
            }
            i28++;
            i27 = 2;
        }
        zzmo[] zzmoVarArr = new zzmo[i27];
        for (int i29 = 0; i29 < i27; i29++) {
            zzmoVarArr[i29] = (zzzlVar.zza(i29) || zzzlVar.zzI.contains(Integer.valueOf(zzaafVar.zza(i29))) || (zzaafVar.zza(i29) != -2 && zzaacVarArr[i29] == null)) ? null : zzmo.zza;
        }
        return Pair.create(zzmoVarArr, zzaacVarArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ boolean zzk(com.google.android.gms.internal.ads.zzzl r8, com.google.android.gms.internal.ads.zzv r9) {
        /*
            r7 = this;
            boolean r8 = r8.zzU
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L8f
            java.lang.Boolean r8 = r7.zzi
            if (r8 == 0) goto L10
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L8f
        L10:
            int r8 = r9.zzG
            r2 = -1
            if (r8 == r2) goto L8f
            r3 = 2
            if (r8 <= r3) goto L8f
            java.lang.String r8 = r9.zzo
            r4 = 32
            if (r8 != 0) goto L1f
            goto L67
        L1f:
            int r5 = r8.hashCode()
            r6 = 3
            switch(r5) {
                case -2123537834: goto L46;
                case 187078296: goto L3c;
                case 187078297: goto L32;
                case 1504578661: goto L28;
                default: goto L27;
            }
        L27:
            goto L4f
        L28:
            java.lang.String r5 = "audio/eac3"
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L4f
            r2 = r1
            goto L4f
        L32:
            java.lang.String r5 = "audio/ac4"
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L4f
            r2 = r6
            goto L4f
        L3c:
            java.lang.String r5 = "audio/ac3"
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L4f
            r2 = r0
            goto L4f
        L46:
            java.lang.String r5 = "audio/eac3-joc"
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L4f
            r2 = r3
        L4f:
            if (r2 == 0) goto L58
            if (r2 == r1) goto L58
            if (r2 == r3) goto L58
            if (r2 == r6) goto L58
            goto L67
        L58:
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r4) goto L8f
            com.google.android.gms.internal.ads.zzzp r8 = r7.zzg
            if (r8 == 0) goto L8f
            boolean r8 = r8.zza()
            if (r8 != 0) goto L67
            goto L8f
        L67:
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r4) goto L90
            com.google.android.gms.internal.ads.zzzp r8 = r7.zzg
            if (r8 == 0) goto L90
            boolean r2 = r8.zza()
            if (r2 == 0) goto L90
            boolean r8 = r8.zzb()
            if (r8 == 0) goto L90
            com.google.android.gms.internal.ads.zzzp r8 = r7.zzg
            boolean r8 = r8.zzc()
            if (r8 == 0) goto L90
            com.google.android.gms.internal.ads.zzzp r8 = r7.zzg
            com.google.android.gms.internal.ads.zzd r2 = r7.zzh
            boolean r8 = r8.zzd(r2, r9)
            if (r8 == 0) goto L8e
            goto L8f
        L8e:
            return r0
        L8f:
            r0 = r1
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaa.zzk(com.google.android.gms.internal.ads.zzzl, com.google.android.gms.internal.ads.zzv):boolean");
    }
}
