package p000do;

import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u1 extends LockFreeLinkedListNode implements y0, o1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public JobSupport f59890e;

    @Override // p000do.o1
    @Nullable
    public z1 b() {
        return null;
    }

    @Override // p000do.y0
    public void dispose() {
        t().T0(this);
    }

    @Override // p000do.o1
    public boolean isActive() {
        return true;
    }

    @NotNull
    public final JobSupport t() {
        JobSupport jobSupport = this.f59890e;
        if (jobSupport != null) {
            return jobSupport;
        }
        p.C("job");
        return null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        return m0.a(this) + '@' + m0.b(this) + "[job@" + m0.b(t()) + ']';
    }

    public abstract boolean u();

    public abstract void v(@Nullable Throwable th2);

    public final void w(@NotNull JobSupport jobSupport) {
        this.f59890e = jobSupport;
    }
}
