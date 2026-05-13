package yads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ya0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final db0 f97053a;

    public ya0(db0 db0Var) {
        this.f97053a = db0Var;
    }

    @Override // yads.o0
    public final /* bridge */ /* synthetic */ Object a(View view, m0 m0Var, u0 u0Var) {
        return a(view, (wa0) m0Var, (hn.c) u0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.view.View r5, yads.wa0 r6, hn.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof yads.xa0
            if (r0 == 0) goto L13
            r0 = r7
            yads.xa0 r0 = (yads.xa0) r0
            int r1 = r0.f96698d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96698d = r1
            goto L18
        L13:
            yads.xa0 r0 = new yads.xa0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f96696b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f96698d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.c.b(r7)
            android.content.Context r5 = r5.getContext()
            yads.db0 r7 = r4.f97053a
            r0.f96698d = r3
            java.lang.Object r7 = r7.a(r5, r6, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            yads.sg2 r7 = (yads.sg2) r7
            yads.o01 r5 = new yads.o01
            r5.<init>(r3, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ya0.a(android.view.View, yads.wa0, hn.c):java.lang.Object");
    }
}
