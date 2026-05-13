package com.mbridge.msdk.video.module.listener.impl;

import android.os.Handler;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: VideoViewDefaultListener.java */
/* JADX INFO: loaded from: classes9.dex */
public class m extends o {
    private Timer A;
    private Handler B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private MBridgeVideoView.u H;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private MBridgeVideoView f41884x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private MBridgeContainerView f41885y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f41886z;

    /* JADX INFO: compiled from: VideoViewDefaultListener.java */
    public class a extends TimerTask {

        /* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: VideoViewDefaultListener.java */
        public class RunnableC0526a implements Runnable {
            public RunnableC0526a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m.this.f41885y.showVideoClickView(-1);
                m.this.f41884x.soundOperate(0, 2);
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                m.this.B.post(new RunnableC0526a());
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
        }
    }

    public m(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, int i10, int i11, com.mbridge.msdk.video.module.listener.a aVar2, int i12, boolean z10, int i13) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i12, z10);
        this.B = new Handler();
        this.C = false;
        this.D = false;
        this.E = false;
        this.f41884x = mBridgeVideoView;
        this.f41885y = mBridgeContainerView;
        this.G = i10;
        this.f41886z = i11;
        this.F = i13;
        if (mBridgeVideoView != null) {
            this.C = mBridgeVideoView.getVideoSkipTime() == 0;
        }
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f41867a = false;
        }
    }

    private void a(int i10, int i11) {
        CampaignEx campaignEx;
        if (this.C || this.f41884x == null || (campaignEx = this.f41868b) == null) {
            return;
        }
        int i12 = this.f41886z;
        int i13 = (i12 < 0 || i10 < i12) ? 1 : 2;
        if (i13 != 2 && (campaignEx.getVideoCompleteTime() != 0 ? i10 > this.f41868b.getVideoCompleteTime() : this.f41884x.mCurrPlayNum > 1)) {
            i13 = 2;
        }
        if (i13 != 2 && this.f41884x.mCurrPlayNum > 1 && i10 == i11) {
            i13 = 2;
        }
        if (i13 == 2) {
            this.f41884x.closeVideoOperate(0, i13);
            this.C = true;
        }
    }

    private void n() {
        try {
            Timer timer = this.A;
            if (timer != null) {
                timer.cancel();
                this.A = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void o() {
        CampaignEx campaignEx = this.f41868b;
        if (campaignEx == null || campaignEx.getDynamicTempCode() != 5) {
            return;
        }
        CampaignEx campaignEx2 = null;
        MBridgeVideoView mBridgeVideoView = this.f41884x;
        if (mBridgeVideoView != null && mBridgeVideoView.mCampOrderViewData != null) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 < this.f41884x.mCampOrderViewData.size()) {
                    if (this.f41884x.mCampOrderViewData.get(i11) != null && this.f41884x.mCampOrderViewData.get(i11).getId() == this.f41868b.getId()) {
                        i10 = i11 - 1;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            if (i10 >= 0 && this.f41884x.mCampOrderViewData.get(i10) != null) {
                campaignEx2 = this.f41884x.mCampOrderViewData.get(i10);
            }
        }
        if (campaignEx2 != null) {
            MBridgeVideoView mBridgeVideoView2 = this.f41884x;
            if (mBridgeVideoView2 != null) {
                mBridgeVideoView2.setCampaign(campaignEx2);
            }
            MBridgeContainerView mBridgeContainerView = this.f41885y;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setCampaign(campaignEx2);
            }
            a(campaignEx2);
        }
    }

    private void p() {
        try {
            n();
            this.A = new Timer();
            this.A.schedule(new a(), 3000L);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x035a  */
    @Override // com.mbridge.msdk.video.module.listener.impl.o, com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.listener.impl.m.a(int, java.lang.Object):void");
    }
}
