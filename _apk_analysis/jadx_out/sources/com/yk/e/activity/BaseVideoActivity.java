package com.yk.e.activity;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.c;
import b.d;
import b.e;
import b.e0;
import b.f;
import b.g0;
import b.i;
import b.j;
import b.p;
import b.r;
import b.v;
import bp.h;
import com.yk.e.callBack.MainVideoAdCallBack;
import com.yk.e.object.AdInfo;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.object.MainParams;
import com.yk.e.object.SendLoader;
import com.yk.e.pl.OktVideoView;
import com.yk.e.util.AdLog;
import com.yk.e.util.AdPlayer;
import com.yk.e.util.AppUtil;
import com.yk.e.util.FileLoader;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ImageLoader;
import com.yk.e.util.ScreenUtil;
import com.yk.e.util.StringUtil;
import java.io.File;
import xyz.doikki.videoplayer.player.VideoView;

/* JADX INFO: loaded from: classes8.dex */
public class BaseVideoActivity extends BaseActivity {
    public int I11L;
    public MainVideoAdCallBack I1I;
    public TextView IL1Iii;
    public TextView ILL;
    public SendLoader ILil;

    /* JADX INFO: renamed from: IL丨丨l, reason: contains not printable characters */
    public TextView f3287ILl;
    public RelativeLayout Ilil;

    /* JADX INFO: renamed from: I丨iL, reason: contains not printable characters */
    public TextView f3290IiL;

    /* JADX INFO: renamed from: LI丨丨l丨l, reason: contains not printable characters */
    public final i f3292LIll;

    /* JADX INFO: renamed from: Lil, reason: collision with root package name */
    public TextView f59310Lil;
    public ImageView LlLI1;

    /* JADX INFO: renamed from: Ll丨1, reason: contains not printable characters */
    public RelativeLayout f3293Ll1;

    /* JADX INFO: renamed from: L丨1l, reason: contains not printable characters */
    public WebView f3294L1l;

    /* JADX INFO: renamed from: L丨1丨1丨I, reason: contains not printable characters */
    public TextView f3295L11I;
    public AdPlayer baseAdPlayer;
    public String iIi1;
    public String iIlLiL;

    /* JADX INFO: renamed from: iI丨LLL1, reason: contains not printable characters */
    public ImageView f3297iILLL1;

    /* JADX INFO: renamed from: l1IIi1丨, reason: contains not printable characters */
    public ProgressBar f3298l1IIi1;

    /* JADX INFO: renamed from: lIi丨I, reason: contains not printable characters */
    public ImageView f3299lIiI;

    /* JADX INFO: renamed from: lI丨II, reason: contains not printable characters */
    public TextView f3300lIII;

    /* JADX INFO: renamed from: lI丨lii, reason: contains not printable characters */
    public LinearLayout f3301lIlii;
    public RelativeLayout llI;
    public ImageView llliI;

    /* JADX INFO: renamed from: ll丨L1ii, reason: contains not printable characters */
    public TextView f3302llL1ii;

    /* JADX INFO: renamed from: l丨Li1LL, reason: contains not printable characters */
    public RelativeLayout f3303lLi1LL;

    /* JADX INFO: renamed from: 丨iI丨丨LLl, reason: contains not printable characters */
    public ImageView f3304iILLl;

    /* JADX INFO: renamed from: 丨il, reason: contains not printable characters */
    public ImageView f3305il;

    /* JADX INFO: renamed from: 丨lL, reason: contains not printable characters */
    public MainParams f3306lL;

    /* JADX INFO: renamed from: 丨l丨, reason: contains not printable characters */
    public int f3307l;

    /* JADX INFO: renamed from: 丨丨, reason: contains not printable characters */
    public LinearLayout f3308;

    /* JADX INFO: renamed from: 丨丨LLlI1, reason: contains not printable characters */
    public VideoView f3309LLlI1;

    /* JADX INFO: renamed from: I丨L, reason: contains not printable characters */
    public boolean f3289IL = true;
    public boolean I11li1 = false;

    /* JADX INFO: renamed from: 丨丨丨1丨, reason: contains not printable characters */
    public boolean f33101 = false;

    /* JADX INFO: renamed from: L丨lLLL, reason: contains not printable characters */
    public int f3296LlLLL = 0;
    public boolean LL1IL = false;

    /* JADX INFO: renamed from: L11丨丨丨1, reason: contains not printable characters */
    public boolean f3291L111 = false;

    /* JADX INFO: renamed from: I丨Ii, reason: contains not printable characters */
    public boolean f3288IIi = false;

    public BaseVideoActivity() {
        new Handler(Looper.getMainLooper(), new IL1Iii(this));
        this.f3292LIll = new i(this);
    }

    public void IL1Iii() {
    }

    public final void IL1Iii(int i10) {
        try {
            if (this.f3291L111) {
                return;
            }
            if (i10 >= 0) {
                new Handler().postDelayed(new e0(this, i10), 1000L);
                return;
            }
            AdPlayer adPlayer = this.baseAdPlayer;
            if (adPlayer != null) {
                adPlayer.stop();
            }
            ILil();
        } catch (Exception e10) {
            d.a(e10, new StringBuilder("countdown error, msg = "), e10);
        }
    }

    public final void IL1Iii(int i10, int i11) {
        if (i10 > i11 && this.I11L == 1) {
            this.llliI.setVisibility(0);
            int screenWidth = ScreenUtil.getScreenWidth(this);
            int i12 = (i11 * screenWidth) / i10;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f3309LLlI1.getLayoutParams();
            layoutParams.width = screenWidth;
            layoutParams.height = i12;
            this.f3309LLlI1.setLayoutParams(layoutParams);
            return;
        }
        if (i11 <= i10 || this.I11L != 0) {
            this.llliI.setVisibility(8);
            return;
        }
        this.llliI.setVisibility(0);
        int screenHeight = ScreenUtil.getScreenHeight(this);
        int i13 = (i10 * screenHeight) / i11;
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f3309LLlI1.getLayoutParams();
        layoutParams2.width = i13;
        layoutParams2.height = screenHeight;
        this.f3309LLlI1.setLayoutParams(layoutParams2);
    }

    public final void IL1Iii(AdPlayer adPlayer, View view, OktVideoView oktVideoView) {
        getWindow().setFlags(128, 128);
        this.Ilil = (RelativeLayout) findViewById("main_layout_video");
        this.IL1Iii = (TextView) findViewById("main_txt_count_down_time");
        this.f3303lLi1LL = (RelativeLayout) findViewById("main_layout_bottom");
        this.f3297iILLL1 = (ImageView) findViewById("main_img_logo");
        this.f3290IiL = (TextView) findViewById("main_txt_name");
        this.f3295L11I = (TextView) findViewById("main_txt_summary");
        this.f3305il = (ImageView) findViewById("main_img_voice");
        this.ILL = (TextView) findViewById("main_btn_download");
        this.f3293Ll1 = (RelativeLayout) findViewById("main_layout_detail");
        this.f3299lIiI = (ImageView) findViewById("main_img_detail_logo");
        this.f3287ILl = (TextView) findViewById("main_txt_detail_name");
        this.f59310Lil = (TextView) findViewById("main_txt_detail_summary");
        this.LlLI1 = (ImageView) findViewById("main_img_detail_close");
        this.f3302llL1ii = (TextView) findViewById("main_btn_detail_download");
        this.f3301lIlii = (LinearLayout) findViewById("main_layout_content");
        this.llliI = (ImageView) findViewById("main_img_lager");
        this.f3308 = (LinearLayout) findViewById("main_reward_content_ly");
        this.llI = (RelativeLayout) findViewById("main_reward_web_ly");
        this.f3294L1l = (WebView) findViewById("main_reward_web_wv");
        this.f3298l1IIi1 = (ProgressBar) findViewById("main_reward_web_pb");
        this.f3304iILLl = (ImageView) findViewById("main_reward_web_close");
        this.f3309LLlI1 = oktVideoView;
        this.baseAdPlayer = adPlayer;
        this.f3308.removeAllViews();
        h.a(view);
        this.f3308.addView(view, new LinearLayout.LayoutParams(-1, -1));
        this.f3305il.setVisibility(8);
        this.IL1Iii.setVisibility(8);
        this.f3303lLi1LL.setVisibility(8);
        showDetail(false);
        try {
            this.f3305il.setVisibility(0);
            this.IL1Iii.setVisibility(0);
            this.f3303lLi1LL.setVisibility(0);
            int duration = this.baseAdPlayer.getDuration();
            this.IL1Iii.setVisibility(0);
            this.IL1Iii.setText(String.valueOf(duration));
            IL1Iii(duration);
            this.baseAdPlayer.addFragmentLife(this);
            this.baseAdPlayer.setIPlayerCallback(new r((RewardVideoActivity) this));
            this.baseAdPlayer.play4PreLoad();
            MainParams mainParams = this.f3306lL;
            IL1Iii(mainParams.videoWidth, mainParams.videoHeight);
            new ImageLoader().loadImg(this, this.f3306lL.logoUrl, new g0((RewardVideoActivity) this));
            this.f3290IiL.setText(this.f3306lL.name);
            this.f3287ILl.setText(this.f3306lL.name);
            if (TextUtils.isEmpty(this.f3306lL.name)) {
                this.f3287ILl.setVisibility(8);
            } else {
                this.f3287ILl.setVisibility(0);
            }
            this.f3295L11I.setText(this.f3306lL.summary);
            this.f59310Lil.setText(this.f3306lL.summary);
            if (TextUtils.isEmpty(this.f3306lL.summary)) {
                this.f59310Lil.setVisibility(8);
            } else {
                this.f59310Lil.setVisibility(0);
            }
            this.iIi1 = this.f3306lL.packageName;
            new ImageLoader().loadImg(this, this.f3306lL.imgUrl, new e((RewardVideoActivity) this));
            MainParams mainParams2 = this.f3306lL;
            this.f3307l = mainParams2.type;
            this.f3296LlLLL = mainParams2.skipTime;
            this.I1I.onAdShow(new AdInfo());
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            MainVideoAdCallBack mainVideoAdCallBack = this.I1I;
            int i10 = AdSdkStateCode.MAIN_LOGIC_ERROR;
            e10.getMessage();
            mainVideoAdCallBack.onAdFail(i10, "platform:wx, msg:" + IDUtil.getString(this, "main_ad_load_err"));
        }
        RewardVideoActivity rewardVideoActivity = (RewardVideoActivity) this;
        this.f3305il.setOnClickListener(new ILil(rewardVideoActivity));
        this.LlLI1.setOnClickListener(new v(rewardVideoActivity));
        j jVar = new j(rewardVideoActivity);
        this.f3293Ll1.setOnClickListener(jVar);
        this.f3303lLi1LL.setOnClickListener(jVar);
        TextView textView = (TextView) findViewById("main_txt_skip");
        this.f3300lIII = textView;
        textView.setOnClickListener(new f(rewardVideoActivity));
        boolean zEquals = this.f3306lL.playable.equals("1");
        AdLog.d("开启互动广告 " + zEquals);
        if (!zEquals) {
            AdLog.d("不开启互动广告");
            return;
        }
        WebSettings settings = this.f3294L1l.getSettings();
        this.f3294L1l.setVerticalScrollBarEnabled(false);
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
        this.f3294L1l.getSettings().setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        this.f3304iILLl.setOnClickListener(new c(rewardVideoActivity));
        this.f3294L1l.setWebViewClient(this.f3292LIll);
        this.f3294L1l.addJavascriptInterface(new p(rewardVideoActivity), "OktH5Bridge");
        this.f3294L1l.loadUrl(this.f3306lL.playableUrl);
    }

    public final void ILil() {
        try {
            if (!this.f33101) {
                this.f33101 = true;
                this.I1I.onAdVideoComplete();
                if (this.f3306lL.playable.equals("1")) {
                    AdLog.d("playableUrlLoadFailed " + this.f3288IIi);
                    if (this.f3288IIi) {
                        IL1Iii();
                        this.I1I.onAdClick();
                        closeAd();
                    } else if (TextUtils.isEmpty(this.f3306lL.playableUrl)) {
                        AdLog.d("playableUrl is empty!");
                        IL1Iii();
                        this.I1I.onAdClick();
                        closeAd();
                    } else {
                        this.f3293Ll1.setVisibility(8);
                        this.Ilil.setVisibility(8);
                        this.llI.setVisibility(0);
                        this.f3294L1l.loadUrl(this.f3306lL.playableUrl);
                    }
                } else {
                    showDetail(true);
                }
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public void closeAd() {
        this.I1I.onAdClose();
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AdPlayer adPlayer = this.baseAdPlayer;
        if (adPlayer != null) {
            adPlayer.release();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.I11li1 = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        AdPlayer adPlayer;
        super.onResume();
        if (this.I11li1 && (adPlayer = this.baseAdPlayer) != null) {
            IL1Iii(adPlayer.getRestTime());
        }
        this.I11li1 = false;
        int i10 = this.f3307l;
        if (i10 != 0) {
            if (i10 == 1) {
                String pathByUrl = FileLoader.getPathByUrl(this, this.f3306lL.clickUrl);
                if (TextUtils.isEmpty(this.iIi1) && new File(pathByUrl).exists()) {
                    this.iIi1 = AppUtil.getPackageName(this, pathByUrl);
                }
                if (StringUtil.isAppInstalled(this, this.iIi1)) {
                    this.ILL.setText(getString("main_open"));
                    this.f3302llL1ii.setText(getString("main_open_now"));
                    return;
                } else if (FileLoader.isApkVaild(this, this.f3306lL.clickUrl)) {
                    this.ILL.setText(getString("main_install"));
                    this.f3302llL1ii.setText(getString("main_install_now"));
                    return;
                } else {
                    this.ILL.setText(getString("main_downLoad"));
                    this.f3302llL1ii.setText(getString("main_downLoad_now"));
                    return;
                }
            }
            if (i10 != 2) {
                return;
            }
        }
        this.ILL.setText(getString("main_open"));
        this.f3302llL1ii.setText(getString("main_open_now"));
    }

    public void showDetail(boolean z10) {
        if (!z10) {
            this.f3293Ll1.setVisibility(8);
            this.Ilil.setVisibility(0);
            return;
        }
        this.f3293Ll1.setVisibility(0);
        if (this.I11L == 0) {
            this.f3301lIlii.getLayoutParams().width = ScreenUtil.getScreenWidth(this) / 2;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f3301lIlii.getLayoutParams();
            layoutParams.height = -1;
            layoutParams.addRule(11);
        }
        this.Ilil.setVisibility(8);
    }
}
