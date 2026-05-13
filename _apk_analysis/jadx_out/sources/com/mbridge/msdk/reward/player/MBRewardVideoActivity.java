package com.mbridge.msdk.reward.player;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.ironsource.C3978d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.adapter.RewardUnitCacheManager;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.video.bt.module.MBTempContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.bt.module.orglistener.h;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.activity.AbstractJSActivity;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.videocommon.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MBRewardVideoActivity extends AbstractJSActivity {
    public static String INTENT_LOCAL_REQUEST_ID = "lRid";
    public static String SAVE_STATE_KEY_REPORT = "hasRelease";
    private MBridgeBTContainer A;
    private WindVaneWebView B;
    private com.mbridge.msdk.video.bt.module.listener.a C;
    private String D;
    private String E;
    private boolean F;
    private String N;
    private com.mbridge.msdk.foundation.same.report.metrics.c O;
    private boolean Q;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f39546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f39547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f39548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.entity.c f39549i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f39553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f39554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f39555o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private h f39558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f39559s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f39562v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CampaignEx f39563w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.download.a> f39564x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List<CampaignEx> f39565y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private MBTempContainer f39566z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f39550j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f39551k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f39552l = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f39556p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f39557q = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f39560t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f39561u = false;
    private int G = 1;
    private int H = 0;
    private int I = 0;
    private int J = 0;
    private int K = 0;
    private int L = 0;
    private int M = 0;
    private boolean P = false;
    private AdSession R = null;
    private MediaEvents S = null;
    private AdEvents T = null;
    private long U = 0;
    private String V = "";
    private Boolean W = null;
    private int X = 0;
    private boolean Y = false;
    private boolean Z = false;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.a f39544a0 = new a();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.d f39545b0 = new b();

    public class a implements com.mbridge.msdk.video.dynview.listener.a {
        public a() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.a
        public void a(Map<String, Object> map) {
            if (map == null) {
                return;
            }
            if (map.containsKey(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                MBRewardVideoActivity.this.f39550j = ((Integer) map.get(CampaignEx.JSON_NATIVE_VIDEO_MUTE)).intValue();
            }
            if (map.containsKey(C3978d4.i.L)) {
                int iIntValue = ((Integer) map.get(C3978d4.i.L)).intValue();
                if (MBRewardVideoActivity.this.f39565y == null || MBRewardVideoActivity.this.f39565y.size() <= 0 || iIntValue < 1) {
                    return;
                }
                MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                mBRewardVideoActivity.f39563w = (CampaignEx) mBRewardVideoActivity.f39565y.get(iIntValue);
                MBRewardVideoActivity.m(MBRewardVideoActivity.this);
                int i10 = iIntValue - 1;
                if (MBRewardVideoActivity.this.f39565y.get(i10) != null) {
                    MBRewardVideoActivity mBRewardVideoActivity2 = MBRewardVideoActivity.this;
                    MBRewardVideoActivity.b(mBRewardVideoActivity2, ((CampaignEx) mBRewardVideoActivity2.f39565y.get(i10)).getVideoLength());
                }
                MBRewardVideoActivity mBRewardVideoActivity3 = MBRewardVideoActivity.this;
                MBRewardVideoActivity.this.f39563w.setVideoCompleteTime(mBRewardVideoActivity3.a(mBRewardVideoActivity3.f39563w.getVideoCompleteTime(), MBRewardVideoActivity.this.G));
                MBRewardVideoActivity.this.f39563w.setShowIndex(MBRewardVideoActivity.this.G);
                MBRewardVideoActivity.this.f39563w.setShowType(1);
                MBRewardVideoActivity mBRewardVideoActivity4 = MBRewardVideoActivity.this;
                mBRewardVideoActivity4.c(mBRewardVideoActivity4.f39563w);
            }
        }
    }

    public class b implements com.mbridge.msdk.video.dynview.listener.d {
        public b() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.d
        public void a() {
            if (MBRewardVideoActivity.this.A != null) {
                new com.mbridge.msdk.video.dynview.ui.b().b(MBRewardVideoActivity.this.A, 500L);
            }
            MBRewardVideoActivity.this.f39556p = true;
            MBRewardVideoActivity.this.j();
            if (MBRewardVideoActivity.this.f39566z != null) {
                MBRewardVideoActivity.this.f39566z.setNotchPadding(MBRewardVideoActivity.this.M, MBRewardVideoActivity.this.I, MBRewardVideoActivity.this.K, MBRewardVideoActivity.this.J, MBRewardVideoActivity.this.L);
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.d
        public void a(CampaignEx campaignEx) {
            if (campaignEx == null) {
                MBRewardVideoActivity.this.b("campaign is null");
                return;
            }
            if (MBRewardVideoActivity.this.A != null) {
                new com.mbridge.msdk.video.dynview.ui.b().b(MBRewardVideoActivity.this.A, 500L);
            }
            MBRewardVideoActivity.this.f39563w = campaignEx;
            MBRewardVideoActivity.this.f39563w.setShowType(2);
            MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
            mBRewardVideoActivity.c(mBRewardVideoActivity.f39563w);
        }
    }

    public class c implements com.mbridge.msdk.video.bt.module.listener.a {
        public c() {
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a() {
            if (MBRewardVideoActivity.this.f39558r != null) {
                MBRewardVideoActivity.this.f39558r.a(MBRewardVideoActivity.this.O);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(int i10, String str, String str2) {
            if (MBRewardVideoActivity.this.f39558r != null) {
                MBRewardVideoActivity.this.f39558r.a(i10, str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(String str) {
            if (MBRewardVideoActivity.this.f39558r != null) {
                MBRewardVideoActivity.this.f39558r.a(MBRewardVideoActivity.this.O, str);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(String str, String str2) {
            if (MBRewardVideoActivity.this.f39558r != null) {
                MBRewardVideoActivity.this.f39558r.a(str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, int i10) {
            if (MBRewardVideoActivity.this.f39558r != null) {
                MBRewardVideoActivity.this.f39558r.a(z10, i10);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, com.mbridge.msdk.videocommon.entity.c cVar) {
            if (MBRewardVideoActivity.this.f39558r != null) {
                MBRewardVideoActivity.this.f39558r.a(MBRewardVideoActivity.this.O, z10, cVar);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, String str, String str2) {
            if (MBRewardVideoActivity.this.f39558r != null) {
                MBRewardVideoActivity.this.f39558r.a(z10, str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void b(String str, String str2) {
            if (MBRewardVideoActivity.this.f39558r != null) {
                MBRewardVideoActivity.this.f39558r.b(str, str2);
            }
        }
    }

    public class d implements com.mbridge.msdk.foundation.feedback.a {
        public d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            MBRewardVideoActivity.this.onPause();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            MBRewardVideoActivity.this.onResume();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            MBRewardVideoActivity.this.onResume();
        }
    }

    public static final class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f39571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f39572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f39573c;

        public e(List<com.mbridge.msdk.videocommon.download.a> list, String str, String str2) {
            this.f39571a = list;
            this.f39572b = str;
            this.f39573c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f39571a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f39571a) {
                    if (aVar != null && aVar.h() != null) {
                        CampaignEx campaignExH = aVar.h();
                        try {
                            AppletModelManager.getInstance().remove(campaignExH);
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("MBRewardVideoActivity", "AppletModelManager remove error", e10);
                            }
                        }
                        com.mbridge.msdk.videocommon.download.b.getInstance().c(this.f39572b, campaignExH.getRequestId() + campaignExH.getId() + campaignExH.getVideoUrlEncode());
                        if (campaignExH.getRewardTemplateMode() != null) {
                            if (!TextUtils.isEmpty(campaignExH.getRewardTemplateMode().j())) {
                                com.mbridge.msdk.videocommon.a.e(this.f39572b + "_" + campaignExH.getId() + "_" + this.f39573c + "_" + campaignExH.getRewardTemplateMode().j());
                                com.mbridge.msdk.videocommon.a.b(campaignExH.getAdType(), campaignExH);
                            }
                            if (!TextUtils.isEmpty(campaignExH.getCMPTEntryUrl())) {
                                com.mbridge.msdk.videocommon.a.e(this.f39572b + "_" + this.f39573c + "_" + campaignExH.getCMPTEntryUrl());
                            }
                            com.mbridge.msdk.videocommon.cache.a.a().a(this.f39572b, campaignExH);
                        }
                    }
                }
            } catch (Exception e11) {
                q0.a("MBRewardVideoActivity", e11.getMessage());
            }
        }
    }

    public static final class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f39574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f39575b;

        public f(String str, List<com.mbridge.msdk.videocommon.download.a> list) {
            this.f39574a = list;
            this.f39575b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f39574a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f39574a) {
                    if (aVar != null && aVar.h() != null) {
                        com.mbridge.msdk.videocommon.cache.a.a().a(aVar.h(), this.f39575b);
                    }
                }
            } catch (Throwable th2) {
                q0.b("MBRewardVideoActivity", th2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, int i11) {
        List<CampaignEx> list = this.f39565y;
        if (list == null || list.size() == 0) {
            return i10;
        }
        int videoLength = 0;
        int videoCompleteTime = 0;
        for (int i12 = 0; i12 < this.f39565y.size(); i12++) {
            if (this.f39565y.get(0) != null) {
                if (i12 == 0) {
                    videoCompleteTime = this.f39565y.get(0).getVideoCompleteTime();
                }
                videoLength += this.f39565y.get(i12).getVideoLength();
            }
        }
        if (i11 == 1) {
            if (i10 == 0) {
                if (videoLength >= 45) {
                    return 45;
                }
            } else if (videoLength > i10) {
                if (i10 > 45) {
                    return 45;
                }
                return i10;
            }
            return videoLength;
        }
        int videoLength2 = 0;
        for (int i13 = 0; i13 < i11 - 1; i13++) {
            if (this.f39565y.get(i13) != null) {
                videoLength2 += this.f39565y.get(i13).getVideoLength();
            }
        }
        if (videoCompleteTime > videoLength2) {
            return videoCompleteTime - videoLength2;
        }
        return 0;
    }

    private WindVaneWebView a(String str) {
        a.C0529a c0529aB = com.mbridge.msdk.videocommon.a.b(str);
        if (c0529aB != null) {
            return c0529aB.b();
        }
        return null;
    }

    private void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getImageUrl());
            }
            if (TextUtils.isEmpty(campaignEx.getIconUrl())) {
                return;
            }
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getIconUrl());
        }
    }

    private void a(List<CampaignEx> list) {
        CampaignEx campaignEx;
        if (this.Q) {
            return;
        }
        if (list == null) {
            try {
                if (this.f39556p) {
                    list = this.f39565y;
                } else {
                    list = new ArrayList<>();
                    List<com.mbridge.msdk.videocommon.download.a> list2 = this.f39564x;
                    if (list2 != null && list2.get(0) != null && this.f39564x.get(0).h() != null) {
                        list.add(this.f39564x.get(0).h());
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        String currentLocalRid = "";
        if (list != null && !list.isEmpty() && (campaignEx = list.get(0)) != null) {
            currentLocalRid = campaignEx.getCurrentLocalRid();
        }
        if (!TextUtils.isEmpty(currentLocalRid)) {
            this.O = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
        }
        if (this.O == null) {
            this.O = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39546f);
            eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f39552l ? 1 : 0));
            eVar.a("adtp", Integer.valueOf(this.f39551k ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94));
            eVar.a("lrid", this.N);
            eVar.a("his_reason", "show campaign is null");
            this.O.a("2000129", eVar);
        }
        if (list != null) {
            this.O.b(list);
        }
        this.Q = true;
        com.mbridge.msdk.reward.report.metrics.a.a().a("2000129", this.O);
    }

    public static /* synthetic */ int b(MBRewardVideoActivity mBRewardVideoActivity, int i10) {
        int i11 = mBRewardVideoActivity.H - i10;
        mBRewardVideoActivity.H = i11;
        return i11;
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isActiveOm() && this.R == null) {
                    AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(getApplicationContext(), false, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f39546f, campaignEx.getVideoUrlEncode(), campaignEx.getRequestIdNotice());
                    this.R = adSessionA;
                    if (adSessionA != null) {
                        this.T = AdEvents.createAdEvents(adSessionA);
                        this.S = MediaEvents.createMediaEvents(this.R);
                    }
                }
            } catch (Throwable th2) {
                q0.b("MBRewardVideoActivity", th2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        q0.b("MBRewardVideoActivity", str);
        a(this.f39565y);
        h hVar = this.f39558r;
        if (hVar != null) {
            hVar.a(this.O, str);
        }
        finish();
    }

    private void b(List<CampaignEx> list) {
        int dynamicTempCode;
        if (list == null) {
            b("no available campaign");
            return;
        }
        if (list.size() == 0) {
            b("no available campaign");
            return;
        }
        if (list.get(0) != null) {
            dynamicTempCode = list.get(0).getDynamicTempCode();
            this.N = list.get(0).getCurrentLocalRid();
        } else {
            dynamicTempCode = 0;
        }
        if (dynamicTempCode != 5) {
            k();
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null) {
                this.H += campaignEx.getVideoLength();
            }
        }
        e(list.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CampaignEx campaignEx) {
        CampaignEx campaignExH;
        try {
            List<com.mbridge.msdk.videocommon.download.a> list = this.f39564x;
            if (list != null && list.size() > 0) {
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f39564x) {
                    if (aVar != null && (campaignExH = aVar.h()) != null && TextUtils.equals(campaignExH.getId(), campaignEx.getId()) && TextUtils.equals(campaignExH.getRequestId(), campaignEx.getRequestId())) {
                        this.f39562v = aVar;
                    }
                }
            }
            this.f39556p = true;
            j();
            MBTempContainer mBTempContainer = this.f39566z;
            if (mBTempContainer != null) {
                mBTempContainer.setNotchPadding(this.M, this.I, this.K, this.J, this.L);
            }
        } catch (Exception e10) {
            q0.b("MBRewardVideoActivity", e10.getMessage());
            b("more offer to one offer exception");
        }
    }

    private void d(CampaignEx campaignEx) {
        com.mbridge.msdk.reward.player.a.a(this, campaignEx, this.f39559s, this.f39546f);
    }

    private void e() {
        try {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f39546f, this.f39551k ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
            if (bitmapDrawableA != null) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                v0.a(imageView, bitmapDrawableA, getResources().getDisplayMetrics());
                ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                AdSession adSession = this.R;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(imageView, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void e(CampaignEx campaignEx) {
        if (campaignEx == null) {
            b("campaign is less");
            return;
        }
        int iA = a(campaignEx.getVideoCompleteTime(), this.G);
        this.f39563w = campaignEx;
        campaignEx.setCampaignIsFiltered(true);
        this.G = 1;
        this.f39563w.setVideoCompleteTime(iA);
        this.f39563w.setShowIndex(this.G);
        this.f39563w.setShowType(1);
        c(this.f39563w);
    }

    private void f() {
        h hVar = this.f39558r;
        if (hVar == null || !(hVar instanceof com.mbridge.msdk.video.bt.module.orglistener.b)) {
            return;
        }
        try {
            com.mbridge.msdk.video.bt.module.orglistener.b bVar = (com.mbridge.msdk.video.bt.module.orglistener.b) hVar;
            Boolean boolD = bVar.d();
            Boolean boolC = bVar.c();
            if (boolD == null && boolC == null) {
                this.W = null;
            } else {
                Boolean bool = Boolean.FALSE;
                this.W = Boolean.valueOf(bool.equals(boolD) && bool.equals(boolC));
            }
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    private void g() {
        h hVar;
        try {
            Boolean bool = this.W;
            if ((bool == null || bool.booleanValue()) && (hVar = this.f39558r) != null) {
                hVar.a(this.O, "show fail : unexpected destroy");
            }
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    private void h() {
        try {
            List<CampaignEx> list = this.f39565y;
            if (list != null && list.size() > 0) {
                Iterator<CampaignEx> it = this.f39565y.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            CampaignEx campaignEx = this.f39563w;
            if (campaignEx != null) {
                a(campaignEx);
            }
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    private com.mbridge.msdk.video.bt.module.listener.a i() {
        if (this.C == null) {
            this.C = new c();
        }
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        List<CampaignEx> list;
        RewardPlus rewardPlus;
        CampaignEx campaignEx;
        List<CampaignEx> list2;
        int iFindID = findID("mbridge_temp_container");
        if (!i0.a(iFindID)) {
            b("no id mbridge_bt_container in mbridge_more_offer_activity layout");
        }
        MBTempContainer mBTempContainer = (MBTempContainer) findViewById(iFindID);
        this.f39566z = mBTempContainer;
        if (mBTempContainer == null) {
            b("env error");
        }
        List<CampaignEx> list3 = this.f39565y;
        if (list3 == null || list3.size() <= 0 || !this.f39565y.get(0).isDynamicView()) {
            this.f39566z.setVisibility(0);
        } else {
            new com.mbridge.msdk.video.dynview.ui.b().a(this.f39566z, 500L);
        }
        changeHalfScreenPadding(-1);
        this.f39566z.setActivity(this);
        this.f39566z.setBidCampaign(this.f39552l);
        this.f39566z.setBigOffer(this.f39556p);
        this.f39566z.setUnitId(this.f39546f);
        this.f39566z.setCampaign(this.f39563w);
        if (this.f39563w.getDynamicTempCode() == 5 && (list2 = this.f39565y) != null && list2.size() > 1) {
            View viewFindViewById = findViewById(findID("mbridge_reward_root_container"));
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            this.f39566z.removeAllViews();
            this.f39566z.setCampOrderViewData(this.f39565y, this.H);
            this.f39566z.setCamPlayOrderCallback(this.f39544a0, this.G);
        }
        this.f39566z.setCampaignDownLoadTask(this.f39562v);
        this.f39566z.setIV(this.f39551k);
        CampaignEx campaignEx2 = this.f39563w;
        if (campaignEx2 == null || campaignEx2.getAdSpaceT() != 2) {
            this.f39566z.setIVRewardEnable(this.f39553m, this.f39554n, this.f39555o);
        } else {
            this.f39566z.setIVRewardEnable(0, 0, 0);
        }
        this.f39566z.setMute(this.f39550j);
        CampaignEx campaignEx3 = this.f39563w;
        if (((campaignEx3 != null && (rewardPlus = campaignEx3.getRewardPlus()) != null) || ((list = this.f39565y) != null && list.size() > 0 && this.f39565y.get(0) != null && (rewardPlus = this.f39565y.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            com.mbridge.msdk.videocommon.entity.c cVar = new com.mbridge.msdk.videocommon.entity.c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.a() < 0) {
                cVar.a(1);
            }
            this.f39549i = cVar;
        }
        this.f39566z.setReward(this.f39549i);
        this.f39566z.setRewardUnitSetting(this.f39559s);
        this.f39566z.setPlacementId(this.f39547g);
        this.f39566z.setUserId(this.f39548h);
        this.f39566z.setShowRewardListener(this.f39558r);
        this.f39566z.setDeveloperExtraData(this.E);
        this.f39566z.init(this);
        this.f39566z.setAdSession(this.R);
        this.f39566z.setAdEvents(this.T);
        this.f39566z.setVideoEvents(this.S);
        this.f39566z.onCreate();
        if (!com.mbridge.msdk.util.b.a() || (campaignEx = this.f39563w) == null) {
            return;
        }
        d(campaignEx);
    }

    private void k() {
        RewardPlus rewardPlus;
        List<CampaignEx> list;
        int iFindID = findID("mbridge_bt_container");
        if (!i0.a(iFindID)) {
            b("no mbridge_webview_framelayout in mbridge_more_offer_activity layout");
        }
        MBridgeBTContainer mBridgeBTContainer = (MBridgeBTContainer) findViewById(iFindID);
        this.A = mBridgeBTContainer;
        if (mBridgeBTContainer == null) {
            b("env error");
        }
        this.A.setVisibility(0);
        com.mbridge.msdk.video.bt.module.listener.a aVarI = i();
        this.C = aVarI;
        this.A.setBTContainerCallback(aVarI);
        this.A.setShowRewardVideoListener(this.f39558r);
        this.A.setChoiceOneCallback(this.f39545b0);
        this.A.setCampaigns(this.f39565y);
        this.A.setCampaignDownLoadTasks(this.f39564x);
        this.A.setRewardUnitSetting(this.f39559s);
        this.A.setUnitId(this.f39546f);
        this.A.setPlacementId(this.f39547g);
        this.A.setUserId(this.f39548h);
        this.A.setActivity(this);
        CampaignEx campaignEx = this.f39563w;
        if (((campaignEx != null && (rewardPlus = campaignEx.getRewardPlus()) != null) || (this.f39565y.get(0) != null && (rewardPlus = this.f39565y.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            com.mbridge.msdk.videocommon.entity.c cVar = new com.mbridge.msdk.videocommon.entity.c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.a() < 0) {
                cVar.a(1);
            }
            this.f39549i = cVar;
        }
        this.A.setReward(this.f39549i);
        this.A.setIVRewardEnable(this.f39553m, this.f39554n, this.f39555o);
        this.A.setIV(this.f39551k);
        this.A.setMute(this.f39550j);
        this.A.setJSFactory((com.mbridge.msdk.video.signal.factory.b) this.jsFactory);
        this.A.setDeveloperExtraData(this.E);
        this.A.init(this);
        this.A.setAdSession(this.R);
        this.A.setVideoEvents(this.S);
        this.A.setAdEvents(this.T);
        this.A.onCreate(this.P);
        if (!com.mbridge.msdk.util.b.a() || (list = this.f39565y) == null || list.size() <= 0 || this.f39565y.get(0) == null) {
            return;
        }
        d(this.f39565y.get(0));
    }

    public static /* synthetic */ int m(MBRewardVideoActivity mBRewardVideoActivity) {
        int i10 = mBRewardVideoActivity.G;
        mBRewardVideoActivity.G = i10 + 1;
        return i10;
    }

    public void changeHalfScreenPadding(int i10) {
        int iF;
        int iG;
        int iG2;
        float f10;
        try {
            CampaignEx campaignEx = this.f39563w;
            if (campaignEx == null || campaignEx.getAdSpaceT() != 2) {
                return;
            }
            getWindow().getDecorView().setBackgroundColor(-1728053248);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f39566z.getLayoutParams();
            layoutParams.gravity = 17;
            if (this.f39563w.getRewardTemplateMode().g() == 0) {
                if (i10 == 2) {
                    iF = (int) (v0.f(this) * 0.6f);
                    iG2 = v0.g(this);
                    f10 = iG2 * 0.6f;
                } else {
                    iF = (int) (v0.f(this) * 0.6f);
                    iG = v0.g(this);
                    f10 = iG * 0.7f;
                }
            } else if (this.f39563w.getRewardTemplateMode().g() == 2) {
                iF = (int) (v0.f(this) * 0.6f);
                iG2 = v0.g(this);
                f10 = iG2 * 0.6f;
            } else {
                iF = (int) (v0.f(this) * 0.6f);
                iG = v0.g(this);
                f10 = iG * 0.7f;
            }
            layoutParams.height = iF;
            layoutParams.width = (int) f10;
            this.f39566z.setLayoutParams(layoutParams);
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.f53141o, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public int findID(String str) {
        return i0.a(getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return i0.a(getApplicationContext(), str, "layout");
    }

    @Override // android.app.Activity
    public void finish() {
        this.Y = true;
        com.mbridge.msdk.foundation.controller.c.n().b(0);
        MBTempContainer mBTempContainer = this.f39566z;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f39566z = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f39546f);
        if (this.R != null) {
            q0.b("omsdk", "mbrewardvideoac finish");
            this.R.removeAllFriendlyObstructions();
            this.R.finish();
            this.R = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.A = null;
        }
        super.finish();
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        this.Z = true;
        super.onBackPressed();
        MBTempContainer mBTempContainer = this.f39566z;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f39566z != null) {
            changeHalfScreenPadding(configuration.orientation);
            this.f39566z.onConfigurationChanged(configuration);
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onConfigurationChanged(configuration);
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        List<com.mbridge.msdk.videocommon.download.a> list;
        String cMPTEntryUrl = "";
        super.onCreate(bundle);
        MBridgeConstans.isRewardActivityShowing = true;
        com.mbridge.msdk.foundation.controller.c.n().a(this);
        this.U = SystemClock.elapsedRealtime();
        if (TextUtils.isEmpty(this.V)) {
            str = "onCreate";
        } else {
            str = this.V + "_onCreate";
        }
        this.V = str;
        try {
            Intent intent = getIntent();
            this.f39546f = intent.getStringExtra(MBridgeConstans.UNIT_ID);
            this.f39547g = intent.getStringExtra(MBridgeConstans.PLACEMENT_ID);
            this.f39549i = com.mbridge.msdk.videocommon.entity.c.a(intent.getStringExtra(MBridgeConstans.REWARD_ID));
            this.f39548h = intent.getStringExtra(MBridgeConstans.USER_ID);
            this.f39550j = intent.getIntExtra(MBridgeConstans.MUTE_STATE, 2);
            this.f39551k = intent.getBooleanExtra(MBridgeConstans.IS_IV, false);
            com.mbridge.msdk.foundation.controller.c cVarN = com.mbridge.msdk.foundation.controller.c.n();
            boolean z10 = this.f39551k;
            int i10 = MBSupportMuteAdType.INTERSTITIAL_VIDEO;
            cVarN.b(z10 ? 287 : 94);
            this.f39552l = intent.getBooleanExtra(MBridgeConstans.IS_BID, false);
            this.E = intent.getStringExtra(MBridgeConstans.EXTRA_DATA);
            boolean booleanExtra = intent.getBooleanExtra("is_refactor", false);
            this.P = booleanExtra;
            if (booleanExtra) {
                this.f39558r = MBridgeGlobalCommon.showRewardListenerMap.get(this.f39546f);
            } else {
                this.f39558r = com.mbridge.msdk.reward.controller.a.f39450f0.get(this.f39546f);
            }
            if (this.f39551k) {
                this.f39553m = intent.getIntExtra(MBridgeConstans.IV_REWARD_MODE_TYPE, 0);
                this.f39554n = intent.getIntExtra(MBridgeConstans.IV_REWARD_VALUE_TYPE, 0);
                this.f39555o = intent.getIntExtra(MBridgeConstans.IV_REWARD_VALUE, 0);
            }
            this.f39556p = intent.getBooleanExtra(MBridgeConstans.IS_BIG_OFFER, false);
            this.f39564x = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f39546f);
            this.f39565y = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f39546f);
            int iFindLayout = findLayout("mbridge_more_offer_activity");
            if (!i0.a(iFindLayout)) {
                b("no mbridge_more_offer_activity layout");
                return;
            }
            setContentView(iFindLayout);
            if (TextUtils.isEmpty(this.f39546f)) {
                b("data empty error");
                return;
            }
            com.mbridge.msdk.video.signal.factory.b bVar = new com.mbridge.msdk.video.signal.factory.b(this);
            this.jsFactory = bVar;
            registerJsFactory(bVar);
            h hVar = this.f39558r;
            if (hVar == null) {
                b("showRewardListener is null");
                return;
            }
            this.X = hVar.hashCode();
            com.mbridge.msdk.videocommon.setting.c cVar = RewardUnitCacheManager.getInstance().get(this.f39547g, this.f39546f);
            this.f39559s = cVar;
            if (cVar == null) {
                com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39546f);
                this.f39559s = cVarC;
                if (cVarC == null) {
                    this.f39559s = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39546f, this.f39551k);
                }
            }
            com.mbridge.msdk.videocommon.setting.c cVar2 = this.f39559s;
            if (cVar2 != null) {
                this.f39549i.a(cVar2.d());
                this.f39549i.b(this.f39559s.s());
            }
            com.mbridge.msdk.videocommon.entity.c cVar3 = this.f39549i;
            if (cVar3 != null && cVar3.a() <= 0) {
                this.f39549i.a(1);
            }
            int iA = i0.a(this, "mbridge_reward_activity_open", "anim");
            int iA2 = i0.a(this, "mbridge_reward_activity_stay", "anim");
            if (i0.a(iA) && i0.a(iA2)) {
                overridePendingTransition(iA, iA2);
            }
            if (bundle != null) {
                try {
                    this.f39561u = bundle.getBoolean(SAVE_STATE_KEY_REPORT);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            q0.a("DynamicViewCampaignResourceDownloader", "进入 show，大模板 " + this.f39556p);
            if (!this.f39556p) {
                List<com.mbridge.msdk.videocommon.download.a> list2 = this.f39564x;
                if (list2 != null && list2.size() > 0) {
                    this.f39562v = this.f39564x.get(0);
                }
                com.mbridge.msdk.videocommon.download.a aVar = this.f39562v;
                if (aVar != null) {
                    this.f39563w = aVar.h();
                    this.f39562v.b(true);
                    this.f39562v.d(false);
                    CampaignEx campaignEx = this.f39563w;
                    if (campaignEx != null) {
                        this.N = campaignEx.getCurrentLocalRid();
                        this.f39563w.setShowIndex(1);
                        this.f39563w.setShowType(1);
                        com.mbridge.msdk.reward.controller.a.f39446b0 = this.f39563w.getEcppv();
                        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39563w.getMaitve(), this.f39563w.getMaitve_src());
                    }
                }
                CampaignEx campaignEx2 = this.f39563w;
                if (campaignEx2 != null && !com.mbridge.msdk.foundation.tools.h.a(campaignEx2, this, (View) null, campaignEx2.getImpReportType())) {
                    b("env is exception");
                    return;
                }
                if (this.f39562v != null && this.f39563w != null && this.f39549i != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f39563w);
                    a(arrayList);
                    b(this.f39563w);
                    j();
                    if (com.mbridge.msdk.util.b.a()) {
                        return;
                    }
                    e();
                    return;
                }
                b("data empty error");
                return;
            }
            a(this.f39565y);
            this.D = "";
            List<CampaignEx> list3 = this.f39565y;
            if (list3 != null && list3.size() > 0) {
                CampaignEx campaignEx3 = this.f39565y.get(0);
                if (!com.mbridge.msdk.foundation.tools.h.a(this.f39565y, this, (View) null, campaignEx3.getImpReportType())) {
                    b("env is exception");
                    return;
                }
                b(campaignEx3);
                cMPTEntryUrl = campaignEx3.getCMPTEntryUrl();
                this.D = campaignEx3.getRequestId();
                this.N = campaignEx3.getCurrentLocalRid();
                com.mbridge.msdk.reward.controller.a.f39446b0 = campaignEx3.getEcppv();
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx3.getMaitve(), campaignEx3.getMaitve_src());
            }
            WindVaneWebView windVaneWebViewA = a(this.f39546f + "_" + this.D + "_" + cMPTEntryUrl);
            this.B = windVaneWebViewA;
            if (windVaneWebViewA == null) {
                if (this.f39562v == null && (list = this.f39564x) != null && list.size() > 0) {
                    this.f39562v = this.f39564x.get(0);
                }
                if (this.f39562v == null) {
                    com.mbridge.msdk.videocommon.download.b bVar2 = com.mbridge.msdk.videocommon.download.b.getInstance();
                    if (!this.f39551k) {
                        i10 = 94;
                    }
                    this.f39562v = bVar2.a(i10, this.f39546f, this.f39552l);
                }
                com.mbridge.msdk.videocommon.download.a aVar2 = this.f39562v;
                if (aVar2 != null) {
                    this.f39563w = aVar2.h();
                    this.f39562v.b(true);
                    this.f39562v.d(false);
                }
                if (this.f39562v != null && this.f39563w != null && this.f39549i != null) {
                    this.f39556p = false;
                    List<CampaignEx> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f39565y);
                    if (listA == null) {
                        b("no available campaign");
                        return;
                    }
                    int size = listA.size();
                    if (size == 0) {
                        b("no available campaign");
                        return;
                    }
                    if (listA.get(0) == null || !listA.get(0).isDynamicView()) {
                        j();
                    } else if (size == 1) {
                        CampaignEx campaignEx4 = listA.get(0);
                        this.f39563w = campaignEx4;
                        if (campaignEx4 != null) {
                            this.N = campaignEx4.getCurrentLocalRid();
                            this.f39563w.setCampaignIsFiltered(true);
                        }
                        c(this.f39563w);
                    } else {
                        b(listA);
                    }
                }
                b("data empty error");
                return;
            }
            b(this.f39565y.get(0));
            WindVaneWebView windVaneWebView = this.B;
            if (windVaneWebView != null) {
                b1.a(windVaneWebView, this.f39565y.get(0).getLocalRequestId(), this.f39565y.get(0).getLocalAllowTrackClick());
                try {
                    k kVar = (k) this.B.getObject();
                    kVar.setAdEvents(this.T);
                    kVar.setAdSession(this.R);
                    kVar.setVideoEvents(this.S);
                    this.B.setObject(kVar);
                } catch (Exception e11) {
                    q0.b("MBRewardVideoActivity", e11.getMessage());
                }
            }
            k();
            if (com.mbridge.msdk.util.b.a()) {
                return;
            }
            e();
        } catch (Throwable th2) {
            a(this.f39565y);
            b("onCreate error" + th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onDestroy() {
        String str;
        if (TextUtils.isEmpty(this.V)) {
            str = "onDestroy";
        } else {
            str = this.V + "_onDestroy";
        }
        this.V = str;
        super.onDestroy();
        f();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("activity_life_cycle", TextUtils.isEmpty(this.V) ? "unKnown" : this.V);
        eVar.a("activity_duration", Long.valueOf(SystemClock.elapsedRealtime() - this.U));
        Boolean bool = this.W;
        eVar.a("is_unexpected_destroy", Integer.valueOf(bool == null ? 0 : bool.booleanValue() ? 1 : 2));
        eVar.a("is_listener_null", Integer.valueOf(this.f39558r == null ? 1 : 2));
        eVar.a("is_called_finish", Integer.valueOf(this.Y ? 1 : 2));
        eVar.a("is_back_pressed", Integer.valueOf(this.Z ? 1 : 2));
        h hVar = this.f39558r;
        eVar.a("is_listener_change", Integer.valueOf(hVar != null ? hVar.hashCode() == this.X ? 1 : 2 : 0));
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000151", this.f39563w, eVar);
        g();
        com.mbridge.msdk.video.module.report.b.a(this.f39546f);
        h();
        MBTempContainer mBTempContainer = this.f39566z;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f39566z = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.A = null;
        }
        this.f39544a0 = null;
        this.f39545b0 = null;
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f39546f + "_1");
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f39546f + "_2");
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(this.f39564x, this.f39546f, this.D));
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onPause() {
        String str;
        super.onPause();
        if (TextUtils.isEmpty(this.V)) {
            str = C3978d4.i.f31364t0;
        } else {
            str = this.V + "_onPause";
        }
        this.V = str;
        MBTempContainer mBTempContainer = this.f39566z;
        if (mBTempContainer != null) {
            mBTempContainer.onPause();
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        String str;
        super.onRestart();
        if (TextUtils.isEmpty(this.V)) {
            str = "onRestart";
        } else {
            str = this.V + "_onRestart";
        }
        this.V = str;
        MBTempContainer mBTempContainer = this.f39566z;
        if (mBTempContainer != null) {
            mBTempContainer.onRestart();
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onRestart();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onResume() {
        String str;
        MBridgeVideoView mBridgeVideoView;
        super.onResume();
        if (TextUtils.isEmpty(this.V)) {
            str = C3978d4.i.f31366u0;
        } else {
            str = this.V + "_onResume";
        }
        this.V = str;
        if (com.mbridge.msdk.foundation.feedback.b.f37652f) {
            MBTempContainer mBTempContainer = this.f39566z;
            if (mBTempContainer == null || (mBridgeVideoView = mBTempContainer.mbridgeVideoView) == null) {
                return;
            }
            mBridgeVideoView.setCover(false);
            return;
        }
        com.mbridge.msdk.foundation.controller.c.n().a(this);
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new f(this.f39546f, this.f39564x));
        } catch (Throwable th2) {
            q0.b("MBRewardVideoActivity", th2.getMessage());
        }
        MBTempContainer mBTempContainer2 = this.f39566z;
        if (mBTempContainer2 != null) {
            mBTempContainer2.onResume();
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(SAVE_STATE_KEY_REPORT, this.f39561u);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        String str;
        super.onStart();
        if (TextUtils.isEmpty(this.V)) {
            str = "onStart";
        } else {
            str = this.V + "_onStart";
        }
        this.V = str;
        if (com.mbridge.msdk.foundation.feedback.b.f37652f) {
            return;
        }
        new d();
        MBTempContainer mBTempContainer = this.f39566z;
        if (mBTempContainer != null) {
            mBTempContainer.onStart();
            this.f39563w.setCampaignUnitId(this.f39546f);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f39546f + "_1", this.f39563w);
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStart();
            List<CampaignEx> list = this.f39565y;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = this.f39565y.get(0);
                campaignEx.setCampaignUnitId(this.f39546f);
                com.mbridge.msdk.foundation.feedback.b.b().a(this.f39546f + "_1", campaignEx);
            }
        }
        if (this.F) {
            return;
        }
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f39546f + "_1", 1);
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f39546f + "_2");
        this.F = true;
    }

    @Override // android.app.Activity
    public void onStop() {
        String str;
        if (TextUtils.isEmpty(this.V)) {
            str = "onStop";
        } else {
            str = this.V + "_onStop";
        }
        this.V = str;
        MBridgeConstans.isRewardActivityShowing = false;
        super.onStop();
        MBTempContainer mBTempContainer = this.f39566z;
        if (mBTempContainer != null) {
            mBTempContainer.onStop();
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i0.a(this, "mbridge_transparent_theme", "style"));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14) {
        this.I = i11;
        this.K = i12;
        this.J = i13;
        this.L = i14;
        this.M = i10;
        MBTempContainer mBTempContainer = this.f39566z;
        if (mBTempContainer != null) {
            mBTempContainer.setNotchPadding(i10, i11, i12, i13, i14);
        }
        MBridgeBTContainer mBridgeBTContainer = this.A;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.setNotchPadding(i10, i11, i12, i13, i14);
        }
        com.mbridge.msdk.video.dynview.constant.a.a(i10, i11, i12, i13, i14);
    }
}
