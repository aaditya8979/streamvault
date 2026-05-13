package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.lh.ouw;
import com.bytedance.sdk.openadsdk.core.qbp;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.core.zin;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ryl {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile ryl vt;
    private com.bytedance.sdk.component.pno.pno fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final ksc.ouw f13327le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final AtomicBoolean f13328lh;
    public final Context ouw;
    private final List<vt> yu;

    public static class lh implements PAGRewardedAdLoadListener {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final AtomicInteger f13336lh;
        private final PAGRewardedAdLoadListener ouw;
        private final AtomicBoolean vt;
        private final com.bytedance.sdk.openadsdk.core.model.ouw yu;

        private lh(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
            this.vt = new AtomicBoolean(false);
            this.ouw = pAGRewardedAdLoadListener;
            this.yu = ouwVar;
            this.f13336lh = new AtomicInteger(ouw());
        }

        public /* synthetic */ lh(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, byte b10) {
            this(pAGRewardedAdLoadListener, ouwVar);
        }

        private int ouw() {
            if (!this.yu.vt()) {
                return 0;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.yu.yu.size(); i11++) {
                vpp vppVar = this.yu.yu.get(i11);
                if (vppVar != null && !od.lh(vppVar) && vppVar.f13788sd != null) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
        public final void onError(int i10, String str) {
            if (this.f13336lh.decrementAndGet() > 0 || this.ouw == null || !this.vt.compareAndSet(false, true)) {
                return;
            }
            this.ouw.onError(i10, str);
            com.bytedance.sdk.openadsdk.rn.lh.ouw("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.lh.1
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                @Nullable
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", lh.this.yu.ouw());
                    com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                    yuVar.ouw = "choose_ad_load_error";
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public final void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.f13336lh.decrementAndGet();
            if (this.ouw == null || !this.vt.compareAndSet(false, true)) {
                return;
            }
            this.ouw.onAdLoaded(pAGRewardedAd);
        }
    }

    public static class ouw implements PAGRewardedAdLoadListener {
        private final boolean fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final com.bytedance.sdk.openadsdk.core.model.ouw f13337lh;
        private final Context ouw;
        private final AdSlot vt;
        private final PAGRewardedAdLoadListener yu;

        public ouw(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, boolean z10) {
            this.ouw = context;
            this.vt = adSlot;
            this.f13337lh = ouwVar;
            this.yu = pAGRewardedAdLoadListener;
            this.fkw = z10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public final /* synthetic */ void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            ryl.ouw(this.ouw).ouw(this.vt, this.f13337lh, this.yu, pAGRewardedAd, this.fkw);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
        public final void onError(int i10, String str) {
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener = this.yu;
            if (pAGRewardedAdLoadListener != null) {
                pAGRewardedAdLoadListener.onError(i10, str);
            }
        }
    }

    public static class vt extends com.bytedance.sdk.component.pno.pno {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final com.bytedance.sdk.openadsdk.core.model.ouw f13338lh;
        public final vpp ouw;
        public final AdSlot vt;

        public vt(vpp vppVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
            super("Reward Task");
            this.ouw = vppVar;
            this.vt = adSlot;
            this.f13338lh = ouwVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            vpp vppVar = this.ouw;
            if (vppVar == null || vppVar.f13788sd == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(CacheDirFactory.getICacheDir(vppVar.f13789sm).ouw(), this.ouw);
            vtVarOuw.ouw("material_meta", this.ouw);
            vtVarOuw.ouw("ad_slot", this.vt);
            com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, new com.bykv.vk.openvk.ouw.ouw.ouw.fkw.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.vt.1
                @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0167ouw
                public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, int i10) {
                    ko.lh("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess with net change !!");
                    cf cfVarOuw = cf.ouw(zih.ouw());
                    vt vtVar = vt.this;
                    cfVarOuw.ouw(vtVar.vt, vtVar.f13338lh);
                }

                @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0167ouw
                public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, int i10, String str) {
                    ko.lh("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail with net change !!");
                }
            });
        }
    }

    private ryl(Context context) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f13328lh = atomicBoolean;
        this.yu = Collections.synchronizedList(new ArrayList());
        ksc.ouw ouwVar = new ksc.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.2
            @Override // com.bytedance.sdk.component.utils.ksc.ouw
            public final void ouw(boolean z10, int i10) {
                if (z10) {
                    if (ryl.this.fkw == null) {
                        ryl rylVar = ryl.this;
                        rylVar.fkw = new com.bytedance.sdk.openadsdk.component.reward.vt("net connect task", rylVar.yu);
                    }
                    com.bytedance.sdk.component.utils.bly.ouw().post(ryl.this.fkw);
                }
            }
        };
        this.f13327le = ouwVar;
        Context contextOuw = context == null ? zih.ouw() : context.getApplicationContext();
        this.ouw = contextOuw;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        ksc.ouw(ouwVar, contextOuw);
    }

    private void lh(final AdSlot adSlot) {
        if (cf.ouw(this.ouw).vt(adSlot.getCodeId(), false) != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.ksc kscVar = new com.bytedance.sdk.openadsdk.core.model.ksc();
        kscVar.vt = 2;
        zih.yu();
        if (com.bytedance.sdk.openadsdk.core.settings.cf.pno(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            kscVar.bly = 2;
        }
        zih.lh().ouw(adSlot, kscVar, 7, new vpp.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.3
            @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
                if (list == null || list.isEmpty()) {
                    return;
                }
                ryl.ouw(ryl.this, ouwVar, new jg(ryl.this.ouw, ouwVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }
        });
    }

    public static ryl ouw(Context context) {
        if (vt == null) {
            synchronized (ryl.class) {
                if (vt == null) {
                    vt = new ryl(context);
                }
            }
        }
        return vt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAd pAGRewardedAd, final boolean z10) {
        com.bytedance.sdk.openadsdk.core.jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.10
            @Override // java.lang.Runnable
            public final void run() {
                if (z10) {
                    ryl.ouw(ryl.this, adSlot);
                } else {
                    cf.ouw(ryl.this.ouw).ouw(adSlot, ouwVar);
                    ryl.ouw(ryl.this, adSlot);
                }
            }
        });
        if (pAGRewardedAdLoadListener != null) {
            pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
        }
    }

    public static /* synthetic */ void ouw(ryl rylVar, AdSlot adSlot) {
        String codeId = adSlot.getCodeId();
        cf cfVarOuw = cf.ouw(rylVar.ouw);
        if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
            com.bytedance.sdk.openadsdk.common.vt.ouw("sp_reward_video_new").yu(codeId);
        } else {
            cfVarOuw.vt.le(codeId);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void ouw(com.bytedance.sdk.openadsdk.component.reward.ryl r16, final com.bytedance.sdk.openadsdk.core.model.ouw r17, final com.bytedance.sdk.openadsdk.component.reward.jg r18, final com.bytedance.sdk.openadsdk.AdSlot r19, final boolean r20, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener r21) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ryl.ouw(com.bytedance.sdk.openadsdk.component.reward.ryl, com.bytedance.sdk.openadsdk.core.model.ouw, com.bytedance.sdk.openadsdk.component.reward.jg, com.bytedance.sdk.openadsdk.AdSlot, boolean, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener):void");
    }

    private void vt(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.model.ksc kscVar = new com.bytedance.sdk.openadsdk.core.model.ksc();
        kscVar.vt = 2;
        zih.yu();
        if (com.bytedance.sdk.openadsdk.core.settings.cf.pno(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            kscVar.bly = 2;
        }
        zih.lh().ouw(adSlot, kscVar, 7, (qbp) new zin() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.1
            public boolean ouw = false;

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.qbp
            public final String ouw() {
                cf.ouw(ryl.this.ouw);
                return cf.ouw(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
            public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                List<com.bytedance.sdk.openadsdk.core.model.vpp> list;
                if (this.ouw || (list = ouwVar.yu) == null || list.isEmpty()) {
                    return;
                }
                ryl.ouw(ryl.this, ouwVar, new jg(ryl.this.ouw, ouwVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.qbp
            public final boolean ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
                cf.ouw(ryl.this.ouw);
                boolean zOuw = cf.ouw(ouwVar);
                this.ouw = zOuw;
                return zOuw;
            }
        });
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.fkw != null) {
            try {
                com.bytedance.sdk.component.utils.bly.ouw().removeCallbacks(this.fkw);
            } catch (Exception unused) {
            }
            this.fkw = null;
        }
        if (this.f13328lh.get()) {
            this.f13328lh.set(false);
            try {
                ksc.ouw(this.f13327le);
            } catch (Exception unused2) {
            }
        }
    }

    public final void ouw() {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        try {
            final cf cfVarOuw = cf.ouw(this.ouw);
            if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
                com.bytedance.sdk.openadsdk.common.vt.ouw("sp_reward_video_new").ouw();
                return;
            }
            try {
                boolean z10 = com.bytedance.sdk.openadsdk.core.bly.fkw("sp_reward_video");
                File file = new File(cfVarOuw.ouw.getDataDir(), z10 ? "files" : "shared_prefs");
                if (file.exists() && file.isDirectory() && (fileArrListFiles2 = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.cf.1
                    public AnonymousClass1() {
                    }

                    @Override // java.io.FileFilter
                    public final boolean accept(File file2) {
                        if (file2 != null) {
                            return file2.getName().contains("sp_reward_video");
                        }
                        return false;
                    }
                })) != null) {
                    for (File file2 : fileArrListFiles2) {
                        if (z10) {
                            try {
                                com.bytedance.sdk.component.utils.ra.lh(file2);
                            } catch (Throwable unused) {
                            }
                        } else {
                            cfVarOuw.ouw.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            File cacheDir = cfVarOuw.ouw.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.cf.2
                public AnonymousClass2() {
                }

                @Override // java.io.FileFilter
                public final boolean accept(File file3) {
                    if (file3 != null) {
                        return file3.getName().contains("reward_video_cache");
                    }
                    return false;
                }
            })) == null) {
                return;
            }
            for (File file3 : fileArrListFiles) {
                try {
                    com.bytedance.sdk.component.utils.ra.lh(file3);
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public final void ouw(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
            vt(adSlot);
        } else {
            lh(adSlot);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVarLh = ouwVar.lh();
        for (com.bytedance.sdk.openadsdk.core.model.vpp vppVar : ouwVar.yu) {
            if (vppVar.yiz == null) {
                vppVar.yiz = adSlot;
            }
        }
        final jg jgVar = new jg(this.ouw, ouwVar, adSlot);
        if (!od.lh(vppVarLh)) {
            jgVar.ouw.ouw();
        }
        com.bytedance.sdk.openadsdk.core.ryl.lh.yu.ouw(ouwVar);
        if (zih.yu().ryl() == 0) {
            ouw(adSlot, ouwVar, pAGRewardedAdLoadListener, jgVar.ouw, true);
        }
        ouw ouwVar2 = new ouw(this.ouw, adSlot, ouwVar, pAGRewardedAdLoadListener, true);
        final lh lhVar = new lh(ouwVar2, ouwVar, 0 == true ? 1 : 0);
        for (int i10 = 0; i10 < ouwVar.yu.size(); i10++) {
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = ouwVar.yu.get(i10);
            boolean z10 = zih.yu().ryl() == 1;
            if (!od.lh(vppVar2)) {
                com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = com.bytedance.sdk.openadsdk.core.model.vpp.ouw(CacheDirFactory.getICacheDir(vppVar2.f13789sm).ouw(), vppVar2);
                vtVarOuw.ouw("material_meta", vppVar2);
                vtVarOuw.ouw("ad_slot", adSlot);
                com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, new com.bykv.vk.openvk.ouw.ouw.ouw.fkw.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.6
                    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0167ouw
                    public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar2, int i11) {
                        Log.d("RewardVideoLoadManager", "onVideoPreloadSuccess: ");
                        if (lhVar == null || zih.yu().ryl() != 1) {
                            return;
                        }
                        lhVar.onAdLoaded(jgVar.ouw);
                    }

                    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0167ouw
                    public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar2, int i11, String str) {
                        ko.lh("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onVideoPreloadFail");
                        if (lhVar == null || zih.yu().ryl() != 1) {
                            return;
                        }
                        lhVar.onError(i11, str);
                    }
                });
                z10 = false;
            }
            if (z10) {
                lhVar.onAdLoaded(jgVar.ouw);
            }
            if (ouwVar.yu()) {
                break;
            }
        }
        for (final int i11 = 0; i11 < ouwVar.yu.size(); i11++) {
            com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(ouwVar.yu.get(i11), new ouw.InterfaceC0235ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ryl.5
                @Override // com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.InterfaceC0235ouw
                public final void ouw(boolean z11) {
                    com.bytedance.sdk.component.utils.qbp.ouw("RewardVideoLoadManager", "onCachedResponse: i=" + i11 + ", isSuccess=" + z11);
                }
            });
        }
        ko.vt("RewardVideoLoadManager", "get cache data success");
        ko.vt("bidding", "reward video get cache data success");
    }
}
