package lo;

import bn.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.q;
import tn.i;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Object f73876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final q<Object, f<?>, Object, r> f73877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final q<f<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.d, r>> f73878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final q<Object, Object, Object, Object> f73879d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Object obj, @NotNull q<Object, ? super f<?>, Object, r> qVar, @Nullable q<? super f<?>, Object, Object, ? extends q<? super Throwable, Object, ? super kotlin.coroutines.d, r>> qVar2) {
        this.f73876a = obj;
        this.f73877b = qVar;
        this.f73878c = qVar2;
        this.f73879d = h.f73884a;
    }

    public /* synthetic */ b(Object obj, q qVar, q qVar2, int i10, i iVar) {
        this(obj, qVar, (i10 & 4) != 0 ? null : qVar2);
    }

    @Override // lo.e
    @Nullable
    public q<f<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.d, r>> a() {
        return this.f73878c;
    }

    @Override // lo.e
    @NotNull
    public q<Object, Object, Object, Object> b() {
        return this.f73879d;
    }

    @Override // lo.e
    @NotNull
    public q<Object, f<?>, Object, r> c() {
        return this.f73877b;
    }

    @Override // lo.e
    @NotNull
    public Object d() {
        return this.f73876a;
    }
}
