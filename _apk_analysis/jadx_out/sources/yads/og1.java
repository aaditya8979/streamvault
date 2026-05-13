package yads;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes11.dex */
public final class og1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f93212d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile og1 f93213e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ey1 f93214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f93215b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f93216c;

    public og1(ey1 ey1Var) {
        this.f93214a = ey1Var;
    }

    public final Executor a() {
        Executor executorNewSingleThreadExecutor;
        synchronized (f93212d) {
            if (this.f93215b.size() < 4) {
                executorNewSingleThreadExecutor = Executors.newSingleThreadExecutor(this.f93214a);
                this.f93215b.add(executorNewSingleThreadExecutor);
            } else {
                ArrayList arrayList = this.f93215b;
                int i10 = this.f93216c;
                this.f93216c = i10 + 1;
                executorNewSingleThreadExecutor = (Executor) arrayList.get(i10);
                if (this.f93216c == 4) {
                    this.f93216c = 0;
                }
            }
        }
        return executorNewSingleThreadExecutor;
    }
}
