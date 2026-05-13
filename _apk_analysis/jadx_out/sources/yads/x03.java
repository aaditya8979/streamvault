package yads;

import android.view.View;
import com.ironsource.C3978d4;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivExtension;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class x03 implements DivExtensionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f96580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kh0 f96581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jq0 f96582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kq0 f96583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f96584e;

    public /* synthetic */ x03(io2 io2Var) {
        this(io2Var, new kh0(), new jq0(), new kq0());
    }

    public x03(io2 io2Var, kh0 kh0Var, jq0 jq0Var, kq0 kq0Var) {
        this.f96580a = io2Var;
        this.f96581b = kh0Var;
        this.f96582c = jq0Var;
        this.f96583d = kq0Var;
        this.f96584e = new ConcurrentHashMap();
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void bindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ah.e2 e2Var) {
        Integer numValueOf;
        z03 z03Var = (z03) this.f96584e.get(div2View.getDivData());
        if (z03Var != null) {
            view.setVisibility(8);
            z03Var.f97351d.getClass();
            DivExtension divExtensionA = kh0.a(e2Var, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            if (divExtensionA != null) {
                z03Var.f97352e.getClass();
                JSONObject jSONObject = divExtensionA.f55241b;
                if (jSONObject != null) {
                    try {
                        numValueOf = Integer.valueOf(jSONObject.getInt(C3978d4.i.L));
                    } catch (JSONException unused) {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    ArrayList arrayListI = z03Var.f97348a.i();
                    if (numValueOf.intValue() < 0 || numValueOf.intValue() >= arrayListI.size()) {
                        return;
                    }
                    w02 w02Var = (w02) arrayListI.get(numValueOf.intValue());
                    r12 r12VarA = z03Var.f97353f.a(view, new k92(numValueOf.intValue()));
                    try {
                        ny2 ny2VarA = wg0.a(div2View);
                        yf0 yf0Var = z03Var.f97350c;
                        pu puVar = (pu) ny2VarA.f93053a.f94152b.get(numValueOf);
                        if (puVar == null) {
                            puVar = new pu(yf0Var);
                            ny2VarA.f93053a.f94151a.put(numValueOf, puVar);
                        }
                        w02Var.a(r12VarA, puVar);
                        view.setVisibility(0);
                    } catch (j02 e10) {
                        z03Var.f97349b.reportError("Failed to bind DivKit Slider Inner Ad", e10);
                    }
                }
            }
        }
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final boolean matches(ah.e2 e2Var) {
        Integer numValueOf;
        this.f96581b.getClass();
        DivExtension divExtensionA = kh0.a(e2Var, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (divExtensionA == null) {
            return false;
        }
        this.f96582c.getClass();
        JSONObject jSONObject = divExtensionA.f55241b;
        String string = null;
        if (jSONObject != null) {
            try {
                numValueOf = Integer.valueOf(jSONObject.getInt(C3978d4.i.L));
            } catch (JSONException unused) {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        this.f96583d.getClass();
        JSONObject jSONObject2 = divExtensionA.f55241b;
        if (jSONObject2 != null) {
            try {
                string = jSONObject2.getString("view_name");
            } catch (JSONException unused2) {
            }
        }
        return numValueOf != null && tn.p.f("native_ad_view", string);
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void unbindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ah.e2 e2Var) {
    }
}
