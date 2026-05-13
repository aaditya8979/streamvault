package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class c41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k41 f88335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u82 f88336b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c41(Context context) {
        w82 w82VarA = w82.f96306d.a(context);
        this(w82VarA.b(), w82VarA.c());
    }

    public c41(k41 k41Var, u82 u82Var) {
        this.f88335a = k41Var;
        this.f88336b = u82Var;
    }

    public final void a(Set set, d51 d51Var) {
        if (set.isEmpty()) {
            d51Var.a(kotlin.collections.a.j());
        } else {
            new y31(this.f88335a, set, d51Var, new Handler(Looper.getMainLooper()), new AtomicInteger(set.size()), new js1()).a();
        }
    }
}
