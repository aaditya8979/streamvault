package yads;

import android.util.Log;
import android.webkit.WebView;
import com.ironsource.C3978d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wv3 f89088a;

    public e4(wv3 wv3Var) {
        this.f89088a = wv3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        wv3 wv3Var = this.f89088a;
        boolean z10 = wv3Var.f96538g;
        if (z10) {
            throw new IllegalStateException("AdSession is finished");
        }
        if (eb2.f89188c != wv3Var.f96533b.f90327a) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
        if (!wv3Var.f96537f || z10) {
            try {
                wv3Var.c();
            } catch (Exception unused) {
            }
        }
        wv3 wv3Var2 = this.f89088a;
        if (!wv3Var2.f96537f || wv3Var2.f96538g) {
            return;
        }
        if (wv3Var2.f96540i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
        ka kaVar = wv3Var2.f96536e;
        ix3.f91031a.a((WebView) kaVar.f91524b.get(), "publishImpressionEvent", kaVar.f91523a);
        wv3Var2.f96540i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(nc3 nc3Var) {
        ex3.a(this.f89088a);
        wv3 wv3Var = this.f89088a;
        if (eb2.f89188c != wv3Var.f96533b.f90327a) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", nc3Var.f92817a);
            if (nc3Var.f92817a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, nc3Var.f92818b);
            }
            jSONObject.put("autoPlay", nc3Var.f92819c);
            jSONObject.put(C3978d4.i.L, nc3Var.f92820d);
        } catch (JSONException e10) {
            Log.e("OMIDLIB", "VastProperties: JSON error", e10);
        }
        if (wv3Var.f96541j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        ka kaVar = wv3Var.f96536e;
        ix3.f91031a.a((WebView) kaVar.f91524b.get(), "publishLoadedEvent", jSONObject, kaVar.f91523a);
        wv3Var.f96541j = true;
    }
}
