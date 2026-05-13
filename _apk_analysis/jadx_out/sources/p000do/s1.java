package p000do;

import bn.r;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
public class s1 extends JobSupport implements w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f59887d;

    public s1(@Nullable g gVar) {
        super(true);
        z0(gVar);
        this.f59887d = f1();
    }

    @Override // p000do.w
    public boolean b(@NotNull Throwable th2) {
        return F0(new y(th2, false, 2, null));
    }

    @Override // p000do.w
    public boolean complete() {
        return F0(r.f5635a);
    }

    public final boolean f1() {
        JobSupport jobSupportT;
        q qVarT0 = t0();
        r rVar = qVarT0 instanceof r ? (r) qVarT0 : null;
        if (rVar != null && (jobSupportT = rVar.t()) != null) {
            while (!jobSupportT.o0()) {
                q qVarT02 = jobSupportT.t0();
                r rVar2 = qVarT02 instanceof r ? (r) qVarT02 : null;
                if (rVar2 == null || (jobSupportT = rVar2.t()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean o0() {
        return this.f59887d;
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean q0() {
        return true;
    }
}
