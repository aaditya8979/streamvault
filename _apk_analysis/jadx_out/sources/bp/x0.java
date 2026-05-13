package bp;

import android.content.Context;
import com.yk.e.inf.IComCallback;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f5888a;

    public x0(d1 d1Var) {
        this.f5888a = d1Var;
    }

    @Override // bp.i1
    public final void b() {
        q1 q1Var = this.f5888a.f5750a;
        a1 a1Var = q1Var.f5863e;
        Context context = q1Var.f5861c;
        String str = q1Var.f5860b;
        JSONArray jSONArray = q1Var.f5859a;
        IComCallback iComCallback = q1Var.f5862d;
        a1Var.getClass();
        new Thread(new r1(new n(context, new q1(a1Var, jSONArray, str, context, iComCallback)))).start();
    }
}
