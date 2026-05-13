package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4952m3 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5108sa f67255a;

    public C4952m3() {
        this(new C5108sa(20, 100));
    }

    @VisibleForTesting
    public C4952m3(@NonNull C5108sa c5108sa) {
        this.f67255a = c5108sa;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull List<String> list) {
        Nn nnA = this.f67255a.a((List<Object>) list);
        C4803g8 c4803g8 = new C4803g8();
        c4803g8.f66813a = StringUtils.getUTF8Bytes((List<String>) nnA.f65673a);
        InterfaceC4695c3 interfaceC4695c3 = nnA.f65674b;
        int i10 = ((C5003o4) interfaceC4695c3).f66415a;
        return new Ei(c4803g8, interfaceC4695c3);
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
