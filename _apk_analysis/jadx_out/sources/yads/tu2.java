package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class tu2 implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final CopyOnWriteArrayList f95356f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f95357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p000do.l0 f95358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ut1 f95359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f95360e;

    public tu2(Context context, iu3 iu3Var, p000do.l0 l0Var, ut1 ut1Var) {
        this.f95357b = iu3Var;
        this.f95358c = l0Var;
        this.f95359d = ut1Var;
        this.f95360e = context.getApplicationContext();
    }

    @Override // java.lang.Runnable
    public final void run() {
        zu2 zu2Var = new zu2(this.f95360e, this.f95357b, this.f95358c, new w5(), null, null, 2097136);
        f95356f.add(zu2Var);
        p000do.i.d(this.f95358c, null, null, new su2(zu2Var, this, null), 3, null);
    }
}
