package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.vt;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.bytedance.sdk.openadsdk.utils.od;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class le extends PAGInterstitialAd {
    private boolean bly;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.ouw.lh.vt f13210lh;
    private final Context ouw;
    private boolean pno;
    private final com.bytedance.sdk.openadsdk.core.model.ouw vt;
    private final AtomicBoolean fkw = new AtomicBoolean(false);

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private boolean f13209le = false;
    private boolean yu = false;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final String f13211ra = ex.ouw();
    private final String tlj = "fullscreen_interstitial_ad";

    public le(Context context, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        this.ouw = context;
        this.vt = ouwVar;
    }

    private void vt() {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            bs.fkw(new com.bytedance.sdk.component.pno.pno("FullScreen_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.le.3
                public final /* synthetic */ int ouw = 1;

                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw();
                    if (this.ouw != 1 || le.this.f13210lh == null) {
                        return;
                    }
                    ko.vt("MultiProcess", "start registerFullScreenVideoListener ! ");
                    com.bytedance.sdk.openadsdk.multipro.aidl.vt.lh lhVar = new com.bytedance.sdk.openadsdk.multipro.aidl.vt.lh(le.this.f13210lh);
                    IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(ouwVarOuw.ouw(1));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerFullVideoListener(le.this.f13211ra, lhVar);
                            ko.vt("MultiProcess", "end registerFullScreenVideoListener ! ");
                        } catch (RemoteException e10) {
                            qbp.lh("TTFullScreenVideoAdImpl", e10.getMessage());
                        }
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public final Object getExtraInfo(String str) {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = this.vt;
        if (ouwVar == null || ouwVar.lh() == null || this.vt.lh().npr == null) {
            return null;
        }
        try {
            return this.vt.lh().npr.get(str);
        } catch (Throwable th2) {
            qbp.lh("TTFullScreenVideoAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public final Map<String, Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = this.vt;
        if (ouwVar == null || ouwVar.lh() == null) {
            return null;
        }
        return this.vt.lh().npr;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public final void loss(Double d10, String str, String str2) {
        if (this.bly) {
            return;
        }
        od.ouw(this.vt.lh(), d10, str, str2);
        this.bly = true;
    }

    public final void ouw() {
        if (this.fkw.get()) {
            return;
        }
        this.yu = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public final void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.f13210lh = new com.bytedance.sdk.openadsdk.component.lh.ouw(pAGInterstitialAdInteractionCallback, this.vt);
        vt();
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public final void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.f13210lh = new com.bytedance.sdk.openadsdk.component.lh.ouw(pAGInterstitialAdInteractionListener, this.vt);
        vt();
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public final void show(Activity activity) {
        if (activity != null && activity.isFinishing()) {
            ko.fkw("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error1: activity is finishing");
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = this.vt;
        if (ouwVar == null || !ouwVar.vt()) {
            return;
        }
        final vpp vppVarLh = this.vt.lh();
        if (!com.bykv.vk.openvk.ouw.ouw.vt.vt.ouw.ouw()) {
            com.bytedance.sdk.openadsdk.yu.tlj.ouw(vppVarLh, "show_ad_fail", this.tlj, "not_called_on_main_thread");
            ko.fkw("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
        }
        List<vpp> list = this.vt.yu;
        if (list != null) {
            Iterator<vpp> it = list.iterator();
            while (it.hasNext()) {
                IPBroadcastReceiver.vt(this.ouw, it.next());
            }
        }
        if (this.fkw.get()) {
            com.bytedance.sdk.openadsdk.yu.tlj.ouw(vppVarLh, "show_ad_fail", this.tlj, "repeat_play");
            return;
        }
        this.fkw.set(true);
        if (vppVarLh == null || (vppVarLh.f13788sd == null && vppVarLh.f13791tc == null)) {
            com.bytedance.sdk.openadsdk.yu.tlj.ouw(vppVarLh, "show_ad_fail", this.tlj, "video_or_image_empty");
            return;
        }
        com.bytedance.sdk.openadsdk.yu.tlj.ouw(vppVarLh, "show_start", this.tlj, (String) null);
        Context contextOuw = activity == null ? this.ouw : activity;
        if (contextOuw == null) {
            contextOuw = zih.ouw();
        }
        Intent intent = vppVarLh.tpk ? new Intent(contextOuw, (Class<?>) TTAdActivity.class) : vppVarLh.lh() ? com.bytedance.sdk.openadsdk.component.reward.vt.pno.ouw(vppVarLh) ? new Intent(contextOuw, (Class<?>) TTInterstitialExpressActivity.class) : new Intent(contextOuw, (Class<?>) TTFullScreenExpressVideoActivity.class) : com.bytedance.sdk.openadsdk.component.reward.vt.pno.ouw(vppVarLh) ? new Intent(contextOuw, (Class<?>) TTInterstitialActivity.class) : new Intent(contextOuw, (Class<?>) TTFullScreenVideoActivity.class);
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        boolean zPno = com.bytedance.sdk.openadsdk.vpp.ouw.pno();
        com.bytedance.sdk.openadsdk.component.reward.ouw.vt.ouw(intent, activity, this.yu, this.vt, this.f13211ra);
        intent.putExtra("is_verity_playable", this.f13209le);
        intent.putExtra("enable_new_arch", zPno);
        if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            if (zPno) {
                com.bytedance.sdk.openadsdk.core.od.ouw().ouw(this.f13211ra, this.f13210lh);
            } else {
                com.bytedance.sdk.openadsdk.core.od.ouw().f13902lh = this.f13210lh;
            }
            this.f13210lh = null;
        }
        final boolean z10 = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("start_activity_async", 0) == 1;
        if (z10) {
            com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.component.reward.le.1
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar2.f14401lh = "start_activity";
                    ouwVar2.pno = "fullscreen_interstitial_ad";
                    return ouwVar2;
                }
            });
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.utils.vt.ouw(contextOuw, intent, new vt.InterfaceC0207vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.le.2
            @Override // com.bytedance.sdk.component.utils.vt.InterfaceC0207vt
            public final void ouw() {
                if (le.this.f13209le) {
                    try {
                        com.bytedance.sdk.openadsdk.rn.lh.ouw("click_playable_test_tool", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.2
                            public final /* synthetic */ String ouw;

                            public AnonymousClass2(String str) {
                                str = str;
                            }

                            @Override // com.bytedance.sdk.openadsdk.rn.vt
                            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("playable_url", str);
                                } catch (Throwable unused) {
                                }
                                yu yuVar = new yu();
                                yuVar.ouw = "click_playable_test_tool";
                                yuVar.bly = jSONObject.toString();
                                return yuVar;
                            }
                        });
                    } catch (Throwable unused) {
                    }
                }
                if (z10) {
                    com.bytedance.sdk.openadsdk.vm.lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.component.reward.le.2.1
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar2.f14401lh = "start_activity";
                            ouwVar2.pno = "fullscreen_interstitial_ad";
                            return ouwVar2;
                        }
                    });
                    final long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    com.bytedance.sdk.openadsdk.rn.lh.ouw("start_activity_action", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.component.reward.le.2.2
                        @Override // com.bytedance.sdk.openadsdk.rn.vt
                        public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("duration", jElapsedRealtime2);
                            com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                            yuVar.ouw = "start_activity_action";
                            yuVar.bly = jSONObject.toString();
                            return yuVar;
                        }
                    });
                }
            }

            @Override // com.bytedance.sdk.component.utils.vt.InterfaceC0207vt
            public final void ouw(Throwable th2) {
                ko.lh("TTFullScreenVideoAdImpl", "show full screen video error: ", th2);
                if (le.this.f13209le) {
                    try {
                        com.bytedance.sdk.openadsdk.rn.lh.ouw("use_playable_test_tool_error", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.3

                            /* JADX INFO: renamed from: lh */
                            public final /* synthetic */ String f14234lh;
                            public final /* synthetic */ String ouw;
                            public final /* synthetic */ int vt = -1;

                            public AnonymousClass3(String str, String str2) {
                                str = str;
                                str = str2;
                            }

                            @Override // com.bytedance.sdk.openadsdk.rn.vt
                            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("playable_url", str);
                                    jSONObject.put("error_code", this.vt);
                                    jSONObject.put("error_message", str);
                                } catch (Throwable unused) {
                                }
                                yu yuVar = new yu();
                                yuVar.ouw = "use_playable_test_tool_error";
                                yuVar.bly = jSONObject.toString();
                                return yuVar;
                            }
                        });
                    } catch (Throwable unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.yu.tlj.ouw(vppVarLh, "show_ad_fail", le.this.tlj, "activity_start_fail");
                if (z10) {
                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.component.reward.le.2.3
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar2.f14401lh = "start_activity";
                            ouwVar2.pno = "fullscreen_interstitial_ad";
                            return ouwVar2;
                        }
                    });
                }
            }
        }, true);
        ouw.ouw(this.vt.lh(), this.yu, false);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public final void win(Double d10) {
        if (this.pno) {
            return;
        }
        od.ouw(this.vt.lh(), d10);
        this.pno = true;
    }
}
