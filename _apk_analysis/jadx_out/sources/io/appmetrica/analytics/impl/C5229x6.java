package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5229x6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(@NotNull C5071qm[] c5071qmArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(c5071qmArr.length), 16));
        for (C5071qm c5071qm : c5071qmArr) {
            Pair pairA = bn.h.a(c5071qm.f67594a, cn.r.G0(c5071qm.f67595b));
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        return linkedHashMap;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5071qm[] fromModel(@NotNull Map<String, ? extends List<String>> map) {
        C5071qm[] c5071qmArr = new C5071qm[map.size()];
        int i10 = 0;
        for (Object obj : map.entrySet()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                cn.w.w();
            }
            Map.Entry entry = (Map.Entry) obj;
            C5071qm c5071qm = new C5071qm();
            c5071qm.f67594a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c5071qm.f67595b = (String[]) array;
            c5071qmArr[i10] = c5071qm;
            i10 = i11;
        }
        return c5071qmArr;
    }
}
