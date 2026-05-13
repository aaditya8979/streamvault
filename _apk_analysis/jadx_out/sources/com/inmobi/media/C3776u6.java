package com.inmobi.media;

import androidx.media3.exoplayer.ExoPlayer;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.TrackPercentage;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3776u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExoPlayer f28228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p000do.l0 f28229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final go.k f28230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f28231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.g f28232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.g f28233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean[] f28235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f28236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rl[] f28237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f28238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f28239l;

    public C3776u6(ExoPlayer exoPlayer, AdConfig.HybridNativeConfig hybridNativeConfig, p000do.l0 l0Var, long j10, go.k kVar, TrackPercentage trackPercentage) {
        tn.p.k(exoPlayer, "player");
        tn.p.k(hybridNativeConfig, "hybridNativeConfig");
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(kVar, "progressEvents");
        tn.p.k(trackPercentage, "trackPercentage");
        this.f28228a = exoPlayer;
        this.f28229b = l0Var;
        this.f28230c = kVar;
        this.f28231d = new AtomicBoolean(false);
        this.f28234g = -1;
        boolean[] zArr = new boolean[4];
        for (int i10 = 0; i10 < 4; i10++) {
            zArr[i10] = false;
        }
        this.f28235h = zArr;
        this.f28236i = new int[]{trackPercentage.getQ1(), trackPercentage.getQ2(), trackPercentage.getQ3(), trackPercentage.getQ4()};
        this.f28237j = new Rl[]{C3867xm.f28538a, C3494in.f27365a, C3718rn.f28079a, C3892ym.f28610a};
        this.f28238k = 200L;
        this.f28239l = zn.n.f(j10, hybridNativeConfig.getMinProgressInterval());
    }

    public static final Object a(C3776u6 c3776u6, C3751t6 c3751t6) {
        Object objEmit;
        if (!c3776u6.f28228a.isPlaying()) {
            return bn.r.f5635a;
        }
        long duration = c3776u6.f28228a.getDuration();
        if (duration <= 0) {
            return bn.r.f5635a;
        }
        return (c3776u6.f28234g != 2 && (objEmit = c3776u6.f28230c.emit(new C3554l8(c3776u6.f28228a.getCurrentPosition(), duration), c3751t6)) == in.a.g()) ? objEmit : bn.r.f5635a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:
    
        if (r9.a(r2, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.C3776u6 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof com.inmobi.media.C3701r6
            if (r0 == 0) goto L16
            r0 = r10
            com.inmobi.media.r6 r0 = (com.inmobi.media.C3701r6) r0
            int r1 = r0.f28035d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f28035d = r1
            goto L1b
        L16:
            com.inmobi.media.r6 r0 = new com.inmobi.media.r6
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.f28033b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f28035d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.c.b(r10)
            goto Lab
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            int r2 = r0.f28032a
            kotlin.c.b(r10)
            goto La2
        L3e:
            kotlin.c.b(r10)
            androidx.media3.exoplayer.ExoPlayer r10 = r9.f28228a
            boolean r10 = r10.isPlaying()
            if (r10 != 0) goto L4c
            bn.r r9 = bn.r.f5635a
            return r9
        L4c:
            androidx.media3.exoplayer.ExoPlayer r10 = r9.f28228a
            long r5 = r10.getDuration()
            int r10 = (int) r5
            if (r10 > 0) goto L58
            bn.r r9 = bn.r.f5635a
            return r9
        L58:
            androidx.media3.exoplayer.ExoPlayer r2 = r9.f28228a
            long r5 = r2.getCurrentPosition()
            int r2 = (int) r5
            int r2 = r2 * 100
            int r2 = r2 / r10
            int r5 = r9.f28234g
            r6 = 0
            if (r5 != r3) goto L7d
            int[] r5 = r9.f28236i
            r5 = r5[r6]
            if (r2 >= r5) goto L7d
            r5 = -1
            r9.f28234g = r5
            r5 = 4
            boolean[] r7 = new boolean[r5]
            r8 = r6
        L74:
            if (r8 >= r5) goto L7b
            r7[r8] = r6
            int r8 = r8 + 1
            goto L74
        L7b:
            r9.f28235h = r7
        L7d:
            r0.f28032a = r2
            r0.f28035d = r4
            int r4 = r9.f28234g
            if (r4 < 0) goto L88
            bn.r r10 = bn.r.f5635a
            goto L9f
        L88:
            r9.f28234g = r6
            go.k r4 = r9.f28230c
            com.inmobi.media.kn r5 = new com.inmobi.media.kn
            float r10 = (float) r10
            r5.<init>(r10)
            java.lang.Object r10 = r4.emit(r5, r0)
            java.lang.Object r4 = in.a.g()
            if (r10 != r4) goto L9d
            goto L9f
        L9d:
            bn.r r10 = bn.r.f5635a
        L9f:
            if (r10 != r1) goto La2
            goto Laa
        La2:
            r0.f28035d = r3
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto Lab
        Laa:
            return r1
        Lab:
            bn.r r9 = bn.r.f5635a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3776u6.a(com.inmobi.media.u6, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004b -> B:23:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:23:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:23:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.inmobi.media.C3652p6
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.p6 r0 = (com.inmobi.media.C3652p6) r0
            int r1 = r0.f27839f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27839f = r1
            goto L18
        L13:
            com.inmobi.media.p6 r0 = new com.inmobi.media.p6
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f27837d
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27839f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r9 = r0.f27836c
            int r2 = r0.f27835b
            int r4 = r0.f27834a
            kotlin.c.b(r10)
            r10 = r4
            r4 = r8
            goto L6a
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            kotlin.c.b(r10)
            r10 = 0
            int[] r2 = r8.f28236i
            int r2 = r2.length
            r4 = r8
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
        L45:
            if (r2 >= r9) goto L6c
            int[] r5 = r4.f28236i
            r5 = r5[r2]
            if (r10 < r5) goto L6a
            boolean[] r5 = r4.f28235h
            boolean r6 = r5[r2]
            if (r6 != 0) goto L6a
            r5[r2] = r3
            go.k r5 = r4.f28230c
            com.inmobi.media.Rl[] r6 = r4.f28237j
            r6 = r6[r2]
            r0.f27834a = r10
            r0.f27835b = r2
            r0.f27836c = r9
            r0.f27839f = r3
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L6a
            return r1
        L6a:
            int r2 = r2 + r3
            goto L45
        L6c:
            bn.r r9 = bn.r.f5635a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3776u6.a(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void a() {
        if (this.f28231d.getAndSet(false)) {
            H6.a(this.f28232e);
            H6.a(this.f28233f);
            this.f28232e = null;
            this.f28233f = null;
        }
    }
}
