package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4739dl implements InterfaceC4700c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zi f66626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Hf f66627b;

    public C4739dl() {
        this(new Zi(), new Hf());
    }

    public C4739dl(Zi zi2, Hf hf2) {
        this.f66626a = zi2;
        this.f66627b = hf2;
    }

    @NonNull
    public final C4713cl a(@NonNull List<Ei> list) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ei> fromModel(@NonNull C4713cl c4713cl) {
        C5181v8 c5181v8 = new C5181v8();
        c5181v8.f67822a = 2;
        c5181v8.f67824c = new C5106s8();
        Ei eiFromModel = this.f66626a.fromModel(c4713cl.f66545b);
        c5181v8.f67824c.f67671b = (C5081r8) eiFromModel.f65200a;
        Ei eiFromModel2 = this.f66627b.fromModel(c4713cl.f66544a);
        c5181v8.f67824c.f67670a = (C5007o8) eiFromModel2.f65200a;
        return Collections.singletonList(new Ei(c5181v8, new C4669b3(C4669b3.b(eiFromModel, eiFromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
