package com.inmobi.media;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes8.dex */
public final class Mk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mo.a f25972c = mo.g.b(false, 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ne f25973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f25974b;

    public Mk(Ne ne2, LinkedHashSet linkedHashSet) {
        tn.p.k(ne2, "networkResponse");
        tn.p.k(linkedHashSet, "inMobiUnifiedIdInterfaceSet");
        this.f25973a = ne2;
        this.f25974b = linkedHashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.inmobi.media.Kk
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.Kk r0 = (com.inmobi.media.Kk) r0
            int r1 = r0.f25822f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25822f = r1
            goto L18
        L13:
            com.inmobi.media.Kk r0 = new com.inmobi.media.Kk
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f25820d
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f25822f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            mo.a r8 = r0.f25819c
            java.lang.String r9 = r0.f25818b
            kotlin.c.b(r10)     // Catch: java.lang.Throwable -> L32
            goto Lac
        L32:
            r9 = move-exception
            goto Lb5
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            int r8 = r0.f25817a
            mo.a r9 = r0.f25819c
            java.lang.String r2 = r0.f25818b
            kotlin.c.b(r10)
            r10 = r9
            r9 = r2
            goto L5d
        L49:
            kotlin.c.b(r10)
            mo.a r10 = com.inmobi.media.Mk.f25972c
            r0.f25818b = r9
            r0.f25819c = r10
            r0.f25817a = r8
            r0.f25822f = r4
            java.lang.Object r2 = r10.c(r5, r0)
            if (r2 != r1) goto L5d
            goto Laa
        L5d:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Lb9
            r2.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r6 = "errorCode"
            r2.put(r6, r8)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r8 = "UnifiedIdNetworkResponseFailure"
            com.inmobi.media.Wj r6 = com.inmobi.media.Wj.f26549a     // Catch: java.lang.Throwable -> Lb9
            com.inmobi.media.ak r6 = com.inmobi.media.EnumC3287ak.f26805a     // Catch: java.lang.Throwable -> Lb9
            com.inmobi.media.Wj.b(r8, r2, r6)     // Catch: java.lang.Throwable -> Lb9
            com.inmobi.media.Ne r8 = r7.f25973a     // Catch: java.lang.Throwable -> Lb9
            int r8 = r8.c()     // Catch: java.lang.Throwable -> Lb9
            com.inmobi.media.Y5 r2 = com.inmobi.media.EnumC3273a6.f26742b     // Catch: java.lang.Throwable -> Lb9
            r2 = 192(0xc0, float:2.69E-43)
            if (r8 == r2) goto L84
            if (r8 != 0) goto L83
            goto L84
        L83:
            r4 = 0
        L84:
            if (r4 == 0) goto L8c
            bn.r r8 = bn.r.f5635a     // Catch: java.lang.Throwable -> Lb9
            r10.d(r5)
            return r8
        L8c:
            com.inmobi.media.Jk r8 = com.inmobi.media.Jk.f25756a     // Catch: java.lang.Throwable -> Lb9
            r0.f25818b = r9     // Catch: java.lang.Throwable -> Lb9
            r0.f25819c = r10     // Catch: java.lang.Throwable -> Lb9
            r0.f25822f = r3     // Catch: java.lang.Throwable -> Lb9
            com.inmobi.media.qh r8 = com.inmobi.media.Jk.f25757b     // Catch: java.lang.Throwable -> Lb9
            com.inmobi.media.Ek r2 = new com.inmobi.media.Ek     // Catch: java.lang.Throwable -> Lb9
            r2.<init>(r5)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r8 = com.inmobi.media.F3.a(r8, r2, r0)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r0 = in.a.g()     // Catch: java.lang.Throwable -> Lb9
            if (r8 != r0) goto La6
            goto La8
        La6:
            bn.r r8 = bn.r.f5635a     // Catch: java.lang.Throwable -> Lb9
        La8:
            if (r8 != r1) goto Lab
        Laa:
            return r1
        Lab:
            r8 = r10
        Lac:
            r7.a(r9)     // Catch: java.lang.Throwable -> L32
            bn.r r9 = bn.r.f5635a     // Catch: java.lang.Throwable -> L32
            r8.d(r5)
            return r9
        Lb5:
            r10 = r8
            goto Lbb
        Lb7:
            r9 = r8
            goto Lbb
        Lb9:
            r8 = move-exception
            goto Lb7
        Lbb:
            r10.d(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Mk.a(int, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:13:0x002d, B:38:0x008d, B:39:0x00a6, B:41:0x00ac, B:43:0x00b4, B:44:0x00bf, B:45:0x00c3, B:22:0x0055, B:28:0x0067, B:31:0x006d, B:34:0x0087), top: B:51:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(org.json.JSONObject r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Mk.a(org.json.JSONObject, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x0056, JSONException -> 0x0058, Merged into TryCatch #0 {all -> 0x0056, JSONException -> 0x0058, blocks: (B:4:0x000d, B:6:0x0013, B:8:0x001d, B:9:0x0023, B:11:0x0029, B:12:0x0033, B:13:0x0039, B:15:0x003f, B:22:0x0059), top: B:27:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r5 = "ufids"
            org.json.JSONObject r0 = com.inmobi.media.F9.b()
            org.json.JSONObject r0 = com.inmobi.media.Ok.a(r0)
            r1 = 0
            if (r0 == 0) goto L33
            boolean r2 = r0.has(r5)     // Catch: java.lang.Throwable -> L56 org.json.JSONException -> L58
            if (r2 == 0) goto L33
            org.json.JSONArray r5 = r0.getJSONArray(r5)     // Catch: java.lang.Throwable -> L56 org.json.JSONException -> L58
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L56 org.json.JSONException -> L58
            if (r5 <= 0) goto L33
            java.util.LinkedHashSet r5 = r4.f25974b     // Catch: java.lang.Throwable -> L56 org.json.JSONException -> L58
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L56 org.json.JSONException -> L58
        L23:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L56 org.json.JSONException -> L58
            if (r2 == 0) goto L50
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L56 org.json.JSONException -> L58
            com.inmobi.unifiedId.InMobiUnifiedIdInterface r2 = (com.inmobi.unifiedId.InMobiUnifiedIdInterface) r2     // Catch: java.lang.Throwable -> L56 org.json.JSONException -> L58
            com.inmobi.media.Ok.a(r2, r0, r1)     // Catch: java.lang.Throwable -> L56 org.json.JSONException -> L58
            goto L23
        L33:
            java.util.LinkedHashSet r5 = r4.f25974b     // Catch: java.lang.Throwable -> L56 org.json.JSONException -> L58
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L56 org.json.JSONException -> L58
        L39:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L56 org.json.JSONException -> L58
            if (r0 == 0) goto L50
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L56 org.json.JSONException -> L58
            com.inmobi.unifiedId.InMobiUnifiedIdInterface r0 = (com.inmobi.unifiedId.InMobiUnifiedIdInterface) r0     // Catch: java.lang.Throwable -> L56 org.json.JSONException -> L58
            java.lang.Error r2 = new java.lang.Error     // Catch: java.lang.Throwable -> L56 org.json.JSONException -> L58
            java.lang.String r3 = "Fetching the unifiedIds from ID Service has failed and there are no unified ids present in cache"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L56 org.json.JSONException -> L58
            com.inmobi.media.Ok.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L56 org.json.JSONException -> L58
            goto L39
        L50:
            java.util.LinkedHashSet r5 = r4.f25974b
            r5.clear()
            return
        L56:
            r5 = move-exception
            goto L62
        L58:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L56
            java.util.LinkedHashSet r5 = r4.f25974b
            r5.clear()
            return
        L62:
            java.util.LinkedHashSet r0 = r4.f25974b
            r0.clear()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Mk.a(java.lang.String):void");
    }
}
