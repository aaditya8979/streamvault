package com.mbridge.msdk.splash.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;

/* JADX INFO: compiled from: SplashLoadListenerImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MBSplashLoadListener f39918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f39919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f39920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f39921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MBridgeIds f39922e;

    public b(c cVar, MBridgeIds mBridgeIds) {
        this.f39919b = cVar;
        this.f39922e = mBridgeIds;
        if (mBridgeIds != null) {
            this.f39920c = mBridgeIds.getUnitId();
        }
    }

    public void a(CampaignEx campaignEx, int i10) {
        c cVar;
        c cVar2 = this.f39919b;
        if (cVar2 == null || !cVar2.g() || campaignEx == null) {
            return;
        }
        MBSplashLoadListener mBSplashLoadListener = this.f39918a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadSuccessed(this.f39922e, i10);
            this.f39918a.isSupportZoomOut(this.f39922e, campaignEx.getFlb() == 1);
        }
        this.f39919b.b(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), arrayList, this.f39920c, campaignEx.isBidCampaign());
        if (i10 != 2 || (cVar = this.f39919b) == null) {
            return;
        }
        cVar.b(campaignEx, 0, true);
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar, int i10) {
        c cVar = this.f39919b;
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
        MBSplashLoadListener mBSplashLoadListener = this.f39918a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadFailed(this.f39922e, str, i10);
        }
        this.f39919b.b(false);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, this.f39920c, !TextUtils.isEmpty(this.f39921d), bVar != null ? bVar.d() : null);
    }

    public void a(MBSplashLoadListener mBSplashLoadListener) {
        this.f39918a = mBSplashLoadListener;
    }

    public void a(String str) {
        this.f39921d = str;
    }
}
