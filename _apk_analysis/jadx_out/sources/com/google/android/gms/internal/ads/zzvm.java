package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzvm implements zzxd {
    private final zzafa zza;

    @Nullable
    private zzaeu zzb;

    @Nullable
    private zzaev zzc;

    public zzvm(zzafa zzafaVar) {
        this.zza = zzafaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    @Override // com.google.android.gms.internal.ads.zzxd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzj r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzaex r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzael r6 = new com.google.android.gms.internal.ads.zzael
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzaeu r8 = r7.zzb
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.gms.internal.ads.zzafa r8 = r7.zza
            com.google.android.gms.internal.ads.zzaeu[] r8 = r8.zzb(r9, r10)
            int r10 = r8.length
            com.google.android.gms.internal.ads.zzguc r13 = com.google.android.gms.internal.ads.zzguf.zzv(r10)
            r14 = 0
            r0 = 1
            if (r10 != r0) goto L24
            r8 = r8[r14]
            r7.zzb = r8
            goto L7e
        L24:
            r1 = r14
        L25:
            if (r1 >= r10) goto L7a
            r2 = r8[r1]
            boolean r3 = r2.zza(r6)     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            if (r3 == 0) goto L38
            r7.zzb = r2     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            com.google.android.gms.internal.ads.zzgrc.zzi(r0)
            r6.zzl()
            goto L7a
        L38:
            java.util.List r2 = r2.zzb()     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            r13.zzh(r2)     // Catch: java.lang.Throwable -> L4c java.io.EOFException -> L61
            com.google.android.gms.internal.ads.zzaeu r2 = r7.zzb
            if (r2 != 0) goto L70
            long r2 = r6.zzn()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L6e
            goto L70
        L4c:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzaeu r9 = r7.zzb
            if (r9 != 0) goto L59
            long r9 = r6.zzn()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L5a
        L59:
            r14 = r0
        L5a:
            com.google.android.gms.internal.ads.zzgrc.zzi(r14)
            r6.zzl()
            throw r8
        L61:
            com.google.android.gms.internal.ads.zzaeu r2 = r7.zzb
            if (r2 != 0) goto L70
            long r2 = r6.zzn()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L6e
            goto L70
        L6e:
            r2 = r14
            goto L71
        L70:
            r2 = r0
        L71:
            com.google.android.gms.internal.ads.zzgrc.zzi(r2)
            r6.zzl()
            int r1 = r1 + 1
            goto L25
        L7a:
            com.google.android.gms.internal.ads.zzaeu r10 = r7.zzb
            if (r10 == 0) goto L84
        L7e:
            com.google.android.gms.internal.ads.zzaeu r8 = r7.zzb
            r8.zzc(r15)
            return
        L84:
            com.google.android.gms.internal.ads.zzyo r10 = new com.google.android.gms.internal.ads.zzyo
            com.google.android.gms.internal.ads.zzguf r8 = com.google.android.gms.internal.ads.zzguf.zzr(r8)
            com.google.android.gms.internal.ads.zzvl r11 = new com.google.android.gms.internal.ads.zzgqt() { // from class: com.google.android.gms.internal.ads.zzvl
                static {
                    /*
                        com.google.android.gms.internal.ads.zzvl r0 = new com.google.android.gms.internal.ads.zzvl
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.ads.zzvl) com.google.android.gms.internal.ads.zzvl.zza com.google.android.gms.internal.ads.zzvl
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvl.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvl.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.zzgqt
                public final /* synthetic */ java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.ads.zzaeu r1 = (com.google.android.gms.internal.ads.zzaeu) r1
                        r1.zzg()
                        java.lang.Class r1 = r1.getClass()
                        java.lang.String r1 = r1.getSimpleName()
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvl.apply(java.lang.Object):java.lang.Object");
                }
            }
            java.util.List r8 = com.google.android.gms.internal.ads.zzgvf.zzc(r8, r11)
            java.lang.String r11 = ", "
            java.lang.String r8 = com.google.android.gms.internal.ads.zzgqw.zzd(r8, r11)
            int r11 = r8.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r11 = r11 + 58
            r12.<init>(r11)
            java.lang.String r11 = "None of the available extractors ("
            r12.append(r11)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            com.google.android.gms.internal.ads.zzguf r11 = r13.zzi()
            r10.<init>(r8, r9, r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvm.zza(com.google.android.gms.internal.ads.zzj, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzaex):void");
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzb() {
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar != null) {
            zzaeuVar.zzf();
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzc() {
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar != null && (zzaeuVar instanceof zzajp)) {
            ((zzajp) zzaeuVar).zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final long zzd() {
        zzaev zzaevVar = this.zzc;
        if (zzaevVar != null) {
            return zzaevVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zze(long j10, long j11) {
        zzaeu zzaeuVar = this.zzb;
        zzaeuVar.getClass();
        zzaeuVar.zze(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final int zzf(zzafv zzafvVar) throws IOException {
        zzaev zzaevVar;
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar == null || (zzaevVar = this.zzc) == null) {
            throw null;
        }
        return zzaeuVar.zzd(zzaevVar, zzafvVar);
    }
}
