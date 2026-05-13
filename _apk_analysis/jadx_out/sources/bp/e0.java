package bp;

import android.content.Context;
import android.net.Uri;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.UsLocalSaveHelper;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f5752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IComCallback f5754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1 f5755e;

    public e0(e1 e1Var, Context context, String str, IComCallback iComCallback) {
        this.f5755e = e1Var;
        this.f5752b = context;
        this.f5753c = str;
        this.f5754d = iComCallback;
    }

    public final void a() {
        e1 e1Var;
        e1 e1Var2;
        try {
            try {
                IComCallback iComCallback = this.f5754d;
                if (iComCallback != null) {
                    iComCallback.onSuccess();
                }
                e1Var2 = this.f5755e;
                e1Var2.f5758b = false;
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
                this.f5754d.onFailed(-1, e10.getMessage());
                e1 e1Var3 = this.f5755e;
                e1Var3.f5758b = false;
                if (e1Var3.f5757a.isEmpty()) {
                    return;
                } else {
                    e1Var = this.f5755e;
                }
            }
            if (e1Var2.f5757a.isEmpty()) {
                return;
            }
            e1Var = this.f5755e;
            ((Runnable) e1Var.f5757a.poll()).run();
        } catch (Throwable th2) {
            e1 e1Var4 = this.f5755e;
            e1Var4.f5758b = false;
            if (!e1Var4.f5757a.isEmpty()) {
                ((Runnable) this.f5755e.f5757a.poll()).run();
            }
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5755e.f5758b = true;
        if (AppLovinSdk.getInstance(this.f5752b).isInitialized()) {
            AdLog.i("Applovin has success");
            a();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        AppLovinSdk.getInstance(this.f5752b).getSettings().setVerboseLogging(Constant.debugFlag);
        AppLovinSdk.getInstance(this.f5752b).getSettings().setCreativeDebuggerEnabled(true);
        if (l.a().c("max_user_geography")) {
            e1 e1Var = this.f5755e;
            Context context = this.f5752b;
            e1Var.getClass();
            AppLovinSdk.getInstance(context).getSettings().getTermsAndPrivacyPolicyFlowSettings().setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR);
        }
        if (l.a().c("max_mediation_debug")) {
            AppLovinSdk.getInstance(this.f5752b).showMediationDebugger();
        }
        AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfigurationBuild = AppLovinSdkInitializationConfiguration.builder(this.f5753c, this.f5752b).setMediationProvider("max").build();
        if (UsLocalSaveHelper.getInstance().isStartCmp()) {
            AdLog.i("start cmp for max");
            AppLovinSdkSettings settings = AppLovinSdk.getInstance(this.f5752b).getSettings();
            settings.getTermsAndPrivacyPolicyFlowSettings().setEnabled(true);
            settings.getTermsAndPrivacyPolicyFlowSettings().setPrivacyPolicyUri(Uri.parse(Constant.privacyPolicyUri));
        }
        AppLovinSdk.getInstance(this.f5752b).initialize(appLovinSdkInitializationConfigurationBuild, new i(this, jCurrentTimeMillis));
    }
}
