package com.ironsource;

import com.ironsource.AbstractC4211q3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Lg<Smash extends AbstractC4211q3<?>> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f29811g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<Smash> f29814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<Smash> f29815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<Smash> f29816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<Smash> f29817f;

    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.Lg$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0366a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f29818a;

            static {
                int[] iArr = new int[Cg.values().length];
                try {
                    iArr[Cg.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Cg.BIDDER_SENSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f29818a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final <Smash extends AbstractC4211q3<?>> Lg<Smash> a(@NotNull Cg cg2, int i10, boolean z10, @NotNull List<? extends Smash> list) {
            tn.p.k(cg2, "loadingStrategy");
            tn.p.k(list, com.ironsource.mediationsdk.d.f32393h);
            int i11 = C0366a.f29818a[cg2.ordinal()];
            if (i11 == 1) {
                return new N4(i10, z10, list);
            }
            if (i11 == 2) {
                return new C4312w3(i10, z10, list, false, 8, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Lg(int i10, boolean z10, @NotNull List<? extends Smash> list) {
        tn.p.k(list, com.ironsource.mediationsdk.d.f32393h);
        this.f29812a = i10;
        this.f29813b = z10;
        this.f29814c = list;
        this.f29815d = new ArrayList();
        this.f29816e = new ArrayList();
        this.f29817f = new ArrayList();
    }

    private final int a(Smash smash) {
        return smash.i().l();
    }

    private final int b() {
        Integer num;
        List<Smash> list = this.f29814c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractC4211q3) obj).y()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(a((AbstractC4211q3) it.next()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(a((AbstractC4211q3) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    private final boolean b(Smash smash) {
        return b() < a(smash);
    }

    @NotNull
    public final List<Smash> a() {
        return this.f29817f;
    }

    @NotNull
    public final List<Smash> c() {
        return this.f29815d;
    }

    public abstract void c(@NotNull Smash smash);

    public final int d() {
        return this.f29815d.size() + this.f29816e.size() + this.f29817f.size();
    }

    public final void d(@NotNull Smash smash) {
        tn.p.k(smash, "smash");
        if (smash.x()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - smash " + smash.k() + " is failed to load");
            return;
        }
        if (smash.y()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is already loaded");
            this.f29816e.add(smash);
            return;
        }
        if (smash.z()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " still loading");
            this.f29817f.add(smash);
            return;
        }
        if (smash.A().get()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " marked as loading candidate");
            this.f29817f.add(smash);
            return;
        }
        if (!this.f29813b || !b(smash)) {
            c(smash);
            return;
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is not better than already loaded smashes");
    }

    public boolean e() {
        return d() >= this.f29812a;
    }
}
