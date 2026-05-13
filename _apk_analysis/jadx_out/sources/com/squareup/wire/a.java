package com.squareup.wire;

import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import ue.b;
import ue.c;
import ue.e;

/* JADX INFO: compiled from: EnumAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a<E extends e> extends ProtoAdapter<E> {
    public a(Class<E> cls) {
        super(FieldEncoding.VARINT, cls);
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final E e(b bVar) throws IOException {
        int iL = bVar.l();
        E e10 = (E) u(iL);
        if (e10 != null) {
            return e10;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(iL, this.f53368b);
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void i(c cVar, E e10) throws IOException {
        cVar.q(e10.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final int l(E e10) {
        return c.i(e10.getValue());
    }

    public abstract E u(int i10);
}
