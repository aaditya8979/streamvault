package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5062qd implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5268yk f67579a = C5009oa.k().p();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(@NotNull C5145tm[] c5145tmArr) {
        Map<String, Zc> mapC = this.f67579a.c();
        ArrayList arrayList = new ArrayList();
        for (C5145tm c5145tm : c5145tmArr) {
            Zc zc2 = mapC.get(c5145tm.f67751a);
            Pair pairA = zc2 != null ? bn.h.a(c5145tm.f67751a, zc2.f66299c.toModel(c5145tm.f67752b)) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return kotlin.collections.a.x(arrayList);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5145tm[] fromModel(@NotNull Map<String, ? extends Object> map) {
        C5145tm c5145tm;
        Map<String, Zc> mapC = this.f67579a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Zc zc2 = mapC.get(key);
            if (zc2 == null || value == null) {
                c5145tm = null;
            } else {
                c5145tm = new C5145tm();
                c5145tm.f67751a = key;
                c5145tm.f67752b = (byte[]) zc2.f66299c.fromModel(value);
            }
            if (c5145tm != null) {
                arrayList.add(c5145tm);
            }
        }
        Object[] array = arrayList.toArray(new C5145tm[0]);
        if (array != null) {
            return (C5145tm[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
