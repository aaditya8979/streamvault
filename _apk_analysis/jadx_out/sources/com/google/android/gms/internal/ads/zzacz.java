package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzacz {
    private final Context zzb;

    @Nullable
    private zzacv zzc;
    private boolean zzd;

    @Nullable
    private Surface zze;
    private float zzg;
    private float zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private final zzabv zza = new zzabv();
    private float zzf = -1.0f;
    private float zzi = 1.0f;
    private int zzj = 0;

    public zzacz(Context context) {
        this.zzb = context;
    }

    private final void zzj() {
        this.zzm = 0L;
        this.zzq = -1L;
        this.zzn = -1L;
        this.zzk = 0L;
        this.zzl = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzk() {
        /*
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L62
            android.view.Surface r0 = r8.zze
            if (r0 != 0) goto Lb
            goto L62
        Lb:
            com.google.android.gms.internal.ads.zzabv r0 = r8.zza
            boolean r2 = r0.zzc()
            if (r2 == 0) goto L18
            float r2 = r0.zzg()
            goto L1a
        L18:
            float r2 = r8.zzf
        L1a:
            float r3 = r8.zzg
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L62
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L51
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L51
            boolean r1 = r0.zzc()
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L44
            long r0 = r0.zze()
            r4 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L44
            r3 = 1036831949(0x3dcccccd, float:0.1)
        L44:
            float r0 = r8.zzg
            float r0 = r2 - r0
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L5a
            goto L5b
        L51:
            if (r5 != 0) goto L5d
            int r0 = r0.zzd()
            if (r0 < r1) goto L5a
            goto L5b
        L5a:
            r6 = r7
        L5b:
            if (r6 == 0) goto L62
        L5d:
            r8.zzg = r2
            r8.zzl(r7)
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacz.zzk():void");
    }

    private final void zzl(boolean z10) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        float f10 = 0.0f;
        if (this.zzd) {
            float f11 = this.zzg;
            if (f11 != -1.0f) {
                f10 = this.zzi * f11;
            }
        }
        if (z10 || this.zzh != f10) {
            this.zzh = f10;
            zzacu.zza(this.zze, f10);
        }
    }

    private final void zzm() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f || !surface.isValid()) {
            return;
        }
        this.zzh = 0.0f;
        zzacu.zza(this.zze, 0.0f);
    }

    public final void zza(int i10) {
        if (this.zzj == i10) {
            return;
        }
        this.zzj = i10;
        zzl(true);
    }

    public final void zzb() {
        this.zzd = true;
        zzj();
        DisplayManager displayManager = (DisplayManager) this.zzb.getSystemService("display");
        zzacv zzacyVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                zzacyVar = Build.VERSION.SDK_INT >= 33 ? new zzacy(choreographer, displayManager, null) : new zzacw(choreographer, displayManager, null);
            } catch (RuntimeException e10) {
                zzee.zzd("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }
        this.zzc = zzacyVar;
        if (zzacyVar != null) {
            zzacyVar.zza();
        }
        zzl(false);
    }

    public final void zzc(@Nullable Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzm();
        this.zze = surface;
        zzl(true);
    }

    public final void zzd() {
        zzj();
    }

    public final void zze(float f10) {
        this.zzi = f10;
        zzl(false);
    }

    public final void zzf(float f10) {
        this.zzf = f10;
        this.zza.zza();
        zzk();
    }

    public final void zzg(long j10) {
        long j11 = this.zzn;
        if (j11 != -1) {
            this.zzq = j11;
            this.zzr = this.zzo;
            this.zzs = this.zzp;
            this.zzk = this.zzl;
        }
        this.zzm++;
        this.zza.zzb(j10 * 1000);
        zzk();
    }

    public final void zzh() {
        this.zzd = false;
        zzacv zzacvVar = this.zzc;
        if (zzacvVar != null) {
            zzacvVar.zzb();
        }
        zzm();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzi(long r18, long r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            long r3 = r0.zzq
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L40
            com.google.android.gms.internal.ads.zzabv r3 = r0.zza
            boolean r4 = r3.zzc()
            if (r4 == 0) goto L21
            long r3 = r3.zzf()
            long r5 = r0.zzm
            long r7 = r0.zzq
            long r5 = r5 - r7
            long r3 = r3 * r5
            float r5 = r0.zzi
            goto L2a
        L21:
            long r3 = r0.zzs
            long r3 = r1 - r3
            float r5 = r0.zzi
            r6 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r6
        L2a:
            float r3 = (float) r3
            float r3 = r3 / r5
            long r3 = (long) r3
            long r5 = r0.zzr
            long r5 = r5 + r3
            long r3 = r18 - r5
            long r3 = java.lang.Math.abs(r3)
            r7 = 20000000(0x1312d00, double:9.881313E-317)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L42
            r17.zzj()
        L40:
            r5 = r18
        L42:
            long r3 = r0.zzm
            r0.zzn = r3
            r0.zzo = r5
            r0.zzp = r1
            com.google.android.gms.internal.ads.zzacv r1 = r0.zzc
            if (r1 != 0) goto L50
            goto Lb8
        L50:
            long r1 = r1.zzc
            com.google.android.gms.internal.ads.zzacv r3 = r0.zzc
            long r3 = r3.zzd
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 == 0) goto Lb8
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto Lb8
            long r7 = r5 - r1
            long r7 = r7 / r3
            long r7 = r7 * r3
            long r1 = r1 + r7
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 > 0) goto L6f
            long r7 = r1 - r3
            goto L74
        L6f:
            long r7 = r1 + r3
            r15 = r1
            r1 = r7
            r7 = r15
        L74:
            r9 = 2
            long r9 = r3 / r9
            long r11 = r1 - r5
            long r5 = r5 - r7
            long r13 = r11 - r5
            long r13 = java.lang.Math.abs(r13)
            int r9 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            r18 = r1
            r1 = 0
            if (r9 >= 0) goto La3
            r9 = 4
            long r9 = r3 / r9
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 >= 0) goto La5
            long r13 = r0.zzk
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 == 0) goto L9b
            r0.zzl = r13
            r1 = r13
            goto La7
        L9b:
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 >= 0) goto La1
            long r1 = -r9
            goto La5
        La1:
            r1 = r9
            goto La5
        La3:
            long r1 = r0.zzk
        La5:
            r0.zzl = r1
        La7:
            long r11 = r11 + r1
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 >= 0) goto Laf
            r1 = r18
            goto Lb0
        Laf:
            r1 = r7
        Lb0:
            r5 = 80
            long r3 = r3 * r5
            r5 = 100
            long r3 = r3 / r5
            long r1 = r1 - r3
            return r1
        Lb8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacz.zzi(long, long):long");
    }
}
