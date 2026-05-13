package com.fyber.inneractive.sdk.flow.endcard.loaders.companion;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.j;
import com.fyber.inneractive.sdk.flow.endcard.p;
import com.fyber.inneractive.sdk.flow.endcard.r;
import com.fyber.inneractive.sdk.flow.endcard.t;
import com.fyber.inneractive.sdk.flow.endcard.v;
import com.fyber.inneractive.sdk.flow.endcard.x;
import com.fyber.inneractive.sdk.flow.vast.h;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.model.vast.i;
import com.fyber.inneractive.sdk.model.vast.k;
import com.fyber.inneractive.sdk.network.e1;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.web.i1;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f16337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f16338b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f16339c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f16340d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f16341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f16342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.endcard.c f16343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.b f16344h;

    public a(j jVar, x0 x0Var, com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar) {
        this.f16337a = jVar;
        this.f16341e = x0Var;
        this.f16344h = bVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a() {
        com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar = this.f16344h;
        com.fyber.inneractive.sdk.flow.endcard.c cVar = this.f16343g;
        bVar.getClass();
        if (cVar != null) {
            IAlog.a("%s : onCompanionLoadSuccess: endcard type: %s", "EndCardLoader", cVar.i());
            bVar.f16336d.a(cVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a(String str) {
        this.f16344h.getClass();
        IAlog.a("%s : onCompanionLoadFailure: error: %s", "EndCardLoader", str);
        b();
    }

    public final void b() {
        Iterator it = this.f16342f;
        if (it == null || !it.hasNext()) {
            return;
        }
        com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) this.f16342f.next();
        this.f16343g = cVar;
        String str = null;
        if (cVar instanceof r) {
            r rVar = (r) cVar;
            this.f16338b.getClass();
            String str2 = rVar.f16312g.f16842f;
            x0 x0Var = rVar.f16308c;
            u uVar = u.VAST_COMPANION_LOAD_ATTEMPT;
            InneractiveAdRequest inneractiveAdRequest = x0Var.f16703c;
            g gVar = x0Var.f16704d;
            JSONArray jSONArray = x0Var.f16706f;
            w wVar = new w(gVar);
            wVar.f17078c = uVar;
            wVar.f17076a = inneractiveAdRequest;
            wVar.f17079d = jSONArray;
            wVar.a((String) null);
            com.fyber.inneractive.sdk.flow.endcard.u uVar2 = (com.fyber.inneractive.sdk.flow.endcard.u) rVar.f();
            uVar2.f16378e = str2;
            uVar2.a(this);
            return;
        }
        if (cVar instanceof v) {
            e eVar = this.f16339c;
            v vVar = (v) cVar;
            eVar.getClass();
            k kVar = vVar.f16383h;
            int i10 = c.f16345a[kVar.ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                IAlog.f("%s Invalid static type: %s", "StaticCompanionEndCardLoader", kVar);
                return;
            }
            String str3 = vVar.f16312g.f16842f;
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            IAlog.c("%s load Static End-Card image %s", "StaticCompanionEndCardLoader", str3);
            x0 x0Var2 = vVar.f16308c;
            u uVar3 = u.VAST_COMPANION_LOAD_ATTEMPT;
            InneractiveAdRequest inneractiveAdRequest2 = x0Var2.f16703c;
            g gVar2 = x0Var2.f16704d;
            JSONArray jSONArray2 = x0Var2.f16706f;
            w wVar2 = new w(gVar2);
            wVar2.f17078c = uVar3;
            wVar2.f17076a = inneractiveAdRequest2;
            wVar2.f17079d = jSONArray2;
            wVar2.a((String) null);
            IAConfigManager.O.f15973s.a(new e1(new d(eVar, vVar, this), vVar.f16312g.f16842f, vVar.f16308c.f16702b.f16697c));
            return;
        }
        if (cVar instanceof x) {
            x xVar = (x) cVar;
            this.f16340d.getClass();
            if (xVar.f16312g.f16837a != i.Static) {
                x0 x0Var3 = xVar.f16308c;
                u uVar4 = u.VAST_COMPANION_LOAD_ATTEMPT;
                InneractiveAdRequest inneractiveAdRequest3 = x0Var3.f16703c;
                g gVar3 = x0Var3.f16704d;
                JSONArray jSONArray3 = x0Var3.f16706f;
                w wVar3 = new w(gVar3);
                wVar3.f17078c = uVar4;
                wVar3.f17076a = inneractiveAdRequest3;
                wVar3.f17079d = jSONArray3;
                wVar3.a((String) null);
                String str4 = xVar.f16312g.f16842f;
                String strB = o.b("fyb_iframe_endcard_tmpl.html");
                if (!TextUtils.isEmpty(strB)) {
                    strB = strB.replace("$__SrcIframeUrl__$", str4);
                }
                com.fyber.inneractive.sdk.flow.endcard.u uVar5 = (com.fyber.inneractive.sdk.flow.endcard.u) xVar.f();
                uVar5.f16378e = strB;
                uVar5.a(this);
                return;
            }
            x0 x0Var4 = xVar.f16308c;
            u uVar6 = u.VAST_COMPANION_LOAD_ATTEMPT;
            InneractiveAdRequest inneractiveAdRequest4 = x0Var4.f16703c;
            g gVar4 = x0Var4.f16704d;
            JSONArray jSONArray4 = x0Var4.f16706f;
            w wVar4 = new w(gVar4);
            wVar4.f17078c = uVar6;
            wVar4.f17076a = inneractiveAdRequest4;
            wVar4.f17079d = jSONArray4;
            wVar4.a((String) null);
            com.fyber.inneractive.sdk.model.vast.c cVar2 = xVar.f16312g;
            String str5 = cVar2.f16842f;
            String str6 = cVar2.f16843g;
            if (TextUtils.isEmpty(str6)) {
                com.fyber.inneractive.sdk.model.vast.b bVar = xVar.f16308c.f16704d.O;
                if (bVar != null) {
                    str = bVar.f16822b;
                }
            } else {
                str = str6;
            }
            String strB2 = o.b("fyb_static_endcard_tmpl.html");
            if (!TextUtils.isEmpty(strB2)) {
                strB2 = strB2.replace("$__IMGSRC__$", str5);
                if (str != null) {
                    strB2 = strB2.replace("$__IMGHREF__$", str.replace("\"", "\\\""));
                }
            }
            com.fyber.inneractive.sdk.flow.endcard.u uVar7 = (com.fyber.inneractive.sdk.flow.endcard.u) xVar.f();
            uVar7.f16378e = strB2;
            if (TextUtils.isEmpty(strB2)) {
                throw new h("End-Card HTML not loaded", "No template");
            }
            com.fyber.inneractive.sdk.player.controller.d dVarE = uVar7.e();
            dVarE.a();
            i1 i1Var = dVarE.f17149a;
            if (i1Var != null) {
                i1Var.F = false;
            }
            dVarE.a(strB2, new t(uVar7, this), !(uVar7 instanceof p));
        }
    }
}
