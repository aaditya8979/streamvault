package com.mgs.carparking.ui.login.splash;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.dramarush.shortin.R;
import com.mgs.carparking.basecommon.ui.BarActivity;
import com.mgs.carparking.db.AdNumShowDao;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.wangxiong.sdk.callBack.SplashAdCallBack;
import com.wangxiong.sdk.view.SplashAd;
import com.yk.e.object.AdInfo;
import ec.f;
import ed.c;
import ed.p;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SplashWxActivity extends BarActivity {
    public static final String[] I = {"android.permission.READ_PHONE_STATE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    public boolean C;
    public String D;
    public int E;
    public RelativeLayout F;
    public SplashAd G;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FrameLayout f44805w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<String> f44804v = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f44806x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f44807y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Handler f44808z = new Handler();
    public boolean A = false;
    public AdInfoDetailEntry B = new AdInfoDetailEntry();
    public SplashAdCallBack H = new a();

    public class a implements SplashAdCallBack {
        public a() {
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i("SplashActivity", "开屏广告被点击了");
            SplashWxActivity.this.f44807y = true;
            c.e(3, SplashWxActivity.this.B.getAd_type(), SplashWxActivity.this.B.getAd_source_id(), 1, SplashWxActivity.this.E, 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainSplashAdCallBack
        public void onAdClose() {
            Log.i("SplashActivity", "开屏广告关闭");
            SplashWxActivity.this.f44807y = true;
            SplashWxActivity.this.u();
        }

        @Override // com.yk.e.callBack.MainSplashAdCallBack
        public void onAdComplete() {
            Log.i("SplashActivity", "开屏广告播放完成");
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            Log.i("SplashActivity", "开屏广告加载失败:" + str);
            c.e(1, SplashWxActivity.this.B.getAd_type(), SplashWxActivity.this.B.getAd_source_id(), 1, SplashWxActivity.this.E, 0, 0, 0);
            c.d("adposition:1 Ad_source_id:" + SplashWxActivity.this.B.getAd_source_id() + " +s:" + i10 + " s1:" + str);
            SplashWxActivity splashWxActivity = SplashWxActivity.this;
            if (splashWxActivity.H != null) {
                splashWxActivity.v();
            }
        }

        @Override // com.yk.e.callBack.MainSplashAdCallBack
        public void onAdLoaded() {
            SplashAd splashAd;
            Log.i("SplashActivity", "开屏广告缓存成功");
            SplashWxActivity.this.A = true;
            c.e(4, SplashWxActivity.this.B.getAd_type(), SplashWxActivity.this.B.getAd_source_id(), 1, SplashWxActivity.this.E, 1, 0, 0);
            SplashWxActivity splashWxActivity = SplashWxActivity.this;
            if (splashWxActivity.H == null || (splashAd = splashWxActivity.G) == null) {
                return;
            }
            splashAd.showAd();
        }

        @Override // com.yk.e.callBack.MainSplashAdCallBack
        public void onAdShow(AdInfo adInfo) {
            Log.i("SplashActivity", "开屏广告展示了");
            Log.e("SplashActivity", "onShowSuccessed");
            SplashWxActivity.this.A = true;
            SplashWxActivity.this.F.setVisibility(8);
            AdNumShowDao.getInstance().updateSplashTdNum(AdNumShowDao.getInstance().getNum(2) + 1);
            c.e(2, SplashWxActivity.this.B.getAd_type(), SplashWxActivity.this.B.getAd_source_id(), 1, SplashWxActivity.this.E, 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainSplashAdCallBack
        public void onAdSkipped() {
            Log.i("SplashActivity", "开屏广告跳过了");
            SplashWxActivity.this.f44807y = true;
            SplashWxActivity.this.u();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SplashWxActivity.this.A) {
                return;
            }
            if (SplashWxActivity.this.C) {
                SplashWxActivity.this.finish();
            } else {
                SplashWxActivity.this.v();
            }
        }
    }

    public void initData() {
        for (String str : I) {
            if (ContextCompat.checkSelfPermission(this, str) != 0) {
                this.f44804v.add(str);
            }
        }
        this.f44805w = (FrameLayout) findViewById(R.id.splash_container);
        this.C = getIntent().getBooleanExtra("flag", false);
        AdInfoDetailEntry adInfoDetailEntry = (AdInfoDetailEntry) getIntent().getSerializableExtra("adInfoDetailEntry");
        this.B = adInfoDetailEntry;
        if (adInfoDetailEntry != null) {
            this.D = adInfoDetailEntry.getSdk_ad_id();
            this.E = this.B.getAd_id();
            if (this.f44804v.isEmpty()) {
                w();
            } else {
                List<String> list = this.f44804v;
                ActivityCompat.requestPermissions(this, (String[]) list.toArray(new String[list.size()]), 1);
            }
        } else if (this.C) {
            finish();
        } else {
            v();
        }
        postLoad();
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        np.b.b().c(1);
        super.onCreate(bundle);
        f.d(getWindow().getDecorView());
        setContentView(R.layout.activity_splash_wx, false);
        this.F = (RelativeLayout) findViewById(R.id.show_ad);
        initData();
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.f44808z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f44808z = null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4 || i10 == 3) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f44806x = false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f44806x = true;
        u();
    }

    public void postLoad() {
        this.f44808z.postDelayed(new b(), 3500L);
    }

    public final void u() {
        if (this.f44806x && this.f44807y) {
            this.f44806x = false;
            if (this.C) {
                finish();
            } else {
                v();
            }
        }
    }

    public final void v() {
        this.H = null;
        this.f44807y = false;
        p.a(this);
        finish();
    }

    public final void w() {
        try {
            SplashAd splashAd = new SplashAd(this, this.D, this.f44805w, this.H);
            this.G = splashAd;
            splashAd.loadAd();
            c.e(7, this.B.getAd_type(), this.B.getAd_source_id(), 1, this.E, 0, 0, 0);
        } catch (Exception unused) {
        }
    }
}
