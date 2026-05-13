package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Q8 implements ProtobufConverter {
    public static C5182v9 a(P8 p82) {
        C5182v9 c5182v9 = new C5182v9();
        c5182v9.f67832d = new int[p82.f65742b.size()];
        Iterator it = p82.f65742b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            c5182v9.f67832d[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        c5182v9.f67831c = p82.f65744d;
        c5182v9.f67830b = p82.f65743c;
        c5182v9.f67829a = p82.f65741a;
        return c5182v9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((P8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C5182v9 c5182v9 = (C5182v9) obj;
        return new P8(c5182v9.f67829a, c5182v9.f67830b, c5182v9.f67831c, CollectionUtils.hashSetFromIntArray(c5182v9.f67832d));
    }
}
