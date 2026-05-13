package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
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
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.rn;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.ey;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.widget.ouw.le;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.tlj.yu;
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
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class TTVideoLandingPageActivity extends TTBaseLandingPageActivity implements com.bytedance.sdk.openadsdk.cf.yu {
    public int bly;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh f12935cd;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    private ILoader f12937cj;
    public com.bytedance.sdk.openadsdk.core.widget.ouw ex;
    public com.bytedance.sdk.openadsdk.multipro.vt.ouw ey;
    public Context fkw;
    public String hun;
    public rn jae;
    public TextView jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public long f12939ko;
    public TextView ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f12940le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public ImageView f12941lh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public Button f12942od;
    public int osn;
    public com.bytedance.sdk.component.bly.le ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public String f12943pd;
    public bs pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public String f12944ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public vpp f12945rn;
    public mwh rrs;
    public com.bytedance.sdk.openadsdk.core.mwh.vt.le ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public TextView f12946tc;
    public FrameLayout tlj;
    private int ucs;
    public le.ouw ux;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    private int f12950vh;
    public RelativeLayout vpp;
    public ImageView vt;
    public TextView yu;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public int f12936cf = -1;
    public int zih = 0;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public int f12951vm = 0;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public int f12947th = 0;
    public int qbp = 0;
    public String zin = "ダウンロード";

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    public boolean f12949uq = false;
    public boolean fvf = false;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    public boolean f12934bs = true;
    public boolean fak = false;
    public String uoy = null;
    public AtomicBoolean jvy = new AtomicBoolean(true);
    public JSONArray fqk = null;
    private final AtomicInteger pv = new AtomicInteger(0);

    /* JADX INFO: renamed from: wp, reason: collision with root package name */
    private final AtomicInteger f12952wp = new AtomicInteger(0);

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    private final AtomicInteger f12938kn = new AtomicInteger(0);
    public int lso = -1;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.lh.ouw f12948ub = null;
    private final lh.vt yib = new lh.vt() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.11
        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.vt
        public final void ouw(boolean z10) {
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity.f12949uq = z10;
            if (tTVideoLandingPageActivity.isFinishing()) {
                return;
            }
            if (!z10) {
                osn.ouw((View) TTVideoLandingPageActivity.this.ouw, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.tlj.getLayoutParams();
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                marginLayoutParams.width = tTVideoLandingPageActivity2.f12947th;
                marginLayoutParams.height = tTVideoLandingPageActivity2.qbp;
                marginLayoutParams.leftMargin = tTVideoLandingPageActivity2.f12951vm;
                marginLayoutParams.topMargin = tTVideoLandingPageActivity2.zih;
                tTVideoLandingPageActivity2.tlj.setLayoutParams(marginLayoutParams);
                return;
            }
            osn.ouw((View) TTVideoLandingPageActivity.this.ouw, 8);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.tlj.getLayoutParams();
            TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity3.f12951vm = marginLayoutParams2.leftMargin;
            tTVideoLandingPageActivity3.zih = marginLayoutParams2.topMargin;
            tTVideoLandingPageActivity3.f12947th = marginLayoutParams2.width;
            tTVideoLandingPageActivity3.qbp = marginLayoutParams2.height;
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = -1;
            marginLayoutParams2.topMargin = 0;
            marginLayoutParams2.leftMargin = 0;
            tTVideoLandingPageActivity3.tlj.setLayoutParams(marginLayoutParams2);
        }
    };
    private final ksc.ouw yhj = new ksc.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2
        public static /* synthetic */ void ouw(AnonymousClass2 anonymousClass2, int i10) {
            com.bytedance.sdk.component.bly.le leVar;
            String str;
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            if (tTVideoLandingPageActivity.osn == 0 && i10 != 0 && (leVar = tTVideoLandingPageActivity.ouw) != null && (str = tTVideoLandingPageActivity.uoy) != null) {
                leVar.a_(str);
            }
            com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar2 = TTVideoLandingPageActivity.this.ryl;
            if (leVar2 != null && leVar2.getNativeVideoController() != null) {
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                if (!tTVideoLandingPageActivity2.fvf && tTVideoLandingPageActivity2.osn != i10) {
                    com.bytedance.sdk.openadsdk.core.mwh.vt.lh nativeVideoController = tTVideoLandingPageActivity2.ryl.getNativeVideoController();
                    nativeVideoController.yu(i10);
                    if (i10 == 4) {
                        nativeVideoController.zih = false;
                        nativeVideoController.ryl();
                    }
                }
            }
            TTVideoLandingPageActivity.this.osn = i10;
        }

        @Override // com.bytedance.sdk.component.utils.ksc.ouw
        public final void ouw(boolean z10, final int i10) {
            com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass2.ouw(AnonymousClass2.this, i10);
                }
            });
        }
    };

    @SuppressLint({"StaticFieldLeak"})
    public static class ouw extends AsyncTask<Void, Void, Drawable> {
        private final Bitmap ouw;
        private final WeakReference<com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt> vt;

        private ouw(Bitmap bitmap, com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt vtVar) {
            this.ouw = bitmap;
            this.vt = new WeakReference<>(vtVar);
        }

        public /* synthetic */ ouw(Bitmap bitmap, com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt vtVar, byte b10) {
            this(bitmap, vtVar);
        }

        private Drawable ouw() {
            try {
                Bitmap bitmapOuw = com.bytedance.sdk.component.adexpress.yu.ouw.ouw(zih.ouw(), this.ouw, 25);
                if (bitmapOuw == null) {
                    return null;
                }
                return new BitmapDrawable(zih.ouw().getResources(), bitmapOuw);
            } catch (Throwable th2) {
                qbp.lh("TTVideoLandingPage", th2.getMessage());
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ Drawable doInBackground(Void[] voidArr) {
            return ouw();
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(Drawable drawable) {
            WeakReference<com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt> weakReference;
            Drawable drawable2 = drawable;
            if (drawable2 == null || (weakReference = this.vt) == null || weakReference.get() == null) {
                return;
            }
            this.vt.get().ouw(drawable2);
        }
    }

    private boolean jg() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar == null || leVar.getNativeVideoController() == null) {
            return true;
        }
        return this.ryl.getNativeVideoController().f13827jg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ko() {
        return !TextUtils.isEmpty(this.uoy) && this.uoy.contains("__luban_sdk");
    }

    private void mwh() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar;
        if (this.f12949uq && (leVar = this.ryl) != null && leVar.getNativeVideoController() != null) {
            this.ryl.getNativeVideoController().le();
            this.f12949uq = false;
        } else if (!ko() || this.jvy.getAndSet(true)) {
            super.onBackPressed();
        } else {
            rn();
            ouw(0);
        }
    }

    private void ouw(final int i10) {
        if (this.f12941lh == null || !ko()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public final void run() {
                osn.ouw((View) TTVideoLandingPageActivity.this.f12941lh, i10);
            }
        });
    }

    private void ouw(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.f12942od) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public final void run() {
                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                if (tTVideoLandingPageActivity.f12942od == null || tTVideoLandingPageActivity.isFinishing()) {
                    return;
                }
                TTVideoLandingPageActivity.this.f12942od.setText(str);
            }
        });
    }

    private void rn() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.pno.ouw("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void ryl() {
        vpp vppVar = this.f12945rn;
        if (vppVar == null || vppVar.f13782pd != 4) {
            return;
        }
        this.jae.setVisibility(0);
        Button button = (Button) findViewById(com.bytedance.sdk.openadsdk.utils.rn.f14344gh);
        this.f12942od = button;
        if (button != null) {
            ouw(yu());
            this.f12942od.setOnClickListener(this.f12948ub);
            this.f12942od.setOnTouchListener(this.f12948ub);
        }
    }

    public final long bly() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar == null || leVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.ryl.getNativeVideoController().th();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void cf() {
        if (this.f12945rn == null) {
            return;
        }
        this.f12935cd = com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(this, this.f12943pd);
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.lh.ouw(this, this.f12945rn, this.f12943pd, this.bly);
        this.f12948ub = ouwVar;
        ouwVar.yu = false;
        ouwVar.f13624le = true;
        this.ksc.setOnClickListener(ouwVar);
        this.ksc.setOnTouchListener(this.f12948ub);
        this.f12948ub.ouw(this.f12935cd);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.f53147u, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void le() {
        this.jae = (rn) findViewById(com.bytedance.sdk.openadsdk.utils.rn.f14375vh);
        this.ouw = (com.bytedance.sdk.component.bly.le) findViewById(com.bytedance.sdk.openadsdk.utils.rn.ux);
        ImageView imageView = (ImageView) findViewById(520093720);
        this.vt = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTVideoLandingPageActivity$8;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f53147u, view);
                    safedk_TTVideoLandingPageActivity$8_onClick_8becff8855aaffa33f686ea19bcfc1c9(view);
                }

                public void safedk_TTVideoLandingPageActivity$8_onClick_8becff8855aaffa33f686ea19bcfc1c9(View view) {
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    if (tTVideoLandingPageActivity.ouw != null) {
                        le.ouw ouwVar = tTVideoLandingPageActivity.ux;
                        if (ouwVar != null) {
                            ouwVar.ouw();
                        }
                        if (TTVideoLandingPageActivity.this.ouw.lh()) {
                            TTVideoLandingPageActivity.this.ouw.yu();
                            return;
                        }
                        if (TTVideoLandingPageActivity.this.ko()) {
                            TTVideoLandingPageActivity.this.onBackPressed();
                            return;
                        }
                        JSONObject jSONObjectOuw = null;
                        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = TTVideoLandingPageActivity.this.ryl;
                        if (leVar != null && leVar.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                            jSONObjectOuw = uoy.ouw(tTVideoLandingPageActivity2.f12945rn, tTVideoLandingPageActivity2.ryl.getNativeVideoController().zih(), TTVideoLandingPageActivity.this.ryl.getNativeVideoController().f13829le);
                        }
                        JSONObject jSONObject = jSONObjectOuw;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(tTVideoLandingPageActivity3.f12945rn, "embeded_ad", "detail_back", tTVideoLandingPageActivity3.bly(), TTVideoLandingPageActivity.this.tlj(), jSONObject, (com.bytedance.sdk.openadsdk.yu.ra) null);
                        TTVideoLandingPageActivity.this.finish();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar != null) {
            leVar.setIsAutoPlay(this.fak);
        }
        ImageView imageView2 = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.rn.osn);
        this.f12941lh = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTVideoLandingPageActivity$9;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f53147u, view);
                    safedk_TTVideoLandingPageActivity$9_onClick_df389c5d78bce6f751d1ca8c5d18117f(view);
                }

                public void safedk_TTVideoLandingPageActivity$9_onClick_df389c5d78bce6f751d1ca8c5d18117f(View view) {
                    com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar2 = TTVideoLandingPageActivity.this.ryl;
                    if (leVar2 != null) {
                        JSONObject jSONObjectOuw = null;
                        if (leVar2.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                            jSONObjectOuw = uoy.ouw(tTVideoLandingPageActivity.f12945rn, tTVideoLandingPageActivity.ryl.getNativeVideoController().zih(), TTVideoLandingPageActivity.this.ryl.getNativeVideoController().f13829le);
                        }
                        TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(tTVideoLandingPageActivity2.f12945rn, "embeded_ad", "detail_skip", tTVideoLandingPageActivity2.bly(), TTVideoLandingPageActivity.this.tlj(), jSONObjectOuw, (com.bytedance.sdk.openadsdk.yu.ra) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.yu = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.rn.odc);
        this.tlj = (FrameLayout) findViewById(com.bytedance.sdk.openadsdk.utils.rn.uoy);
        this.vpp = (RelativeLayout) findViewById(com.bytedance.sdk.openadsdk.utils.rn.ey);
        this.jqy = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.rn.jvy);
        this.f12946tc = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.rn.fqk);
        this.ksc = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.rn.hun);
        this.ex = (com.bytedance.sdk.openadsdk.core.widget.ouw) findViewById(com.bytedance.sdk.openadsdk.utils.rn.rrs);
        vpp vppVar = this.f12945rn;
        if (vppVar == null || vppVar.f13782pd != 4) {
            return;
        }
        osn.ouw((View) this.vpp, 0);
        String str = !TextUtils.isEmpty(this.f12945rn.fqk) ? this.f12945rn.fqk : !TextUtils.isEmpty(this.f12945rn.hun) ? this.f12945rn.hun : !TextUtils.isEmpty(this.f12945rn.f13798vh) ? this.f12945rn.f13798vh : "";
        com.bytedance.sdk.openadsdk.core.model.zih zihVar = this.f12945rn.fak;
        if (zihVar != null && zihVar.ouw != null) {
            osn.ouw((View) this.ex, 0);
            osn.ouw((View) this.jqy, 4);
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar2 = this.f12945rn;
            com.bytedance.sdk.openadsdk.th.vt.ouw(vppVar2.fak, this.ex, vppVar2);
        } else if (!TextUtils.isEmpty(str)) {
            osn.ouw((View) this.ex, 4);
            osn.ouw((View) this.jqy, 0);
            this.jqy.setText(str.substring(0, 1));
        }
        if (!TextUtils.isEmpty(this.f12945rn.vpp())) {
            this.ksc.setText(this.f12945rn.vpp());
        }
        if (!TextUtils.isEmpty(str)) {
            this.f12946tc.setText(str);
        }
        osn.ouw((View) this.f12946tc, 0);
        osn.ouw((View) this.ksc, 0);
    }

    public abstract View lh();

    @Override // android.app.Activity
    public void onBackPressed() {
        mwh();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ryl();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!jg.fkw()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        try {
            zih.vt(this);
        } catch (Throwable unused2) {
        }
        this.osn = ksc.ouw(getApplicationContext(), 60000L);
        try {
            setContentView(lh());
            this.fkw = this;
            Intent intent = getIntent();
            String stringExtra = null;
            this.fak = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.f12939ko = bundle.getLong("video_play_position", 0L);
            }
            String stringExtra2 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra3 != null) {
                    try {
                        this.f12945rn = com.bytedance.sdk.openadsdk.core.vt.ouw(new JSONObject(stringExtra3));
                    } catch (Exception unused3) {
                    }
                }
                vpp vppVar = this.f12945rn;
                if (vppVar != null) {
                    this.f12936cf = vppVar.ucs;
                }
                this.f12940le = intent.getStringExtra("adid");
                this.f12944ra = intent.getStringExtra("log_extra");
                stringExtra = intent.getStringExtra("web_title");
                this.hun = intent.getStringExtra("gecko_id");
                this.f12943pd = intent.getStringExtra("event_tag");
                this.bly = intent.getIntExtra("source", -1);
                this.uoy = intent.getStringExtra("url");
            } else {
                vpp vppVarOuw = od.ouw().ouw(od.ouw(intent));
                this.f12945rn = vppVarOuw;
                if (vppVarOuw != null) {
                    this.f12936cf = vppVarOuw.ucs;
                    this.f12940le = vppVarOuw.pv;
                    this.f12944ra = vppVarOuw.yhj;
                    stringExtra = vppVarOuw.fqk;
                    this.hun = vppVarOuw.f13767ki;
                    this.uoy = vppVarOuw.f13792th;
                    this.bly = vppVarOuw.zin;
                    this.f12943pd = vppVarOuw.qbp;
                }
            }
            String strOuw = stringExtra;
            if (this.f12945rn == null) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.hun)) {
                com.bytedance.sdk.openadsdk.ra.vt.ouw();
                this.f12937cj = com.bytedance.sdk.openadsdk.ra.vt.vt();
                com.bytedance.sdk.openadsdk.ra.vt.ouw();
                int iOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(this.f12937cj, this.hun);
                this.ucs = iOuw;
                this.f12950vh = iOuw > 0 ? 2 : 0;
            }
            if (stringExtra2 != null) {
                try {
                    this.ey = com.bytedance.sdk.openadsdk.multipro.vt.ouw.ouw(new JSONObject(stringExtra2));
                } catch (Exception unused4) {
                }
                com.bytedance.sdk.openadsdk.multipro.vt.ouw ouwVar = this.ey;
                if (ouwVar != null) {
                    this.f12939ko = ouwVar.f14197ra;
                }
            }
            if (bundle != null) {
                this.f12945rn = od.ouw().ouw(bundle.getInt("meta_index", -1));
                long j10 = bundle.getLong("video_play_position");
                if (j10 > 0) {
                    this.f12939ko = j10;
                }
            }
            le();
            cf();
            bs bsVar = new bs(this);
            this.pno = bsVar;
            bs bsVarVt = bsVar.vt(this.ouw);
            bsVarVt.f13482lh = this.f12940le;
            bsVarVt.fkw = this.f12944ra;
            bsVarVt.f13481le = this.bly;
            bs bsVarOuw = bsVarVt.ouw(this.f12945rn);
            bsVarOuw.pno = this.f12945rn.f13799vi;
            bs bsVarOuw2 = bsVarOuw.ouw(this.ouw);
            bsVarOuw2.ouw = "landingpage_split_screen";
            bsVarOuw2.f13485ra = this.f12945rn.hun();
            ouw(4);
            if (this.ouw != null) {
                com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(this.fkw);
                lhVarOuw.vt = true;
                lhVarOuw.ouw = false;
                lhVarOuw.ouw(this.ouw.getWebView());
                mwh mwhVar = new mwh(this.f12945rn, this.ouw.getWebView(), new ryl() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.yu.ryl
                    public final void ouw(int i10) {
                        lh.ouw.ouw(TTVideoLandingPageActivity.this.ucs, TTVideoLandingPageActivity.this.f12938kn.get(), TTVideoLandingPageActivity.this.f12952wp.get(), TTVideoLandingPageActivity.this.pv.get() - TTVideoLandingPageActivity.this.f12952wp.get(), TTVideoLandingPageActivity.this.f12945rn, "landingpage_split_screen", i10);
                    }
                }, this.f12950vh);
                mwhVar.jae = true;
                this.rrs = mwhVar;
                this.ux = mwhVar.ryl;
                mwhVar.ouw("landingpage_split_screen");
            }
            com.bytedance.sdk.component.bly.le leVar = this.ouw;
            if (leVar != null) {
                leVar.setLandingPage(true);
                this.ouw.setTag("landingpage_split_screen");
                this.ouw.setMaterialMeta(this.f12945rn.bs());
                this.ouw.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.fkw(this.fkw, this.pno, this.f12940le, this.rrs) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public void onLoadResource(WebView webView, String str) {
                        super.onLoadResource(webView, str);
                        CreativeInfoManager.onResourceLoaded(g.f53147u, webView, str);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public void onPageFinished(WebView webView, String str) {
                        super.onPageFinished(webView, str);
                        CreativeInfoManager.onWebViewPageFinished(g.f53147u, webView, str);
                    }

                    public WebResourceResponse safedk_TTVideoLandingPageActivity$4_shouldInterceptRequest_70bacd8d18e5c7fb197b2b534026d60a(WebView webView, String str) {
                        try {
                            if (TextUtils.isEmpty(TTVideoLandingPageActivity.this.hun)) {
                                return super.shouldInterceptRequest(webView, str);
                            }
                            TTVideoLandingPageActivity.this.pv.incrementAndGet();
                            com.bytedance.sdk.openadsdk.ra.vt.ouw();
                            WebResourceResponseModel webResourceResponseModelOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(TTVideoLandingPageActivity.this.f12937cj, TTVideoLandingPageActivity.this.hun, str);
                            if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getWebResourceResponse() != null) {
                                TTVideoLandingPageActivity.this.f12952wp.incrementAndGet();
                                ko.vt("TTVideoLandingPage", "GeckoLog: hit++");
                                return webResourceResponseModelOuw.getWebResourceResponse();
                            }
                            if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getMsg() == 2) {
                                TTVideoLandingPageActivity.this.f12938kn.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(webView, str);
                        } catch (Throwable th2) {
                            qbp.ouw("TTVideoLandingPage", "shouldInterceptRequest url error", th2);
                            return super.shouldInterceptRequest(webView, str);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f53147u, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTVideoLandingPageActivity$4;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                        return CreativeInfoManager.onWebViewResponse(g.f53147u, webView, str, safedk_TTVideoLandingPageActivity$4_shouldInterceptRequest_70bacd8d18e5c7fb197b2b534026d60a(webView, str));
                    }
                });
                com.bytedance.sdk.component.bly.le leVar2 = this.ouw;
                leVar2.setUserAgentString(th.ouw(leVar2.getWebView()));
            }
            com.bytedance.sdk.component.bly.le leVar3 = this.ouw;
            if (leVar3 != null) {
                leVar3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.yu.lh.ouw(this.f12945rn, "landingpage_split_screen", this.f12950vh);
            zin.ouw(this.ouw, this.uoy);
            this.ouw.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(this.pno, this.rrs) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
                public final void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                }
            });
            this.ouw.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(String str, String str2, String str3, String str4, long j11) {
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar = tTVideoLandingPageActivity.f12935cd;
                    if (lhVar != null) {
                        lhVar.ouw(tTVideoLandingPageActivity.f12945rn);
                    }
                }
            });
            TextView textView = this.yu;
            if (textView != null) {
                if (TextUtils.isEmpty(strOuw)) {
                    strOuw = com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_web_title_default");
                }
                textView.setText(strOuw);
            }
            ksc.ouw(this.yhj, this.fkw);
            ra();
            ryl();
            lh.ouw.ouw(SystemClock.elapsedRealtime() - jElapsedRealtime, this.f12945rn, "landingpage_split_screen", this.f12937cj, this.hun);
        } catch (Throwable unused5) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            ksc.ouw(this.yhj);
        } catch (Exception unused) {
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.f12945rn.f13755cd = false;
        } catch (Throwable unused2) {
        }
        com.bytedance.sdk.component.bly.le leVar = this.ouw;
        if (leVar != null) {
            ey.ouw(leVar.getWebView());
        }
        this.ouw = null;
        bs bsVar = this.pno;
        if (bsVar != null) {
            bsVar.lh();
        }
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar2 = this.ryl;
        if (leVar2 != null && leVar2.getNativeVideoController() != null) {
            this.ryl.getNativeVideoController().ko();
        }
        this.ryl = null;
        this.f12945rn = null;
        mwh mwhVar = this.rrs;
        if (mwhVar != null) {
            mwhVar.ouw(true);
        }
        if (!TextUtils.isEmpty(this.hun)) {
            lh.ouw.ouw(this.f12952wp.get(), this.pv.get(), this.f12945rn);
        }
        com.bytedance.sdk.openadsdk.ra.vt.ouw();
        com.bytedance.sdk.openadsdk.ra.vt.ouw(this.f12937cj);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.ryl != null && !jg()) {
            this.ryl.cf();
        }
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar == null || leVar.getNativeVideoController() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.mwh.vt.lh nativeVideoController = this.ryl.getNativeVideoController();
        this.fvf = this.fvf || nativeVideoController.jqy();
        Boolean bool = Boolean.TRUE;
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_is_update_flag", bool);
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.fvf));
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(nativeVideoController.rn()));
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(nativeVideoController.th() + nativeVideoController.zih()));
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_duration", Long.valueOf(nativeVideoController.th()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar;
        super.onResume();
        if (!this.f12934bs && (leVar = this.ryl) != null && leVar.getNativeVideoController() != null && !jg()) {
            this.ryl.cf();
        }
        this.f12934bs = false;
        bs bsVar = this.pno;
        if (bsVar != null) {
            bsVar.vt();
        }
        mwh mwhVar = this.rrs;
        if (mwhVar != null) {
            mwhVar.fkw();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        int iOuw = this.f12945rn != null ? od.ouw().ouw(this.f12945rn) : -1;
        this.lso = iOuw;
        bundle.putInt("meta_index", iOuw);
        bundle.putLong("video_play_position", this.f12939ko);
        bundle.putBoolean("is_complete", this.fvf);
        long j10 = this.f12939ko;
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar != null && leVar.getNativeVideoController() != null) {
            j10 = this.ryl.getNativeVideoController().bly;
        }
        bundle.putLong("video_play_position", j10);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.lso >= 0) {
            od.ouw().vt(this.lso);
            this.lso = -1;
        }
        com.bytedance.sdk.openadsdk.utils.yu.ouw(this, this.f12945rn);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        mwh mwhVar = this.rrs;
        if (mwhVar != null) {
            mwhVar.le();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.cf.yu
    public final void ouw(boolean z10, JSONArray jSONArray) {
        if (!z10 || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.fqk = jSONArray;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final boolean ouw() {
        return true;
    }

    public abstract boolean pno();

    public void ra() {
        if (pno()) {
            try {
                com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = new com.bytedance.sdk.openadsdk.core.mwh.vt.le(this.fkw, this.f12945rn, true, (com.bytedance.sdk.openadsdk.yu.ra) null);
                this.ryl = leVar;
                if (leVar.getNativeVideoController() != null) {
                    this.ryl.getNativeVideoController().vt(false);
                }
                if (this.fvf) {
                    this.tlj.setVisibility(0);
                    this.tlj.removeAllViews();
                    this.tlj.addView(this.ryl);
                    this.ryl.bly();
                } else {
                    if (!this.fak) {
                        this.f12939ko = 0L;
                    }
                    if (this.ey != null && this.ryl.getNativeVideoController() != null) {
                        this.ryl.getNativeVideoController().uoy = this.ey.f14197ra;
                        this.ryl.getNativeVideoController().f13824bs = this.ey.fkw;
                        int iFqk = this.f12945rn.fqk();
                        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar2 = this.ryl;
                        zih.yu();
                        leVar2.ouw(cf.vt(String.valueOf(iFqk)), "landingPageInit");
                    }
                    if (this.ryl.ouw(this.f12939ko, this.f12934bs, this.fvf)) {
                        this.tlj.setVisibility(0);
                        this.tlj.removeAllViews();
                        this.tlj.addView(this.ryl);
                    }
                    if (this.ryl.getNativeVideoController() != null) {
                        this.ryl.getNativeVideoController().vt(false);
                        this.ryl.getNativeVideoController().ouw(this.yib);
                    }
                }
                String str = this.f12945rn.f13791tc.get(0).ouw;
                yu.ouw.vt.ouw(str).ouw(this.f12945rn.f13791tc.get(0).vt).vt(this.f12945rn.f13791tc.get(0).f13812lh).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw())).lh(2).ouw(new com.bytedance.sdk.openadsdk.tlj.vt(this.f12945rn, str, new com.bytedance.sdk.component.fkw.rn() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.fkw.rn
                    public final void ouw(int i10, String str2, @Nullable Throwable th2) {
                    }

                    @Override // com.bytedance.sdk.component.fkw.rn
                    public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
                        try {
                            Object objVt = cfVar.vt();
                            if (objVt instanceof Bitmap) {
                                new ouw((Bitmap) objVt, TTVideoLandingPageActivity.this.ryl.getNativeVideoController().f13833ra, (byte) 0).execute(new Void[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }));
                this.ryl.findViewById(520093726).setOnTouchListener(null);
                this.ryl.findViewById(520093726).setOnClickListener(null);
            } catch (Exception e10) {
                qbp.lh("TTVideoLandingPage", e10.getMessage());
                if (this.ryl == null) {
                    ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e10);
                }
            }
            if (this.osn == 0) {
                try {
                    Toast.makeText(this, com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final int tlj() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar == null || leVar.getNativeVideoController() == null) {
            return 0;
        }
        return this.ryl.getNativeVideoController().qbp();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final void vt() {
        mwh();
    }

    public final String yu() {
        vpp vppVar = this.f12945rn;
        if (vppVar != null && !TextUtils.isEmpty(vppVar.vpp())) {
            this.zin = this.f12945rn.vpp();
        }
        return this.zin;
    }
}
