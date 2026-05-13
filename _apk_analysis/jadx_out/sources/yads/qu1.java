package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class qu1 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f94154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lu2 f94155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l00 f94156d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu1(Context context, lu2 lu2Var, l00 l00Var) {
        super(0);
        this.f94154b = context;
        this.f94155c = lu2Var;
        this.f94156d = l00Var;
    }

    @Override // sn.a
    public final Object invoke() {
        Context context = this.f94154b;
        lu2 lu2Var = this.f94155c;
        l00 l00Var = this.f94156d;
        if (!new rl().a()) {
            iu3 iu3Var = (iu3) lu2Var;
            p000do.i.d(kotlinx.coroutines.d.a(p000do.j2.b(null, 1, null).plus(p000do.w0.b()).plus(new y10(iu3Var.a()))), null, null, new su1(context, iu3Var, null), 3, null);
            new yn3(new cj2()).a();
            Context applicationContext = context.getApplicationContext();
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            if (ub.a(applicationContext) && !d63.a() && !atomicBoolean.getAndSet(true)) {
                lc1.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
            }
            Object obj = ut1.f95782f;
            st1.a(lu2Var).a(context, l00Var);
        }
        return bn.r.f5635a;
    }
}
