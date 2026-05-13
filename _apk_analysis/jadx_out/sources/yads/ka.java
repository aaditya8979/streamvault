package yads;

import android.webkit.WebView;
import com.ironsource.C3978d4;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hw3 f91524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e4 f91525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public il1 f91526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f91527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f91528f;

    public ka(String str) {
        a();
        this.f91523a = str;
        this.f91524b = new hw3(null);
    }

    public final void a() {
        this.f91528f = System.nanoTime();
        this.f91527e = 1;
    }

    public final void a(WebView webView) {
        this.f91524b = new hw3(webView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, JSONObject jSONObject) {
        ix3.f91031a.a((WebView) this.f91524b.get(), "publishMediaEvent", str, jSONObject, this.f91523a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(ha haVar) {
        ix3 ix3Var = ix3.f91031a;
        WebView webView = (WebView) this.f91524b.get();
        String str = this.f91523a;
        JSONObject jSONObject = new JSONObject();
        lw3.a(jSONObject, "impressionOwner", haVar.f90327a);
        lw3.a(jSONObject, "mediaEventsOwner", haVar.f90328b);
        lw3.a(jSONObject, "creativeType", haVar.f90330d);
        lw3.a(jSONObject, "impressionType", haVar.f90331e);
        lw3.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(haVar.f90329c));
        ix3Var.a(webView, C3978d4.a.f31210f, jSONObject, str);
    }

    public void a(wv3 wv3Var, ia iaVar) {
        a(wv3Var, iaVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(wv3 wv3Var, ia iaVar, JSONObject jSONObject) {
        String str = wv3Var.f96539h;
        JSONObject jSONObject2 = new JSONObject();
        lw3.a(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        lw3.a(jSONObject2, "adSessionType", iaVar.f90722h);
        lw3.a(jSONObject2, "deviceInfo", ew3.a());
        lw3.a(jSONObject2, "deviceCategory", gg0.a(sv3.a()));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        lw3.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        lw3.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, iaVar.f90715a.f94355a);
        lw3.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, iaVar.f90715a.f94356b);
        lw3.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        lw3.a(jSONObject4, "libraryVersion", "1.5.6-Yandex");
        lw3.a(jSONObject4, "appId", fx3.f89722b.f89723a.getApplicationContext().getPackageName());
        lw3.a(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        String str2 = iaVar.f90721g;
        if (str2 != null) {
            lw3.a(jSONObject2, "contentUrl", str2);
        }
        String str3 = iaVar.f90720f;
        if (str3 != null) {
            lw3.a(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject5 = new JSONObject();
        for (md3 md3Var : Collections.unmodifiableList(iaVar.f90717c)) {
            lw3.a(jSONObject5, md3Var.f92328a, md3Var.f92330c);
        }
        ix3.f91031a.a((WebView) this.f91524b.get(), "startSession", str, jSONObject2, jSONObject5, jSONObject);
    }

    public void b() {
        this.f91524b.clear();
    }

    public void c() {
    }
}
