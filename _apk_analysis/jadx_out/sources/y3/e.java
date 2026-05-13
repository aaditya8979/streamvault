package y3;

import android.content.Context;
import com.applovin.mediation.adapters.unityads.BuildConfig;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONException;

/* JADX INFO: compiled from: UnityInitializer.java */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e f87220b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f87221a = new b();

    public static synchronized e a() {
        if (f87220b == null) {
            f87220b = new e();
        }
        return f87220b;
    }

    public void b(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) throws JSONException {
        if (this.f87221a.f()) {
            iUnityAdsInitializationListener.onInitializationComplete();
            return;
        }
        MediationMetaData mediationMetaDataA = this.f87221a.a(context);
        mediationMetaDataA.setName("AdMob");
        mediationMetaDataA.setVersion(this.f87221a.d());
        mediationMetaDataA.set("adapter_version", BuildConfig.VERSION_NAME);
        mediationMetaDataA.commit();
        this.f87221a.e(context, str, iUnityAdsInitializationListener);
    }
}
