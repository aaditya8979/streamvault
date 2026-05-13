package yads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class qu3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x92 f94159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f94160b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f94161c = new ArrayList();

    public qu3(Context context) {
        this.f94159a = x92.f96680g.a(context);
    }

    public final void a(ld3 ld3Var) {
        synchronized (this.f94160b) {
            this.f94161c.add(ld3Var);
            this.f94159a.b(ld3Var);
            bn.r rVar = bn.r.f5635a;
        }
    }
}
