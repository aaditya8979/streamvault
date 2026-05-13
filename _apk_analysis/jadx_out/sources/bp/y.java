package bp;

import android.content.Context;
import android.text.TextUtils;
import com.yk.e.net.NetRequest;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.object.ErrMsgParams;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.IDUtil;
import com.yk.e.util.LocalSaveUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class y implements NetRequest.NetCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ErrMsgParams f5890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f5892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f5893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f5895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f5897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a1 f5898j;

    public y(a1 a1Var, Context context, ErrMsgParams errMsgParams, boolean z10, s0 s0Var, String str, int i10, String str2, int i11, String str3) {
        this.f5898j = a1Var;
        this.f5889a = context;
        this.f5890b = errMsgParams;
        this.f5891c = z10;
        this.f5892d = s0Var;
        this.f5893e = str;
        this.f5894f = i10;
        this.f5895g = str2;
        this.f5896h = i11;
        this.f5897i = str3;
    }

    @Override // com.yk.e.net.NetRequest.NetCallBack
    public final void execute(String str) {
        if (TextUtils.isEmpty(str) || NetRequest.TYPE_UNKNOWN_HOST.equals(str)) {
            if (NetRequest.TYPE_UNKNOWN_HOST.equals(str)) {
                b1.a(this.f5889a).c(new t(this));
                return;
            }
            String string = IDUtil.getString(this.f5889a, "main_load_data_fail");
            if (!this.f5891c) {
                this.f5892d.b(AdSdkStateCode.API_REQUEST_FAILED, string);
            }
            this.f5898j.f(this.f5889a, this.f5893e, "", string + ", msg = 网络错误", "0", "0", null);
            return;
        }
        b1 b1VarA = b1.a(this.f5889a);
        Context context = this.f5889a;
        String str2 = Constant.commonApi;
        AdLog.d(b1VarA.f5734d, "setNewHost " + str2);
        LocalSaveUtil.put(context, b1VarA.f5736f, str2);
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5890b.setRepData(jSONObject.toString());
            int iOptInt = jSONObject.optInt("status");
            this.f5898j.getClass();
            if (iOptInt != 1001) {
                String strOptString = jSONObject.optString("info");
                if (TextUtils.isEmpty(strOptString)) {
                    strOptString = "sdk api error";
                }
                AdLog.e(strOptString);
                this.f5898j.f(this.f5889a, this.f5893e, "", strOptString, "0", "0", null);
                if (!this.f5891c) {
                    this.f5892d.b(AdSdkStateCode.API_REQUEST_ERROR, strOptString);
                }
            } else if (!this.f5891c) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                this.f5892d.a(Integer.valueOf(jSONObjectOptJSONObject.optInt("loadNumber", 1)), jSONObjectOptJSONObject.optJSONArray("adList"), Integer.valueOf(jSONObjectOptJSONObject.optInt("biddingTime", 1)), Integer.valueOf(jSONObjectOptJSONObject.optInt(com.ironsource.mediationsdk.d.f32393h, 1)), jSONObjectOptJSONObject.optJSONArray("bottomAdList"));
            }
            s1 s1VarA = s1.a();
            Context context2 = this.f5889a;
            int i10 = this.f5894f;
            String str3 = this.f5893e;
            s1VarA.getClass();
            s1VarA.d(context2, String.format(Constant.fileApiCache, Integer.valueOf(i10)), str3, jSONObject);
        } catch (Exception e10) {
            String str4 = IDUtil.getString(this.f5889a, "main_load_fail") + ", msg = " + e10.getMessage();
            if (!this.f5891c) {
                this.f5892d.b(AdSdkStateCode.API_PARSE_FAILED, str4);
            }
            AdLog.ad(str4);
            AdLog.e(e10.getMessage(), e10);
            this.f5898j.f(this.f5889a, this.f5893e, "", str4, "0", "0", null);
        }
    }
}
