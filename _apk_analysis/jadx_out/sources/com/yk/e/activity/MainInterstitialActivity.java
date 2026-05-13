package com.yk.e.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.a;
import b.b;
import b.c0;
import b.d;
import b.h0;
import b.i0;
import b.k;
import b.l0;
import b.m;
import b.s;
import b.z;
import bp.h;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.object.AdInfo;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.object.MainParams;
import com.yk.e.object.SendLoader;
import com.yk.e.util.AdLog;
import com.yk.e.util.AdPlayer;
import com.yk.e.util.Constant;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ImageHandler;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: loaded from: classes3.dex */
public class MainInterstitialActivity extends Activity {
    public static final /* synthetic */ int I11L = 0;
    public AdPlayer I1I;
    public MainInterstitialActivity IL1Iii;
    public TextView ILL;
    public MainParams ILil;

    /* JADX INFO: renamed from: IL丨丨l, reason: contains not printable characters */
    public SendLoader f3319ILl;
    public LinearLayout Ilil;

    /* JADX INFO: renamed from: I丨L, reason: contains not printable characters */
    public WebView f3320IL;

    /* JADX INFO: renamed from: I丨iL, reason: contains not printable characters */
    public RelativeLayout f3321IiL;

    /* JADX INFO: renamed from: Lil, reason: collision with root package name */
    public MainInterstitialAdCallBack f59311Lil;

    /* JADX INFO: renamed from: Ll丨1, reason: contains not printable characters */
    public ImageView f3322Ll1;

    /* JADX INFO: renamed from: L丨1丨1丨I, reason: contains not printable characters */
    public RelativeLayout f3323L11I;

    /* JADX INFO: renamed from: iI丨LLL1, reason: contains not printable characters */
    public ImageView f3324iILLL1;

    /* JADX INFO: renamed from: lIi丨I, reason: contains not printable characters */
    public ImageView f3325lIiI;

    /* JADX INFO: renamed from: l丨Li1LL, reason: contains not printable characters */
    public ProgressBar f3328lLi1LL;

    /* JADX INFO: renamed from: 丨il, reason: contains not printable characters */
    public LinearLayout f3329il;
    public boolean LlLI1 = false;

    /* JADX INFO: renamed from: ll丨L1ii, reason: contains not printable characters */
    public final double f3327llL1ii = 1.775d;

    /* JADX INFO: renamed from: lI丨lii, reason: contains not printable characters */
    public String f3326lIlii = "";
    public String iIi1 = "";
    public boolean iIlLiL = true;
    public final s I11li1 = new s(this);

    /* JADX INFO: renamed from: 丨lL, reason: contains not printable characters */
    public final m f3330lL = new m(this);

    public final void IL1Iii() {
        if (this.ILil.playable.equals("1")) {
            WebSettings settings = this.f3320IL.getSettings();
            this.f3320IL.setVerticalScrollBarEnabled(false);
            settings.setSupportZoom(false);
            settings.setSaveFormData(false);
            settings.setJavaScriptEnabled(true);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
            settings.setBuiltInZoomControls(false);
            settings.setAppCacheEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setGeolocationEnabled(true);
            settings.setCacheMode(-1);
            settings.setAllowFileAccess(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            this.f3320IL.getSettings().setLoadsImagesAutomatically(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            this.f3320IL.setWebViewClient(this.f3330lL);
            this.f3320IL.addJavascriptInterface(new k(this), "OktH5Bridge");
            this.f3320IL.loadUrl(this.ILil.playableUrl);
        }
    }

    public final void IL1Iii(int i10) {
        try {
            if (i10 < 0) {
                this.ILL.setVisibility(8);
                this.f3322Ll1.setVisibility(0);
            } else {
                new Handler().postDelayed(new z(this, i10), 1000L);
            }
        } catch (Exception e10) {
            d.a(e10, new StringBuilder("countdown error, msg = "), e10);
            this.ILL.setVisibility(8);
            this.f3322Ll1.setVisibility(0);
        }
    }

    public final void IL1Iii(Activity activity) {
        try {
            if (this.I1I != null) {
                this.f3321IiL.setVisibility(8);
                this.I1I.release();
            }
            activity.finish();
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public final void IL1Iii(Activity activity, String str) {
        try {
            this.f3324iILLL1.setVisibility(0);
            this.f3329il.setVisibility(8);
            this.Ilil.setVisibility(8);
            new ImageHandler().loadImg(activity, str, this.f3324iILLL1, "", new l0(this));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public final void IL1Iii(RelativeLayout relativeLayout) {
        int i10;
        int i11;
        int i12 = this.IL1Iii.getResources().getDisplayMetrics().widthPixels;
        int i13 = this.IL1Iii.getResources().getDisplayMetrics().heightPixels;
        if (i12 < i13) {
            i11 = (i12 / 7) * 5;
            i10 = (int) (((double) i11) * this.f3327llL1ii);
        } else {
            i10 = (i13 / 10) * 9;
            i11 = (int) (((double) i10) / this.f3327llL1ii);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.width = i11;
        layoutParams.height = i10;
    }

    public final void IL1Iii(AdPlayer adPlayer) {
        View rootView = this.f3319ILl.getRootView();
        this.f3329il.removeAllViews();
        h.a(rootView);
        this.f3329il.addView(rootView, new LinearLayout.LayoutParams(-1, -1));
        adPlayer.addFragmentLife(this.IL1Iii);
        adPlayer.setViewOnClickListener(this.I11li1);
        adPlayer.setIPlayerCallback(new i0(this));
        adPlayer.play4PreLoad();
    }

    public final void ILil(Activity activity) {
        StringBuilder sb2 = new StringBuilder("开启广告误触 ");
        sb2.append(this.ILil.adAreaType == 1);
        AdLog.d(sb2.toString());
        this.f3323L11I = (RelativeLayout) findViewById(IDUtil.getViewID(this, "main_interstitial_root_rl"));
        this.f3321IiL = (RelativeLayout) findViewById(IDUtil.getViewID(this, "main_interstitial_content_rl"));
        this.f3329il = (LinearLayout) findViewById(IDUtil.getViewID(this, "main_interstitial_player_root_ly"));
        this.f3324iILLL1 = (ImageView) findViewById(IDUtil.getViewID(this, "main_im_gif_interstitial"));
        this.ILL = (TextView) findViewById(IDUtil.getViewID(this, "main_txt_cd"));
        this.f3322Ll1 = (ImageView) findViewById(IDUtil.getViewID(this, "main_img_close"));
        this.f3320IL = (WebView) findViewById(IDUtil.getViewID(this, "main_interstitial_wv_wb"));
        this.Ilil = (LinearLayout) findViewById(IDUtil.getViewID(this, "main_interstitial_wv_ly"));
        this.f3328lLi1LL = (ProgressBar) findViewById(IDUtil.getViewID(this, "main_interstitial_wv_pb"));
        this.f3325lIiI = (ImageView) findViewById(IDUtil.getViewID(this, "main_img_voice"));
        this.f3322Ll1.setOnClickListener(new b(this, activity));
        this.f3325lIiI.setOnClickListener(new h0(this));
        this.f3323L11I.setOnClickListener(new a(this, activity));
        this.f3324iILLL1.setOnClickListener(new c0(this, activity));
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            AdLog.d("横竖屏切换，重新调整尺寸");
            IL1Iii(this.f3321IiL);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.IL1Iii = this;
            setContentView(IDUtil.getLayoutID(this, "main_layout_interstitial"));
            Intent intent = getIntent();
            this.f3326lIlii = intent.getStringExtra(VastAttributes.AD_ID);
            this.iIi1 = intent.getStringExtra("adType");
            SendLoader sendLoader = Constant.interstitialVideoAdMap.get(this.f3326lIlii);
            this.f3319ILl = sendLoader;
            if (sendLoader == null) {
                AdLog.e("mainSendLoader is empty, adID" + this.f3326lIlii);
                finish();
                return;
            }
            this.ILil = sendLoader.getMainParams();
            this.f59311Lil = (MainInterstitialAdCallBack) this.f3319ILl.getAdCallBack();
            ILil(this.IL1Iii);
            IL1Iii(this.f3321IiL);
            if (TextUtils.isEmpty(this.ILil.videoUrl)) {
                IL1Iii(this.IL1Iii, this.ILil.imgUrl);
            } else {
                AdPlayer adPlayer = this.f3319ILl.getAdPlayer();
                this.I1I = adPlayer;
                boolean zIsVoice = adPlayer.isVoice();
                this.iIlLiL = zIsVoice;
                ImageView imageView = this.f3325lIiI;
                if (imageView != null) {
                    imageView.setImageResource(IDUtil.getDrawable(this, zIsVoice ? "main_ico_voice" : "main_ico_no_voice"));
                }
                this.f3325lIiI.setVisibility(0);
                IL1Iii(this.I1I);
                IL1Iii();
            }
            this.ILL.setVisibility(0);
            this.f3322Ll1.setVisibility(8);
            this.ILL.setText(String.valueOf(this.ILil.countDownTime));
            IL1Iii(this.ILil.countDownTime);
            this.f59311Lil.onAdShow(new AdInfo());
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f59311Lil;
            if (mainInterstitialAdCallBack != null) {
                mainInterstitialAdCallBack.onAdFail(AdSdkStateCode.MAIN_LOGIC_ERROR, Log.getStackTraceString(e10));
                return;
            }
            AdLog.e("mainAdCallBack is null, msg = " + e10.getMessage());
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }
}
