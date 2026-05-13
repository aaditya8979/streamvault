package androidx.compose.runtime;

import bn.r;
import hn.c;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R3\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/LaunchedEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "Lbn/r;", "onRemembered", "onForgotten", "onAbandoned", "Lkotlin/Function2;", "Ldo/l0;", "Lhn/c;", "", "task", "Lsn/p;", "scope", "Ldo/l0;", "Lkotlinx/coroutines/g;", "job", "Lkotlinx/coroutines/g;", "Lkotlin/coroutines/d;", "parentCoroutineContext", "<init>", "(Lkotlin/coroutines/d;Lsn/p;)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class LaunchedEffectImpl implements RememberObserver {

    @Nullable
    private g job;

    @NotNull
    private final l0 scope;

    @NotNull
    private final p<l0, c<? super r>, Object> task;

    /* JADX WARN: Multi-variable type inference failed */
    public LaunchedEffectImpl(@NotNull d dVar, @NotNull p<? super l0, ? super c<? super r>, ? extends Object> pVar) {
        tn.p.k(dVar, "parentCoroutineContext");
        tn.p.k(pVar, "task");
        this.task = pVar;
        this.scope = kotlinx.coroutines.d.a(dVar);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        g gVar = this.job;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        g gVar = this.job;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        g gVar = this.job;
        if (gVar != null) {
            JobKt__JobKt.f(gVar, "Old job was still running!", null, 2, null);
        }
        this.job = i.d(this.scope, null, null, this.task, 3, null);
    }
}
