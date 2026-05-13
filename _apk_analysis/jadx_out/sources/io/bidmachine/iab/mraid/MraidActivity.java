package io.bidmachine.iab.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.rendering.internal.b;
import io.bidmachine.util.UiUtils;

/* JADX INFO: loaded from: classes11.dex */
public class MraidActivity extends io.bidmachine.rendering.internal.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final SparseArray f69178d = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f69179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MraidInterstitial f69180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f69181c = false;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69182a;

        static {
            int[] iArr = new int[MraidType.values().length];
            f69182a = iArr;
            try {
                iArr[MraidType.Static.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69182a[MraidType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69182a[MraidType.Rewarded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static Intent a(Context context, MraidType mraidType, int i10) {
        Intent intentA = b.a(context, MraidActivity.class);
        intentA.putExtra("InterstitialId", i10);
        intentA.putExtra("InterstitialType", mraidType);
        return intentA;
    }

    private static void a(MraidInterstitial mraidInterstitial) {
        f69178d.put(mraidInterstitial.f69247id, mraidInterstitial);
    }

    private static void a(Integer num) {
        if (num == null) {
            return;
        }
        f69178d.remove(num.intValue());
    }

    private void c() {
        a(this.f69179a);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, "io.bidmachine");
        context.startActivity(intent);
    }

    public static void show(@Nullable Context context, @Nullable MraidInterstitial mraidInterstitial, @Nullable MraidType mraidType) {
        if (mraidInterstitial == null) {
            MraidLog.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.f48294i, "MraidInterstitial is null during showing MraidActivity", new Object[0]);
            return;
        }
        if (context == null) {
            MraidLog.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.f48294i, "Context is null during showing MraidActivity", new Object[0]);
            mraidInterstitial.c(IabError.noRequiredArguments("Context is null during showing MraidActivity"));
            return;
        }
        if (mraidType == null) {
            MraidLog.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.f48294i, "MraidType is null during showing MraidActivity", new Object[0]);
            mraidInterstitial.c(IabError.noRequiredArguments("MraidType is null during showing MraidActivity"));
            return;
        }
        try {
            a(mraidInterstitial);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a(context, mraidType, mraidInterstitial.f69247id));
        } catch (Throwable th2) {
            MraidLog.e("Exception during showing MraidActivity", th2);
            mraidInterstitial.c(IabError.throwable("Exception during showing MraidActivity", th2));
            a(Integer.valueOf(mraidInterstitial.f69247id));
        }
    }

    @Override // io.bidmachine.rendering.internal.a
    public void a() {
        if (this.f69181c) {
            MraidInterstitial mraidInterstitial = this.f69180b;
            if (mraidInterstitial != null) {
                mraidInterstitial.dispatchClose();
            } else {
                UiUtils.finishActivityWithoutAnimation(this);
            }
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
        if (!getIntent().hasExtra("InterstitialId")) {
            MraidLog.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.f48294i, "Mraid display cache id not provided", new Object[0]);
            UiUtils.finishActivityWithoutAnimation(this);
            return;
        }
        Integer numValueOf = Integer.valueOf(getIntent().getIntExtra("InterstitialId", 0));
        this.f69179a = numValueOf;
        MraidInterstitial mraidInterstitial = (MraidInterstitial) f69178d.get(numValueOf.intValue());
        this.f69180b = mraidInterstitial;
        if (mraidInterstitial == null) {
            MraidLog.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.f48294i, "Mraid interstitial not found in display cache, id=%s", this.f69179a);
            UiUtils.finishActivityWithoutAnimation(this);
            return;
        }
        MraidType mraidType = (MraidType) getIntent().getSerializableExtra("InterstitialType");
        if (mraidType == null) {
            MraidLog.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.f48294i, "MraidType is null", new Object[0]);
            UiUtils.finishActivityWithoutAnimation(this);
            this.f69180b.c(IabError.internal("MraidType is null"));
            return;
        }
        Utils.applyFullscreenActivityFlags(this);
        int i10 = a.f69182a[mraidType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            this.f69181c = true;
        } else if (i10 == 3) {
            this.f69181c = false;
        }
        try {
            this.f69180b.a((Activity) this, false);
        } catch (Exception e10) {
            MraidLog.e("Exception during showing MraidInterstial in MraidActivity", e10);
            UiUtils.finishActivityWithoutAnimation(this);
            this.f69180b.c(IabError.throwable("Exception during showing MraidInterstial in MraidActivity", e10));
            c();
        }
        Utils.applyWindowInsets(this);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f69180b == null || isChangingConfigurations()) {
            return;
        }
        this.f69180b.b();
        c();
    }
}
