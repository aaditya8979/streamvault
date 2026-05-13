package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5151u3 implements ProtobufConverter {
    public static C5101s3 a(C5176v3 c5176v3) {
        LinkedHashMap linkedHashMap;
        C5226x3 c5226x3 = c5176v3.f67802a;
        if (c5226x3 != null) {
            C5201w3[] c5201w3Arr = c5226x3.f67926a;
            linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(c5201w3Arr.length), 16));
            for (C5201w3 c5201w3 : c5201w3Arr) {
                Pair pairA = bn.h.a(c5201w3.f67874a, c5201w3.f67875b);
                linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
            }
        } else {
            linkedHashMap = null;
        }
        int i10 = c5176v3.f67803b;
        return new C5101s3(linkedHashMap, i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? T7.f65925b : T7.f65928e : T7.f65927d : T7.f65926c : T7.f65925b);
    }

    public static C5176v3 a(C5101s3 c5101s3) {
        C5226x3 c5226x3;
        C5176v3 c5176v3 = new C5176v3();
        Map map = c5101s3.f67660a;
        int i10 = 0;
        if (map != null) {
            c5226x3 = new C5226x3();
            int size = map.size();
            C5201w3[] c5201w3Arr = new C5201w3[size];
            for (int i11 = 0; i11 < size; i11++) {
                c5201w3Arr[i11] = new C5201w3();
            }
            c5226x3.f67926a = c5201w3Arr;
            int i12 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C5201w3 c5201w3 = c5226x3.f67926a[i12];
                c5201w3.f67874a = str;
                c5201w3.f67875b = str2;
                i12++;
            }
        } else {
            c5226x3 = null;
        }
        c5176v3.f67802a = c5226x3;
        int iOrdinal = c5101s3.f67661b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i10 = 1;
            } else if (iOrdinal == 2) {
                i10 = 2;
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = 3;
            }
        }
        c5176v3.f67803b = i10;
        return c5176v3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5126t3 toModel(@NotNull C5251y3 c5251y3) {
        C5176v3 c5176v3 = c5251y3.f68009a;
        if (c5176v3 == null) {
            c5176v3 = new C5176v3();
        }
        C5101s3 c5101s3A = a(c5176v3);
        C5176v3[] c5176v3Arr = c5251y3.f68010b;
        ArrayList arrayList = new ArrayList(c5176v3Arr.length);
        for (C5176v3 c5176v32 : c5176v3Arr) {
            arrayList.add(a(c5176v32));
        }
        return new C5126t3(c5101s3A, arrayList);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5251y3 fromModel(@NotNull C5126t3 c5126t3) {
        C5251y3 c5251y3 = new C5251y3();
        c5251y3.f68009a = a(c5126t3.f67715a);
        int size = c5126t3.f67716b.size();
        C5176v3[] c5176v3Arr = new C5176v3[size];
        for (int i10 = 0; i10 < size; i10++) {
            c5176v3Arr[i10] = a((C5101s3) c5126t3.f67716b.get(i10));
        }
        c5251y3.f68010b = c5176v3Arr;
        return c5251y3;
    }
}
