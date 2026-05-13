package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4842hl implements InterfaceC4700c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zi f66929a;

    public C4842hl() {
        this(new Zi());
    }

    public C4842hl(Zi zi2) {
        this.f66929a = zi2;
    }

    @NonNull
    public final C4816gl a(@NonNull List<Ei> list) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ei> fromModel(@NonNull C4816gl c4816gl) {
        C5181v8 c5181v8 = new C5181v8();
        c5181v8.f67822a = 1;
        c5181v8.f67823b = new C5156u8();
        Ei eiFromModel = this.f66929a.fromModel(c4816gl.f66844a);
        c5181v8.f67823b.f67775a = (C5081r8) eiFromModel.f65200a;
        C4669b3 c4669b3 = new C4669b3(C4669b3.b(eiFromModel));
        eiFromModel.f65201b.getBytesTruncated();
        return Collections.singletonList(new Ei(c5181v8, c4669b3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
