package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Sn implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gn f65892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f65893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4853i6 f65894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cl f65895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ie f65896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Je f65897f;

    public Sn() {
        this(new Gn(), new W(new C5271yn()), new C4853i6(), new Cl(), new Ie(), new Je());
    }

    public Sn(Gn gn2, W w10, C4853i6 c4853i6, Cl cl2, Ie ie2, Je je2) {
        this.f65893b = w10;
        this.f65892a = gn2;
        this.f65894c = c4853i6;
        this.f65895d = cl2;
        this.f65896e = ie2;
        this.f65897f = je2;
    }

    @NonNull
    public final Rn a(@NonNull W5 w52) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W5 fromModel(@NonNull Rn rn2) {
        W5 w52 = new W5();
        Hn hn2 = rn2.f65845a;
        if (hn2 != null) {
            w52.f66084a = this.f65892a.fromModel(hn2);
        }
        V v10 = rn2.f65846b;
        if (v10 != null) {
            w52.f66085b = this.f65893b.fromModel(v10);
        }
        List<El> list = rn2.f65847c;
        if (list != null) {
            w52.f66088e = this.f65895d.fromModel(list);
        }
        String str = rn2.f65851g;
        if (str != null) {
            w52.f66086c = str;
        }
        w52.f66087d = this.f65894c.a(rn2.f65852h);
        if (!TextUtils.isEmpty(rn2.f65848d)) {
            w52.f66091h = this.f65896e.fromModel(rn2.f65848d);
        }
        if (!TextUtils.isEmpty(rn2.f65849e)) {
            w52.f66092i = rn2.f65849e.getBytes();
        }
        if (!mo.a(rn2.f65850f)) {
            w52.f66093j = this.f65897f.fromModel(rn2.f65850f);
        }
        return w52;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
