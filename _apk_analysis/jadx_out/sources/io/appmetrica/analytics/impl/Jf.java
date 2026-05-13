package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Jf implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5108sa f65442a;

    public Jf() {
        this(new C5108sa(20, 100));
    }

    @VisibleForTesting
    public Jf(@NonNull C5108sa c5108sa) {
        this.f65442a = c5108sa;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull List<String> list) {
        Nn nnA = this.f65442a.a((List<Object>) list);
        List list2 = (List) nnA.f65673a;
        C5032p8[] c5032p8Arr = new C5032p8[0];
        if (list2 != null) {
            c5032p8Arr = new C5032p8[list2.size()];
            for (int i10 = 0; i10 < list2.size(); i10++) {
                C5032p8 c5032p8 = new C5032p8();
                c5032p8Arr[i10] = c5032p8;
                c5032p8.f67513a = StringUtils.getUTF8Bytes((String) list2.get(i10));
            }
        }
        nnA.f65674b.getBytesTruncated();
        return new Ei(c5032p8Arr, nnA.f65674b);
    }

    @NonNull
    public final List<String> a(@NonNull Ei ei2) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
