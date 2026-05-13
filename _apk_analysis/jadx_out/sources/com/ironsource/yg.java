package com.ironsource;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class yg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<A> f34470a;

    /* JADX WARN: Multi-variable type inference failed */
    public yg(@NotNull List<? extends A> list) {
        tn.p.k(list, com.ironsource.mediationsdk.d.f32396k);
        this.f34470a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ yg a(yg ygVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = ygVar.f34470a;
        }
        return ygVar.a(list);
    }

    private final String a(C4157n2 c4157n2, int i10) {
        tn.x xVar = tn.x.f85368a;
        String str = String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i10), c4157n2.c()}, 2));
        tn.p.j(str, "format(format, *args)");
        return str;
    }

    @NotNull
    public final yg a(@NotNull List<? extends A> list) {
        tn.p.k(list, com.ironsource.mediationsdk.d.f32396k);
        return new yg(list);
    }

    @NotNull
    public final List<A> a() {
        return this.f34470a;
    }

    @NotNull
    public final List<A> b() {
        return this.f34470a;
    }

    public final int c() {
        return this.f34470a.size();
    }

    @NotNull
    public final String d() {
        ArrayList arrayList = new ArrayList();
        for (A a10 : this.f34470a) {
            arrayList.add(a(a10.h(), a10.r()));
        }
        return cn.f0.D0(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg) && tn.p.f(this.f34470a, ((yg) obj).f34470a);
    }

    public int hashCode() {
        return this.f34470a.hashCode();
    }

    @NotNull
    public String toString() {
        return "WaterfallInstances(instances=" + this.f34470a + ")";
    }
}
