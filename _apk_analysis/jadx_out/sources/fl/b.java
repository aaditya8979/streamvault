package fl;

import bn.d;
import bn.r;
import ol.c;
import org.jetbrains.annotations.NotNull;
import p000do.y0;
import sn.l;
import tn.p;
import tn.y;

/* JADX INFO: compiled from: Events.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ml.b<fl.a<?>, ol.a> f61753a = new ml.b<>();

    /* JADX INFO: compiled from: Events.kt */
    public static final class a extends c implements y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final l<?, r> f61754e;

        @Override // p000do.y0
        public void dispose() {
            i();
        }

        @NotNull
        public final l<?, r> k() {
            return this.f61754e;
        }
    }

    public final <T> void a(@NotNull fl.a<T> aVar, T t10) {
        p.k(aVar, "definition");
        ol.a aVarA = this.f61753a.a(aVar);
        Throwable th2 = null;
        if (aVarA != null) {
            Object objE = aVarA.e();
            p.i(objE, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            for (c cVarF = (c) objE; !p.f(cVarF, aVarA); cVarF = cVarF.f()) {
                if (cVarF instanceof a) {
                    try {
                        l<?, r> lVarK = ((a) cVarF).k();
                        p.i(lVarK, "null cannot be cast to non-null type kotlin.Function1<T of io.ktor.events.Events.raise, kotlin.Unit>");
                        ((l) y.e(lVarK, 1)).invoke(t10);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            d.a(th2, th3);
                        } else {
                            th2 = th3;
                        }
                    }
                }
            }
        }
        if (th2 != null) {
            throw th2;
        }
    }
}
