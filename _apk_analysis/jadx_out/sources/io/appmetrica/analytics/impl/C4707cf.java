package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4707cf implements InterfaceC4716co {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f66530a;

    public C4707cf(@NotNull C4758ef c4758ef) {
        boolean z10;
        List<C4733df> list = c4758ef.f66684b;
        if ((list instanceof Collection) && list.isEmpty()) {
            z10 = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C4733df) it.next()).f66610c == T7.f65926c) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
        }
        this.f66530a = z10;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4716co, sn.p
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C4733df> mo2invoke(@NotNull List<? extends C4733df> list, @NotNull C5088rf c5088rf) {
        C4733df c4733df = new C4733df(c5088rf.f67617a, c5088rf.f67618b, c5088rf.f67621e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C4733df) it.next()).f66610c == c5088rf.f67621e) {
                    if (c4733df.f66610c == T7.f65926c && this.f66530a) {
                        return cn.f0.P0(list, c4733df);
                    }
                    return null;
                }
            }
        }
        return cn.f0.P0(list, c4733df);
    }
}
