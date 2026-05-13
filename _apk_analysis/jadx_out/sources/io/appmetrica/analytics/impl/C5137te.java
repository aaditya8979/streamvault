package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5137te implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5208wa f67745a;

    public C5137te() {
        this(new C5208wa(20480, 100, 1000));
    }

    @VisibleForTesting
    public C5137te(@NonNull C5208wa c5208wa) {
        this.f67745a = c5208wa;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull Map<String, String> map) {
        Nn nnA = this.f67745a.a(map);
        C4957m8 c4957m8 = new C4957m8();
        c4957m8.f67282b = ((C5003o4) nnA.f65674b).f67391b;
        Map map2 = (Map) nnA.f65673a;
        if (map2 != null) {
            c4957m8.f67281a = new C4932l8[map2.size()];
            int i10 = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c4957m8.f67281a[i10] = new C4932l8();
                c4957m8.f67281a[i10].f67193a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c4957m8.f67281a[i10].f67194b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i10++;
            }
        }
        InterfaceC4695c3 interfaceC4695c3 = nnA.f65674b;
        int i11 = ((C5003o4) interfaceC4695c3).f66415a;
        return new Ei(c4957m8, interfaceC4695c3);
    }

    @NonNull
    public final Map<String, String> a(@NonNull Ei ei2) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
