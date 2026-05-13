package yads;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class z52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mj0 f97405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f97406b = new ConcurrentHashMap();

    public z52(Context context) {
        this.f97405a = ih3.b(context.getApplicationContext());
    }

    public final void a() {
        Iterator it = this.f97406b.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            mj0 mj0Var = this.f97405a;
            if (mj0Var != null) {
                mj0Var.f92370c++;
                mj0Var.f92368a.obtainMessage(7, str).sendToTarget();
            }
        }
        this.f97406b.clear();
    }

    public final void a(String str, zg3 zg3Var, String str2) {
        if (this.f97405a == null) {
            zg3Var.b();
            a();
            return;
        }
        Uri uri = Uri.parse(str);
        m51 m51Var = p51.f93439c;
        pj0 pj0Var = new pj0(str2, uri, null, sm2.f94878f, null, null, null);
        this.f97406b.put(str2, zg3Var);
        rn3 rn3Var = new rn3(str2, zg3Var);
        mj0 mj0Var = this.f97405a;
        mj0Var.getClass();
        mj0Var.f92369b.add(rn3Var);
        mj0 mj0Var2 = this.f97405a;
        mj0Var2.f92370c++;
        mj0Var2.f92368a.obtainMessage(6, 0, 0, pj0Var).sendToTarget();
        mj0 mj0Var3 = this.f97405a;
        if (mj0Var3.f92371d) {
            mj0Var3.f92371d = false;
            mj0Var3.f92370c++;
            mj0Var3.f92368a.obtainMessage(1, 0, 0).sendToTarget();
            boolean zA = mj0Var3.a();
            Iterator it = mj0Var3.f92369b.iterator();
            while (it.hasNext()) {
                ((kj0) it.next()).getClass();
            }
            if (zA) {
                Iterator it2 = mj0Var3.f92369b.iterator();
                while (it2.hasNext()) {
                    ((kj0) it2.next()).getClass();
                }
            }
        }
    }
}
