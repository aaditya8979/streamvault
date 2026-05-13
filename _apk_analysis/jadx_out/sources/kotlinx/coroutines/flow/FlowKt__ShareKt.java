package kotlinx.coroutines.flow;

import bn.r;
import go.e;
import go.k;
import go.l;
import go.m;
import go.n;
import go.p;
import go.q;
import go.s;
import go.u;
import go.v;
import hn.c;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import p000do.l0;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class FlowKt__ShareKt {
    @NotNull
    public static final <T> p<T> a(@NotNull k<T> kVar) {
        return new m(kVar, null);
    }

    @NotNull
    public static final <T> u<T> b(@NotNull l<T> lVar) {
        return new n(lVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> go.s<T> c(go.d<? extends T> r7, int r8) {
        /*
            fo.d$a r0 = fo.d.E8
            int r0 = r0.a()
            int r0 = zn.n.e(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.ChannelFlow
            if (r1 == 0) goto L3d
            r1 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r1 = (kotlinx.coroutines.flow.internal.ChannelFlow) r1
            go.d r2 = r1.j()
            if (r2 == 0) goto L3d
            go.s r7 = new go.s
            int r3 = r1.f73402c
            r4 = -3
            r5 = 0
            if (r3 == r4) goto L27
            r4 = -2
            if (r3 == r4) goto L27
            if (r3 == 0) goto L27
            r0 = r3
            goto L35
        L27:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.f73403d
            kotlinx.coroutines.channels.BufferOverflow r6 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 != r6) goto L30
            if (r3 != 0) goto L35
            goto L34
        L30:
            if (r8 != 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = r5
        L35:
            kotlinx.coroutines.channels.BufferOverflow r8 = r1.f73403d
            kotlin.coroutines.d r1 = r1.f73401b
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3d:
            go.s r8 = new go.s
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt.c(go.d, int):go.s");
    }

    public static final <T> g d(l0 l0Var, d dVar, go.d<? extends T> dVar2, k<T> kVar, a aVar, T t10) {
        return p000do.g.c(l0Var, dVar, tn.p.f(aVar, a.f73397a.c()) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(aVar, dVar2, kVar, t10, null));
    }

    @NotNull
    public static final <T> p<T> e(@NotNull p<? extends T> pVar, @NotNull sn.p<? super e<? super T>, ? super c<? super r>, ? extends Object> pVar2) {
        return new SubscribedSharedFlow(pVar, pVar2);
    }

    @NotNull
    public static final <T> p<T> f(@NotNull go.d<? extends T> dVar, @NotNull l0 l0Var, @NotNull a aVar, int i10) {
        s sVarC = c(dVar, i10);
        k kVarA = q.a(i10, sVarC.f62659b, sVarC.f62660c);
        return new m(kVarA, d(l0Var, sVarC.f62661d, sVarC.f62658a, kVarA, aVar, q.f62655a));
    }

    @NotNull
    public static final <T> u<T> g(@NotNull go.d<? extends T> dVar, @NotNull l0 l0Var, @NotNull a aVar, T t10) {
        s sVarC = c(dVar, 1);
        l lVarA = v.a(t10);
        return new n(lVarA, d(l0Var, sVarC.f62661d, sVarC.f62658a, lVarA, aVar, t10));
    }
}
