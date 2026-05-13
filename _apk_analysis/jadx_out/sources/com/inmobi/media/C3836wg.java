package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.wg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3836wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Nn f28442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final go.l f28443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p000do.l0 f28444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3886yg f28445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.g f28446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f28447f;

    public C3836wg(p000do.l0 l0Var, C3886yg c3886yg, Nn nn2) {
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(c3886yg, "pollingVisibilityTrackerConfig");
        tn.p.k(nn2, "visibilityTrackedView");
        tn.p.k(nn2, "visibilityTrackedView");
        this.f28442a = nn2;
        this.f28443b = go.v.a(Mn.f25977a);
        this.f28444c = l0Var;
        this.f28445d = c3886yg;
        this.f28447f = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0061 -> B:17:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.C3836wg r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof com.inmobi.media.C3786ug
            if (r0 == 0) goto L16
            r0 = r8
            com.inmobi.media.ug r0 = (com.inmobi.media.C3786ug) r0
            int r1 = r0.f28277c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f28277c = r1
            goto L1b
        L16:
            com.inmobi.media.ug r0 = new com.inmobi.media.ug
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f28275a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f28277c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            goto L38
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.c.b(r8)
            goto L56
        L38:
            kotlin.c.b(r8)
        L3b:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f28447f
            boolean r8 = r8.get()
            if (r8 != 0) goto L64
            do.y1 r8 = p000do.w0.c()
            com.inmobi.media.vg r2 = new com.inmobi.media.vg
            r5 = 0
            r2.<init>(r7, r5)
            r0.f28277c = r4
            java.lang.Object r8 = p000do.g.g(r8, r2, r0)
            if (r8 != r1) goto L56
            goto L63
        L56:
            com.inmobi.media.yg r8 = r7.f28445d
            int r8 = r8.f28594a
            long r5 = (long) r8
            r0.f28277c = r3
            java.lang.Object r8 = p000do.s0.a(r5, r0)
            if (r8 != r1) goto L3b
        L63:
            return r1
        L64:
            bn.r r7 = bn.r.f5635a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3836wg.a(com.inmobi.media.wg, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void a() {
        if (this.f28447f.get() || this.f28446e != null) {
            return;
        }
        this.f28446e = p000do.i.d(this.f28444c, null, null, new C3761tg(this, null), 3, null);
    }
}
