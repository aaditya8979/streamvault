package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Fg implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gn f65249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f65250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4853i6 f65251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cl f65252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ie f65253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Je f65254f;

    public Fg() {
        this(new Gn(), new W(new C5271yn()), new C4853i6(), new Cl(), new Ie(), new Je());
    }

    public Fg(Gn gn2, W w10, C4853i6 c4853i6, Cl cl2, Ie ie2, Je je2) {
        this.f65249a = gn2;
        this.f65250b = w10;
        this.f65251c = c4853i6;
        this.f65252d = cl2;
        this.f65253e = ie2;
        this.f65254f = je2;
    }

    @NonNull
    public final Eg a(@NonNull Y5 y52) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 fromModel(@NonNull Eg eg2) {
        Y5 y52 = new Y5();
        y52.f66246f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(eg2.f65196a, y52.f66246f));
        Rn rn2 = eg2.f65197b;
        if (rn2 != null) {
            Hn hn2 = rn2.f65845a;
            if (hn2 != null) {
                y52.f66241a = this.f65249a.fromModel(hn2);
            }
            V v10 = rn2.f65846b;
            if (v10 != null) {
                y52.f66242b = this.f65250b.fromModel(v10);
            }
            List<El> list = rn2.f65847c;
            if (list != null) {
                y52.f66245e = this.f65252d.fromModel(list);
            }
            y52.f66243c = (String) WrapUtils.getOrDefault(rn2.f65851g, y52.f66243c);
            y52.f66244d = this.f65251c.a(rn2.f65852h);
            if (!TextUtils.isEmpty(rn2.f65848d)) {
                y52.f66249i = this.f65253e.fromModel(rn2.f65848d);
            }
            if (!TextUtils.isEmpty(rn2.f65849e)) {
                y52.f66250j = rn2.f65849e.getBytes();
            }
            if (!mo.a(rn2.f65850f)) {
                y52.f66251k = this.f65254f.fromModel(rn2.f65850f);
            }
        }
        return y52;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
