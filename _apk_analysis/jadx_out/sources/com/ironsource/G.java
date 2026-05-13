package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f29339c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC4309w0 f29340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final yg f29341b;

    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.G$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0364a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f29342a;

            static {
                int[] iArr = new int[Cg.values().length];
                try {
                    iArr[Cg.BIDDER_SENSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Cg.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f29342a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final G a(@NotNull AbstractC4309w0 abstractC4309w0, @NotNull yg ygVar) {
            tn.p.k(abstractC4309w0, "adUnitData");
            tn.p.k(ygVar, "waterfallInstances");
            int i10 = C0364a.f29342a[(abstractC4309w0.d() ? Cg.BIDDER_SENSITIVE : Cg.DEFAULT).ordinal()];
            if (i10 == 1) {
                return new C4295v3(abstractC4309w0, ygVar);
            }
            if (i10 == 2) {
                return abstractC4309w0.q() ? new C4206pf(abstractC4309w0, ygVar) : new K4(abstractC4309w0, ygVar);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<A> f29343a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<A> f29344b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<A> f29345c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f29346d;

        @NotNull
        public final List<A> a() {
            return this.f29343a;
        }

        public final void a(boolean z10) {
            this.f29346d = z10;
        }

        @NotNull
        public final List<A> b() {
            return this.f29344b;
        }

        @NotNull
        public final List<A> c() {
            return this.f29345c;
        }

        public final boolean d() {
            return this.f29346d;
        }

        public final boolean e() {
            return g() == 0;
        }

        public final boolean f() {
            return this.f29343a.isEmpty() && this.f29345c.isEmpty();
        }

        public final int g() {
            return this.f29343a.size() + this.f29344b.size() + this.f29345c.size();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final A f29347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<A> f29348b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@Nullable A a10, @NotNull List<? extends A> list) {
            tn.p.k(list, "orderedInstances");
            this.f29347a = a10;
            this.f29348b = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, A a10, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                a10 = cVar.f29347a;
            }
            if ((i10 & 2) != 0) {
                list = cVar.f29348b;
            }
            return cVar.a(a10, list);
        }

        @Nullable
        public final A a() {
            return this.f29347a;
        }

        @NotNull
        public final c a(@Nullable A a10, @NotNull List<? extends A> list) {
            tn.p.k(list, "orderedInstances");
            return new c(a10, list);
        }

        @NotNull
        public final List<A> b() {
            return this.f29348b;
        }

        @Nullable
        public final A c() {
            return this.f29347a;
        }

        @NotNull
        public final List<A> d() {
            return this.f29348b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return tn.p.f(this.f29347a, cVar.f29347a) && tn.p.f(this.f29348b, cVar.f29348b);
        }

        public int hashCode() {
            A a10 = this.f29347a;
            return ((a10 == null ? 0 : a10.hashCode()) * 31) + this.f29348b.hashCode();
        }

        @NotNull
        public String toString() {
            return "ShowSelection(instanceToShow=" + this.f29347a + ", orderedInstances=" + this.f29348b + ")";
        }
    }

    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return fn.b.d(Integer.valueOf(((A) t10).h().l()), Integer.valueOf(((A) t11).h().l()));
        }
    }

    public G(@NotNull AbstractC4309w0 abstractC4309w0, @NotNull yg ygVar) {
        tn.p.k(abstractC4309w0, "adUnitData");
        tn.p.k(ygVar, "waterfallInstances");
        this.f29340a = abstractC4309w0;
        this.f29341b = ygVar;
    }

    private final List<A> b() {
        return cn.f0.X0(this.f29341b.b(), new d());
    }

    private final boolean b(A a10, b bVar) {
        if (a10.v()) {
            IronLog.INTERNAL.verbose(a10.d().name() + " - Instance " + a10.q() + " is failed to load");
        } else if (a10.w()) {
            IronLog.INTERNAL.verbose(a10.d().name() + " - Instance " + a10.q() + " is already loaded");
            bVar.b().add(a10);
        } else if (a10.x()) {
            IronLog.INTERNAL.verbose(a10.d().name() + " - Instance " + a10.q() + " still loading");
            bVar.c().add(a10);
        } else if (a(a10, this.f29341b)) {
            IronLog.INTERNAL.verbose(a10.d().name() + " - Instance " + a10.q() + " is not better than already loaded instances");
        } else {
            a(a10, bVar);
        }
        return a(bVar);
    }

    public abstract void a(@NotNull A a10, @NotNull b bVar);

    public final boolean a() {
        int i10;
        List<A> listB = this.f29341b.b();
        if ((listB instanceof Collection) && listB.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = listB.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((A) it.next()).w() && (i10 = i10 + 1) < 0) {
                    cn.w.v();
                }
            }
        }
        return i10 >= this.f29340a.k();
    }

    public final boolean a(@NotNull A a10) {
        Object next;
        tn.p.k(a10, C4157n2.f33007p);
        Iterator<T> it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!((A) next).v()) {
                break;
            }
        }
        return tn.p.f(next, a10);
    }

    public boolean a(@NotNull A a10, @NotNull yg ygVar) {
        tn.p.k(a10, C4157n2.f33007p);
        tn.p.k(ygVar, "waterfallInstances");
        return false;
    }

    public boolean a(@NotNull b bVar) {
        tn.p.k(bVar, "loadSelection");
        return bVar.g() >= this.f29340a.k();
    }

    @NotNull
    public final c c() {
        Object next;
        List<A> listB = b();
        Iterator<T> it = listB.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((A) next).w()) {
                break;
            }
        }
        return new c((A) next, listB);
    }

    @NotNull
    public final b d() {
        IronLog.INTERNAL.verbose(this.f29340a.b().a().name() + " waterfall size: " + this.f29341b.b().size());
        b bVar = new b();
        Iterator<A> it = this.f29341b.b().iterator();
        while (it.hasNext() && !b(it.next(), bVar)) {
        }
        return bVar;
    }
}
