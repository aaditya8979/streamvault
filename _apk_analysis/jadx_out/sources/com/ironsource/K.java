package com.ironsource;

import com.ironsource.C4208q0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<I> f29698b = new CopyOnWriteArrayList();

    public K(int i10) {
        this.f29697a = i10;
    }

    private final boolean a() {
        return c() && this.f29698b.size() >= this.f29697a;
    }

    private final boolean b() {
        return this.f29697a == 0;
    }

    private final boolean c() {
        return this.f29697a != -1;
    }

    public final void a(@Nullable I i10) {
        if (b()) {
            return;
        }
        if (a()) {
            cn.b0.Q(this.f29698b);
        }
        if (i10 == null) {
            i10 = new I(C4208q0.a.NotPartOfWaterfall);
        }
        this.f29698b.add(i10);
    }

    @NotNull
    public final String d() {
        List<I> list = this.f29698b;
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((I) it.next()).b().ordinal()));
        }
        return cn.f0.D0(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }
}
