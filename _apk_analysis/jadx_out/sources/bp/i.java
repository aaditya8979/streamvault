package bp;

import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.yk.e.AbstractC4634il;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements AppLovinSdk.SdkInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f5778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f5779b;

    public i(e0 e0Var, long j10) {
        this.f5779b = e0Var;
        this.f5778a = j10;
    }

    @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
    public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        AdLog.i("Applovin SDK is initialized");
        e1 e1Var = this.f5779b.f5755e;
        if (e1Var.f5759c == 0) {
            e1Var.f5759c = System.currentTimeMillis() - this.f5778a;
            AbstractC4634il.f3394lLi1LL.put("applovin", Long.valueOf(this.f5779b.f5755e.f5759c));
            AdLog.i("applovin init time = " + this.f5779b.f5755e.f5759c + "ms");
        }
        this.f5779b.a();
    }
}
