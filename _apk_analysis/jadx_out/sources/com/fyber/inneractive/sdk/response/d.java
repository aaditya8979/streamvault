package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.model.vast.a0;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.y;
import com.fyber.inneractive.sdk.model.vast.z;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.s;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f19374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r0 f19375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.f f19376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f19377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z f19379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f19380k;

    public d() {
        this.f19380k = true;
        this.f19377h = new ArrayList();
    }

    public d(boolean z10) {
        this();
        this.f19380k = z10;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final e a() {
        g gVar = new g();
        this.f19370a = gVar;
        this.f19374e = gVar;
        return gVar;
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.f fVar, List list) {
        com.fyber.inneractive.sdk.flow.vast.c cVar = new com.fyber.inneractive.sdk.flow.vast.c(this.f19380k);
        int iIntValue = this.f19375f.f16098f.f16151c.intValue();
        int iIntValue2 = this.f19375f.f16098f.f16150b.intValue();
        int iIntValue3 = this.f19375f.f16098f.f16155g.intValue();
        cVar.f16658b = iIntValue;
        cVar.f16659c = iIntValue2;
        cVar.f16660d = iIntValue3;
        if (UnitDisplayType.VERTICAL.equals(this.f19375f.f16098f.f16158j)) {
            cVar.f16661e = true;
        }
        if (this.f19375f.f16098f.f16159k.contains(2)) {
            cVar.f16662f = true;
        }
        try {
            z zVar = this.f19379j;
            this.f19374e.O = cVar.a(fVar, list, zVar != null ? zVar.f16908b : "");
        } catch (com.fyber.inneractive.sdk.flow.vast.h e10) {
            g gVar = this.f19374e;
            gVar.getClass();
            gVar.f19389i = e10.getMessage();
        }
        com.fyber.inneractive.sdk.model.vast.b bVar = this.f19374e.O;
        if (bVar != null) {
            String str = bVar.f16834n;
            if (!TextUtils.isEmpty(str) && h0.e(str)) {
                w wVar = new w(u.VAST_EVENT_DVC_DETECTED, (InneractiveAdRequest) null, this.f19370a);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("templateURL", str);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str);
                }
                wVar.f17081f.put(jSONObject);
                wVar.a((String) null);
            } else if (!TextUtils.isEmpty(str)) {
                this.f19374e.O.f16834n = "";
                com.fyber.inneractive.sdk.network.events.a.a(t.VAST_ERROR_DVC_FAILURE, com.fyber.inneractive.sdk.network.events.b.SSL_ERROR, (InneractiveAdRequest) null, this.f19370a, "Unsecured URL", str, Boolean.FALSE);
            }
        }
        g gVar2 = this.f19374e;
        LinkedHashMap linkedHashMap = cVar.f16663g;
        if (linkedHashMap != null) {
            gVar2.P.putAll(linkedHashMap);
        } else {
            gVar2.getClass();
        }
        g gVar3 = this.f19374e;
        ArrayList arrayList = cVar.f16664h;
        if (arrayList != null) {
            gVar3.Q.addAll(arrayList);
        } else {
            gVar3.getClass();
        }
        g gVar4 = this.f19374e;
        ArrayList arrayList2 = cVar.f16667k;
        if (arrayList2 != null) {
            gVar4.R.addAll(arrayList2);
        } else {
            gVar4.getClass();
        }
        if (IAlog.f19500a == 2) {
            LinkedHashMap linkedHashMap2 = cVar.f16663g;
            if (linkedHashMap2.size() <= 0) {
                IAlog.e("VParser: Unsupported media files: none", new Object[0]);
                return;
            }
            IAlog.e(" VParser: Unsupported media files:", new Object[0]);
            for (r rVar : linkedHashMap2.keySet()) {
                IAlog.e("VParser: %s", rVar);
                IAlog.e("VParser: reason = %s", linkedHashMap2.get(rVar));
            }
        }
    }

    public final void a(String str, int i10) throws Exception {
        com.fyber.inneractive.sdk.model.vast.u uVarA;
        try {
            String strReplaceFirst = str.replaceFirst("<\\?.*\\?>", "");
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setCoalescing(true);
            Document document = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new InputSource(new StringReader(strReplaceFirst)));
            if (document != null) {
                Node firstChild = document.getFirstChild();
                if (!firstChild.getNodeName().equalsIgnoreCase(VastTagName.VAST)) {
                    IAlog.a("XML does not contain a VAST tag as its first child!", new Object[0]);
                    throw new Exception("XML does not contain a VAST tag as its first child!");
                }
                uVarA = com.fyber.inneractive.sdk.model.vast.u.a(firstChild);
            } else {
                uVarA = null;
            }
            try {
                if (this.f19379j == null) {
                    this.f19379j = new z(uVarA.f16893a);
                } else {
                    z zVar = new z(uVarA.f16893a);
                    if (zVar.compareTo(this.f19379j) >= 0) {
                        this.f19379j = zVar;
                    }
                }
            } catch (y unused) {
            }
            ArrayList arrayList = uVarA.f16894b;
            if (arrayList == null || arrayList.isEmpty()) {
                IAlog.a("Vast response parser: no ads found in model. aborting", new Object[0]);
                throw new com.fyber.inneractive.sdk.flow.vast.h("ErrorNoMediaFiles", "No ads found in model. Empty Vast?");
            }
            com.fyber.inneractive.sdk.model.vast.f fVar = (com.fyber.inneractive.sdk.model.vast.f) arrayList.get(0);
            a0 a0Var = fVar.f16851b;
            if (a0Var == null) {
                if (fVar.f16852c == null) {
                    throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "A top level ad with no wrapper on inline found!");
                }
                this.f19376g = fVar;
                return;
            }
            IAlog.a("Vast response parser: found VAST wrapper #%d", Integer.valueOf(this.f19377h.size()));
            int size = this.f19377h.size();
            int i11 = this.f19378i;
            if (size >= i11) {
                IAlog.a("Vast response parser: too many vast wrappers! Only %d allowed. stopping", Integer.valueOf(i11));
                throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorTooManyWrappers", "More than " + this.f19378i + " found");
            }
            this.f19377h.add(fVar);
            String str2 = a0Var.f16820i;
            if (TextUtils.isEmpty(str2)) {
                IAlog.a("Vast response parser: found an empty tag uri in wrapper! aborting!", new Object[0]);
                throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "No ad tag URI for wrapper");
            }
            if (!h0.e(str2)) {
                IAlog.a("Vast response parser: Unsecure Wrapper URL. Aborting! url: %s", str2);
                throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorUnsecure", "Unsecure ad tag URI for wrapper");
            }
            String strA = s.a(str2, 3000, 5000);
            if (TextUtils.isEmpty(strA)) {
                throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "Failed getting data from ad tag URI");
            }
            int i12 = this.f19378i - i10;
            if (i12 <= 0) {
                throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "Invalid level for wrapper");
            }
            a0Var.f16858f = i12;
            this.f19374e.S.put(str2, strA);
            a(strA, i10 + 1);
        } catch (Exception e10) {
            IAlog.a("Failed parsing Vast file! parsing error = %s", e10.getMessage());
            throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", e10.getMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, r0 r0Var) {
        this.f19375f = r0Var;
        if (r0Var == null || r0Var.f16098f == null) {
            this.f19370a.f19389i = "ErrorConfigurationMismatch";
            return;
        }
        this.f19374e.N = System.currentTimeMillis();
        this.f19374e.C = this.f19375f.f16094b;
        this.f19378i = IAConfigManager.O.f15963i.f16072b;
        try {
            a(str, 0);
            a(this.f19376g, this.f19377h);
        } catch (com.fyber.inneractive.sdk.flow.vast.h e10) {
            this.f19374e.f19389i = e10.getMessage();
            this.f19374e.f19390j = e10.getCause().getMessage();
        } catch (InterruptedException e11) {
            throw e11;
        } catch (Exception e12) {
            this.f19374e.f19390j = e12.getMessage();
            g gVar = this.f19374e;
            gVar.f19389i = "VastErrorInvalidFile";
            gVar.f19406z = e12;
            if (IAlog.f19500a == 2) {
                e12.printStackTrace();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final boolean c() {
        return true;
    }
}
