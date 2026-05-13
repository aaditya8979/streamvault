package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C5083ra extends D2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5158ua f67613b;

    public C5083ra(int i10) {
        this(i10, null);
    }

    public C5083ra(int i10, @Nullable InterfaceC5158ua interfaceC5158ua) {
        super(i10);
        this.f67613b = interfaceC5158ua;
    }

    @Override // io.appmetrica.analytics.impl.D2, io.appmetrica.analytics.impl.InterfaceC5158ua
    @NonNull
    public final Nn a(@Nullable List<Object> list) {
        int iB;
        int i10 = 0;
        if (list == null || (list.size() <= this.f65144a && this.f67613b == null)) {
            iB = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            iB = 0;
            int i11 = 0;
            for (Object obj : list) {
                if (i11 < this.f65144a) {
                    InterfaceC5158ua interfaceC5158ua = this.f67613b;
                    if (interfaceC5158ua != null) {
                        Nn nnA = interfaceC5158ua.a(obj);
                        Object obj2 = nnA.f65673a;
                        iB += nnA.f65674b.getBytesTruncated();
                        mo.a(obj, nnA.f65673a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i10++;
                    iB += b(obj);
                }
                i11++;
            }
            list = arrayList;
        }
        return new Nn(list, new C5003o4(i10, iB));
    }

    public int b(@Nullable Object obj) {
        return 0;
    }

    @Nullable
    @VisibleForTesting
    public final InterfaceC5158ua b() {
        return this.f67613b;
    }
}
