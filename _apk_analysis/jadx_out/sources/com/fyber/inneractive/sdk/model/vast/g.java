package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.w1;
import com.ironsource.sdk.controller.f;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16853a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f16857e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v f16859g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f16856d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16858f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f16860h = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16854b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f16855c = new ArrayList();

    public final void a(Node node) {
        w wVar;
        Node nodeD = w1.d(node, "AdVerifications");
        if (nodeD != null) {
            for (Node node2 : w1.c(nodeD, VastTagName.VERIFICATION)) {
                com.fyber.inneractive.sdk.measurement.h hVar = null;
                if (node2 != null) {
                    com.fyber.inneractive.sdk.measurement.h hVar2 = new com.fyber.inneractive.sdk.measurement.h();
                    hVar2.f16776e = w1.b(node2, "vendor");
                    Node nodeD2 = w1.d(node2, VastTagName.JAVA_SCRIPT_RESOURCE);
                    if (nodeD2 != null) {
                        hVar2.f16778g = true;
                        try {
                            hVar2.f16777f = w1.a(nodeD2);
                            hVar2.f16773b = w1.b(nodeD2, VastAttributes.API_FRAMEWORK);
                            hVar2.f16772a = new URL(hVar2.f16777f);
                        } catch (MalformedURLException unused) {
                        }
                    }
                    Node nodeD3 = w1.d(node2, VastTagName.TRACKING_EVENTS);
                    if (nodeD3 != null) {
                        for (Node node3 : w1.c(nodeD3, VastTagName.TRACKING)) {
                            if (node3 == null) {
                                wVar = null;
                            } else {
                                wVar = new w();
                                wVar.f16904a = w1.b(node3, "event");
                                wVar.f16905b = w1.a(node3);
                                wVar.f16906c = w1.b(node3, TypedValues.CycleType.S_WAVE_OFFSET);
                            }
                            if (node3 != null && wVar.f16904a.equalsIgnoreCase("verificationNotExecuted")) {
                                hVar2.a(x.EVENT_VERIFICATION_NOT_EXECUTED, wVar.f16905b);
                            }
                        }
                    }
                    Node nodeD4 = w1.d(node2, VastTagName.VERIFICATION_PARAMETERS);
                    if (nodeD4 != null) {
                        hVar2.f16775d = w1.a(nodeD4);
                    }
                    hVar = hVar2;
                }
                if (hVar != null) {
                    IAlog.a("Verification Found - %s", hVar.toString());
                    this.f16856d.add(hVar);
                }
            }
        }
    }

    public void b(Node node) {
        Node nodeD;
        NodeList childNodes;
        NodeList childNodes2;
        m mVar;
        Iterator it;
        h hVar;
        Iterator it2;
        w wVar;
        w wVar2;
        Iterator it3;
        Iterator it4;
        r rVar;
        g gVar = this;
        Node nodeD2 = w1.d(node, VastTagName.AD_SYSTEM);
        if (nodeD2 != null) {
            w1.b(nodeD2, "version");
            w1.a(nodeD2);
        }
        Node nodeD3 = w1.d(node, VastTagName.ERROR);
        if (nodeD3 != null) {
            String strA = w1.a(nodeD3);
            if (!TextUtils.isEmpty(strA)) {
                gVar.f16853a = strA;
            }
        }
        Iterator it5 = w1.c(node, VastTagName.IMPRESSION).iterator();
        while (it5.hasNext()) {
            String strA2 = w1.a((Node) it5.next());
            if (!TextUtils.isEmpty(strA2)) {
                gVar.f16854b.add(strA2);
            }
        }
        Node nodeD4 = w1.d(node, VastTagName.CREATIVES);
        if (nodeD4 != null) {
            Iterator it6 = w1.c(nodeD4, VastTagName.CREATIVE).iterator();
            while (it6.hasNext()) {
                Node node2 = (Node) it6.next();
                if (node2 == null) {
                    it = it6;
                    mVar = null;
                } else {
                    mVar = new m();
                    if (TextUtils.isEmpty(w1.b(node2, "AdID"))) {
                        w1.b(node2, f.b.f33716c);
                    }
                    w1.b(node2, "id");
                    w1.a(node2, "sequence");
                    Node nodeD5 = w1.d(node2, VastTagName.LINEAR);
                    if (nodeD5 != null) {
                        q qVar = new q();
                        it = it6;
                        Node nodeD6 = w1.d(nodeD5, VastTagName.MEDIA_FILES);
                        if (nodeD6 != null) {
                            ArrayList arrayListC = w1.c(nodeD6, VastTagName.MEDIA_FILE);
                            if (!arrayListC.isEmpty()) {
                                qVar.f16881a = new ArrayList();
                                Iterator it7 = arrayListC.iterator();
                                while (it7.hasNext()) {
                                    Node node3 = (Node) it7.next();
                                    if (node3 == null) {
                                        it4 = it7;
                                        rVar = null;
                                    } else {
                                        it4 = it7;
                                        rVar = new r();
                                        rVar.f16886a = w1.b(node3, "delivery");
                                        rVar.f16887b = w1.a(node3, "width");
                                        rVar.f16888c = w1.a(node3, "height");
                                        rVar.f16889d = w1.b(node3, "type");
                                        w1.b(node3, "id");
                                        rVar.f16891f = w1.b(node3, VastAttributes.API_FRAMEWORK);
                                        rVar.f16890e = w1.a(node3, VastAttributes.BITRATE);
                                        String strB = w1.b(node3, VastAttributes.MAINTAIN_ASPECT_RATION);
                                        if (!TextUtils.isEmpty(strB)) {
                                            try {
                                                Boolean.valueOf(strB);
                                            } catch (Exception unused) {
                                            }
                                        }
                                        String strB2 = w1.b(node3, VastAttributes.SCALABLE);
                                        if (!TextUtils.isEmpty(strB2)) {
                                            try {
                                                Boolean.valueOf(strB2);
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        rVar.f16892g = w1.a(node3);
                                    }
                                    if (rVar != null) {
                                        qVar.f16881a.add(rVar);
                                    }
                                    it7 = it4;
                                }
                            }
                        }
                        Node nodeD7 = w1.d(nodeD5, VastTagName.VIDEO_CLICKS);
                        if (nodeD7 != null) {
                            qVar.f16883c = w1.a(w1.d(nodeD7, VastTagName.CLICK_THROUGH));
                            ArrayList arrayListC2 = w1.c(nodeD7, VastTagName.CLICK_TRACKING);
                            if (!arrayListC2.isEmpty()) {
                                qVar.f16884d = new ArrayList();
                                Iterator it8 = arrayListC2.iterator();
                                while (it8.hasNext()) {
                                    String strA3 = w1.a((Node) it8.next());
                                    if (!TextUtils.isEmpty(strA3)) {
                                        qVar.f16884d.add(strA3);
                                    }
                                }
                            }
                        }
                        Node nodeD8 = w1.d(nodeD5, VastTagName.TRACKING_EVENTS);
                        if (nodeD8 != null) {
                            ArrayList arrayListC3 = w1.c(nodeD8, VastTagName.TRACKING);
                            if (!arrayListC3.isEmpty()) {
                                qVar.f16882b = new ArrayList();
                                Iterator it9 = arrayListC3.iterator();
                                while (it9.hasNext()) {
                                    Node node4 = (Node) it9.next();
                                    if (node4 == null) {
                                        it3 = it9;
                                        wVar2 = null;
                                    } else {
                                        wVar2 = new w();
                                        it3 = it9;
                                        wVar2.f16904a = w1.b(node4, "event");
                                        wVar2.f16905b = w1.a(node4);
                                        wVar2.f16906c = w1.b(node4, TypedValues.CycleType.S_WAVE_OFFSET);
                                    }
                                    if (wVar2 != null) {
                                        qVar.f16882b.add(wVar2);
                                    }
                                    it9 = it3;
                                }
                            }
                        }
                        Node nodeD9 = w1.d(nodeD5, VastTagName.DURATION);
                        if (nodeD9 != null) {
                            qVar.f16885e = w1.a(nodeD9);
                        }
                        mVar.f16874a = qVar;
                    } else {
                        it = it6;
                    }
                    Node nodeD10 = w1.d(node2, VastTagName.COMPANION_ADS);
                    if (nodeD10 != null) {
                        j jVar = new j();
                        String strB3 = w1.b(nodeD10, VastAttributes.REQUIRED);
                        if (!"all".equalsIgnoreCase(strB3)) {
                            "none".equalsIgnoreCase(strB3);
                        }
                        ArrayList arrayListC4 = w1.c(nodeD10, VastTagName.COMPANION);
                        jVar.f16871a.clear();
                        Iterator it10 = arrayListC4.iterator();
                        while (it10.hasNext()) {
                            Node node5 = (Node) it10.next();
                            if (node5 == null) {
                                it2 = it10;
                                hVar = null;
                            } else {
                                hVar = new h();
                                hVar.f16861a = w1.a(node5, "width");
                                hVar.f16862b = w1.a(node5, "height");
                                hVar.f16863c = w1.b(node5, "id");
                                w1.b(node5, VastAttributes.API_FRAMEWORK);
                                w1.a(node5, VastAttributes.EXPANDED_WIDTH);
                                w1.a(node5, VastAttributes.EXPANDED_HEIGHT);
                                Node nodeD11 = w1.d(node5, VastTagName.STATIC_RESOURCE);
                                if (nodeD11 != null) {
                                    l lVar = new l();
                                    it2 = it10;
                                    lVar.f16872a = w1.b(nodeD11, "creativeType");
                                    lVar.f16873b = w1.a(nodeD11);
                                    hVar.f16864d = lVar;
                                } else {
                                    it2 = it10;
                                }
                                Node nodeD12 = w1.d(node5, VastTagName.HTML_RESOURCE);
                                if (nodeD12 != null) {
                                    hVar.f16866f = w1.a(nodeD12);
                                }
                                Node nodeD13 = w1.d(node5, VastTagName.I_FRAME_RESOURCE);
                                if (nodeD13 != null) {
                                    hVar.f16865e = w1.a(nodeD13);
                                }
                                Node nodeD14 = w1.d(node5, VastTagName.COMPANION_CLICK_THROUGH);
                                if (nodeD14 != null) {
                                    hVar.f16867g = w1.a(nodeD14);
                                }
                                hVar.f16868h.clear();
                                ArrayList arrayListC5 = w1.c(node5, VastTagName.COMPANION_CLICK_TRACKING);
                                if (arrayListC5.size() > 0) {
                                    Iterator it11 = arrayListC5.iterator();
                                    while (it11.hasNext()) {
                                        String strA4 = w1.a((Node) it11.next());
                                        if (!TextUtils.isEmpty(strA4)) {
                                            hVar.f16868h.add(strA4);
                                        }
                                    }
                                }
                                hVar.f16870j.clear();
                                Node nodeD15 = w1.d(node5, VastTagName.TRACKING_EVENTS);
                                if (nodeD15 != null) {
                                    ArrayList<Node> arrayListC6 = w1.c(nodeD15, VastTagName.TRACKING);
                                    if (!arrayListC6.isEmpty()) {
                                        for (Node node6 : arrayListC6) {
                                            if (node6 == null) {
                                                wVar = null;
                                            } else {
                                                wVar = new w();
                                                wVar.f16904a = w1.b(node6, "event");
                                                wVar.f16905b = w1.a(node6);
                                                wVar.f16906c = w1.b(node6, TypedValues.CycleType.S_WAVE_OFFSET);
                                            }
                                            if (wVar != null) {
                                                hVar.f16870j.add(wVar);
                                            }
                                        }
                                    }
                                }
                            }
                            if (hVar != null) {
                                jVar.f16871a.add(hVar);
                            }
                            it10 = it2;
                        }
                        mVar.f16875b = jVar;
                    }
                }
                gVar = this;
                if (mVar != null) {
                    gVar.f16855c.add(mVar);
                }
                it6 = it;
            }
        }
        Node nodeD16 = w1.d(node, VastTagName.EXTENSIONS);
        if (nodeD16 != null) {
            for (Node node7 : w1.c(nodeD16, VastTagName.EXTENSION)) {
                if ("AdVerifications".equalsIgnoreCase(w1.b(node7, "type"))) {
                    gVar.a(node7);
                }
                if ("FMPCompanionAssets".equalsIgnoreCase(w1.b(node7, "type"))) {
                    IAlog.a("parseFMPCompanionAssetsTag", new Object[0]);
                    Node nodeD17 = w1.d(node7, "FMPCompanionAssets");
                    if (nodeD17 != null) {
                        o oVar = new o();
                        String strB4 = w1.b(nodeD17, "enableMultipleCompanions");
                        if (com.ironsource.mediationsdk.metadata.a.f32683h.equalsIgnoreCase(strB4) || "0".equals(strB4)) {
                            oVar.f16880d = false;
                        }
                        Node nodeD18 = w1.d(nodeD17, "Name");
                        if (nodeD18 != null) {
                            oVar.f16877a = w1.a(nodeD18);
                        }
                        Node nodeD19 = w1.d(nodeD17, "Description");
                        if (nodeD19 != null) {
                            w1.a(nodeD19);
                        }
                        oVar.f16878b.clear();
                        Node nodeD20 = w1.d(nodeD17, "Icons");
                        if (nodeD20 != null) {
                            Iterator it12 = w1.c(nodeD20, "Icon").iterator();
                            while (it12.hasNext()) {
                                oVar.f16878b.add(w1.a((Node) it12.next()));
                            }
                        }
                        Node nodeD21 = w1.d(nodeD17, "Rating");
                        if (nodeD21 != null) {
                            try {
                                Float.parseFloat(w1.a(nodeD21));
                            } catch (Exception unused3) {
                            }
                        }
                        Node nodeD22 = w1.d(nodeD17, "Screenshots");
                        if (nodeD22 != null) {
                            oVar.f16879c = new ArrayList();
                            Iterator it13 = w1.c(nodeD22, "Screenshot").iterator();
                            while (it13.hasNext()) {
                                String strA5 = w1.a((Node) it13.next());
                                if (!TextUtils.isEmpty(strA5)) {
                                    oVar.f16879c.add(strA5);
                                }
                            }
                        }
                        gVar.f16857e = oVar;
                    }
                }
                if ("DynamicVideoControlsURL".equalsIgnoreCase(w1.b(node7, "type"))) {
                    Node nodeD23 = w1.d(node7, "DynamicVideoControlsURL");
                    n nVar = new n();
                    if (nodeD23 != null) {
                        nVar.f16876a = w1.a(nodeD23);
                    }
                    if (!TextUtils.isEmpty(nVar.f16876a)) {
                        gVar.f16860h.add(nVar);
                    }
                }
                if ("StorePromoAssets".equalsIgnoreCase(w1.b(node7, "type")) && (nodeD = w1.d(node7, "DTSPR")) != null) {
                    v vVar = new v();
                    Node nodeD24 = w1.d(nodeD, "DTSPNm");
                    if (nodeD24 != null) {
                        vVar.f16896b = w1.a(nodeD24);
                    }
                    Node nodeD25 = w1.d(nodeD, "DTSPTUrl");
                    if (nodeD25 != null) {
                        vVar.f16897c = w1.a(nodeD25);
                    }
                    Node nodeD26 = w1.d(nodeD, "DTSPPNm");
                    if (nodeD26 != null) {
                        vVar.f16903i = w1.a(nodeD26);
                    }
                    Node nodeD27 = w1.d(nodeD, "DTSPIap");
                    if (nodeD27 != null) {
                        vVar.f16898d = w1.a(nodeD27);
                    }
                    Node nodeD28 = w1.d(nodeD, "DTSPCads");
                    if (nodeD28 != null) {
                        vVar.f16899e = w1.a(nodeD28);
                    }
                    Node nodeD29 = w1.d(nodeD, "DTSPMedia");
                    if (nodeD29 != null && (childNodes2 = nodeD29.getChildNodes()) != null && childNodes2.getLength() != 0) {
                        for (int i10 = 0; i10 < childNodes2.getLength(); i10++) {
                            Node nodeItem = childNodes2.item(i10);
                            if (nodeItem != null) {
                                String nodeName = nodeItem.getNodeName();
                                String strA6 = w1.a(nodeItem);
                                if (!TextUtils.isEmpty(strA6)) {
                                    if ("DTSPScrn".equalsIgnoreCase(nodeName)) {
                                        vVar.f16900f.add(strA6);
                                    } else if ("DTSPVid".equalsIgnoreCase(nodeName)) {
                                        vVar.f16901g.add(strA6);
                                    } else if ("DTSPIcon".equalsIgnoreCase(nodeName)) {
                                        vVar.f16895a = strA6;
                                    }
                                }
                            }
                        }
                    }
                    Node nodeD30 = w1.d(nodeD, "DTSPMetadata");
                    if (nodeD30 != null && (childNodes = nodeD30.getChildNodes()) != null && childNodes.getLength() != 0) {
                        String strA7 = null;
                        String strA8 = null;
                        String strA9 = null;
                        for (int i11 = 0; i11 < childNodes.getLength(); i11++) {
                            Node nodeItem2 = childNodes.item(i11);
                            if (nodeItem2 != null) {
                                String nodeName2 = nodeItem2.getNodeName();
                                if ("DTSPLabel".equalsIgnoreCase(nodeName2)) {
                                    strA7 = w1.a(nodeItem2);
                                } else if ("DTSPRating".equalsIgnoreCase(nodeName2)) {
                                    strA8 = w1.a(nodeItem2);
                                } else if ("DTSPSize".equalsIgnoreCase(nodeName2)) {
                                    strA9 = w1.a(nodeItem2);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(strA7) && !TextUtils.isEmpty(strA8) && !TextUtils.isEmpty(strA9)) {
                            vVar.f16902h = new com.fyber.inneractive.sdk.flow.storepromo.model.d(strA8, strA7, strA9);
                        }
                    }
                    gVar.f16859g = vVar;
                }
            }
        }
        a(node);
    }
}
