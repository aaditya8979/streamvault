package lo;

import bn.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.q;
import tn.i;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class d<Q> implements c<Q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Object f73880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final q<Object, f<?>, Object, r> f73881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final q<Object, Object, Object, Object> f73882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final q<f<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.d, r>> f73883d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull Object obj, @NotNull q<Object, ? super f<?>, Object, r> qVar, @NotNull q<Object, Object, Object, ? extends Object> qVar2, @Nullable q<? super f<?>, Object, Object, ? extends q<? super Throwable, Object, ? super kotlin.coroutines.d, r>> qVar3) {
        this.f73880a = obj;
        this.f73881b = qVar;
        this.f73882c = qVar2;
        this.f73883d = qVar3;
    }

    public /* synthetic */ d(Object obj, q qVar, q qVar2, q qVar3, int i10, i iVar) {
        this(obj, qVar, qVar2, (i10 & 8) != 0 ? null : qVar3);
    }

    @Override // lo.e
    @Nullable
    public q<f<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.d, r>> a() {
        return this.f73883d;
    }

    @Override // lo.e
    @NotNull
    public q<Object, Object, Object, Object> b() {
        return this.f73882c;
    }

    @Override // lo.e
    @NotNull
    public q<Object, f<?>, Object, r> c() {
        return this.f73881b;
    }

    @Override // lo.e
    @NotNull
    public Object d() {
        return this.f73880a;
    }
}
