package zk;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HttpCallValidator.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<sn.p<dl.c, hn.c<? super bn.r>, Object>> f98305a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<i> f98306b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f98307c = true;

    public final boolean a() {
        return this.f98307c;
    }

    @NotNull
    public final List<i> b() {
        return this.f98306b;
    }

    @NotNull
    public final List<sn.p<dl.c, hn.c<? super bn.r>, Object>> c() {
        return this.f98305a;
    }

    public final void d(boolean z10) {
        this.f98307c = z10;
    }

    public final void e(@NotNull sn.p<? super dl.c, ? super hn.c<? super bn.r>, ? extends Object> pVar) {
        tn.p.k(pVar, "block");
        this.f98305a.add(pVar);
    }
}
