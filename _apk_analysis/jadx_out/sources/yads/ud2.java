package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class ud2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f95601a;

    public ud2(Context context) {
        this.f95601a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r6, hn.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof yads.pd2
            if (r0 == 0) goto L13
            r0 = r8
            yads.pd2 r0 = (yads.pd2) r0
            int r1 = r0.f93559d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f93559d = r1
            goto L18
        L13:
            yads.pd2 r0 = new yads.pd2
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f93557b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f93559d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.c.b(r8)     // Catch: java.lang.Throwable -> L55
            goto L43
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.c.b(r8)
            yads.sd2 r8 = new yads.sd2     // Catch: java.lang.Throwable -> L55
            r8.<init>(r5, r3)     // Catch: java.lang.Throwable -> L55
            r0.f93559d = r4     // Catch: java.lang.Throwable -> L55
            java.lang.Object r8 = kotlinx.coroutines.TimeoutKt.e(r6, r8, r0)     // Catch: java.lang.Throwable -> L55
            if (r8 != r1) goto L43
            return r1
        L43:
            com.google.android.gms.appset.AppSetIdInfo r8 = (com.google.android.gms.appset.AppSetIdInfo) r8     // Catch: java.lang.Throwable -> L55
            if (r8 == 0) goto L55
            java.lang.String r6 = r8.getId()     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L55
            boolean r7 = bo.d0.u0(r6)     // Catch: java.lang.Throwable -> L55
            r7 = r7 ^ r4
            if (r7 == 0) goto L55
            r3 = r6
        L55:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ud2.a(long, hn.c):java.lang.Object");
    }
}
