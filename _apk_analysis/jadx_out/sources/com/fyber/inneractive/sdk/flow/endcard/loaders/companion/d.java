package com.fyber.inneractive.sdk.flow.endcard.loaders.companion;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.v;
import com.fyber.inneractive.sdk.flow.endcard.w;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.model.vast.k;
import com.fyber.inneractive.sdk.network.d1;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.response.g;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f16346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a f16347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f16348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f16349d;

    public d(e eVar, v vVar, com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        this.f16349d = eVar;
        this.f16348c = vVar;
        this.f16346a = (w) vVar.f();
        this.f16347b = aVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        Bitmap bitmap;
        d1 d1Var = (d1) obj;
        boolean zEqualsIgnoreCase = false;
        if (exc == null && d1Var != null && d1Var.f16957b == null && (bitmap = d1Var.f16956a) != null) {
            w wVar = this.f16346a;
            Bitmap bitmap2 = wVar.f16384c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            wVar.f16384c = bitmap;
            wVar.f16385d.setImageBitmap(bitmap);
            e eVar = this.f16349d;
            v vVar = this.f16348c;
            eVar.getClass();
            JSONObject jSONObject = new JSONObject();
            String string = vVar.f16312g.a().toString();
            try {
                jSONObject.put("companion_data", string);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", string);
            }
            x0 x0Var = vVar.f16308c;
            u uVar = u.VAST_COMPANION_LOADED;
            InneractiveAdRequest inneractiveAdRequest = x0Var.f16703c;
            g gVar = x0Var.f16704d;
            JSONArray jSONArray = x0Var.f16706f;
            com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(gVar);
            wVar2.f17078c = uVar;
            wVar2.f17076a = inneractiveAdRequest;
            wVar2.f17079d = jSONArray;
            wVar2.f17081f.put(jSONObject);
            wVar2.a((String) null);
            this.f16347b.a();
            return;
        }
        String str = d1Var != null ? d1Var.f16957b : null;
        e eVar2 = this.f16349d;
        v vVar2 = this.f16348c;
        eVar2.getClass();
        IAlog.a("%s sending VAST_COMPANION_FAILED_LOADING event", "StaticCompanionEndCardLoader");
        JSONObject jSONObject2 = new JSONObject();
        String strA = TextUtils.isEmpty(str) ? com.fyber.inneractive.sdk.util.v.a(exc) : str;
        if (!TextUtils.isEmpty(strA)) {
            try {
                jSONObject2.put("reason", strA);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "reason", strA);
            }
        }
        JSONObject jSONObjectA = vVar2.f16312g.a();
        try {
            jSONObject2.put("companion_data", jSONObjectA);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", jSONObjectA);
        }
        x0 x0Var2 = vVar2.f16308c;
        t tVar = t.VAST_COMPANION_FAILED_LOADING;
        InneractiveAdRequest inneractiveAdRequest2 = x0Var2.f16703c;
        g gVar2 = x0Var2.f16704d;
        JSONArray jSONArray2 = x0Var2.f16706f;
        com.fyber.inneractive.sdk.network.w wVar3 = new com.fyber.inneractive.sdk.network.w(gVar2);
        wVar3.f17077b = tVar;
        wVar3.f17076a = inneractiveAdRequest2;
        wVar3.f17079d = jSONArray2;
        wVar3.f17081f.put(jSONObject2);
        wVar3.a((String) null);
        this.f16347b.a(str);
        v vVar3 = this.f16348c;
        String str2 = vVar3.f16312g.f16842f;
        k kVar = vVar3.f16383h;
        if (!TextUtils.isEmpty(str2)) {
            String strSubstring = str2.substring(str2.lastIndexOf(46) + 1);
            if (kVar.extension.equalsIgnoreCase(strSubstring)) {
                zEqualsIgnoreCase = true;
            } else {
                k kVar2 = k.Jpeg;
                if (kVar == kVar2) {
                    zEqualsIgnoreCase = k.Jpg.extension.equalsIgnoreCase(strSubstring);
                } else if (kVar == k.Jpg) {
                    zEqualsIgnoreCase = kVar2.extension.equalsIgnoreCase(strSubstring);
                }
            }
        }
        if (zEqualsIgnoreCase) {
            return;
        }
        x0 x0Var3 = this.f16348c.f16308c;
        t tVar2 = t.VAST_COMPANION_INCOMPATIBLE_MIMETYPE;
        InneractiveAdRequest inneractiveAdRequest3 = x0Var3.f16703c;
        g gVar3 = x0Var3.f16704d;
        JSONArray jSONArray3 = x0Var3.f16706f;
        com.fyber.inneractive.sdk.network.w wVar4 = new com.fyber.inneractive.sdk.network.w(gVar3);
        wVar4.f17077b = tVar2;
        wVar4.f17076a = inneractiveAdRequest3;
        wVar4.f17079d = jSONArray3;
        wVar4.a((String) null);
    }
}
