package com.ironsource;

import com.ironsource.AbstractC4211q3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class Fg<Smash extends AbstractC4211q3<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final V f29338a;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return fn.b.d(Integer.valueOf(((AbstractC4211q3) t10).i().l()), Integer.valueOf(((AbstractC4211q3) t11).i().l()));
        }
    }

    public Fg(@NotNull V v10) {
        tn.p.k(v10, "managerData");
        this.f29338a = v10;
    }

    public final boolean a(@NotNull AbstractC4211q3<?> abstractC4211q3, @NotNull List<? extends Smash> list) {
        Object next;
        tn.p.k(abstractC4211q3, "smash");
        tn.p.k(list, com.ironsource.mediationsdk.d.f32393h);
        Iterator<T> it = b(list).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!((AbstractC4211q3) next).x()) {
                break;
            }
        }
        return tn.p.f(next, abstractC4211q3);
    }

    public final boolean a(@NotNull List<? extends Smash> list) {
        int i10;
        tn.p.k(list, com.ironsource.mediationsdk.d.f32393h);
        if ((list instanceof Collection) && list.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = list.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((AbstractC4211q3) it.next()).y() && (i10 = i10 + 1) < 0) {
                    cn.w.v();
                }
            }
        }
        return i10 >= this.f29338a.i();
    }

    @NotNull
    public final List<Smash> b(@NotNull List<? extends Smash> list) {
        tn.p.k(list, com.ironsource.mediationsdk.d.f32393h);
        return cn.f0.X0(list, new a());
    }

    @Nullable
    public final Smash c(@NotNull List<? extends Smash> list) {
        Object next;
        tn.p.k(list, com.ironsource.mediationsdk.d.f32393h);
        Iterator<T> it = b(list).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC4211q3) next).B()) {
                break;
            }
        }
        return (Smash) next;
    }

    @NotNull
    public final Gg<Smash> d(@NotNull List<? extends Smash> list) {
        tn.p.k(list, com.ironsource.mediationsdk.d.f32393h);
        IronLog.INTERNAL.verbose(this.f29338a.b().name() + " waterfall size: " + list.size());
        Lg<Smash> lgA = Lg.f29811g.a(this.f29338a.c() ? Cg.BIDDER_SENSITIVE : Cg.DEFAULT, this.f29338a.i(), this.f29338a.m(), list);
        Iterator<? extends Smash> it = list.iterator();
        while (it.hasNext()) {
            lgA.d(it.next());
            if (lgA.e()) {
                return new Gg<>(lgA);
            }
        }
        return new Gg<>(lgA);
    }
}
