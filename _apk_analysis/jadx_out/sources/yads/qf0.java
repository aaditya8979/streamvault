package yads;

import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class qf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f94025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sn.a f94026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sn.l f94027c;

    public qf0(Intent intent, sf0 sf0Var, tf0 tf0Var) {
        this.f94025a = intent;
        this.f94026b = sf0Var;
        this.f94027c = tf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf0)) {
            return false;
        }
        qf0 qf0Var = (qf0) obj;
        return tn.p.f(this.f94025a, qf0Var.f94025a) && tn.p.f(this.f94026b, qf0Var.f94026b) && tn.p.f(this.f94027c, qf0Var.f94027c);
    }

    public final int hashCode() {
        return this.f94027c.hashCode() + ((this.f94026b.hashCode() + (this.f94025a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DelegatedActivityLaunchInfo(pendingIntent=" + this.f94025a + ", onLaunchSucceed=" + this.f94026b + ", onLaunchFailed=" + this.f94027c + ")";
    }
}
