package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q {
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.UUID a(byte[] r9) {
        /*
            com.fyber.inneractive.sdk.player.exoplayer2.util.n r0 = new com.fyber.inneractive.sdk.player.exoplayer2.util.n
            r0.<init>(r9)
            int r9 = r0.f18796c
            r1 = 0
            r2 = 32
            if (r9 >= r2) goto Ld
            goto L6d
        Ld:
            r9 = 0
            r0.e(r9)
            int r2 = r0.b()
            int r3 = r0.f18796c
            int r4 = r0.f18795b
            int r3 = r3 - r4
            int r3 = r3 + 4
            if (r2 == r3) goto L1f
            goto L6d
        L1f:
            int r2 = r0.b()
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.V
            if (r2 == r3) goto L28
            goto L6d
        L28:
            int r2 = r0.b()
            int r2 = r2 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 1
            if (r2 <= r3) goto L47
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Unsupported pssh version: "
            r9.<init>(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "PsshAtomUtil"
            android.util.Log.w(r0, r9)
            goto L6d
        L47:
            java.util.UUID r4 = new java.util.UUID
            long r5 = r0.g()
            long r7 = r0.g()
            r4.<init>(r5, r7)
            if (r2 != r3) goto L62
            int r2 = r0.m()
            int r2 = r2 * 16
            int r3 = r0.f18795b
            int r3 = r3 + r2
            r0.e(r3)
        L62:
            int r2 = r0.m()
            int r3 = r0.f18796c
            int r5 = r0.f18795b
            int r3 = r3 - r5
            if (r2 == r3) goto L6f
        L6d:
            r9 = r1
            goto L78
        L6f:
            byte[] r3 = new byte[r2]
            r0.a(r3, r9, r2)
            android.util.Pair r9 = android.util.Pair.create(r4, r3)
        L78:
            if (r9 != 0) goto L7b
            return r1
        L7b:
            java.lang.Object r9 = r9.first
            java.util.UUID r9 = (java.util.UUID) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.q.a(byte[]):java.util.UUID");
    }
}
