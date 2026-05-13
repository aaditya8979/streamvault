package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;
import org.jetbrains.annotations.NotNull;
import p000do.l0;
import tn.p;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzgaf implements zzfyv {

    @NotNull
    private final l0 zza;

    @NotNull
    private final mo.a zzb;

    @NotNull
    private final mo.a zzc;

    @NotNull
    private final mo.a zzd;
    private boolean zze;
    private zzfyt zzf;
    private boolean zzg;

    @NotNull
    private final DataStore zzh;

    @NotNull
    private final zzdvj zzi;

    public zzgaf(@NotNull DataStore dataStore, @NotNull zzfzh zzfzhVar, @NotNull zzdvj zzdvjVar, @NotNull zzfze zzfzeVar) {
        p.k(dataStore, "adQualityDataStore");
        p.k(zzfzhVar, "coroutineScopeProvider");
        p.k(zzdvjVar, "dataPinger");
        p.k(zzfzeVar, "clock");
        this.zzi = zzdvjVar;
        this.zza = zzfzhVar.zza();
        this.zzb = mo.g.b(false, 1, null);
        this.zzc = mo.g.b(false, 1, null);
        this.zzd = mo.g.b(false, 1, null);
        this.zzh = dataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzs(java.lang.String r8, hn.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.zzfzk
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.zzfzk r0 = (com.google.android.gms.internal.ads.zzfzk) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzk r0 = new com.google.android.gms.internal.ads.zzfzk
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zzc
            java.lang.Object r1 = in.a.g()
            int r2 = r0.zze
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.zza
            mo.a r8 = (mo.a) r8
            kotlin.c.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L70
        L31:
            r9 = move-exception
            goto L7c
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.zzb
            mo.a r8 = (mo.a) r8
            java.lang.Object r2 = r0.zza
            java.lang.String r2 = (java.lang.String) r2
            kotlin.c.b(r9)
            r9 = r8
            r8 = r2
            goto L5a
        L49:
            kotlin.c.b(r9)
            mo.a r9 = r7.zzd
            r0.zza = r8
            r0.zzb = r9
            r0.zze = r4
            java.lang.Object r2 = r9.c(r5, r0)
            if (r2 == r1) goto L80
        L5a:
            androidx.datastore.core.DataStore r2 = r7.zzh     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.zzfzl r4 = new com.google.android.gms.internal.ads.zzfzl     // Catch: java.lang.Throwable -> L78
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> L78
            r0.zza = r9     // Catch: java.lang.Throwable -> L78
            r0.zzb = r5     // Catch: java.lang.Throwable -> L78
            r0.zze = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r8 = r2.updateData(r4, r0)     // Catch: java.lang.Throwable -> L78
            if (r8 == r1) goto L80
            r6 = r9
            r9 = r8
            r8 = r6
        L70:
            com.google.android.gms.internal.ads.zzfyy r9 = (com.google.android.gms.internal.ads.zzfyy) r9     // Catch: java.lang.Throwable -> L31
            r8.d(r5)
            bn.r r8 = bn.r.f5635a
            return r8
        L78:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L7c:
            r8.d(r5)
            throw r9
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzs(java.lang.String, hn.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzt(hn.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfzn
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfzn r0 = (com.google.android.gms.internal.ads.zzfzn) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzn r0 = new com.google.android.gms.internal.ads.zzfzn
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzb
            java.lang.Object r1 = in.a.g()
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.zza
            mo.a r0 = (mo.a) r0
            kotlin.c.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L67
        L31:
            r8 = move-exception
            goto L73
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            java.lang.Object r2 = r0.zza
            mo.a r2 = (mo.a) r2
            kotlin.c.b(r8)
            r8 = r2
            goto L53
        L44:
            kotlin.c.b(r8)
            mo.a r8 = r7.zzd
            r0.zza = r8
            r0.zzd = r4
            java.lang.Object r2 = r8.c(r5, r0)
            if (r2 == r1) goto L77
        L53:
            androidx.datastore.core.DataStore r2 = r7.zzh     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.ads.zzfzo r4 = new com.google.android.gms.internal.ads.zzfzo     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6f
            r0.zza = r8     // Catch: java.lang.Throwable -> L6f
            r0.zzd = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r2.updateData(r4, r0)     // Catch: java.lang.Throwable -> L6f
            if (r0 == r1) goto L77
            r6 = r0
            r0 = r8
            r8 = r6
        L67:
            com.google.android.gms.internal.ads.zzfyy r8 = (com.google.android.gms.internal.ads.zzfyy) r8     // Catch: java.lang.Throwable -> L31
            r0.d(r5)
            bn.r r8 = bn.r.f5635a
            return r8
        L6f:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L73:
            r0.d(r5)
            throw r8
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzt(hn.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzu(long r6, hn.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfzm
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfzm r0 = (com.google.android.gms.internal.ads.zzfzm) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzm r0 = new com.google.android.gms.internal.ads.zzfzm
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            java.lang.Object r1 = in.a.g()
            int r2 = r0.zze
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r6 = r0.zza
            java.lang.Object r0 = r0.zzb
            mo.a r0 = (mo.a) r0
            kotlin.c.b(r8)
            goto L4a
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.c.b(r8)
            mo.a r8 = r5.zzb
            r0.zzb = r8
            r0.zza = r6
            r0.zze = r3
            java.lang.Object r0 = r8.c(r4, r0)
            if (r0 == r1) goto L7c
            r0 = r8
        L4a:
            com.google.android.gms.internal.ads.zzfyt r8 = r5.zzf     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = "adQualityDataBuilder"
            if (r8 != 0) goto L54
            tn.p.C(r1)     // Catch: java.lang.Throwable -> L77
            r8 = r4
        L54:
            com.google.android.gms.internal.ads.zzfyt r2 = r5.zzf     // Catch: java.lang.Throwable -> L77
            if (r2 != 0) goto L5c
            tn.p.C(r1)     // Catch: java.lang.Throwable -> L77
            r2 = r4
        L5c:
            long r2 = r2.zzi()     // Catch: java.lang.Throwable -> L77
            long r6 = r6 - r2
            com.google.android.gms.internal.ads.zzfyt r2 = r5.zzf     // Catch: java.lang.Throwable -> L77
            if (r2 != 0) goto L69
            tn.p.C(r1)     // Catch: java.lang.Throwable -> L77
            r2 = r4
        L69:
            long r1 = r2.zzg()     // Catch: java.lang.Throwable -> L77
            long r6 = r6 - r1
            r8.zzb(r6)     // Catch: java.lang.Throwable -> L77
            r0.d(r4)
            bn.r r6 = bn.r.f5635a
            return r6
        L77:
            r6 = move-exception
            r0.d(r4)
            throw r6
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzu(long, hn.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzv(hn.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfzr
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfzr r0 = (com.google.android.gms.internal.ads.zzfzr) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzr r0 = new com.google.android.gms.internal.ads.zzfzr
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            java.lang.Object r1 = in.a.g()
            int r2 = r0.zze
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L53
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r0 = r0.zza
            mo.a r0 = (mo.a) r0
            kotlin.c.b(r8)     // Catch: java.lang.Throwable -> L34
            goto L9b
        L34:
            r8 = move-exception
            goto La5
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.zzb
            mo.a r2 = (mo.a) r2
            java.lang.Object r4 = r0.zza
            com.google.android.gms.internal.ads.zzfyu r4 = (com.google.android.gms.internal.ads.zzfyu) r4
            kotlin.c.b(r8)
            goto L87
        L4b:
            java.lang.Object r2 = r0.zza
            mo.a r2 = (mo.a) r2
            kotlin.c.b(r8)
            goto L62
        L53:
            kotlin.c.b(r8)
            mo.a r2 = r7.zzb
            r0.zza = r2
            r0.zze = r5
            java.lang.Object r8 = r2.c(r6, r0)
            if (r8 == r1) goto Lae
        L62:
            com.google.android.gms.internal.ads.zzfyt r8 = r7.zzf     // Catch: java.lang.Throwable -> La9
            if (r8 != 0) goto L6c
            java.lang.String r8 = "adQualityDataBuilder"
            tn.p.C(r8)     // Catch: java.lang.Throwable -> La9
            r8 = r6
        L6c:
            com.google.android.gms.internal.ads.zzibr r8 = r8.zzbu()     // Catch: java.lang.Throwable -> La9
            com.google.android.gms.internal.ads.zzfyu r8 = (com.google.android.gms.internal.ads.zzfyu) r8     // Catch: java.lang.Throwable -> La9
            r2.d(r6)
            tn.p.h(r8)
            mo.a r2 = r7.zzd
            r0.zza = r8
            r0.zzb = r2
            r0.zze = r4
            java.lang.Object r4 = r2.c(r6, r0)
            if (r4 == r1) goto Lae
            r4 = r8
        L87:
            androidx.datastore.core.DataStore r8 = r7.zzh     // Catch: java.lang.Throwable -> La3
            com.google.android.gms.internal.ads.zzfzs r5 = new com.google.android.gms.internal.ads.zzfzs     // Catch: java.lang.Throwable -> La3
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> La3
            r0.zza = r2     // Catch: java.lang.Throwable -> La3
            r0.zzb = r6     // Catch: java.lang.Throwable -> La3
            r0.zze = r3     // Catch: java.lang.Throwable -> La3
            java.lang.Object r8 = r8.updateData(r5, r0)     // Catch: java.lang.Throwable -> La3
            if (r8 == r1) goto Lae
            r0 = r2
        L9b:
            com.google.android.gms.internal.ads.zzfyy r8 = (com.google.android.gms.internal.ads.zzfyy) r8     // Catch: java.lang.Throwable -> L34
            r0.d(r6)
            bn.r r8 = bn.r.f5635a
            return r8
        La3:
            r8 = move-exception
            r0 = r2
        La5:
            r0.d(r6)
            throw r8
        La9:
            r8 = move-exception
            r2.d(r6)
            throw r8
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzv(hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean zzw(com.google.android.gms.internal.ads.zzfyu r9) {
        /*
            java.util.List r0 = r9.zzk()
            if (r0 == 0) goto Ld
            java.lang.Object r0 = cn.f0.G0(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            int r1 = r9.zzl()
            int r2 = r9.zzm()
            r3 = 1
            r4 = 0
            if (r1 <= r2) goto L22
            boolean r1 = r9.zzd()
            if (r1 != 0) goto L22
            r1 = r3
            goto L23
        L22:
            r1 = r4
        L23:
            if (r0 == 0) goto L36
            long r5 = r0.longValue()
            long r7 = r9.zzi()
            long r7 = r7 - r5
            r5 = 5000(0x1388, double:2.4703E-320)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L36
            r9 = r3
            goto L37
        L36:
            r9 = r4
        L37:
            if (r1 != 0) goto L3d
            if (r9 == 0) goto L3c
            goto L3d
        L3c:
            return r4
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzw(com.google.android.gms.internal.ads.zzfyu):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zza() {
        p000do.i.d(this.zza, null, null, new zzgaa(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzb(@NotNull String str) {
        p.k(str, "gwsQueryId");
        p000do.i.d(this.zza, null, null, new zzfzu(this, str, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzc() {
        p000do.i.d(this.zza, null, null, new zzfzq(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzd() {
        p000do.i.d(this.zza, null, null, new zzgae(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zze() {
        p000do.i.d(this.zza, null, null, new zzfzy(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzf() {
        p000do.i.d(this.zza, null, null, new zzgac(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzg() {
        p000do.i.d(this.zza, null, null, new zzfzw(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        if (zzt(r0) == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [mo.a] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [mo.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzgaf] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzh(@org.jetbrains.annotations.NotNull hn.c r9) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzh(hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzi(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull hn.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.zzfzt
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.zzfzt r0 = (com.google.android.gms.internal.ads.zzfzt) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzt r0 = new com.google.android.gms.internal.ads.zzfzt
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zzc
            java.lang.Object r1 = in.a.g()
            int r2 = r0.zze
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            long r1 = r0.zzb
            java.lang.Object r8 = r0.zza
            mo.a r8 = (mo.a) r8
            java.lang.String r0 = r0.zzf
            kotlin.c.b(r9)
            goto L54
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.c.b(r9)
            mo.a r9 = r7.zzb
            long r5 = java.lang.System.currentTimeMillis()
            r0.zzf = r8
            r0.zza = r9
            r0.zzb = r5
            r0.zze = r3
            java.lang.Object r0 = r9.c(r4, r0)
            if (r0 == r1) goto L8a
            r0 = r8
            r8 = r9
            r1 = r5
        L54:
            boolean r9 = r7.zze     // Catch: java.lang.Throwable -> L85
            if (r9 == 0) goto L5e
            bn.r r9 = bn.r.f5635a     // Catch: java.lang.Throwable -> L85
            r8.d(r4)
            return r9
        L5e:
            r7.zze = r3     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.internal.ads.zzfyu r9 = com.google.android.gms.internal.ads.zzfyu.zzp()     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.internal.ads.zzibl r9 = r9.zzcc()     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = "toBuilder(...)"
            tn.p.j(r9, r3)     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.internal.ads.zzfyt r9 = (com.google.android.gms.internal.ads.zzfyt) r9     // Catch: java.lang.Throwable -> L85
            r7.zzf = r9     // Catch: java.lang.Throwable -> L85
            if (r9 != 0) goto L79
            java.lang.String r9 = "adQualityDataBuilder"
            tn.p.C(r9)     // Catch: java.lang.Throwable -> L85
            r9 = r4
        L79:
            r9.zza(r0)     // Catch: java.lang.Throwable -> L85
            r9.zzj(r1)     // Catch: java.lang.Throwable -> L85
            r8.d(r4)
            bn.r r8 = bn.r.f5635a
            return r8
        L85:
            r9 = move-exception
            r8.d(r4)
            throw r9
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzi(java.lang.String, hn.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        if (zzv(r0) != r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:31:0x0085, B:33:0x0089, B:34:0x008f), top: B:50:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzj(@org.jetbrains.annotations.NotNull hn.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.gms.internal.ads.zzfzp
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.gms.internal.ads.zzfzp r0 = (com.google.android.gms.internal.ads.zzfzp) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzp r0 = new com.google.android.gms.internal.ads.zzfzp
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.zzc
            java.lang.Object r1 = in.a.g()
            int r2 = r0.zze
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L52
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            kotlin.c.b(r11)
            goto La8
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3c:
            kotlin.c.b(r11)
            goto L9f
        L40:
            long r5 = r0.zzb
            java.lang.Object r2 = r0.zza
            mo.a r2 = (mo.a) r2
            kotlin.c.b(r11)
            goto L85
        L4a:
            java.lang.Object r2 = r0.zza
            mo.a r2 = (mo.a) r2
            kotlin.c.b(r11)
            goto L61
        L52:
            kotlin.c.b(r11)
            mo.a r2 = r10.zzc
            r0.zza = r2
            r0.zze = r6
            java.lang.Object r11 = r2.c(r7, r0)
            if (r11 == r1) goto Lb5
        L61:
            boolean r11 = r10.zzg     // Catch: java.lang.Throwable -> Lb0
            if (r11 == 0) goto L6b
            bn.r r11 = bn.r.f5635a     // Catch: java.lang.Throwable -> Lb0
            r2.d(r7)
            return r11
        L6b:
            r10.zzg = r6     // Catch: java.lang.Throwable -> Lb0
            bn.r r11 = bn.r.f5635a     // Catch: java.lang.Throwable -> Lb0
            r2.d(r7)
            mo.a r2 = r10.zzb
            long r8 = java.lang.System.currentTimeMillis()
            r0.zza = r2
            r0.zzb = r8
            r0.zze = r5
            java.lang.Object r11 = r2.c(r7, r0)
            if (r11 == r1) goto Lb5
            r5 = r8
        L85:
            com.google.android.gms.internal.ads.zzfyt r11 = r10.zzf     // Catch: java.lang.Throwable -> Lab
            if (r11 != 0) goto L8f
            java.lang.String r11 = "adQualityDataBuilder"
            tn.p.C(r11)     // Catch: java.lang.Throwable -> Lab
            r11 = r7
        L8f:
            r11.zzo(r5)     // Catch: java.lang.Throwable -> Lab
            r2.d(r7)
            r0.zza = r7
            r0.zze = r4
            java.lang.Object r11 = r10.zzu(r5, r0)
            if (r11 == r1) goto Lb5
        L9f:
            r0.zze = r3
            java.lang.Object r11 = r10.zzv(r0)
            if (r11 != r1) goto La8
            goto Lb5
        La8:
            bn.r r11 = bn.r.f5635a
            return r11
        Lab:
            r11 = move-exception
            r2.d(r7)
            throw r11
        Lb0:
            r11 = move-exception
            r2.d(r7)
            throw r11
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzj(hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzk(@org.jetbrains.annotations.NotNull hn.c r12) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzk(hn.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
    
        if (zzs(r14, r0) == r1) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzl(@org.jetbrains.annotations.NotNull hn.c r14) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzl(hn.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0100, code lost:
    
        if (zzs(r15, r0) == r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090 A[Catch: all -> 0x0106, TRY_ENTER, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzm(@org.jetbrains.annotations.NotNull hn.c r15) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzm(hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzn(@org.jetbrains.annotations.NotNull hn.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfzv
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfzv r0 = (com.google.android.gms.internal.ads.zzfzv) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzv r0 = new com.google.android.gms.internal.ads.zzfzv
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            java.lang.Object r1 = in.a.g()
            int r2 = r0.zze
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r1 = r0.zza
            java.lang.Object r0 = r0.zzb
            mo.a r0 = (mo.a) r0
            kotlin.c.b(r8)
            goto L4f
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            kotlin.c.b(r8)
            mo.a r8 = r7.zzb
            long r5 = java.lang.System.currentTimeMillis()
            r0.zzb = r8
            r0.zza = r5
            r0.zze = r3
            java.lang.Object r0 = r8.c(r4, r0)
            if (r0 == r1) goto L67
            r0 = r8
            r1 = r5
        L4f:
            com.google.android.gms.internal.ads.zzfyt r8 = r7.zzf     // Catch: java.lang.Throwable -> L62
            if (r8 != 0) goto L59
            java.lang.String r8 = "adQualityDataBuilder"
            tn.p.C(r8)     // Catch: java.lang.Throwable -> L62
            r8 = r4
        L59:
            r8.zzs(r1)     // Catch: java.lang.Throwable -> L62
            r0.d(r4)
            bn.r r8 = bn.r.f5635a
            return r8
        L62:
            r8 = move-exception
            r0.d(r4)
            throw r8
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzn(hn.c):java.lang.Object");
    }
}
