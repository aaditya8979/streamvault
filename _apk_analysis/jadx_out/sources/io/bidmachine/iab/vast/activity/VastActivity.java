package io.bidmachine.iab.vast.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.measurer.MraidAdMeasurer;
import io.bidmachine.iab.measurer.VastAdMeasurer;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.iab.vast.VastActivityListener;
import io.bidmachine.iab.vast.VastLog;
import io.bidmachine.iab.vast.VastPlaybackListener;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastRequestManager;
import io.bidmachine.iab.vast.VastViewListener;
import io.bidmachine.util.UiUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class VastActivity extends io.bidmachine.rendering.internal.a {
    public static final int VAST_VIEW_ID = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map f69519h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map f69520i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static WeakReference f69521j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static WeakReference f69522k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static WeakReference f69523l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VastRequest f69525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private VastView f69526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private VastActivityListener f69527d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f69529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f69530g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VastViewListener f69524a = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f69528e = false;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private VastRequest f69531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private VastActivityListener f69532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private VastView f69533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private VastPlaybackListener f69534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private VastAdMeasurer f69535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private MraidAdMeasurer f69536f;

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (intent == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(intent, "io.bidmachine");
            context.startActivity(intent);
        }

        public Intent a(Context context) {
            Intent intent = new Intent(context, (Class<?>) VastActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        }

        @Nullable
        public IabError display(Context context) {
            VastRequest vastRequest = this.f69531a;
            if (vastRequest == null) {
                VastLog.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.f49300f, "VastRequest is null", new Object[0]);
                return IabError.internal("VastRequest is null");
            }
            try {
                VastRequestManager.store(vastRequest);
                Intent intentA = a(context);
                intentA.putExtra("vast_request_id", this.f69531a.getId());
                VastActivityListener vastActivityListener = this.f69532b;
                if (vastActivityListener != null) {
                    VastActivity.b(this.f69531a, vastActivityListener);
                }
                VastView vastView = this.f69533c;
                if (vastView != null) {
                    VastActivity.b(this.f69531a, vastView);
                }
                if (this.f69534d != null) {
                    WeakReference unused = VastActivity.f69521j = new WeakReference(this.f69534d);
                } else {
                    WeakReference unused2 = VastActivity.f69521j = null;
                }
                if (this.f69535e != null) {
                    WeakReference unused3 = VastActivity.f69522k = new WeakReference(this.f69535e);
                } else {
                    WeakReference unused4 = VastActivity.f69522k = null;
                }
                if (this.f69536f != null) {
                    WeakReference unused5 = VastActivity.f69523l = new WeakReference(this.f69536f);
                } else {
                    WeakReference unused6 = VastActivity.f69523l = null;
                }
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentA);
                return null;
            } catch (Throwable th2) {
                VastLog.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.f49300f, th2);
                VastActivity.f(this.f69531a);
                VastActivity.g(this.f69531a);
                WeakReference unused7 = VastActivity.f69521j = null;
                WeakReference unused8 = VastActivity.f69522k = null;
                WeakReference unused9 = VastActivity.f69523l = null;
                return IabError.throwable("Exception during displaying VastActivity", th2);
            }
        }

        public Builder setAdMeasurer(@Nullable VastAdMeasurer vastAdMeasurer) {
            this.f69535e = vastAdMeasurer;
            return this;
        }

        public Builder setListener(@Nullable VastActivityListener vastActivityListener) {
            this.f69532b = vastActivityListener;
            return this;
        }

        public Builder setPlaybackListener(@Nullable VastPlaybackListener vastPlaybackListener) {
            this.f69534d = vastPlaybackListener;
            return this;
        }

        public Builder setPostBannerAdMeasurer(@Nullable MraidAdMeasurer mraidAdMeasurer) {
            this.f69536f = mraidAdMeasurer;
            return this;
        }

        public Builder setRequest(@NonNull VastRequest vastRequest) {
            this.f69531a = vastRequest;
            return this;
        }

        public Builder setVastView(@Nullable VastView vastView) {
            this.f69533c = vastView;
            return this;
        }
    }

    public class b implements VastViewListener {
        private b() {
        }

        @Override // io.bidmachine.iab.vast.VastViewListener
        public void onClick(VastView vastView, VastRequest vastRequest, IabClickCallback iabClickCallback, String str) {
            if (VastActivity.this.f69527d != null) {
                VastActivity.this.f69527d.onVastClick(VastActivity.this, vastRequest, iabClickCallback, str);
            }
        }

        @Override // io.bidmachine.iab.vast.VastViewListener
        public void onComplete(VastView vastView, VastRequest vastRequest) {
            if (VastActivity.this.f69527d != null) {
                VastActivity.this.f69527d.onVastComplete(VastActivity.this, vastRequest);
            }
        }

        @Override // io.bidmachine.iab.vast.VastViewListener
        public void onFinish(VastView vastView, VastRequest vastRequest, boolean z10) {
            VastActivity.this.a(vastRequest, z10);
        }

        @Override // io.bidmachine.iab.vast.VastViewListener
        public void onOrientationRequested(VastView vastView, VastRequest vastRequest, int i10) {
            int forceOrientation = vastRequest.getForceOrientation();
            if (forceOrientation > -1) {
                i10 = forceOrientation;
            }
            VastActivity.this.a(i10);
        }

        @Override // io.bidmachine.iab.vast.VastViewListener
        public void onShowFailed(VastView vastView, VastRequest vastRequest, IabError iabError) {
            VastActivity.this.a(vastRequest, iabError);
        }

        @Override // io.bidmachine.iab.vast.VastViewListener
        public void onShown(VastView vastView, VastRequest vastRequest) {
            if (VastActivity.this.f69527d != null) {
                VastActivity.this.f69527d.onVastShown(VastActivity.this, vastRequest);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        setRequestedOrientation(i10 == 1 ? 7 : i10 == 2 ? 6 : 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(VastRequest vastRequest, IabError iabError) {
        VastActivityListener vastActivityListener = this.f69527d;
        if (vastActivityListener != null) {
            vastActivityListener.onVastShowFailed(vastRequest, iabError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(VastRequest vastRequest, boolean z10) {
        VastActivityListener vastActivityListener = this.f69527d;
        if (vastActivityListener != null && !this.f69530g) {
            vastActivityListener.onVastDismiss(this, vastRequest, z10);
        }
        this.f69530g = true;
        try {
            getWindow().clearFlags(128);
        } catch (Exception e10) {
            VastLog.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.f49300f, e10.getMessage(), new Object[0]);
        }
        if (vastRequest != null) {
            a(vastRequest.getRequestedOrientation());
        }
        UiUtils.finishActivityWithoutAnimation(this);
    }

    private void a(VastView vastView) {
        Utils.applyFullscreenActivityFlags(this);
        Utils.removeFromParent(vastView);
        setContentView(vastView);
        Utils.applyWindowInsets(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(VastRequest vastRequest, VastActivityListener vastActivityListener) {
        f69519h.put(vastRequest.getId(), new WeakReference(vastActivityListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(VastRequest vastRequest, VastView vastView) {
        f69520i.put(vastRequest.getId(), new WeakReference(vastView));
    }

    private Integer c(VastRequest vastRequest) {
        int forceOrientation = vastRequest.getForceOrientation();
        if (forceOrientation > -1) {
            return Integer.valueOf(forceOrientation);
        }
        int preferredVideoOrientation = vastRequest.getPreferredVideoOrientation();
        if (preferredVideoOrientation == 0 || preferredVideoOrientation == getResources().getConfiguration().orientation) {
            return null;
        }
        return Integer.valueOf(preferredVideoOrientation);
    }

    private static VastActivityListener d(VastRequest vastRequest) {
        WeakReference weakReference = (WeakReference) f69519h.get(vastRequest.getId());
        if (weakReference != null && weakReference.get() != null) {
            return (VastActivityListener) weakReference.get();
        }
        f(vastRequest);
        return null;
    }

    private static VastView e(VastRequest vastRequest) {
        WeakReference weakReference = (WeakReference) f69520i.get(vastRequest.getId());
        if (weakReference != null && weakReference.get() != null) {
            return (VastView) weakReference.get();
        }
        g(vastRequest);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(VastRequest vastRequest) {
        f69519h.remove(vastRequest.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(VastRequest vastRequest) {
        f69520i.remove(vastRequest.getId());
    }

    @Override // io.bidmachine.rendering.internal.a
    public void a() {
        VastView vastView = this.f69526c;
        if (vastView != null) {
            vastView.handleBackPress();
        }
    }

    @Override // io.bidmachine.rendering.internal.a, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch("io.bidmachine", motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // io.bidmachine.rendering.internal.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        Integer numC;
        super.onCreate(bundle);
        this.f69525b = VastRequestManager.get(getIntent().getStringExtra("vast_request_id"));
        if (bundle != null && bundle.getBoolean("isFinishedPerformed")) {
            finish();
            return;
        }
        VastRequest vastRequest = this.f69525b;
        if (vastRequest == null) {
            a((VastRequest) null, IabError.internal("VastRequest is null"));
            a((VastRequest) null, false);
            return;
        }
        if (bundle == null && (numC = c(vastRequest)) != null) {
            a(numC.intValue());
            try {
                if ((getPackageManager().getActivityInfo(getComponentName(), 65536).configChanges & 128) == 0) {
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.f69527d = d(this.f69525b);
        VastView vastViewE = e(this.f69525b);
        this.f69526c = vastViewE;
        if (vastViewE == null) {
            this.f69528e = true;
            this.f69526c = new VastView(this);
        }
        this.f69526c.setId(1);
        this.f69526c.setListener(this.f69524a);
        WeakReference weakReference = f69521j;
        if (weakReference != null) {
            this.f69526c.setPlaybackListener((VastPlaybackListener) weakReference.get());
        }
        WeakReference weakReference2 = f69522k;
        if (weakReference2 != null) {
            this.f69526c.setAdMeasurer((VastAdMeasurer) weakReference2.get());
        }
        WeakReference weakReference3 = f69523l;
        if (weakReference3 != null) {
            this.f69526c.setPostBannerAdMeasurer((MraidAdMeasurer) weakReference3.get());
        }
        if (bundle == null || !bundle.getBoolean("isLoadPerformed")) {
            this.f69529f = true;
            if (!this.f69526c.display(this.f69525b, Boolean.TRUE)) {
                return;
            }
        }
        a(this.f69526c);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        VastRequest vastRequest;
        VastView vastView;
        super.onDestroy();
        if (isChangingConfigurations() || (vastRequest = this.f69525b) == null) {
            return;
        }
        VastView vastView2 = this.f69526c;
        a(vastRequest, vastView2 != null && vastView2.isFinished());
        if (this.f69528e && (vastView = this.f69526c) != null) {
            vastView.destroy();
        }
        f(this.f69525b);
        g(this.f69525b);
        f69521j = null;
        f69522k = null;
        f69523l = null;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isLoadPerformed", this.f69529f);
        bundle.putBoolean("isFinishedPerformed", this.f69530g);
    }
}
