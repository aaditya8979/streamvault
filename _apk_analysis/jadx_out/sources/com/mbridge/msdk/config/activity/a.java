package com.mbridge.msdk.config.activity;

import android.content.Intent;
import android.view.ViewGroup;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: ActivityPresenter.java */
/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35747a = "ActivityPresenter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.activity.lifecycle.a f35748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f35749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35750d;

    public a(MBRewardVideoActivity mBRewardVideoActivity, ViewGroup viewGroup) {
        this.f35749c = viewGroup;
        a(mBRewardVideoActivity);
        if (mBRewardVideoActivity != null && mBRewardVideoActivity.getIntent() != null) {
            this.f35748b = (com.mbridge.msdk.config.activity.lifecycle.a) mBRewardVideoActivity.getIntent().getSerializableExtra("lifecycleCallbackByActivity");
            int intExtra = mBRewardVideoActivity.getIntent().getIntExtra("orientation", 1);
            this.f35750d = intExtra;
            mBRewardVideoActivity.setRequestedOrientation(intExtra);
        }
        a("onCreate");
    }

    private void a(MBRewardVideoActivity mBRewardVideoActivity) {
        int iA;
        int iA2;
        int iA3;
        if (mBRewardVideoActivity == null || mBRewardVideoActivity.isFinishing() || mBRewardVideoActivity.getIntent() == null) {
            return;
        }
        Intent intent = mBRewardVideoActivity.getIntent();
        if (intent.getIntExtra("modal", 0) != 1) {
            return;
        }
        try {
            int intExtra = mBRewardVideoActivity.getIntent().getIntExtra("width", 0);
            int intExtra2 = mBRewardVideoActivity.getIntent().getIntExtra("height", 0);
            int iG = v0.g(mBRewardVideoActivity);
            int iF = v0.f(mBRewardVideoActivity);
            if (intent.getIntExtra("hide_status_bar", 0) == 0 && (iA3 = c.a(mBRewardVideoActivity)) > 0) {
                iF -= iA3;
            }
            if (intExtra <= 0 || intExtra2 <= 0) {
                iA = iG;
                iA2 = iF;
            } else {
                iA = v0.a(mBRewardVideoActivity, intExtra);
                iA2 = v0.a(mBRewardVideoActivity, intExtra2);
            }
            int iMin = Math.min(iA, iG);
            int iMin2 = Math.min(iA2, iF);
            ViewGroup.LayoutParams layoutParams = this.f35749c.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iMin, iMin2);
            } else {
                layoutParams.width = iMin;
                layoutParams.height = iMin2;
            }
            this.f35749c.setLayoutParams(layoutParams);
            this.f35749c.setX((iG - iMin) / 2.0f);
            this.f35749c.setY((iF - iMin2) / 2.0f);
        } catch (Exception e10) {
            q0.b("ActivityPresenter", e10.getMessage());
        }
    }

    public void a(String str) {
        if (this.f35748b == null) {
            return;
        }
        str.hashCode();
        switch (str) {
            case "onDestroy":
                this.f35748b.f();
                break;
            case "onPause":
                this.f35748b.e();
                break;
            case "onStart":
                this.f35748b.onStart();
                break;
            case "onBackPressed":
                this.f35748b.c();
                break;
            case "onStop":
                this.f35748b.a();
                break;
            case "onCreate":
                this.f35748b.a(this.f35749c);
                break;
            case "onResume":
                this.f35748b.b();
                break;
        }
        q0.b("ActivityPresenter", "life " + str);
    }
}
