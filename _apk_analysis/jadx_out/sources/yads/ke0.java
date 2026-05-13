package yads;

import android.content.Context;
import java.util.List;
import kotlin.Pair;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes10.dex */
public final class ke0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f91580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z52 f91581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d72 f91582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f91583d;

    public /* synthetic */ ke0(Context context, w5 w5Var) {
        this(w5Var, new z52(context), new d72());
    }

    public ke0(w5 w5Var, z52 z52Var, d72 d72Var) {
        this.f91580a = w5Var;
        this.f91581b = z52Var;
        this.f91582c = d72Var;
        this.f91583d = new Object();
    }

    public final void a(String str) {
        mj0 mj0Var;
        synchronized (this.f91583d) {
            z52 z52Var = this.f91581b;
            if (z52Var.f97406b.containsKey(str) && (mj0Var = z52Var.f97405a) != null) {
                mj0Var.f92370c++;
                mj0Var.f92368a.obtainMessage(3, 1, 0, str).sendToTarget();
            }
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final void a(ry1 ry1Var, g62 g62Var, z30 z30Var) {
        synchronized (this.f91583d) {
            d12 d12Var = ry1Var.f94647a;
            d72 d72Var = this.f91582c;
            d72Var.getClass();
            List<Pair> listU = SequencesKt___SequencesKt.U(SequencesKt___SequencesKt.K(SequencesKt___SequencesKt.K(SequencesKt___SequencesKt.L(SequencesKt___SequencesKt.E(cn.f0.g0(d12Var.f88690a), new a72(d72Var)), b72.f87933b), y62.f97013b), z62.f97411b));
            if (listU.isEmpty()) {
                g62Var.a();
                return;
            }
            je0 je0Var = new je0(this.f91580a, listU.size(), g62Var, z30Var);
            this.f91580a.a(v5.f95937p, null);
            for (Pair pair : listU) {
                this.f91581b.a((String) pair.component1(), je0Var, (String) pair.component2());
            }
            bn.r rVar = bn.r.f5635a;
        }
    }
}
