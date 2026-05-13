package bp;

import android.content.Context;
import com.yk.e.inf.IComCallback;
import com.yk.e.net.TaskThreadPool;
import com.yk.e.util.AdLog;
import com.yk.e.util.StringUtil;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class q1 implements i.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f5859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f5861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IComCallback f5862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1 f5863e;

    public q1(a1 a1Var, JSONArray jSONArray, String str, Context context, IComCallback iComCallback) {
        this.f5863e = a1Var;
        this.f5859a = jSONArray;
        this.f5860b = str;
        this.f5861c = context;
        this.f5862d = iComCallback;
    }

    @Override // i.f
    public final void a(Object... objArr) {
        JSONObject jSONObject = (JSONObject) objArr[0];
        try {
            jSONObject.put("adids", this.f5859a.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f5863e.f5722d);
            this.f5863e.getClass();
            sb2.append(a1.b(jSONObject));
            sb2.append(a1.f5717j);
            jSONObject.put("sign", StringUtil.encryptToMD5(sb2.toString()));
            TaskThreadPool.connect(this.f5860b, jSONObject, new d1(this));
        } catch (Exception e10) {
            String str = "reqTimer error, msg = " + e10.getMessage();
            AdLog.ad(str);
            AdLog.e(str, e10);
            this.f5862d.onFailed(-1, str);
        }
    }
}
