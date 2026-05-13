package yads;

import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class cx3 extends uv3 {
    public cx3(fw3 fw3Var, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(fw3Var, hashSet, jSONObject, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.gw3, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        nw3 nw3Var;
        if (!TextUtils.isEmpty(str) && (nw3Var = nw3.f93027c) != null) {
            for (wv3 wv3Var : Collections.unmodifiableCollection(nw3Var.f93028a)) {
                if (this.f95855c.contains(wv3Var.f96539h)) {
                    ka kaVar = wv3Var.f96536e;
                    if (this.f95857e >= kaVar.f91528f) {
                        kaVar.f91527e = 2;
                        ix3.f91031a.a((WebView) kaVar.f91524b.get(), "setNativeViewHierarchy", str, kaVar.f91523a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (lw3.c(this.f95856d, this.f90144b.f89712a)) {
            return null;
        }
        fw3 fw3Var = this.f90144b;
        JSONObject jSONObject = this.f95856d;
        fw3Var.f89712a = jSONObject;
        return jSONObject.toString();
    }
}
