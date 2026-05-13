package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class Zi implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5137te f66306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4952m3 f66307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5133ta f66308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5133ta f66309d;

    public Zi() {
        this(new C5137te(), new C4952m3(), new C5133ta(100), new C5133ta(1000));
    }

    public Zi(C5137te c5137te, C4952m3 c4952m3, C5133ta c5133ta, C5133ta c5133ta2) {
        this.f66306a = c5137te;
        this.f66307b = c4952m3;
        this.f66308c = c5133ta;
        this.f66309d = c5133ta2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(@NonNull C4737dj c4737dj) {
        Ei eiA;
        C5081r8 c5081r8 = new C5081r8();
        Nn nnA = this.f66308c.a(c4737dj.f66615a);
        c5081r8.f67609a = StringUtils.getUTF8Bytes((String) nnA.f65673a);
        List<String> list = c4737dj.f66616b;
        Ei eiA2 = null;
        if (list != null) {
            eiA = this.f66307b.fromModel(list);
            c5081r8.f67610b = (C4803g8) eiA.f65200a;
        } else {
            eiA = null;
        }
        Nn nnA2 = this.f66309d.a(c4737dj.f66617c);
        c5081r8.f67611c = StringUtils.getUTF8Bytes((String) nnA2.f65673a);
        Map<String, String> map = c4737dj.f66618d;
        if (map != null) {
            eiA2 = this.f66306a.fromModel(map);
            c5081r8.f67612d = (C4957m8) eiA2.f65200a;
        }
        return new Ei(c5081r8, new C4669b3(C4669b3.b(nnA, eiA, nnA2, eiA2)));
    }

    @NonNull
    public final C4737dj a(@NonNull Ei ei2) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
