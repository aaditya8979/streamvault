package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class Hf implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5137te f65319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5263yf f65320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4952m3 f65321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Jf f65322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5133ta f65323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5133ta f65324f;

    public Hf() {
        this(new C5137te(), new C5263yf(), new C4952m3(), new Jf(), new C5133ta(100), new C5133ta(1000));
    }

    public Hf(C5137te c5137te, C5263yf c5263yf, C4952m3 c4952m3, Jf jf2, C5133ta c5133ta, C5133ta c5133ta2) {
        this.f65319a = c5137te;
        this.f65320b = c5263yf;
        this.f65321c = c4952m3;
        this.f65322d = jf2;
        this.f65323e = c5133ta;
        this.f65324f = c5133ta2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull If r10) {
        Ei eiFromModel;
        Ei eiFromModel2;
        Ei eiA;
        Ei eiA2;
        C5007o8 c5007o8 = new C5007o8();
        Nn nnA = this.f65323e.a(r10.f65360a);
        c5007o8.f67409a = StringUtils.getUTF8Bytes((String) nnA.f65673a);
        Nn nnA2 = this.f65324f.a(r10.f65361b);
        c5007o8.f67410b = StringUtils.getUTF8Bytes((String) nnA2.f65673a);
        List<String> list = r10.f65362c;
        Ei eiFromModel3 = null;
        if (list != null) {
            eiFromModel = this.f65321c.fromModel(list);
            c5007o8.f67411c = (C4803g8) eiFromModel.f65200a;
        } else {
            eiFromModel = null;
        }
        Map<String, String> map = r10.f65363d;
        if (map != null) {
            eiFromModel2 = this.f65319a.fromModel(map);
            c5007o8.f67412d = (C4957m8) eiFromModel2.f65200a;
        } else {
            eiFromModel2 = null;
        }
        Af af2 = r10.f65364e;
        if (af2 != null) {
            eiA = this.f65320b.fromModel(af2);
            c5007o8.f67413e = (C4982n8) eiA.f65200a;
        } else {
            eiA = null;
        }
        Af af3 = r10.f65365f;
        if (af3 != null) {
            eiA2 = this.f65320b.fromModel(af3);
            c5007o8.f67414f = (C4982n8) eiA2.f65200a;
        } else {
            eiA2 = null;
        }
        List<String> list2 = r10.f65366g;
        if (list2 != null) {
            eiFromModel3 = this.f65322d.fromModel(list2);
            c5007o8.f67415g = (C5032p8[]) eiFromModel3.f65200a;
        }
        return new Ei(c5007o8, new C4669b3(C4669b3.b(nnA, nnA2, eiFromModel, eiFromModel2, eiA, eiA2, eiFromModel3)));
    }

    @NonNull
    public final If a(@NonNull Ei ei2) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
