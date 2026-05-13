package yads;

import android.content.Context;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class bt1 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb3 f88136b = pu3.f93787a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f88137c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt1(Context context) {
        super(0);
        this.f88137c = context;
    }

    @Override // sn.a
    public final Object invoke() {
        ou3 ou3Var;
        yb3 yb3Var = this.f88136b;
        Context context = this.f88137c;
        ((pu3) yb3Var).getClass();
        ou3 ou3Var2 = pu3.f93789c;
        if (ou3Var2 != null) {
            return ou3Var2;
        }
        synchronized (pu3.f93788b) {
            ou3Var = pu3.f93789c;
            if (ou3Var == null) {
                String str = ub.a(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
                qg qgVar = new qg(context, new zg(context));
                try {
                    AppMetricaAdapter appMetricaAdapter = qgVar.f94028a;
                    if (appMetricaAdapter != null) {
                        appMetricaAdapter.a(str);
                    }
                } catch (Throwable unused) {
                    boolean z10 = ad1.f87661a;
                }
                ou3Var = new ou3(qgVar, new zg(context));
                pu3.f93789c = ou3Var;
            }
        }
        return ou3Var;
    }
}
