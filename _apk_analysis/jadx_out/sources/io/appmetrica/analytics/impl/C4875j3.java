package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4875j3 implements InterfaceC4700c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4901k3 f67008a;

    public C4875j3() {
        this(new C4901k3());
    }

    public C4875j3(C4901k3 c4901k3) {
        this.f67008a = c4901k3;
    }

    @NonNull
    public final C4850i3 a(@NonNull List<Ei> list) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ei> fromModel(@NonNull C4850i3 c4850i3) {
        C5181v8 c5181v8 = new C5181v8();
        c5181v8.f67826e = new C4751e8();
        Ei eiFromModel = this.f67008a.fromModel(c4850i3.f66956b);
        c5181v8.f67826e.f66673a = (C4777f8) eiFromModel.f65200a;
        c5181v8.f67822a = c4850i3.f66955a;
        return Collections.singletonList(new Ei(c5181v8, new C4669b3(C4669b3.b(eiFromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
