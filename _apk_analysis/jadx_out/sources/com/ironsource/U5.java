package com.ironsource;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class U5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final U5 f30543a = new U5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f30544b = "ext_";

    private U5() {
    }

    @NotNull
    public final Map<String, String> a(@Nullable Bundle bundle) {
        Set<String> setKeySet = bundle != null ? bundle.keySet() : null;
        if (setKeySet == null) {
            return kotlin.collections.a.j();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(cn.x.x(setKeySet, 10)), 16));
        for (String str : setKeySet) {
            String str2 = f30544b + str;
            Object obj = bundle.get(str);
            Pair pairA = bn.h.a(str2, obj instanceof Iterable ? cn.f0.D0((Iterable) obj, ", ", null, null, 0, null, null, 62, null) : obj == null ? null : obj.toString());
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        return linkedHashMap;
    }
}
