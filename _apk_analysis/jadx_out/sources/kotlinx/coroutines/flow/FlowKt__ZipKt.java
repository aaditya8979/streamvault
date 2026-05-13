package kotlinx.coroutines.flow;

import bn.r;
import go.d;
import go.e;
import go.f;
import hn.c;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import sn.q;

/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class FlowKt__ZipKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    public static final class a<R> implements d<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f73369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f73370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q f73371d;

        public a(d dVar, d dVar2, q qVar) {
            this.f73369b = dVar;
            this.f73370c = dVar2;
            this.f73371d = qVar;
        }

        @Override // go.d
        public Object collect(e<? super R> eVar, c<? super r> cVar) {
            Object objA = CombineKt.a(eVar, new d[]{this.f73369b, this.f73370c}, FlowKt__ZipKt.d(), new FlowKt__ZipKt$combine$1$1(this.f73371d, null), cVar);
            return objA == in.a.g() ? objA : r.f5635a;
        }
    }

    /* JADX INFO: compiled from: Zip.kt */
    public static final class b implements sn.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f73372b = new b();

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    @NotNull
    public static final <T1, T2, R> d<R> b(@NotNull d<? extends T1> dVar, @NotNull d<? extends T2> dVar2, @NotNull q<? super T1, ? super T2, ? super c<? super R>, ? extends Object> qVar) {
        return f.A(dVar, dVar2, qVar);
    }

    @NotNull
    public static final <T1, T2, R> d<R> c(@NotNull d<? extends T1> dVar, @NotNull d<? extends T2> dVar2, @NotNull q<? super T1, ? super T2, ? super c<? super R>, ? extends Object> qVar) {
        return new a(dVar, dVar2, qVar);
    }

    public static final <T> sn.a<T[]> d() {
        return b.f73372b;
    }
}
