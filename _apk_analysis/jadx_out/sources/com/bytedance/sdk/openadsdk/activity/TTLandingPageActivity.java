package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.cf;
import com.bytedance.sdk.openadsdk.common.rn;
import com.bytedance.sdk.openadsdk.common.vm;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import com.bytedance.sdk.openadsdk.core.widget.ouw.le;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bly;
import com.bytedance.sdk.openadsdk.utils.jg;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.th;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.utils.zin;
import com.bytedance.sdk.openadsdk.yu.lh;
import com.bytedance.sdk.openadsdk.yu.mwh;
import com.bytedance.sdk.openadsdk.yu.ryl;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class TTLandingPageActivity extends TTBaseLandingPageActivity {
    private ImageView bly;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private jg f12892bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private int f12893cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private rn f12894cf;
    private String ex;
    private boolean ey;
    private le.ouw fak;
    public TTAdDislikeToast fkw;
    private boolean fvf;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.le.le f12895ko;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public mwh f12897lh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private int f12898od;
    private com.bytedance.sdk.openadsdk.core.widget.ouw.fkw osn;
    public Context ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.common.mwh f12899pd;
    private com.bytedance.sdk.component.bly.le pno;
    private String qbp;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private String f12901rn;
    private Button ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private ILoader f12902tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private int f12903th;
    private TextView tlj;
    private com.bytedance.sdk.openadsdk.common.fkw uoy;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private bs f12905vm;
    private String vpp;
    public vpp vt;
    public vm yu;
    private String zih;
    private com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh zin;
    private final AtomicBoolean jqy = new AtomicBoolean(true);
    private final AtomicInteger ksc = new AtomicInteger(0);
    private final AtomicInteger jae = new AtomicInteger(0);

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    private final AtomicInteger f12904uq = new AtomicInteger(0);

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final AtomicBoolean f12896le = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final AtomicBoolean f12900ra = new AtomicBoolean(false);
    private String rrs = "ダウンロード";

    public static class lh implements View.OnTouchListener {
        private final WeakReference<mwh> ouw;
        private final WeakReference<com.bytedance.sdk.openadsdk.common.fkw> vt;

        public lh(mwh mwhVar, com.bytedance.sdk.openadsdk.common.fkw fkwVar) {
            this.ouw = new WeakReference<>(mwhVar);
            this.vt = new WeakReference<>(fkwVar);
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTLandingPageActivity$lh;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            CreativeInfoManager.onViewTouched(g.f53147u, view, motionEvent);
            return safedk_TTLandingPageActivity$lh_onTouch_8a0e083223b7dcc7a1245ec9caced857(view, motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean safedk_TTLandingPageActivity$lh_onTouch_8a0e083223b7dcc7a1245ec9caced857(View view, MotionEvent motionEvent) {
            mwh mwhVar = this.ouw.get();
            if (mwhVar != null) {
                mwhVar.ouw(motionEvent);
            }
            com.bytedance.sdk.openadsdk.common.fkw fkwVar = this.vt.get();
            if (fkwVar == null) {
                return false;
            }
            fkwVar.ouw(motionEvent);
            return false;
        }
    }

    public static class ouw implements ryl {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final String f12906lh;
        private final int ouw;
        private final vpp vt;
        private final WeakReference<TTLandingPageActivity> yu;

        public ouw(int i10, vpp vppVar, String str, TTLandingPageActivity tTLandingPageActivity) {
            this.ouw = i10;
            this.vt = vppVar;
            this.f12906lh = str;
            this.yu = new WeakReference<>(tTLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.yu.ryl
        public final void ouw(int i10) {
            TTLandingPageActivity tTLandingPageActivity = this.yu.get();
            if (tTLandingPageActivity != null) {
                lh.ouw.ouw(this.ouw, tTLandingPageActivity.jae.get(), tTLandingPageActivity.f12904uq.get(), tTLandingPageActivity.ksc.get() - tTLandingPageActivity.f12904uq.get(), this.vt, this.f12906lh, i10);
            }
        }
    }

    public static class vt implements View.OnScrollChangeListener {
        private final WeakReference<mwh> ouw;

        public vt(mwh mwhVar) {
            this.ouw = new WeakReference<>(mwhVar);
        }

        @Override // android.view.View.OnScrollChangeListener
        public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
            mwh mwhVar = this.ouw.get();
            if (mwhVar != null) {
                mwhVar.ouw(i11);
            }
        }
    }

    private void le() {
        if (ra() && !this.jqy.getAndSet(true)) {
            pno();
            vt(0);
        } else {
            try {
                super.onBackPressed();
            } catch (Throwable th2) {
                qbp.yu("TTAD.LandingPageAct", "onBackPressed: ", th2.getMessage());
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void lh() {
        vpp vppVar = this.vt;
        if (vppVar == null || vppVar.f13782pd != 4) {
            return;
        }
        rn rnVar = this.f12894cf;
        if (rnVar != null) {
            rnVar.setVisibility(0);
        }
        Button button = (Button) findViewById(com.bytedance.sdk.openadsdk.utils.rn.f14344gh);
        this.ryl = button;
        if (button != null) {
            ouw(yu());
            if (this.zin == null) {
                this.zin = com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(this, TextUtils.isEmpty(this.qbp) ? uoy.vt(this.f12903th) : this.qbp);
            }
            com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.lh.ouw(this, this.vt, this.qbp, this.f12903th);
            ouwVar.yu = false;
            this.ryl.setOnClickListener(ouwVar);
            this.ryl.setOnTouchListener(ouwVar);
            ouwVar.f13624le = true;
            ouwVar.ouw(this.zin);
        }
    }

    private void ouw(int i10) {
        int i11;
        if (i10 == 1 || (i11 = Build.VERSION.SDK_INT) == 26) {
            return;
        }
        if (i11 != 27) {
            setRequestedOrientation(i10);
        } else {
            try {
                setRequestedOrientation(i10);
            } catch (Throwable unused) {
            }
        }
    }

    private void ouw(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.ryl) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.10
            @Override // java.lang.Runnable
            public final void run() {
                if (TTLandingPageActivity.this.ryl == null || TTLandingPageActivity.this.isFinishing()) {
                    return;
                }
                TTLandingPageActivity.this.ryl.setText(str);
            }
        });
    }

    private void pno() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.f12905vm.ouw("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ra() {
        return !TextUtils.isEmpty(this.vpp) && this.vpp.contains("__luban_sdk");
    }

    public static /* synthetic */ void rn(TTLandingPageActivity tTLandingPageActivity) {
        TTAdDislikeToast tTAdDislikeToast;
        if (tTLandingPageActivity.isFinishing() || (tTAdDislikeToast = tTLandingPageActivity.fkw) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    private void vt(final int i10) {
        if (this.bly == null || !ra()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.3
            @Override // java.lang.Runnable
            public final void run() {
                osn.ouw((View) TTLandingPageActivity.this.bly, i10);
            }
        });
    }

    private String yu() {
        vpp vppVar = this.vt;
        if (vppVar != null && !TextUtils.isEmpty(vppVar.vpp())) {
            this.rrs = this.vt.vpp();
        }
        return this.rrs;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.f53147u, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        le();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable unused) {
        }
        lh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    @SuppressLint({"ClickableViewAccessibility"})
    public void onCreate(@Nullable Bundle bundle) {
        ouw(3);
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.jg.fkw()) {
            finish();
            return;
        }
        try {
            zih.vt(this);
        } catch (Throwable unused) {
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Intent intent = getIntent();
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            this.ey = intent.getBooleanExtra("only_loading", false);
        } else {
            vpp vppVarOuw = od.ouw().ouw(od.ouw(intent));
            this.vt = vppVarOuw;
            if (vppVarOuw != null) {
                this.ey = vppVarOuw.f13756cf;
            }
        }
        try {
            com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(this);
            if (Build.VERSION.SDK_INT >= 35) {
                lhVar.setFitsSystemWindows(true);
            }
            com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(this);
            fkwVar.setOrientation(1);
            lhVar.addView(fkwVar, new FrameLayout.LayoutParams(-1, -1));
            View rnVar = new rn(this, new rn.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.8
                @Override // com.bytedance.sdk.openadsdk.common.rn.ouw
                public final View ouw(Context context) {
                    return new cf(context);
                }
            });
            rnVar.setId(com.bytedance.sdk.openadsdk.utils.rn.yhj);
            fkwVar.addView(rnVar, new LinearLayout.LayoutParams(-1, osn.ouw(this, 44.0f)));
            com.bytedance.sdk.openadsdk.core.le.lh lhVar2 = new com.bytedance.sdk.openadsdk.core.le.lh(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            fkwVar.addView(lhVar2, layoutParams);
            com.bytedance.sdk.component.bly.le leVar = new com.bytedance.sdk.component.bly.le(this, le.lh.LANDING_PAGE);
            leVar.setId(com.bytedance.sdk.openadsdk.utils.rn.ux);
            lhVar2.addView(leVar, new FrameLayout.LayoutParams(-1, -1));
            rn rnVar2 = new rn(this, new rn.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.9
                @Override // com.bytedance.sdk.openadsdk.common.rn.ouw
                public final View ouw(Context context) {
                    return new com.bytedance.sdk.openadsdk.common.pno(context);
                }
            });
            rnVar2.setId(com.bytedance.sdk.openadsdk.utils.rn.f14375vh);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 81;
            lhVar2.addView(rnVar2, layoutParams2);
            com.bytedance.sdk.openadsdk.core.le.le leVar2 = new com.bytedance.sdk.openadsdk.core.le.le(this, null);
            leVar2.setId(com.bytedance.sdk.openadsdk.utils.rn.zvq);
            leVar2.setProgress(1);
            leVar2.setVisibility(8);
            leVar2.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.cf.ouw(this, "tt_browser_progress_style"));
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, osn.ouw(this, 3.0f));
            layoutParams3.gravity = 49;
            lhVar2.addView(leVar2, layoutParams3);
            com.bytedance.sdk.openadsdk.common.mwh mwhVar = new com.bytedance.sdk.openadsdk.common.mwh(this);
            mwhVar.setOnlyLoading(this.ey);
            mwhVar.setId(520093721);
            lhVar.addView(mwhVar, new FrameLayout.LayoutParams(-1, -1));
            setContentView(lhVar);
            this.vpp = "";
            vt(4);
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.vt = com.bytedance.sdk.openadsdk.core.vt.ouw(new JSONObject(stringExtra));
                    } catch (Exception e10) {
                        qbp.ouw("TTAD.LandingPageAct", "TTLandingPageActivity - onCreate MultiGlobalInfo : ", e10);
                    }
                }
                this.vpp = intent.getStringExtra("url");
                this.qbp = intent.getStringExtra("event_tag");
                this.f12903th = intent.getIntExtra("source", -1);
                this.f12901rn = intent.getStringExtra("adid");
                this.zih = intent.getStringExtra("log_extra");
                this.ex = intent.getStringExtra("gecko_id");
            } else {
                vpp vppVar = this.vt;
                if (vppVar != null) {
                    this.f12901rn = vppVar.pv;
                    this.zih = vppVar.yhj;
                    this.ex = vppVar.f13767ki;
                    this.vpp = vppVar.f13792th;
                    this.f12903th = vppVar.zin;
                    this.qbp = vppVar.qbp;
                }
            }
            if (this.vt == null) {
                finish();
                return;
            }
            com.bytedance.sdk.component.bly.le leVar3 = (com.bytedance.sdk.component.bly.le) findViewById(com.bytedance.sdk.openadsdk.utils.rn.ux);
            this.pno = leVar3;
            uoy.ouw(this.vt, leVar3);
            this.f12894cf = (rn) findViewById(com.bytedance.sdk.openadsdk.utils.rn.f14375vh);
            rn rnVar3 = (rn) findViewById(com.bytedance.sdk.openadsdk.utils.rn.yhj);
            com.bytedance.sdk.openadsdk.common.mwh mwhVar2 = (com.bytedance.sdk.openadsdk.common.mwh) findViewById(520093721);
            this.f12899pd = mwhVar2;
            if (mwhVar2 != null) {
                mwhVar2.ouw(this.vt);
                this.f12899pd.ouw();
            }
            if (rnVar3 != null) {
                rnVar3.setVisibility(0);
            }
            ImageView imageView = (ImageView) findViewById(520093720);
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.11
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTLandingPageActivity$11;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(g.f53147u, view);
                        safedk_TTLandingPageActivity$11_onClick_ed27a989812dc5c9b827a0289fa9275b(view);
                    }

                    public void safedk_TTLandingPageActivity$11_onClick_ed27a989812dc5c9b827a0289fa9275b(View view) {
                        if (TTLandingPageActivity.this.pno != null) {
                            if (TTLandingPageActivity.this.fak != null) {
                                TTLandingPageActivity.this.fak.ouw();
                            }
                            if (TTLandingPageActivity.this.pno.lh()) {
                                TTLandingPageActivity.this.pno.yu();
                            } else if (TTLandingPageActivity.this.ra()) {
                                TTLandingPageActivity.this.onBackPressed();
                            } else {
                                TTLandingPageActivity.this.finish();
                            }
                        }
                    }
                });
            }
            ImageView imageView2 = (ImageView) findViewById(520093716);
            this.bly = imageView2;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.12
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTLandingPageActivity$12;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(g.f53147u, view);
                        safedk_TTLandingPageActivity$12_onClick_2130f5422e151e3d56ee44a8d5cb2e8f(view);
                    }

                    public void safedk_TTLandingPageActivity$12_onClick_2130f5422e151e3d56ee44a8d5cb2e8f(View view) {
                        TTLandingPageActivity.this.finish();
                    }
                });
            }
            this.tlj = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.rn.odc);
            com.bytedance.sdk.openadsdk.core.le.le leVar4 = (com.bytedance.sdk.openadsdk.core.le.le) findViewById(com.bytedance.sdk.openadsdk.utils.rn.zvq);
            this.f12895ko = leVar4;
            if (leVar4 != null) {
                leVar4.setVisibility(0);
            }
            View viewFindViewById = findViewById(com.bytedance.sdk.openadsdk.utils.rn.ycd);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTLandingPageActivity$2;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(g.f53147u, view);
                        safedk_TTLandingPageActivity$2_onClick_fc6749bd0e69043089d54377338bbf83(view);
                    }

                    public void safedk_TTLandingPageActivity$2_onClick_fc6749bd0e69043089d54377338bbf83(View view) {
                        final TTLandingPageActivity tTLandingPageActivity = TTLandingPageActivity.this;
                        if (tTLandingPageActivity.isFinishing()) {
                            return;
                        }
                        if (tTLandingPageActivity.f12900ra.get()) {
                            TTAdDislikeToast tTAdDislikeToast = tTLandingPageActivity.fkw;
                            if (tTAdDislikeToast != null) {
                                tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
                                return;
                            }
                            return;
                        }
                        vm vmVar = tTLandingPageActivity.yu;
                        if (vmVar == null) {
                            if (vmVar == null) {
                                try {
                                    vm vmVar2 = new vm(tTLandingPageActivity.ouw, tTLandingPageActivity.vt);
                                    tTLandingPageActivity.yu = vmVar2;
                                    vmVar2.setDislikeSource("landing_page");
                                    tTLandingPageActivity.yu.setCallback(new vm.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.4
                                        @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                                        public final void ouw() {
                                            TTLandingPageActivity.this.f12896le.set(true);
                                        }

                                        @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                                        public final void ouw(FilterWord filterWord) {
                                            if (TTLandingPageActivity.this.f12900ra.get() || filterWord == null || filterWord.hasSecondOptions()) {
                                                return;
                                            }
                                            TTLandingPageActivity.this.f12900ra.set(true);
                                            TTLandingPageActivity.rn(TTLandingPageActivity.this);
                                        }

                                        @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                                        public final void vt() {
                                            TTLandingPageActivity.this.f12896le.set(false);
                                        }
                                    });
                                } catch (Throwable th2) {
                                    ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th2);
                                }
                            }
                            FrameLayout frameLayout = (FrameLayout) tTLandingPageActivity.findViewById(R.id.content);
                            frameLayout.addView(tTLandingPageActivity.yu);
                            if (tTLandingPageActivity.fkw == null) {
                                TTAdDislikeToast tTAdDislikeToast2 = new TTAdDislikeToast(tTLandingPageActivity.ouw);
                                tTLandingPageActivity.fkw = tTAdDislikeToast2;
                                frameLayout.addView(tTAdDislikeToast2);
                            }
                        }
                        vm vmVar3 = tTLandingPageActivity.yu;
                        if (vmVar3 != null) {
                            vmVar3.ouw();
                        }
                    }
                });
            }
            if (!TextUtils.isEmpty(this.ex)) {
                com.bytedance.sdk.openadsdk.ra.vt.ouw();
                this.f12902tc = com.bytedance.sdk.openadsdk.ra.vt.vt();
                com.bytedance.sdk.openadsdk.ra.vt.ouw();
                int iOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(this.f12902tc, this.ex);
                this.f12898od = iOuw;
                this.f12893cd = iOuw > 0 ? 2 : 0;
            }
            this.ouw = this;
            if (this.pno != null) {
                com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(this);
                lhVarOuw.vt = false;
                lhVarOuw.ouw = false;
                lhVarOuw.ouw(this.pno.getWebView());
            }
            com.bytedance.sdk.component.bly.le leVar5 = this.pno;
            if (leVar5 != null && leVar5.getWebView() != null) {
                mwh mwhVar3 = new mwh(this.vt, this.pno.getWebView(), new ouw(this.f12898od, this.vt, "landingpage", this), this.f12893cd);
                mwhVar3.jae = true;
                this.f12897lh = mwhVar3;
                this.fak = mwhVar3.ryl;
                this.uoy = uoy.ouw(this.vt, this.pno, this.ouw);
            }
            bs bsVar = new bs(this);
            this.f12905vm = bsVar;
            bs bsVarVt = bsVar.vt(this.pno);
            bsVarVt.f13482lh = this.f12901rn;
            bsVarVt.fkw = this.zih;
            bs bsVarOuw = bsVarVt.ouw(this.vt);
            bsVarOuw.f13481le = this.f12903th;
            vpp vppVar2 = this.vt;
            bsVarOuw.pno = vppVar2.f13799vi;
            bsVarOuw.f13485ra = vppVar2.hun();
            bsVarOuw.ouw(this.pno).ouw = "landingpage";
            com.bytedance.sdk.component.bly.le leVar6 = this.pno;
            if (leVar6 != null) {
                leVar6.setLandingPage(true);
                this.pno.setTag("landingpage");
                this.pno.setMaterialMeta(this.vt.bs());
            }
            com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.widget.ouw.fkw(this.ouw, this.f12905vm, this.f12901rn, this.uoy, this.f12897lh) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                public void onLoadResource(WebView webView, String str) {
                    super.onLoadResource(webView, str);
                    CreativeInfoManager.onResourceLoaded(g.f53147u, webView, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTLandingPageActivity$1;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
                    CreativeInfoManager.onWebViewPageFinished(g.f53147u, webView, str);
                    safedk_TTLandingPageActivity$1_onPageFinished_967ad1ca533d90a13ac51682f67de6fb(webView, str);
                }

                public void safedk_TTLandingPageActivity$1_onPageFinished_967ad1ca533d90a13ac51682f67de6fb(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTLandingPageActivity.this.f12895ko != null && !TTLandingPageActivity.this.isFinishing()) {
                            TTLandingPageActivity.this.f12895ko.setVisibility(8);
                        }
                    } catch (Throwable unused2) {
                    }
                    if (TTLandingPageActivity.this.f12899pd != null) {
                        TTLandingPageActivity.this.f12899pd.vt();
                    }
                }

                public WebResourceResponse safedk_TTLandingPageActivity$1_shouldInterceptRequest_a23ee0e4f1758c9414b15086c3f5754f(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(TTLandingPageActivity.this.ex)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        TTLandingPageActivity.this.ksc.incrementAndGet();
                        com.bytedance.sdk.openadsdk.ra.vt.ouw();
                        WebResourceResponseModel webResourceResponseModelOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(TTLandingPageActivity.this.f12902tc, TTLandingPageActivity.this.ex, str);
                        if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getWebResourceResponse() != null) {
                            TTLandingPageActivity.this.f12904uq.incrementAndGet();
                            ko.vt("TTAD.LandingPageAct", "GeckoLog: hit++");
                            return webResourceResponseModelOuw.getWebResourceResponse();
                        }
                        if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getMsg() == 2) {
                            TTLandingPageActivity.this.jae.incrementAndGet();
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th2) {
                        qbp.ouw("TTAD.LandingPageAct", "shouldInterceptRequest url error", th2);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    return CreativeInfoManager.onWebViewResponseWithHeaders(g.f53147u, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTLandingPageActivity$1;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                    return CreativeInfoManager.onWebViewResponse(g.f53147u, webView, str, safedk_TTLandingPageActivity$1_shouldInterceptRequest_a23ee0e4f1758c9414b15086c3f5754f(webView, str));
                }
            };
            this.osn = fkwVar2;
            fkwVar2.f14036ko = this.vt;
            fkwVar2.tlj = "landingpage";
            com.bytedance.sdk.component.bly.le leVar7 = this.pno;
            if (leVar7 != null) {
                leVar7.setWebViewClient(fkwVar2);
                com.bytedance.sdk.component.bly.le leVar8 = this.pno;
                if (leVar8 != null) {
                    leVar8.setUserAgentString(th.ouw(leVar8.getWebView()));
                }
                com.bytedance.sdk.component.bly.le leVar9 = this.pno;
                if (leVar9 != null) {
                    leVar9.setMixedContentMode(0);
                }
            }
            com.bytedance.sdk.openadsdk.yu.lh.ouw(this.vt, "landingpage", this.f12893cd);
            com.bytedance.sdk.component.bly.le leVar10 = this.pno;
            if (leVar10 != null) {
                zin.ouw(leVar10, this.vpp);
                this.pno.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(this.f12905vm, this.f12897lh, this.uoy) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.5
                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
                    public final void onProgressChanged(WebView webView, int i10) {
                        super.onProgressChanged(webView, i10);
                        if (TTLandingPageActivity.this.f12899pd != null) {
                            TTLandingPageActivity.this.f12899pd.ouw(i10);
                        }
                        if (TTLandingPageActivity.this.f12895ko == null || TTLandingPageActivity.this.isFinishing()) {
                            return;
                        }
                        if (i10 == 100 && TTLandingPageActivity.this.f12895ko.isShown()) {
                            TTLandingPageActivity.this.f12895ko.setVisibility(8);
                        } else {
                            TTLandingPageActivity.this.f12895ko.setProgress(i10);
                        }
                    }

                    @Override // android.webkit.WebChromeClient
                    public final void onReceivedTitle(WebView webView, String str) {
                        super.onReceivedTitle(webView, str);
                        if (TTLandingPageActivity.this.tlj != null) {
                            TextView textView = TTLandingPageActivity.this.tlj;
                            if (TextUtils.isEmpty(str)) {
                                str = com.bytedance.sdk.component.utils.vpp.ouw(TTLandingPageActivity.this, "tt_web_title_default");
                            }
                            textView.setText(str);
                        }
                    }
                });
                if (this.pno.getWebView() != null) {
                    this.pno.getWebView().setOnScrollChangeListener(new vt(this.f12897lh));
                    this.pno.getWebView().setOnTouchListener(new lh(this.f12897lh, this.uoy));
                }
                this.pno.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.6
                    @Override // android.webkit.DownloadListener
                    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
                        if (TTLandingPageActivity.this.zin != null) {
                            TTLandingPageActivity.this.zin.ouw(TTLandingPageActivity.this.vt);
                        }
                    }
                });
            }
            lh();
            jg jgVarOuw = com.bytedance.sdk.openadsdk.utils.bly.ouw(this, new bly.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.7
                @Override // com.bytedance.sdk.openadsdk.utils.bly.ouw
                public final View ouw() {
                    return TTLandingPageActivity.this.bly;
                }

                @Override // com.bytedance.sdk.openadsdk.utils.bly.ouw
                public final void vt() {
                }
            });
            this.f12892bs = jgVarOuw;
            jgVarOuw.ouw(0L);
            lh.ouw.ouw(SystemClock.elapsedRealtime() - jElapsedRealtime, this.vt, "landingpage", this.f12902tc, this.ex);
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        com.bytedance.sdk.component.bly.le leVar;
        super.onDestroy();
        mwh mwhVar = this.f12897lh;
        if (mwhVar != null && (leVar = this.pno) != null) {
            mwhVar.ouw(leVar);
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.bly.le leVar2 = this.pno;
        if (leVar2 != null) {
            com.bytedance.sdk.component.utils.od.ouw(leVar2);
        }
        this.pno = null;
        bs bsVar = this.f12905vm;
        if (bsVar != null) {
            bsVar.lh();
        }
        mwh mwhVar2 = this.f12897lh;
        if (mwhVar2 != null) {
            mwhVar2.ouw(true);
        }
        if (!TextUtils.isEmpty(this.ex)) {
            lh.ouw.ouw(this.f12904uq.get(), this.ksc.get(), this.vt);
        }
        com.bytedance.sdk.openadsdk.ra.vt.ouw();
        com.bytedance.sdk.openadsdk.ra.vt.ouw(this.f12902tc);
        jg jgVar = this.f12892bs;
        if (jgVar != null) {
            jgVar.lh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        jg jgVar = this.f12892bs;
        if (jgVar != null) {
            jgVar.vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        bs bsVar = this.f12905vm;
        if (bsVar != null) {
            bsVar.vt();
        }
        mwh mwhVar = this.f12897lh;
        if (mwhVar != null) {
            mwhVar.fkw();
        }
        if (!this.fvf) {
            this.fvf = true;
            ouw(4);
        }
        jg jgVar = this.f12892bs;
        if (jgVar != null) {
            jgVar.ouw();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.yu.ouw(this, this.vt);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        mwh mwhVar = this.f12897lh;
        if (mwhVar != null) {
            mwhVar.le();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final boolean ouw() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final void vt() {
        le();
    }
}
