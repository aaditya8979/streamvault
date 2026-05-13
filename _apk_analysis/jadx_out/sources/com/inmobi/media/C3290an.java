package com.inmobi.media;

import android.widget.ProgressBar;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3290an extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f26814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f26815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ProgressBar f26817h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C3316bn f26818i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f26819j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3290an(ProgressBar progressBar, C3316bn c3316bn, int i10, hn.c cVar) {
        super(2, cVar);
        this.f26817h = progressBar;
        this.f26818i = c3316bn;
        this.f26819j = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3290an(this.f26817h, this.f26818i, this.f26819j, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3290an) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0065 -> B:13:0x0068). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r11.f26816g
            r2 = 10
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 != r3) goto L1e
            int r1 = r11.f26812c
            int r2 = r11.f26811b
            float r4 = r11.f26814e
            long r5 = r11.f26813d
            int r7 = r11.f26810a
            android.widget.ProgressBar r8 = r11.f26815f
            kotlin.c.b(r12)
            r12 = r11
            goto L68
        L1e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L26:
            kotlin.c.b(r12)
            android.widget.ProgressBar r12 = r11.f26817h
            int r12 = r12.getProgress()
            com.inmobi.media.bn r1 = r11.f26818i
            com.inmobi.media.Fg r1 = r1.f26886c
            long r4 = r1.f25449f
            long r6 = (long) r2
            long r4 = r4 / r6
            int r1 = r11.f26819j
            int r1 = r1 - r12
            float r1 = (float) r1
            r6 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r6
            android.widget.ProgressBar r6 = r11.f26817h
            r7 = 0
            r8 = r6
            r5 = r4
            r4 = r1
            r1 = r7
            r7 = r12
            r12 = r11
        L47:
            if (r1 >= r2) goto L6a
            float r9 = (float) r7
            int r10 = r1 + 1
            float r10 = (float) r10
            float r10 = r10 * r4
            float r10 = r10 + r9
            int r9 = (int) r10
            com.inmobi.media.AbstractC3818vn.a(r8, r9)
            r12.f26815f = r8
            r12.f26810a = r7
            r12.f26813d = r5
            r12.f26814e = r4
            r12.f26811b = r2
            r12.f26812c = r1
            r12.f26816g = r3
            java.lang.Object r9 = p000do.s0.a(r5, r12)
            if (r9 != r0) goto L68
            return r0
        L68:
            int r1 = r1 + r3
            goto L47
        L6a:
            bn.r r12 = bn.r.f5635a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3290an.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
