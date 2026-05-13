package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class Yi extends Sg {
    public Yi(@NotNull Y4 y42) {
        super(y42);
        y42.b().a();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    @Override // io.appmetrica.analytics.impl.Sg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(@org.jetbrains.annotations.NotNull io.appmetrica.analytics.impl.Q5 r6) {
        /*
            r5 = this;
            java.util.Map r6 = r6.f65803p
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        La:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            io.appmetrica.analytics.impl.Y4 r1 = r5.f65880a
            io.appmetrica.analytics.impl.Kk r1 = r1.f66234u
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.getValue()
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L38
            r1.getClass()
            int r3 = r0.length
            if (r3 != 0) goto L2f
            goto L38
        L2f:
            java.util.Map r3 = r1.f65497b
            java.lang.Object r0 = r3.put(r2, r0)
            byte[] r0 = (byte[]) r0
            goto L40
        L38:
            java.util.Map r0 = r1.f65497b
            java.lang.Object r0 = r0.remove(r2)
            byte[] r0 = (byte[]) r0
        L40:
            io.appmetrica.analytics.impl.Ok r0 = r1.f65496a
            java.util.Map r1 = r1.f65497b
            io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper r2 = r0.f65720d
            java.lang.String r3 = r0.f65717a
            io.appmetrica.analytics.impl.Nk r4 = r0.f65719c
            io.appmetrica.analytics.impl.Jk r0 = r0.f65718b
            io.appmetrica.analytics.impl.Lk r0 = r0.fromModel(r1)
            byte[] r0 = r4.toByteArray(r0)
            r2.insert(r3, r0)
            goto La
        L58:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Yi.a(io.appmetrica.analytics.impl.Q5):boolean");
    }
}
