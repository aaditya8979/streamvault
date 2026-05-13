package bp;

import android.content.Context;
import android.text.TextUtils;
import com.yk.e.callBack.MainInitSdkCallback;
import com.yk.e.net.NetRequest;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.LocalSaveUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 implements NetRequest.NetCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f5741a;

    public c1(d dVar) {
        this.f5741a = dVar;
    }

    @Override // com.yk.e.net.NetRequest.NetCallBack
    public final void execute(String str) {
        if (TextUtils.isEmpty(str) || NetRequest.TYPE_UNKNOWN_HOST.equals(str)) {
            if (NetRequest.TYPE_UNKNOWN_HOST.equals(str)) {
                b1.a(this.f5741a.f5743b).c(new h1(this));
                return;
            }
            d dVar = this.f5741a;
            MainInitSdkCallback mainInitSdkCallback = dVar.f5745d;
            if (mainInitSdkCallback == null || dVar.f5744c) {
                return;
            }
            mainInitSdkCallback.onInitFailed(AdSdkStateCode.INIT_FAILED, "请求初始化接口失败, msg = 网络错误");
            return;
        }
        b1 b1VarA = b1.a(this.f5741a.f5743b);
        Context context = this.f5741a.f5743b;
        String str2 = Constant.commonApi;
        AdLog.d(b1VarA.f5734d, "setNewHost " + str2);
        LocalSaveUtil.put(context, b1VarA.f5736f, str2);
        d dVar2 = this.f5741a;
        if (!dVar2.f5744c) {
            dVar2.f5746e.i(str, dVar2.f5743b, true, dVar2.f5745d);
        }
        s1 s1VarA = s1.a();
        d dVar3 = this.f5741a;
        Context context2 = dVar3.f5743b;
        dVar3.f5746e.getClass();
        this.f5741a.f5746e.getClass();
        s1VarA.getClass();
        try {
            s1VarA.d(context2, String.format(Constant.fileApiCache, 9999), "1", new JSONObject(str));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
