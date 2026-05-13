package com.mbridge.msdk.click;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;

/* JADX INFO: compiled from: DefaultAppletSchemeCallBack.java */
/* JADX INFO: loaded from: classes11.dex */
public class h extends AppletSchemeCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeListener.NativeTrackingListener f35626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CampaignEx f35627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AppletsModel f35628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f35629d;

    public h(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        this.f35626a = nativeTrackingListener;
        this.f35627b = campaignEx;
        this.f35628c = appletsModel;
        this.f35629d = aVar;
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public void onRequestFailed(int i10, String str, String str2) {
        CampaignEx campaignEx = this.f35627b;
        if (campaignEx == null || this.f35628c == null) {
            return;
        }
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f35626a;
            if (nativeTrackingListener != null) {
                try {
                    nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e10.getMessage());
                    }
                }
            }
            this.f35628c.setUserClick(false);
            this.f35628c.setRequestingFinish();
            this.f35627b.setClickURL(str2);
            a aVar = this.f35629d;
            if (aVar != null) {
                try {
                    aVar.a(this.f35627b);
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e11.getMessage());
                    }
                }
            }
        } catch (Exception e12) {
            if (MBridgeConstans.DEBUG) {
                q0.b("DefaultAppletSchemeCallBack", e12.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public void onRequestStart() {
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public void onRequestSuccess(String str) {
        CampaignEx campaignEx = this.f35627b;
        if (campaignEx == null || this.f35628c == null) {
            return;
        }
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f35626a;
            if (nativeTrackingListener != null) {
                try {
                    nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e10.getMessage());
                    }
                }
            }
            this.f35628c.setUserClick(false);
            this.f35628c.setRequestingFinish();
            this.f35627b.setDeepLinkUrl(str);
            a aVar = this.f35629d;
            if (aVar != null) {
                try {
                    aVar.a(this.f35627b);
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e11.getMessage());
                    }
                }
            }
        } catch (Exception e12) {
            if (MBridgeConstans.DEBUG) {
                q0.b("DefaultAppletSchemeCallBack", e12.getMessage());
            }
        }
    }
}
