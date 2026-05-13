package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Gn implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cl f65297a;

    public Gn() {
        this(new Cl());
    }

    public Gn(Cl cl2) {
        this.f65297a = cl2;
    }

    @NonNull
    public final Hn a(@NonNull C4698c6 c4698c6) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4698c6 fromModel(@NonNull Hn hn2) {
        C4698c6 c4698c6 = new C4698c6();
        c4698c6.f66477a = (String) WrapUtils.getOrDefault(hn2.f65340a, "");
        c4698c6.f66478b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(hn2.f65341b, ""));
        List<El> list = hn2.f65342c;
        if (list != null) {
            c4698c6.f66479c = this.f65297a.fromModel(list);
        }
        Hn hn3 = hn2.f65343d;
        if (hn3 != null) {
            c4698c6.f66480d = fromModel(hn3);
        }
        List list2 = hn2.f65344e;
        int i10 = 0;
        if (list2 == null) {
            c4698c6.f66481e = new C4698c6[0];
        } else {
            c4698c6.f66481e = new C4698c6[list2.size()];
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                c4698c6.f66481e[i10] = fromModel((Hn) it.next());
                i10++;
            }
        }
        return c4698c6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }
}
