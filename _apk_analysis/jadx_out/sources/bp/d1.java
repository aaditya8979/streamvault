package bp;

import android.content.Context;
import android.text.TextUtils;
import com.yk.e.net.NetRequest;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.LocalSaveUtil;
import com.yk.e.util.UsLocalSaveHelper;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 implements NetRequest.NetCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1 f5750a;

    public d1(q1 q1Var) {
        this.f5750a = q1Var;
    }

    @Override // com.yk.e.net.NetRequest.NetCallBack
    public final void execute(String str) {
        if (TextUtils.isEmpty(str) || NetRequest.TYPE_UNKNOWN_HOST.equals(str)) {
            if (NetRequest.TYPE_UNKNOWN_HOST.equals(str)) {
                b1.a(this.f5750a.f5861c).c(new x0(this));
                return;
            }
            return;
        }
        b1 b1VarA = b1.a(this.f5750a.f5861c);
        Context context = this.f5750a.f5861c;
        String str2 = Constant.commonApi;
        AdLog.d(b1VarA.f5734d, "setNewHost " + str2);
        LocalSaveUtil.put(context, b1VarA.f5736f, str2);
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("status");
            this.f5750a.f5863e.getClass();
            if (iOptInt == 1001) {
                UsLocalSaveHelper.getInstance().setTimerCacheList(CoreUtils.parsePreloadCacheList(jSONObject.getJSONObject("data").optJSONArray("adv_cache")));
                this.f5750a.f5862d.onSuccess();
            } else {
                this.f5750a.f5862d.onFailed(-1, "status is not right");
            }
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("api init parse error, msg = "), e10);
            this.f5750a.f5862d.onFailed(-1, e10.getMessage());
        }
    }
}
