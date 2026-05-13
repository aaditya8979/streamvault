package com.inmobi.media;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.inmobi.media.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3657pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mo.a[] f27859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f27860b;

    public C3657pb() {
        mo.a[] aVarArr = new mo.a[16];
        for (int i10 = 0; i10 < 16; i10++) {
            aVarArr[i10] = mo.g.b(false, 1, null);
        }
        this.f27859a = aVarArr;
        this.f27860b = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, com.inmobi.media.ho r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.inmobi.media.C3607nb
            if (r0 == 0) goto L13
            r0 = r11
            com.inmobi.media.nb r0 = (com.inmobi.media.C3607nb) r0
            int r1 = r0.f27683f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27683f = r1
            goto L18
        L13:
            com.inmobi.media.nb r0 = new com.inmobi.media.nb
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f27681d
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27683f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r9 = r0.f27679b
            mo.a r9 = (mo.a) r9
            java.lang.String r10 = r0.f27678a
            kotlin.c.b(r11)     // Catch: java.lang.Throwable -> L33
            goto L8b
        L33:
            r10 = move-exception
            goto L98
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            mo.a r9 = r0.f27680c
            java.lang.Object r10 = r0.f27679b
            sn.l r10 = (sn.l) r10
            java.lang.String r2 = r0.f27678a
            kotlin.c.b(r11)
            r11 = r9
            r9 = r2
            goto L70
        L4c:
            kotlin.c.b(r11)
            if (r9 == 0) goto L56
            int r11 = r9.hashCode()
            goto L57
        L56:
            r11 = 0
        L57:
            mo.a[] r2 = r8.f27859a
            r6 = 16
            int r11 = java.lang.Math.floorMod(r11, r6)
            r11 = r2[r11]
            r0.f27678a = r9
            r0.f27679b = r10
            r0.f27680c = r11
            r0.f27683f = r4
            java.lang.Object r2 = r11.c(r5, r0)
            if (r2 != r1) goto L70
            goto L86
        L70:
            java.util.LinkedHashMap r2 = r8.f27860b     // Catch: java.lang.Throwable -> L96
            java.lang.Object r2 = r2.get(r9)     // Catch: java.lang.Throwable -> L96
            if (r2 != 0) goto L92
            r0.f27678a = r9     // Catch: java.lang.Throwable -> L96
            r0.f27679b = r11     // Catch: java.lang.Throwable -> L96
            r0.f27680c = r5     // Catch: java.lang.Throwable -> L96
            r0.f27683f = r3     // Catch: java.lang.Throwable -> L96
            java.lang.Object r10 = r10.invoke(r0)     // Catch: java.lang.Throwable -> L96
            if (r10 != r1) goto L87
        L86:
            return r1
        L87:
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L8b:
            java.util.LinkedHashMap r0 = r8.f27860b     // Catch: java.lang.Throwable -> L33
            r0.put(r10, r11)     // Catch: java.lang.Throwable -> L33
            r2 = r11
            r11 = r9
        L92:
            r11.d(r5)
            return r2
        L96:
            r10 = move-exception
            r9 = r11
        L98:
            r9.d(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3657pb.a(java.lang.String, com.inmobi.media.ho, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.inmobi.media.C3632ob
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.ob r0 = (com.inmobi.media.C3632ob) r0
            int r1 = r0.f27776e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27776e = r1
            goto L18
        L13:
            com.inmobi.media.ob r0 = new com.inmobi.media.ob
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f27774c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27776e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            mo.a r7 = r0.f27773b
            java.lang.String r0 = r0.f27772a
            kotlin.c.b(r8)
            goto L5a
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.c.b(r8)
            if (r7 == 0) goto L40
            int r8 = r7.hashCode()
            goto L41
        L40:
            r8 = 0
        L41:
            mo.a[] r2 = r6.f27859a
            r5 = 16
            int r8 = java.lang.Math.floorMod(r8, r5)
            r8 = r2[r8]
            r0.f27772a = r7
            r0.f27773b = r8
            r0.f27776e = r3
            java.lang.Object r0 = r8.c(r4, r0)
            if (r0 != r1) goto L58
            return r1
        L58:
            r0 = r7
            r7 = r8
        L5a:
            java.util.LinkedHashMap r8 = r6.f27860b     // Catch: java.lang.Throwable -> L65
            r8.remove(r0)     // Catch: java.lang.Throwable -> L65
            r7.d(r4)
            bn.r r7 = bn.r.f5635a
            return r7
        L65:
            r8 = move-exception
            r7.d(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3657pb.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final String toString() {
        String str = this.f27860b.toString();
        tn.p.j(str, "toString(...)");
        return str;
    }
}
