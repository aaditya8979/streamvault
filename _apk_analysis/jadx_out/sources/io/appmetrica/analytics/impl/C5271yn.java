package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5271yn implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cl f68051a;

    public C5271yn() {
        this(new Cl());
    }

    public C5271yn(Cl cl2) {
        this.f68051a = cl2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4672b6 fromModel(@NonNull C5246xn c5246xn) {
        C4672b6 c4672b6 = new C4672b6();
        Integer num = c5246xn.f67991e;
        c4672b6.f66428e = num == null ? -1 : num.intValue();
        c4672b6.f66427d = c5246xn.f67990d;
        c4672b6.f66425b = c5246xn.f67988b;
        c4672b6.f66424a = c5246xn.f67987a;
        c4672b6.f66426c = c5246xn.f67989c;
        Cl cl2 = this.f68051a;
        List list = c5246xn.f67992f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new El((StackTraceElement) it.next()));
        }
        c4672b6.f66429f = cl2.fromModel(arrayList);
        return c4672b6;
    }

    @NonNull
    public final C5246xn a(@NonNull C4672b6 c4672b6) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
