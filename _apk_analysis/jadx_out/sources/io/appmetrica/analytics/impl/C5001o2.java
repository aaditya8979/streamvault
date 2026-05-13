package io.appmetrica.analytics.impl;

import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C5001o2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4976n2 toModel(@NonNull C5021om c5021om) {
        ArrayList arrayList = new ArrayList();
        for (C4996nm c4996nm : c5021om.f67472a) {
            String str = c4996nm.f67382a;
            C4971mm c4971mm = c4996nm.f67383b;
            arrayList.add(new Pair(str, c4971mm == null ? null : new C4951m2(c4971mm.f67307a)));
        }
        return new C4976n2(arrayList);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5021om fromModel(@NonNull C4976n2 c4976n2) {
        C4971mm c4971mm;
        C5021om c5021om = new C5021om();
        c5021om.f67472a = new C4996nm[c4976n2.f67319a.size()];
        for (int i10 = 0; i10 < c4976n2.f67319a.size(); i10++) {
            C4996nm c4996nm = new C4996nm();
            Pair pair = (Pair) c4976n2.f67319a.get(i10);
            c4996nm.f67382a = (String) pair.first;
            if (pair.second != null) {
                c4996nm.f67383b = new C4971mm();
                C4951m2 c4951m2 = (C4951m2) pair.second;
                if (c4951m2 == null) {
                    c4971mm = null;
                } else {
                    C4971mm c4971mm2 = new C4971mm();
                    c4971mm2.f67307a = c4951m2.f67254a;
                    c4971mm = c4971mm2;
                }
                c4996nm.f67383b = c4971mm;
            }
            c5021om.f67472a[i10] = c4996nm;
        }
        return c5021om;
    }
}
