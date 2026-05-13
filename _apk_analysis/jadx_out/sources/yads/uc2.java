package yads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class uc2 {
    public final wc2 a(Context context) {
        wc2 wc2Var = wc2.f96341i;
        if (wc2Var == null) {
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                Object obj = og1.f93212d;
                Executor executorA = ng1.a().a();
                wc2 wc2Var2 = wc2.f96341i;
                if (wc2Var2 == null) {
                    Object obj2 = dw2.f89000j;
                    wc2Var2 = new wc2(applicationContext, executorA, cw2.a(), new tc2(applicationContext.getApplicationContext()), new sc2());
                    wc2.f96341i = wc2Var2;
                }
                wc2Var = wc2Var2;
            }
        }
        return wc2Var;
    }
}
