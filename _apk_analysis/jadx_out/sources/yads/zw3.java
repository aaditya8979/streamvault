package yads;

import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class zw3 extends uv3 {
    public zw3(fw3 fw3Var, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(fw3Var, hashSet, jSONObject, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.gw3, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        nw3 nw3Var = nw3.f93027c;
        if (nw3Var != null) {
            for (wv3 wv3Var : Collections.unmodifiableCollection(nw3Var.f93028a)) {
                if (this.f95855c.contains(wv3Var.f96539h)) {
                    ka kaVar = wv3Var.f96536e;
                    if (this.f95857e >= kaVar.f91528f && kaVar.f91527e != 3) {
                        kaVar.f91527e = 3;
                        ix3.f91031a.a((WebView) kaVar.f91524b.get(), "setNativeViewHierarchy", str, kaVar.f91523a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        return this.f95856d.toString();
    }
}
