package io.appmetrica.analytics.remotepermissions.impl;

import cn.x;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements ProtobufConverter {
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.appmetrica.analytics.remotepermissions.impl.a toModel(@org.jetbrains.annotations.NotNull io.appmetrica.analytics.remotepermissions.impl.f r7) {
        /*
            r6 = this;
            byte[][] r7 = r7.f68369a
            if (r7 == 0) goto L23
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            r1 = 0
            int r2 = r7.length
        Lc:
            if (r1 >= r2) goto L1d
            r3 = r7[r1]
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r5 = bo.c.f5639b
            r4.<init>(r3, r5)
            r0.add(r4)
            int r1 = r1 + 1
            goto Lc
        L1d:
            java.util.Set r7 = cn.f0.l1(r0)
            if (r7 != 0) goto L27
        L23:
            java.util.Set r7 = cn.w0.f()
        L27:
            io.appmetrica.analytics.remotepermissions.impl.a r0 = new io.appmetrica.analytics.remotepermissions.impl.a
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.remotepermissions.impl.c.toModel(io.appmetrica.analytics.remotepermissions.impl.f):io.appmetrica.analytics.remotepermissions.impl.a");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f fromModel(@NotNull a aVar) {
        f fVar = new f();
        Set set = aVar.f68361a;
        ArrayList arrayList = new ArrayList(x.x(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).getBytes(bo.c.f5639b));
        }
        Object[] array = arrayList.toArray(new byte[0][]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        fVar.f68369a = (byte[][]) array;
        return fVar;
    }
}
