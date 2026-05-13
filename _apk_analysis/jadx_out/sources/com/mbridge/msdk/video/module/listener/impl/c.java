package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.signal.factory.IJSFactory;

/* JADX INFO: compiled from: ContainerViewJSListener.java */
/* JADX INFO: loaded from: classes3.dex */
public class c extends d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IJSFactory f41858n;

    public c(IJSFactory iJSFactory, CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f41858n = iJSFactory;
        if (iJSFactory == null) {
            this.f41867a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.d, com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        if (this.f41867a) {
            if (i10 != 8) {
                if (i10 == 105) {
                    this.f41858n.getJSNotifyProxy().a(3, obj.toString());
                    i10 = -1;
                } else if (i10 == 107) {
                    this.f41858n.getJSContainerModule().showVideoClickView(-1);
                    this.f41858n.getJSVideoModule().setCover(false);
                    this.f41858n.getJSVideoModule().setMiniEndCardState(false);
                    this.f41858n.getJSVideoModule().videoOperate(1);
                } else if (i10 == 112) {
                    this.f41858n.getJSVideoModule().setCover(true);
                    this.f41858n.getJSVideoModule().setMiniEndCardState(true);
                    this.f41858n.getJSVideoModule().videoOperate(2);
                } else if (i10 == 115) {
                    com.mbridge.msdk.video.signal.j jSVideoModule = this.f41858n.getJSVideoModule();
                    this.f41858n.getJSContainerModule().resizeMiniCard(jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                }
            } else if (this.f41858n.getJSContainerModule().showAlertWebView()) {
                this.f41858n.getJSVideoModule().alertWebViewShowed();
            } else {
                this.f41858n.getJSVideoModule().showAlertView();
            }
        }
        super.a(i10, obj);
    }
}
