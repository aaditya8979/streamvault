package com.unity3d.ads.core.extensions;

/* JADX INFO: compiled from: JSONObjectExtensions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class JSONObjectExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.Object> toBuiltInMap(@org.jetbrains.annotations.NotNull org.json.JSONObject r7) {
        /*
            java.lang.String r0 = "<this>"
            tn.p.k(r7, r0)
            java.util.Iterator r0 = r7.keys()
            java.lang.String r1 = "keys()"
            tn.p.j(r0, r1)
            ao.i r0 = ao.r.g(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r7.opt(r3)
            r4 = 0
            if (r3 == 0) goto L52
            java.lang.String r5 = "opt(value)"
            tn.p.j(r3, r5)
            java.lang.String r5 = java.lang.String.valueOf(r3)
            java.lang.String r6 = "undefined"
            boolean r5 = tn.p.f(r5, r6)
            if (r5 != 0) goto L4e
            java.lang.String r5 = java.lang.String.valueOf(r3)
            java.lang.String r6 = "null"
            boolean r5 = tn.p.f(r5, r6)
            if (r5 != 0) goto L4e
            r5 = 1
            goto L4f
        L4e:
            r5 = 0
        L4f:
            if (r5 == 0) goto L52
            goto L53
        L52:
            r3 = r4
        L53:
            r1.put(r2, r3)
            goto L1b
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.extensions.JSONObjectExtensionsKt.toBuiltInMap(org.json.JSONObject):java.util.Map");
    }
}
