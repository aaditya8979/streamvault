package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4718d0 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f66562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4853i6 f66563b;

    public C4718d0() {
        this(new W(new C5271yn()), new C4853i6());
    }

    public C4718d0(W w10, C4853i6 c4853i6) {
        this.f66562a = w10;
        this.f66563b = c4853i6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T5 fromModel(@NonNull C4692c0 c4692c0) {
        T5 t52 = new T5();
        t52.f65922a = this.f66562a.fromModel(c4692c0.f66444a);
        String str = c4692c0.f66445b;
        if (str != null) {
            t52.f65923b = str;
        }
        t52.f65924c = this.f66563b.a(c4692c0.f66446c);
        return t52;
    }

    @NonNull
    public final C4692c0 a(@NonNull T5 t52) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
