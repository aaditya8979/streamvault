package yads;

import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class pt1 extends Lambda implements sn.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qt1 f93769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f93770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt1(qt1 qt1Var, Map map) {
        super(1);
        this.f93769b = qt1Var;
        this.f93770c = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036 A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #1 {Exception -> 0x0039, blocks: (B:3:0x0010, B:13:0x0029, B:21:0x0036, B:19:0x0032, B:20:0x0035, B:6:0x0016, B:8:0x001a, B:17:0x0030, B:12:0x0025), top: B:28:0x0010, inners: #0, #2 }] */
    @Override // sn.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            yads.po2 r12 = (yads.po2) r12
            yads.qt1 r0 = r11.f93769b
            java.util.Map r1 = r11.f93770c
            yads.y11 r1 = r0.b(r12, r1)
            yads.z11 r0 = r0.f94149c
            r0.getClass()
            r0 = 0
            java.io.InputStream r2 = r1.f96969d     // Catch: java.lang.Exception -> L39
            r3 = 0
            if (r2 == 0) goto L16
            goto L23
        L16:
            byte[] r2 = r1.f96970e     // Catch: java.lang.Exception -> L39
            if (r2 == 0) goto L22
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L39
            byte[] r4 = r1.f96970e     // Catch: java.lang.Exception -> L39
            r2.<init>(r4)     // Catch: java.lang.Exception -> L39
            goto L23
        L22:
            r2 = r3
        L23:
            if (r2 == 0) goto L36
            byte[] r4 = on.a.c(r2)     // Catch: java.lang.Throwable -> L2f
            on.b.a(r2, r3)     // Catch: java.lang.Exception -> L39
            if (r4 != 0) goto L3b
            goto L36
        L2f:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L31
        L31:
            r4 = move-exception
            on.b.a(r2, r3)     // Catch: java.lang.Exception -> L39
            throw r4     // Catch: java.lang.Exception -> L39
        L36:
            byte[] r4 = new byte[r0]     // Catch: java.lang.Exception -> L39
            goto L3b
        L39:
            byte[] r4 = new byte[r0]
        L3b:
            r7 = r4
            yads.y11 r0 = new yads.y11
            int r6 = r1.f96966a
            java.util.List r1 = r1.f96967b
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.<init>(r6, r1, r7)
            yads.e82 r2 = new yads.e82
            r10 = 1
            java.util.List r9 = java.util.Collections.unmodifiableList(r1)
            java.util.Map r8 = yads.e82.a(r9)
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            long r3 = java.lang.System.currentTimeMillis()
            yads.vo2.a(r3, r12, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.pt1.invoke(java.lang.Object):java.lang.Object");
    }
}
