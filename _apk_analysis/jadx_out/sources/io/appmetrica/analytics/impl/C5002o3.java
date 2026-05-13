package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C5002o3 implements InterfaceC4716co {
    @Override // io.appmetrica.analytics.impl.InterfaceC4716co, sn.p
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C5101s3> mo2invoke(@NotNull List<C5101s3> list, @NotNull C5101s3 c5101s3) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                T7 t72 = ((C5101s3) it.next()).f67661b;
                T7 t73 = c5101s3.f67661b;
                if (t72 == t73) {
                    if (t73 != T7.f65926c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C5101s3) obj).f67661b != T7.f65926c) {
                            arrayList.add(obj);
                        }
                    }
                    return cn.f0.P0(arrayList, c5101s3);
                }
            }
        }
        return cn.f0.P0(list, c5101s3);
    }
}
