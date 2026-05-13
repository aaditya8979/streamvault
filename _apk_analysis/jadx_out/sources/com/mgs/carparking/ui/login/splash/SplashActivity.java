package com.mgs.carparking.ui.login.splash;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.basecommon.ui.BarActivity;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.mgs.carparking.netbean.AdInfoEntry;
import com.vungle.ads.internal.ui.AdActivity;
import ec.f;
import ed.e;
import ed.i;
import ed.l0;
import ed.p;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import np.b;
import uc.c;
import zp.k;
import zp.o;
import zp.r;

/* JADX INFO: loaded from: classes12.dex */
public class SplashActivity extends BarActivity implements tc.a {
    public c A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Handler f44798v = new Handler();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f44799w = "SplashActivity.classdeepLink";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AdInfoDetailEntry f44800x = new AdInfoDetailEntry();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f44801y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f44802z = "";

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strB = i.b(SplashActivity.this);
            if (o.b(strB)) {
                ed.c.h("");
                return;
            }
            Log.e(AdActivity.REQUEST_KEY_EXTRA, strB);
            AppApplication.clipStr = strB;
            Matcher matcher = Pattern.compile("#invited#(.+)#@#").matcher(strB);
            if (!matcher.find()) {
                ed.c.h("");
                return;
            }
            String strGroup = matcher.group(1);
            if (o.b(strGroup)) {
                ed.c.h("");
            } else {
                ed.c.h(strGroup);
                i.a();
            }
        }
    }

    public void copyinit() {
        this.f44798v.postDelayed(new a(), 30L);
    }

    @Override // tc.a
    public void isConf(boolean z10) {
        c cVar;
        if (!z10 || (cVar = this.A) == null) {
            return;
        }
        cVar.d();
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        b.b().c(1);
        super.onCreate(bundle);
        f.d(getWindow().getDecorView());
        setContentView(R.layout.acitivity_splash, false);
        if (!isTaskRoot() || e.i(this) || e.o()) {
            finish();
            return;
        }
        c cVar = new c(this);
        this.A = cVar;
        cVar.e();
        copyinit();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // tc.a
    public void setAdInfo(AdInfoEntry adInfoEntry) {
        if (adInfoEntry == null) {
            return;
        }
        this.f44801y = true;
        k.i(r.b()).n(adInfoEntry);
        AppApplication.adInfoEntry = adInfoEntry;
        if (l0.y() == 0) {
            l0.E0(1);
            p.a(this);
            finish();
        } else if (adInfoEntry.getAd_position_1() != null && adInfoEntry.getAd_position_1().size() > 0) {
            ed.b.C(this, adInfoEntry.getAd_position_1());
        } else {
            p.a(this);
            finish();
        }
    }

    public void showToast(String str) {
    }
}
