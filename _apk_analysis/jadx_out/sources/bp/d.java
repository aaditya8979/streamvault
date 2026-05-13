package bp;

import android.content.Context;
import com.yk.e.callBack.MainInitSdkCallback;
import com.yk.e.net.TaskThreadPool;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.util.AdLog;
import com.yk.e.util.StringUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements i.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f5743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainInitSdkCallback f5745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1 f5746e;

    public d(a1 a1Var, String str, Context context, boolean z10, MainInitSdkCallback mainInitSdkCallback) {
        this.f5746e = a1Var;
        this.f5742a = str;
        this.f5743b = context;
        this.f5744c = z10;
        this.f5745d = mainInitSdkCallback;
    }

    @Override // i.f
    public final void a(Object... objArr) {
        JSONObject jSONObject = (JSONObject) objArr[0];
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f5746e.f5722d);
            this.f5746e.getClass();
            sb2.append(a1.b(jSONObject));
            sb2.append(a1.f5717j);
            jSONObject.put("sign", StringUtil.encryptToMD5(sb2.toString()));
            TaskThreadPool.connect(this.f5742a, jSONObject, new c1(this));
        } catch (Exception e10) {
            String str = "reqInit error, msg = " + e10.getMessage();
            AdLog.ad(str);
            AdLog.e(str, e10);
            MainInitSdkCallback mainInitSdkCallback = this.f5745d;
            if (mainInitSdkCallback == null || this.f5744c) {
                return;
            }
            mainInitSdkCallback.onInitFailed(AdSdkStateCode.INIT_FAILED, "init error, msg = " + e10.getMessage());
        }
    }
}
