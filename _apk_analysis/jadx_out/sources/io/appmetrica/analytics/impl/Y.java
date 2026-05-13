package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes11.dex */
public final class Y implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5205w7 f66206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5133ta f66207b;

    public Y() {
        this(new C5205w7(), new C5133ta(20));
    }

    public Y(C5205w7 c5205w7, C5133ta c5133ta) {
        this.f66206a = c5205w7;
        this.f66207b = c5133ta;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull Z z10) {
        C4726d8 c4726d8 = new C4726d8();
        c4726d8.f66591b = this.f66206a.fromModel(z10.f66275a);
        Nn nnA = this.f66207b.a(z10.f66276b);
        c4726d8.f66590a = StringUtils.getUTF8Bytes((String) nnA.f65673a);
        return new Ei(c4726d8, new C4669b3(C4669b3.b(nnA)));
    }

    @NonNull
    public final Z a(@NonNull Ei ei2) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
