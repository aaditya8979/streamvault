package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;

/* JADX INFO: loaded from: classes9.dex */
public abstract class R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3605n9 f26215a;

    public R0(C3605n9 c3605n9) {
        this.f26215a = c3605n9;
    }

    public abstract bn.r a(AdResponse adResponse, sn.l lVar);

    public abstract Object a(hn.c cVar);

    /* JADX WARN: Can't wrap try/catch for region: R(5:35|(1:37)|38|88|39) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r1 == r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        if (r0.a(r2) == r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
    
        r15.a("AdResponseManager", "Error parsing pub content: " + r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
    
        r9.a("AdResponseManager", "Error parsing pub content: " + r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0114, code lost:
    
        if (r1.a(r0, r14) != r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0116, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ca -> B:19:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d3 -> B:19:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d5 -> B:19:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00eb -> B:19:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ed -> B:19:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r17, sn.l r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.R0.a(java.lang.String, sn.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(sn.l r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.inmobi.media.P0
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.P0 r0 = (com.inmobi.media.P0) r0
            int r1 = r0.f26105d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26105d = r1
            goto L18
        L13:
            com.inmobi.media.P0 r0 = new com.inmobi.media.P0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f26103b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f26105d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.c.b(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            sn.l r6 = r0.f26102a
            kotlin.c.b(r7)
            goto L4d
        L3a:
            kotlin.c.b(r7)
            com.inmobi.media.gb r7 = com.inmobi.media.C3433gb.f27217a
            r6.invoke(r7)
            r0.f26102a = r6
            r0.f26105d = r4
            java.lang.Object r7 = r5.a(r0)
            if (r7 != r1) goto L4d
            goto L5a
        L4d:
            java.lang.String r7 = (java.lang.String) r7
            r2 = 0
            r0.f26102a = r2
            r0.f26105d = r3
            java.lang.Object r6 = r5.a(r7, r6, r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.R0.a(sn.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
