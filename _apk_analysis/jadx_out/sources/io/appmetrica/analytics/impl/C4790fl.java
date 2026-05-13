package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4790fl implements InterfaceC4700c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hf f66795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4837hg f66796b;

    public C4790fl() {
        this(new Hf(), new C4837hg());
    }

    public C4790fl(Hf hf2, C4837hg c4837hg) {
        this.f66795a = hf2;
        this.f66796b = c4837hg;
    }

    @NonNull
    public final C4764el a(@NonNull List<Ei> list) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ei> fromModel(@NonNull C4764el c4764el) {
        Ei eiFromModel;
        C5181v8 c5181v8 = new C5181v8();
        c5181v8.f67822a = 3;
        c5181v8.f67825d = new C5131t8();
        Ei eiFromModel2 = this.f66795a.fromModel(c4764el.f66687a);
        c5181v8.f67825d.f67723a = (C5007o8) eiFromModel2.f65200a;
        C5264yg c5264yg = c4764el.f66688b;
        if (c5264yg != null) {
            eiFromModel = this.f66796b.fromModel(c5264yg);
            c5181v8.f67825d.f67724b = (C5057q8) eiFromModel.f65200a;
        } else {
            eiFromModel = null;
        }
        return Collections.singletonList(new Ei(c5181v8, new C4669b3(C4669b3.b(eiFromModel2, eiFromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
