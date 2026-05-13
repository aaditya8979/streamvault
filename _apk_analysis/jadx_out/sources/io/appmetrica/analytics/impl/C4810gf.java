package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4810gf implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5113sf f66827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4681bf f66828b;

    public C4810gf() {
        this(new C5113sf(), new C4681bf());
    }

    public C4810gf(C5113sf c5113sf, C4681bf c4681bf) {
        this.f66827a = c5113sf;
        this.f66828b = c4681bf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4758ef toModel(@NonNull C5014of c5014of) {
        ArrayList arrayList = new ArrayList(c5014of.f67459b.length);
        for (C4989nf c4989nf : c5014of.f67459b) {
            arrayList.add(this.f66828b.toModel(c4989nf));
        }
        C4964mf c4964mf = c5014of.f67458a;
        return new C4758ef(c4964mf == null ? this.f66827a.toModel(new C4964mf()) : this.f66827a.toModel(c4964mf), arrayList);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5014of fromModel(@NonNull C4758ef c4758ef) {
        C5014of c5014of = new C5014of();
        c5014of.f67458a = this.f66827a.fromModel(c4758ef.f66683a);
        c5014of.f67459b = new C4989nf[c4758ef.f66684b.size()];
        Iterator<C4733df> it = c4758ef.f66684b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            c5014of.f67459b[i10] = this.f66828b.fromModel(it.next());
            i10++;
        }
        return c5014of;
    }
}
