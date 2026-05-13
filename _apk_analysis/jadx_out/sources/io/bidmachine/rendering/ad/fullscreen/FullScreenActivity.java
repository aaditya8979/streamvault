package io.bidmachine.rendering.ad.fullscreen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.rendering.internal.a;
import io.bidmachine.rendering.internal.b;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.util.UiUtils;

/* JADX INFO: loaded from: classes7.dex */
public class FullScreenActivity extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static FullScreenAd f70010b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FullScreenAd f70011a;

    private void c() {
        UiUtils.finishActivityWithoutAnimation(this);
        FullScreenAd fullScreenAd = this.f70011a;
        if (fullScreenAd != null) {
            fullScreenAd.r();
            this.f70011a = null;
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, "io.bidmachine");
        context.startActivity(intent);
    }

    public static void show(@NonNull Context context, @NonNull FullScreenAd fullScreenAd) {
        try {
            f70010b = fullScreenAd;
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, b.a(context, FullScreenActivity.class));
        } catch (Throwable unused) {
            f70010b = null;
            fullScreenAd.d(new Error("Ad is null"));
        }
    }

    @Override // io.bidmachine.rendering.internal.a, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch("io.bidmachine", motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // io.bidmachine.rendering.internal.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FullScreenAd fullScreenAd = f70010b;
        this.f70011a = fullScreenAd;
        if (fullScreenAd == null) {
            c();
        } else {
            fullScreenAd.b(this);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (isChangingConfigurations()) {
            return;
        }
        if (f70010b == this.f70011a) {
            f70010b = null;
        }
        c();
    }
}
