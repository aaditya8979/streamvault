package bp;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.G5;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.LocalSaveUtil;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static b1 f5730g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f5731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5736f;

    public b1(Context context) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f5731a = copyOnWriteArrayList;
        this.f5732b = 0;
        this.f5733c = 200;
        String simpleName = b1.class.getSimpleName();
        this.f5734d = simpleName;
        String str = "host_list_" + Constant.sdkVersion;
        this.f5735e = str;
        this.f5736f = "host_" + Constant.sdkVersion;
        Set<String> setStr = LocalSaveUtil.getSetStr(context, str);
        if (setStr.size() != 0) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList(setStr);
            this.f5731a = copyOnWriteArrayList2;
            AdLog.d("local list_host" + copyOnWriteArrayList2);
            return;
        }
        AdLog.i(simpleName, "初始化备用域名");
        byte[] bytesFromAssets = CoreUtils.getBytesFromAssets(context, "okt_sdk_config");
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        if (bytesFromAssets != null) {
            try {
                JSONArray jSONArrayOptJSONArray = new JSONObject(new String(bytesFromAssets, G5.N)).optJSONArray("host_list");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        copyOnWriteArrayList3.add(jSONArrayOptJSONArray.optString(i10));
                    }
                }
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
            }
        }
        copyOnWriteArrayList.addAll(copyOnWriteArrayList3);
        AdLog.w("list_host " + this.f5731a.toString());
    }

    public static b1 a(Context context) {
        synchronized (b1.class) {
            if (f5730g == null) {
                f5730g = new b1(context);
            }
        }
        return f5730g;
    }

    public final void b(Context context, JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        AdLog.d(this.f5734d, "添加新的域名：" + jSONArray);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                String strOptString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(strOptString)) {
                    this.f5731a.add(strOptString);
                }
            } catch (Exception e10) {
                b.d.a(e10, new StringBuilder("addHost4Api error, msg = "), e10);
                return;
            }
        }
        HashSet hashSet = new HashSet(this.f5731a);
        this.f5731a.clear();
        this.f5731a.addAll(hashSet);
        LocalSaveUtil.put(context, this.f5735e, hashSet);
        AdLog.d("new list_host " + this.f5731a.toString());
    }

    public final void c(i1 i1Var) {
        try {
            if (this.f5732b >= this.f5731a.size()) {
                AdLog.e("game over!!!");
                i1Var.a();
                return;
            }
            Constant.commonApi = (String) this.f5731a.get(this.f5732b);
            Constant.setAddress();
            AdLog.d(this.f5734d, "findAndSetNextHost " + Constant.commonApi);
            this.f5732b = this.f5732b + 1;
            new Handler().postDelayed(new v1(this, i1Var), (long) this.f5733c);
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("findAndSetNextHost error, msg = "), e10);
        }
    }
}
