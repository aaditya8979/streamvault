package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5263yf implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f68038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5288zf f68039b;

    public C5263yf() {
        this(new Y(), new C5288zf(30));
    }

    public C5263yf(Y y10, C5288zf c5288zf) {
        this.f68038a = y10;
        this.f68039b = c5288zf;
    }

    @NonNull
    public final Af a(@NonNull Ei ei2) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull Af af2) {
        int bytesTruncated;
        C4982n8 c4982n8 = new C4982n8();
        Ei eiFromModel = this.f68038a.fromModel(af2.f64975a);
        c4982n8.f67349a = (C4726d8) eiFromModel.f65200a;
        Nn nnA = this.f68039b.a(af2.f64976b);
        if (mo.a((Collection) nnA.f65673a)) {
            bytesTruncated = 0;
        } else {
            c4982n8.f67350b = new C4726d8[((List) nnA.f65673a).size()];
            bytesTruncated = 0;
            for (int i10 = 0; i10 < ((List) nnA.f65673a).size(); i10++) {
                Ei eiFromModel2 = this.f68038a.fromModel((Z) ((List) nnA.f65673a).get(i10));
                c4982n8.f67350b[i10] = (C4726d8) eiFromModel2.f65200a;
                bytesTruncated += eiFromModel2.f65201b.getBytesTruncated();
            }
        }
        return new Ei(c4982n8, new C4669b3(C4669b3.b(eiFromModel, nnA, new C4669b3(bytesTruncated))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
