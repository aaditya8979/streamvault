package kotlinx.coroutines.flow;

import bn.r;
import fo.m;
import go.d;
import go.e;
import go.o;
import hn.c;
import org.jetbrains.annotations.NotNull;
import sn.p;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class FlowKt__BuildersKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    public static final class a<T> implements d<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f73328b;

        public a(Object obj) {
            this.f73328b = obj;
        }

        @Override // go.d
        public Object collect(e<? super T> eVar, c<? super r> cVar) {
            Object objEmit = eVar.emit((Object) this.f73328b, cVar);
            return objEmit == in.a.g() ? objEmit : r.f5635a;
        }
    }

    @NotNull
    public static final <T> d<T> a(@NotNull Iterable<? extends T> iterable) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(iterable);
    }

    @NotNull
    public static final <T> d<T> b(@NotNull p<? super m<? super T>, ? super c<? super r>, ? extends Object> pVar) {
        return new CallbackFlowBuilder(pVar, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> d<T> c(@NotNull p<? super m<? super T>, ? super c<? super r>, ? extends Object> pVar) {
        return new go.c(pVar, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> d<T> d(@NotNull p<? super e<? super T>, ? super c<? super r>, ? extends Object> pVar) {
        return new o(pVar);
    }

    @NotNull
    public static final <T> d<T> e(T t10) {
        return new a(t10);
    }
}
