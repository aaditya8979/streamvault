package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import yads.z82;

/* JADX INFO: loaded from: classes2.dex */
public final class z82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vq1 f97423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f97424b;

    public z82(vq1 vq1Var) {
        this.f97423a = vq1Var;
        this.f97424b = new Object();
    }

    public /* synthetic */ z82(xo1 xo1Var) {
        this(new vq1(xo1Var));
    }

    public static final void a(z82 z82Var, CountDownLatch countDownLatch, ArrayList arrayList, JSONObject jSONObject) {
        if (jSONObject != null) {
            synchronized (z82Var.f97424b) {
                arrayList.add(jSONObject);
            }
        }
        countDownLatch.countDown();
    }

    public final Object a(Context context, a03 a03Var, List list, hn.c cVar) {
        final ArrayList arrayList = new ArrayList(list.size());
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        ep epVar = new ep();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f97423a.a(context, a03Var, (qq1) it.next(), epVar, new tq1() { // from class: bt.wc
                @Override // yads.tq1
                public final void a(JSONObject jSONObject) {
                    z82.a(this.f6379a, countDownLatch, arrayList, jSONObject);
                }
            });
        }
        return p000do.g.g(p000do.w0.b(), new y82(this, countDownLatch, arrayList, epVar, null), cVar);
    }
}
