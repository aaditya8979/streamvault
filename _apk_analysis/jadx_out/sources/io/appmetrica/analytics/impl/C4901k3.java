package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4901k3 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hf f67082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5205w7 f67083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5263yf f67084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4837hg f67085d;

    public C4901k3() {
        this(new Hf(), new C5205w7(), new C5263yf(), new C4837hg());
    }

    public C4901k3(Hf hf2, C5205w7 c5205w7, C5263yf c5263yf, C4837hg c4837hg) {
        this.f67082a = hf2;
        this.f67083b = c5205w7;
        this.f67084c = c5263yf;
        this.f67085d = c4837hg;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull C4927l3 c4927l3) {
        Ei eiA;
        C4777f8 c4777f8 = new C4777f8();
        Ei eiA2 = this.f67082a.fromModel(c4927l3.f67177a);
        c4777f8.f66738a = (C5007o8) eiA2.f65200a;
        c4777f8.f66740c = this.f67083b.fromModel(c4927l3.f67178b);
        Ei eiA3 = this.f67084c.fromModel(c4927l3.f67179c);
        c4777f8.f66741d = (C4982n8) eiA3.f65200a;
        C5264yg c5264yg = c4927l3.f67180d;
        if (c5264yg != null) {
            eiA = this.f67085d.fromModel(c5264yg);
            c4777f8.f66739b = (C5057q8) eiA.f65200a;
        } else {
            eiA = null;
        }
        return new Ei(c4777f8, new C4669b3(C4669b3.b(eiA2, eiA3, eiA)));
    }

    @NonNull
    public final C4927l3 a(@NonNull Ei ei2) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
