package yads;

import android.content.Context;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes10.dex */
public final class h62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p000do.l0 f90258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke0 f90259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hv0 f90260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yy1 f90261d;

    public h62(p000do.l0 l0Var, ke0 ke0Var, hv0 hv0Var, yy1 yy1Var) {
        this.f90258a = l0Var;
        this.f90259b = ke0Var;
        this.f90260c = hv0Var;
        this.f90261d = yy1Var;
    }

    public /* synthetic */ h62(d4 d4Var, lu2 lu2Var, Context context, w5 w5Var, p000do.l0 l0Var) {
        this(l0Var, new ke0(context, w5Var), new hv0(context, w5Var), new yy1(context, d4Var, lu2Var));
    }

    public final Object a(Context context, v9 v9Var, ry1 ry1Var, z30 z30Var, hn.c cVar) {
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        g62 g62Var = new g62(cVar2);
        boolean zA = pr0.a(context, or0.f93311c);
        p62[] p62VarArr = p62.f93445b;
        if (tn.p.f("first_video_preloading_strategy", v9Var.f96011v) && zA) {
            hv0 hv0Var = this.f90260c;
            synchronized (hv0Var.f90575d) {
                d12 d12Var = ry1Var.f94647a;
                d72 d72Var = hv0Var.f90574c;
                d72Var.getClass();
                List listU = SequencesKt___SequencesKt.U(SequencesKt___SequencesKt.K(SequencesKt___SequencesKt.K(SequencesKt___SequencesKt.L(SequencesKt___SequencesKt.E(cn.f0.g0(d12Var.f88690a), new a72(d72Var)), b72.f87933b), y62.f97013b), z62.f97411b));
                if (listU.isEmpty()) {
                    g62Var.a();
                } else {
                    fv0 fv0Var = new fv0(hv0Var.f90572a, g62Var, hv0Var.f90573b, cn.f0.l0(listU, 1).iterator(), z30Var);
                    hv0Var.f90572a.a(v5.f95937p, null);
                    Pair pair = (Pair) cn.f0.t0(listU);
                    hv0Var.f90573b.a((String) pair.component1(), fv0Var, (String) pair.component2());
                }
                bn.r rVar = bn.r.f5635a;
            }
        } else {
            this.f90259b.a(ry1Var, g62Var, z30Var);
        }
        Object objB = cVar2.B();
        if (objB == in.a.g()) {
            jn.f.c(cVar);
        }
        return objB == in.a.g() ? objB : bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r23, android.content.Context r24, yads.ry1 r25, yads.z30 r26, hn.c r27) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            r2 = r27
            boolean r3 = r2 instanceof yads.e62
            if (r3 == 0) goto L19
            r3 = r2
            yads.e62 r3 = (yads.e62) r3
            int r4 = r3.f89127h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f89127h = r4
            goto L1e
        L19:
            yads.e62 r3 = new yads.e62
            r3.<init>(r0, r2)
        L1e:
            r9 = r3
            java.lang.Object r2 = r9.f89125f
            java.lang.Object r3 = in.a.g()
            int r4 = r9.f89127h
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L51
            if (r4 == r6) goto L40
            if (r4 != r5) goto L38
            java.lang.Object r1 = r9.f89121b
            yads.ry1 r1 = (yads.ry1) r1
            kotlin.c.b(r2)
            goto Lb3
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L40:
            boolean r1 = r9.f89124e
            yads.z30 r4 = r9.f89123d
            android.content.Context r6 = r9.f89122c
            java.lang.Object r7 = r9.f89121b
            yads.h62 r7 = (yads.h62) r7
            kotlin.c.b(r2)
            r15 = r4
            r12 = r6
            r11 = r7
            goto L71
        L51:
            kotlin.c.b(r2)
            yads.yy1 r2 = r0.f90261d
            r9.f89121b = r0
            r9.f89122c = r1
            r4 = r26
            r9.f89123d = r4
            r7 = r23
            r9.f89124e = r7
            r9.f89127h = r6
            r6 = r25
            java.lang.Object r2 = r2.a(r1, r6, r9)
            if (r2 != r3) goto L6d
            return r3
        L6d:
            r11 = r0
            r12 = r1
            r15 = r4
            r1 = r7
        L71:
            yads.ry1 r2 = (yads.ry1) r2
            r4 = 0
            if (r2 != 0) goto L77
            return r4
        L77:
            if (r1 != 0) goto L7a
            goto Lb2
        L7a:
            yads.v9 r13 = r2.f94648b
            boolean r1 = r13.E
            if (r1 == 0) goto L9a
            do.l0 r1 = r11.f90258a
            yads.f62 r19 = new yads.f62
            r16 = 0
            r10 = r19
            r14 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r17 = 0
            r18 = 0
            r20 = 3
            r21 = 0
            r16 = r1
            p000do.g.d(r16, r17, r18, r19, r20, r21)
            goto Lb2
        L9a:
            boolean r1 = r13.f96013x
            if (r1 == 0) goto Lb2
            r9.f89121b = r2
            r9.f89122c = r4
            r9.f89123d = r4
            r9.f89127h = r5
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r2
            r8 = r15
            java.lang.Object r1 = r4.a(r5, r6, r7, r8, r9)
            if (r1 != r3) goto Lb2
            return r3
        Lb2:
            r1 = r2
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.h62.a(boolean, android.content.Context, yads.ry1, yads.z30, hn.c):java.lang.Object");
    }
}
