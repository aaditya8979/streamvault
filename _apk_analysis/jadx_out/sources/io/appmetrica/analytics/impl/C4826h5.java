package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4826h5 implements Co {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f66891a;

    public C4826h5(@NotNull List<? extends Pair<String, ? extends Co>> list) {
        this.f66891a = list;
    }

    @Override // io.appmetrica.analytics.impl.Co
    @Nullable
    public final String a() {
        Iterator it = this.f66891a.iterator();
        while (it.hasNext()) {
            String strA = ((Co) ((Pair) it.next()).getSecond()).a();
            if (strA != null && strA.length() > 0) {
                return strA;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final void a(@NotNull String str) {
        Iterator it = this.f66891a.iterator();
        while (it.hasNext()) {
            ((Co) ((Pair) it.next()).getSecond()).a(str);
        }
    }
}
