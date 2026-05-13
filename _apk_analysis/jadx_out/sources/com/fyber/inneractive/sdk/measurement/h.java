package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.x;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public URL f16772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16773b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f16775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f16777f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f16774c = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16778g = false;

    public final String a() {
        if (!this.f16778g) {
            return "JavaScriptResource = ";
        }
        if (TextUtils.isEmpty(this.f16773b)) {
            return "apiFramework = ";
        }
        if (this.f16773b.equalsIgnoreCase(CampaignEx.KEY_OMID)) {
            return "JavaScriptResource_url = " + (TextUtils.isEmpty(this.f16777f) ? "" : this.f16777f);
        }
        return "apiFramework = " + this.f16773b;
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        HashMap map;
        if (xVar == null || (map = this.f16774c) == null) {
            return null;
        }
        return (List) map.get(xVar);
    }

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f16774c.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f16774c.put(xVar, arrayList);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public final boolean b() {
        String str;
        return this.f16778g && this.f16772a != null && ((str = this.f16773b) == null || (!TextUtils.isEmpty(str) && this.f16773b.equalsIgnoreCase(CampaignEx.KEY_OMID)));
    }

    public final String toString() {
        return "Verification{mJavaScriptResource=" + this.f16772a + ", mTrackingEvents=" + this.f16774c + ", mVerificationParameters='" + this.f16775d + "', mVendor='" + this.f16776e + "'}";
    }
}
