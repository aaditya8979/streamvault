package go;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt__BuildersKt;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import kotlinx.coroutines.flow.FlowKt__CollectKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    @NotNull
    public static final <T1, T2, R> d<R> A(@NotNull d<? extends T1> dVar, @NotNull d<? extends T2> dVar2, @NotNull sn.q<? super T1, ? super T2, ? super hn.c<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.c(dVar, dVar2, qVar);
    }

    @NotNull
    public static final <T> d<T> B(T t10) {
        return FlowKt__BuildersKt.e(t10);
    }

    @NotNull
    public static final <T> d<T> C(@NotNull d<? extends T> dVar, @NotNull kotlin.coroutines.d dVar2) {
        return g.f(dVar, dVar2);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.g D(@NotNull d<? extends T> dVar, @NotNull l0 l0Var) {
        return FlowKt__CollectKt.d(dVar, l0Var);
    }

    @NotNull
    public static final <T, R> d<R> E(@NotNull d<? extends T> dVar, @NotNull sn.p<? super T, ? super hn.c<? super R>, ? extends Object> pVar) {
        return FlowKt__MergeKt.a(dVar, pVar);
    }

    @NotNull
    public static final <T> d<T> F(@NotNull d<? extends T> dVar, @NotNull sn.q<? super e<? super T>, ? super Throwable, ? super hn.c<? super bn.r>, ? extends Object> qVar) {
        return FlowKt__EmittersKt.d(dVar, qVar);
    }

    @NotNull
    public static final <T> d<T> G(@NotNull d<? extends T> dVar, @NotNull sn.p<? super T, ? super hn.c<? super bn.r>, ? extends Object> pVar) {
        return FlowKt__TransformKt.b(dVar, pVar);
    }

    @NotNull
    public static final <T> d<T> H(@NotNull d<? extends T> dVar, @NotNull sn.p<? super e<? super T>, ? super hn.c<? super bn.r>, ? extends Object> pVar) {
        return FlowKt__EmittersKt.e(dVar, pVar);
    }

    @NotNull
    public static final <T> p<T> I(@NotNull p<? extends T> pVar, @NotNull sn.p<? super e<? super T>, ? super hn.c<? super bn.r>, ? extends Object> pVar2) {
        return FlowKt__ShareKt.e(pVar, pVar2);
    }

    @NotNull
    public static final <T> d<T> J(@NotNull fo.o<? extends T> oVar) {
        return FlowKt__ChannelsKt.e(oVar);
    }

    @NotNull
    public static final <T> p<T> K(@NotNull d<? extends T> dVar, @NotNull l0 l0Var, @NotNull kotlinx.coroutines.flow.a aVar, int i10) {
        return FlowKt__ShareKt.f(dVar, l0Var, aVar, i10);
    }

    @Nullable
    public static final <T> Object L(@NotNull d<? extends T> dVar, @NotNull hn.c<? super T> cVar) {
        return FlowKt__ReduceKt.e(dVar, cVar);
    }

    @NotNull
    public static final <T> u<T> M(@NotNull d<? extends T> dVar, @NotNull l0 l0Var, @NotNull kotlinx.coroutines.flow.a aVar, T t10) {
        return FlowKt__ShareKt.g(dVar, l0Var, aVar, t10);
    }

    @NotNull
    public static final <T> d<T> N(@NotNull d<? extends T> dVar, int i10) {
        return FlowKt__LimitKt.d(dVar, i10);
    }

    @NotNull
    public static final <T> d<T> O(@NotNull d<? extends T> dVar, @NotNull sn.p<? super T, ? super hn.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__LimitKt.e(dVar, pVar);
    }

    @NotNull
    public static final <T, R> d<R> P(@NotNull d<? extends T> dVar, @NotNull sn.q<? super e<? super R>, ? super T, ? super hn.c<? super bn.r>, ? extends Object> qVar) {
        return FlowKt__MergeKt.b(dVar, qVar);
    }

    @NotNull
    public static final <T, R> d<R> Q(@NotNull d<? extends T> dVar, @NotNull sn.q<? super e<? super R>, ? super T, ? super hn.c<? super Boolean>, ? extends Object> qVar) {
        return FlowKt__LimitKt.f(dVar, qVar);
    }

    @NotNull
    public static final <T> d<T> a(@NotNull Iterable<? extends T> iterable) {
        return FlowKt__BuildersKt.a(iterable);
    }

    @NotNull
    public static final <T> p<T> b(@NotNull k<T> kVar) {
        return FlowKt__ShareKt.a(kVar);
    }

    @NotNull
    public static final <T> u<T> c(@NotNull l<T> lVar) {
        return FlowKt__ShareKt.b(lVar);
    }

    @NotNull
    public static final <T> d<T> d(@NotNull d<? extends T> dVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        return g.a(dVar, i10, bufferOverflow);
    }

    @NotNull
    public static final <T> d<T> f(@NotNull sn.p<? super fo.m<? super T>, ? super hn.c<? super bn.r>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.b(pVar);
    }

    @NotNull
    public static final <T> d<T> g(@NotNull d<? extends T> dVar) {
        return g.c(dVar);
    }

    @NotNull
    public static final <T> d<T> h(@NotNull d<? extends T> dVar, @NotNull sn.q<? super e<? super T>, ? super Throwable, ? super hn.c<? super bn.r>, ? extends Object> qVar) {
        return FlowKt__ErrorsKt.a(dVar, qVar);
    }

    @Nullable
    public static final <T> Object i(@NotNull d<? extends T> dVar, @NotNull e<? super T> eVar, @NotNull hn.c<? super Throwable> cVar) {
        return FlowKt__ErrorsKt.b(dVar, eVar, cVar);
    }

    @NotNull
    public static final <T> d<T> j(@NotNull sn.p<? super fo.m<? super T>, ? super hn.c<? super bn.r>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.c(pVar);
    }

    @Nullable
    public static final Object k(@NotNull d<?> dVar, @NotNull hn.c<? super bn.r> cVar) {
        return FlowKt__CollectKt.a(dVar, cVar);
    }

    @Nullable
    public static final <T> Object l(@NotNull d<? extends T> dVar, @NotNull sn.p<? super T, ? super hn.c<? super bn.r>, ? extends Object> pVar, @NotNull hn.c<? super bn.r> cVar) {
        return FlowKt__CollectKt.b(dVar, pVar, cVar);
    }

    @NotNull
    public static final <T1, T2, R> d<R> m(@NotNull d<? extends T1> dVar, @NotNull d<? extends T2> dVar2, @NotNull sn.q<? super T1, ? super T2, ? super hn.c<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.b(dVar, dVar2, qVar);
    }

    @NotNull
    public static final <T> d<T> n(@NotNull d<? extends T> dVar) {
        return g.e(dVar);
    }

    @NotNull
    public static final <T> d<T> o(@NotNull fo.o<? extends T> oVar) {
        return FlowKt__ChannelsKt.b(oVar);
    }

    @NotNull
    public static final <T> d<T> p(@NotNull d<? extends T> dVar) {
        return j.e(dVar);
    }

    @NotNull
    public static final <T> d<T> q(@NotNull d<? extends T> dVar, @NotNull sn.p<? super T, ? super hn.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__LimitKt.b(dVar, pVar);
    }

    @Nullable
    public static final <T> Object r(@NotNull e<? super T> eVar, @NotNull fo.o<? extends T> oVar, @NotNull hn.c<? super bn.r> cVar) {
        return FlowKt__ChannelsKt.c(eVar, oVar, cVar);
    }

    @Nullable
    public static final <T> Object s(@NotNull e<? super T> eVar, @NotNull d<? extends T> dVar, @NotNull hn.c<? super bn.r> cVar) {
        return FlowKt__CollectKt.c(eVar, dVar, cVar);
    }

    public static final void t(@NotNull e<?> eVar) {
        FlowKt__EmittersKt.b(eVar);
    }

    @NotNull
    public static final <T> d<T> u(@NotNull d<? extends T> dVar) {
        return FlowKt__TransformKt.a(dVar);
    }

    @Nullable
    public static final <T> Object v(@NotNull d<? extends T> dVar, @NotNull hn.c<? super T> cVar) {
        return FlowKt__ReduceKt.a(dVar, cVar);
    }

    @Nullable
    public static final <T> Object w(@NotNull d<? extends T> dVar, @NotNull sn.p<? super T, ? super hn.c<? super Boolean>, ? extends Object> pVar, @NotNull hn.c<? super T> cVar) {
        return FlowKt__ReduceKt.b(dVar, pVar, cVar);
    }

    @Nullable
    public static final <T> Object x(@NotNull d<? extends T> dVar, @NotNull hn.c<? super T> cVar) {
        return FlowKt__ReduceKt.c(dVar, cVar);
    }

    @Nullable
    public static final <T> Object y(@NotNull d<? extends T> dVar, @NotNull sn.p<? super T, ? super hn.c<? super Boolean>, ? extends Object> pVar, @NotNull hn.c<? super T> cVar) {
        return FlowKt__ReduceKt.d(dVar, pVar, cVar);
    }

    @NotNull
    public static final <T> d<T> z(@NotNull sn.p<? super e<? super T>, ? super hn.c<? super bn.r>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.d(pVar);
    }
}
