package io.appmetrica.analytics.idsync.impl;

import cn.f0;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class x implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m fromModel(@NotNull RequestConfig requestConfig) {
        m mVar = new m();
        String type = requestConfig.getType();
        Charset charset = bo.c.f5639b;
        mVar.f64906a = type.getBytes(charset);
        l lVar = new l();
        lVar.f64904a = w.f64932a[requestConfig.getPreconditions().getNetworkType().ordinal()] != 1 ? 0 : 1;
        mVar.f64907b = lVar;
        mVar.f64908c = requestConfig.getUrl().getBytes(charset);
        Map<String, List<String>> headers = requestConfig.getHeaders();
        ArrayList arrayList = new ArrayList(headers.size());
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            k kVar = new k();
            kVar.f64901a = key.getBytes(bo.c.f5639b);
            int size = value.size();
            byte[][] bArr = new byte[size][];
            for (int i10 = 0; i10 < size; i10++) {
                bArr[i10] = value.get(i10).getBytes(bo.c.f5639b);
            }
            kVar.f64902b = bArr;
            arrayList.add(kVar);
        }
        Object[] array = arrayList.toArray(new k[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        mVar.f64909d = (k[]) array;
        mVar.f64910e = requestConfig.getResendIntervalForValidResponse();
        mVar.f64911f = requestConfig.getResendIntervalForInvalidResponse();
        mVar.f64912g = f0.f1(requestConfig.getValidResponseCodes());
        return mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.appmetrica.analytics.idsync.internal.model.RequestConfig toModel(@org.jetbrains.annotations.NotNull io.appmetrica.analytics.idsync.impl.m r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = new java.lang.String
            byte[] r2 = r0.f64906a
            java.nio.charset.Charset r3 = bo.c.f5639b
            r1.<init>(r2, r3)
            io.appmetrica.analytics.idsync.internal.model.Preconditions r4 = new io.appmetrica.analytics.idsync.internal.model.Preconditions
            io.appmetrica.analytics.idsync.impl.l r2 = r0.f64907b
            if (r2 == 0) goto L1d
            int r2 = r2.f64904a
            r5 = 1
            if (r2 != r5) goto L19
            io.appmetrica.analytics.idsync.internal.model.NetworkType r2 = io.appmetrica.analytics.idsync.internal.model.NetworkType.CELL
            goto L1b
        L19:
            io.appmetrica.analytics.idsync.internal.model.NetworkType r2 = io.appmetrica.analytics.idsync.internal.model.NetworkType.ANY
        L1b:
            if (r2 != 0) goto L1f
        L1d:
            io.appmetrica.analytics.idsync.internal.model.NetworkType r2 = io.appmetrica.analytics.idsync.internal.model.NetworkType.ANY
        L1f:
            r4.<init>(r2)
            java.lang.String r2 = new java.lang.String
            byte[] r5 = r0.f64908c
            r2.<init>(r5, r3)
            io.appmetrica.analytics.idsync.impl.k[] r3 = r0.f64909d
            int r5 = r3.length
            int r5 = cn.p0.f(r5)
            r6 = 16
            int r5 = zn.n.e(r5, r6)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r5)
            int r5 = r3.length
            r8 = 0
        L3d:
            if (r8 >= r5) goto L77
            r9 = r3[r8]
            java.lang.String r10 = new java.lang.String
            byte[] r11 = r9.f64901a
            java.nio.charset.Charset r12 = bo.c.f5639b
            r10.<init>(r11, r12)
            byte[][] r9 = r9.f64902b
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r9.length
            r11.<init>(r12)
            int r12 = r9.length
            r13 = 0
        L54:
            if (r13 >= r12) goto L65
            r14 = r9[r13]
            java.lang.String r15 = new java.lang.String
            java.nio.charset.Charset r7 = bo.c.f5639b
            r15.<init>(r14, r7)
            r11.add(r15)
            int r13 = r13 + 1
            goto L54
        L65:
            kotlin.Pair r7 = bn.h.a(r10, r11)
            java.lang.Object r9 = r7.getFirst()
            java.lang.Object r7 = r7.getSecond()
            r6.put(r9, r7)
            int r8 = r8 + 1
            goto L3d
        L77:
            long r7 = r0.f64910e
            long r9 = r0.f64911f
            int[] r0 = r0.f64912g
            java.util.List r11 = cn.r.F0(r0)
            io.appmetrica.analytics.idsync.internal.model.RequestConfig r12 = new io.appmetrica.analytics.idsync.internal.model.RequestConfig
            r0 = r12
            r3 = r4
            r4 = r6
            r5 = r7
            r7 = r9
            r9 = r11
            r0.<init>(r1, r2, r3, r4, r5, r7, r9)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.idsync.impl.x.toModel(io.appmetrica.analytics.idsync.impl.m):io.appmetrica.analytics.idsync.internal.model.RequestConfig");
    }
}
