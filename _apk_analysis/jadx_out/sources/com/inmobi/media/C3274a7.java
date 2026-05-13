package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;

/* JADX INFO: renamed from: com.inmobi.media.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3274a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3274a7 f26760a = new C3274a7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static InMobiUserDataModel f26761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mo.a f26762c;

    static {
        tn.p.j(C3274a7.class.getSimpleName(), "getSimpleName(...)");
        f26762c = mo.g.b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.unifiedId.InMobiUserDataModel r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof com.inmobi.media.Z6
            if (r0 == 0) goto L13
            r0 = r6
            com.inmobi.media.Z6 r0 = (com.inmobi.media.Z6) r0
            int r1 = r0.f26690d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26690d = r1
            goto L18
        L13:
            com.inmobi.media.Z6 r0 = new com.inmobi.media.Z6
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f26689c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f26690d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            mo.a r5 = r0.f26688b
            com.inmobi.unifiedId.InMobiUserDataModel r0 = r0.f26687a
            kotlin.c.b(r6)
            r6 = r5
            r5 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.c.b(r6)
            mo.a r6 = com.inmobi.media.C3274a7.f26762c
            r0.f26687a = r5
            r0.f26688b = r6
            r0.f26690d = r3
            java.lang.Object r0 = r6.c(r4, r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            com.inmobi.unifiedId.InMobiUserDataModel r0 = com.inmobi.media.C3274a7.f26761b     // Catch: java.lang.Throwable -> L5a
            java.util.Objects.toString(r0)     // Catch: java.lang.Throwable -> L5a
            java.util.Objects.toString(r5)     // Catch: java.lang.Throwable -> L5a
            com.inmobi.media.C3274a7.f26761b = r5     // Catch: java.lang.Throwable -> L5a
            bn.r r5 = bn.r.f5635a     // Catch: java.lang.Throwable -> L5a
            r6.d(r4)
            return r5
        L5a:
            r5 = move-exception
            r6.d(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3274a7.a(com.inmobi.unifiedId.InMobiUserDataModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final String toString() {
        return String.valueOf(f26761b);
    }
}
