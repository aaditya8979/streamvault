package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.Partner;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.inmobi.media.core.config.models.AdConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Partner f26513a;

    static {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(AdConfig.class, "clazz");
        String partnerKey = ((AdConfig) Y3.f26611a.a(AdConfig.class)).getViewability().getOmidConfig().getPartnerKey();
        if (partnerKey.length() == 0) {
            partnerKey = "Inmobi";
        }
        Partner partnerCreatePartner = Partner.createPartner(partnerKey, a());
        tn.p.j(partnerCreatePartner, "createPartner(...)");
        f26513a = partnerCreatePartner;
    }

    public static AdSessionContext a(String str, List list, Map map, String str2, String str3) {
        VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters;
        tn.p.k(str, "omsdkScript");
        tn.p.k(list, "omidTrackers");
        tn.p.k(map, "macros");
        tn.p.k(str3, "customReferenceData");
        tn.p.k(list, "adVerifications");
        tn.p.k(map, "macros");
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3910zf c3910zf = (C3910zf) it.next();
            try {
                String str4 = c3910zf.f28364a;
                if (map != null) {
                    String strS = str4;
                    for (Map.Entry entry : map.entrySet()) {
                        strS = bo.a0.S(strS, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
                    }
                    str4 = strS;
                }
                URL url = new URL(str4);
                String str5 = c3910zf.f28642c;
                String str6 = c3910zf.f28643d;
                verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = (str5.length() <= 0 || !F3.a(str6)) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : VerificationScriptResource.createVerificationScriptResourceWithParameters(str5, url, str6);
            } catch (MalformedURLException unused) {
                verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = null;
            }
            arrayList.add(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters);
        }
        AdSessionContext adSessionContextCreateNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(f26513a, str, cn.f0.q0(arrayList), str2, str3);
        tn.p.j(adSessionContextCreateNativeAdSessionContext, "createNativeAdSessionContext(...)");
        return adSessionContextCreateNativeAdSessionContext;
    }

    public static String a() {
        return "a" + bo.a0.S("11.1.0", ".", "", false, 4, null);
    }
}
