package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.safedk.android.internal.special.SpecialsBridge;

/* JADX INFO: compiled from: ContainerViewDefaultListener.java */
/* JADX INFO: loaded from: classes3.dex */
public class b extends d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MBridgeVideoView f41856n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MBridgeContainerView f41857o;

    public b(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f41856n = mBridgeVideoView;
        this.f41857o = mBridgeContainerView;
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f41867a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.d, com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        if (this.f41867a) {
            if (i10 == 8) {
                MBridgeContainerView mBridgeContainerView = this.f41857o;
                if (mBridgeContainerView == null) {
                    MBridgeVideoView mBridgeVideoView = this.f41856n;
                    if (mBridgeVideoView != null) {
                        mBridgeVideoView.showAlertView();
                    }
                } else if (mBridgeContainerView.showAlertWebView()) {
                    MBridgeVideoView mBridgeVideoView2 = this.f41856n;
                    if (mBridgeVideoView2 != null) {
                        mBridgeVideoView2.alertWebViewShowed();
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView3 = this.f41856n;
                    if (mBridgeVideoView3 != null) {
                        mBridgeVideoView3.showAlertView();
                    }
                }
            } else if (i10 == 107) {
                this.f41857o.showVideoClickView(-1);
                this.f41856n.setCover(false);
                this.f41856n.setMiniEndCardState(false);
                SpecialsBridge.MBridgeVideoView_videoOperate(this.f41856n, 1);
            } else if (i10 == 112) {
                this.f41856n.setCover(true);
                this.f41856n.setMiniEndCardState(true);
                SpecialsBridge.MBridgeVideoView_videoOperate(this.f41856n, 2);
            } else if (i10 == 115) {
                this.f41857o.resizeMiniCard(this.f41856n.getBorderViewWidth(), this.f41856n.getBorderViewHeight(), this.f41856n.getBorderViewRadius());
            }
        }
        super.a(i10, obj);
    }
}
