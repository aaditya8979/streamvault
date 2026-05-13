package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Jk implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Lk fromModel(@NotNull Map<String, byte[]> map) {
        Lk lk2 = new Lk();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            Mk mk2 = new Mk();
            mk2.f65608a = entry.getKey().getBytes(bo.c.f5639b);
            mk2.f65609b = entry.getValue();
            arrayList.add(mk2);
        }
        Object[] array = arrayList.toArray(new Mk[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        lk2.f65544a = (Mk[]) array;
        return lk2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(@NotNull Lk lk2) {
        Mk[] mkArr = lk2.f65544a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(mkArr.length), 16));
        for (Mk mk2 : mkArr) {
            Pair pairA = bn.h.a(new String(mk2.f65608a, bo.c.f5639b), mk2.f65609b);
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        return linkedHashMap;
    }
}
