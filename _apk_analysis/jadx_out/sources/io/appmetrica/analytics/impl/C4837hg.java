package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4837hg implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zi f66918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5133ta f66919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5133ta f66920c;

    public C4837hg() {
        this(new Zi(), new C5133ta(100), new C5133ta(2048));
    }

    public C4837hg(Zi zi2, C5133ta c5133ta, C5133ta c5133ta2) {
        this.f66918a = zi2;
        this.f66919b = c5133ta;
        this.f66920c = c5133ta2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull C5264yg c5264yg) {
        Ei eiFromModel;
        C5057q8 c5057q8 = new C5057q8();
        Nn nnA = this.f66919b.a(c5264yg.f68040a);
        c5057q8.f67569a = StringUtils.getUTF8Bytes((String) nnA.f65673a);
        Nn nnA2 = this.f66920c.a(c5264yg.f68041b);
        c5057q8.f67570b = StringUtils.getUTF8Bytes((String) nnA2.f65673a);
        C4737dj c4737dj = c5264yg.f68042c;
        if (c4737dj != null) {
            eiFromModel = this.f66918a.fromModel(c4737dj);
            c5057q8.f67571c = (C5081r8) eiFromModel.f65200a;
        } else {
            eiFromModel = null;
        }
        return new Ei(c5057q8, new C4669b3(C4669b3.b(nnA, nnA2, eiFromModel)));
    }

    @NonNull
    public final C5264yg a(@NonNull Ei ei2) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
