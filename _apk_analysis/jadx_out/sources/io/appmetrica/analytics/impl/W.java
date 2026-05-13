package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class W implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5271yn f66060a;

    public W(@NonNull C5271yn c5271yn) {
        this.f66060a = c5271yn;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S5 fromModel(@NonNull V v10) {
        S5 s52 = new S5();
        C5246xn c5246xn = v10.f66016a;
        if (c5246xn != null) {
            s52.f65866a = this.f66060a.fromModel(c5246xn);
        }
        s52.f65867b = new C4672b6[v10.f66017b.size()];
        int i10 = 0;
        Iterator it = v10.f66017b.iterator();
        while (it.hasNext()) {
            s52.f65867b[i10] = this.f66060a.fromModel((C5246xn) it.next());
            i10++;
        }
        String str = v10.f66018c;
        if (str != null) {
            s52.f65868c = str;
        }
        return s52;
    }

    @NonNull
    public final V a(@NonNull S5 s52) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
