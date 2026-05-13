package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class K8 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(@NotNull byte[] bArr) {
        L8[] l8Arr = ((M8) MessageNano.mergeFrom(new M8(), bArr)).f65581a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(l8Arr.length), 16));
        for (L8 l82 : l8Arr) {
            Pair pairA = bn.h.a(l82.f65526a, l82.f65527b);
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        return linkedHashMap;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NotNull Map<String, byte[]> map) {
        M8 m82 = new M8();
        L8[] l8Arr = new L8[map.size()];
        int i10 = 0;
        for (Object obj : map.entrySet()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                cn.w.w();
            }
            Map.Entry entry = (Map.Entry) obj;
            L8 l82 = new L8();
            l82.f65526a = (String) entry.getKey();
            l82.f65527b = (byte[]) entry.getValue();
            l8Arr[i10] = l82;
            i10 = i11;
        }
        m82.f65581a = l8Arr;
        return MessageNano.toByteArray(m82);
    }
}
