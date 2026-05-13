package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Cl implements ListConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dl f65128a = new Dl();

    @NonNull
    public final List<El> a(C4646a6[] c4646a6Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4646a6[] fromModel(@NonNull List<El> list) {
        C4646a6[] c4646a6Arr = new C4646a6[list.size()];
        Iterator<El> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            c4646a6Arr[i10] = this.f65128a.fromModel(it.next());
            i10++;
        }
        return c4646a6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }
}
