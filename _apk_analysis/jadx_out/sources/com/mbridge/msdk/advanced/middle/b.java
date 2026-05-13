package com.mbridge.msdk.advanced.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import java.util.ArrayList;

/* JADX INFO: compiled from: NativeAdvancedLoadListenerImpl.java */
/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NativeAdvancedAdListener f35465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f35466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeIds f35467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35469e;

    public b(c cVar, MBridgeIds mBridgeIds) {
        this.f35466b = cVar;
        this.f35467c = mBridgeIds;
        this.f35468d = mBridgeIds.getUnitId();
    }

    public void a(CampaignEx campaignEx, int i10) {
        c cVar;
        q0.b("NativeAdvancedLoadManager", "onLoadSuccessed: " + i10);
        c cVar2 = this.f35466b;
        if (cVar2 == null || !cVar2.g() || campaignEx == null) {
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f35465a;
        if (nativeAdvancedAdListener != null && this.f35466b != null) {
            nativeAdvancedAdListener.onLoadSuccessed(this.f35467c);
        }
        this.f35466b.a(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), arrayList, this.f35468d, campaignEx.isBidCampaign());
        if (i10 != 2 || (cVar = this.f35466b) == null) {
            return;
        }
        cVar.a(campaignEx, true);
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar, int i10) {
        c cVar = this.f35466b;
        if (cVar == null || !cVar.g()) {
            return;
        }
        String str = "";
        if (bVar != null) {
            String strL = bVar.l();
            if (!TextUtils.isEmpty(strL)) {
                str = strL;
            }
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f35465a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.f35467c, str);
        }
        this.f35466b.a(false);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, this.f35468d, !TextUtils.isEmpty(this.f35469e), bVar != null ? bVar.d() : null);
    }

    public void a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f35465a = nativeAdvancedAdListener;
    }

    public void a(String str) {
        this.f35469e = str;
    }
}
