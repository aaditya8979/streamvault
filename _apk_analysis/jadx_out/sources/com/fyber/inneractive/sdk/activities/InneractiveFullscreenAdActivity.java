package com.fyber.inneractive.sdk.activities;

import android.R;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.b0;
import com.fyber.inneractive.sdk.flow.p0;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.renderers.t;
import com.fyber.inneractive.sdk.ui.CloseButtonConfiguration;
import com.fyber.inneractive.sdk.ui.CloseButtonFlowManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes3.dex */
public class InneractiveFullscreenAdActivity extends InneractiveBaseActivity implements com.fyber.inneractive.sdk.interfaces.e {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f15776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveAdSpot f15777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.f f15778d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CloseButtonFlowManager f15783i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15779e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15780f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15781g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15782h = false;
    public final Runnable mHideNavigationBarTask = new c(this);

    public interface FullScreenRendererProvider {
        com.fyber.inneractive.sdk.interfaces.f getFullscreenRenderer();
    }

    public interface OnInneractiveFullscreenAdDestroyListener {
        void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity);
    }

    public void cancelHideNavigationBarTask() {
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
        r.f19556b.removeCallbacks(this.mHideNavigationBarTask);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void destroy() {
        if (isFinishing() || this.f15776b == null) {
            return;
        }
        finish();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void disableCloseButton() {
        CloseButtonFlowManager closeButtonFlowManager = this.f15783i;
        closeButtonFlowManager.f19458c.setVisibility(8);
        closeButtonFlowManager.f19456a.setVisibility(8);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void dismissAd(boolean z10) {
        this.f15782h = z10;
        cancelHideNavigationBarTask();
        com.fyber.inneractive.sdk.interfaces.f fVar = this.f15778d;
        if (fVar != null) {
            fVar.b(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f53142p, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public View getCloseButton() {
        return this.f15783i.f19460e;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public ViewGroup getLayout() {
        return this.f15776b;
    }

    public void hideNavigationBar() {
        View decorView = getWindow().getDecorView();
        if ((decorView.getSystemUiVisibility() & 2) == 0) {
            decorView.setSystemUiVisibility(2818);
        }
        decorView.setOnSystemUiVisibilityChangeListener(new d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initWindowFeatures(com.fyber.inneractive.sdk.interfaces.f fVar) {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().addFlags(2);
        }
        if (fVar != 0 && (((b0) fVar) instanceof t)) {
            setTheme(R.style.Theme.NoTitleBar.Fullscreen);
            requestWindowFeature(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            requestWindowFeature(134217728);
            requestWindowFeature(Integer.MIN_VALUE);
        }
        hideNavigationBar();
        t0 t0Var = ((r0) this.f15777c.getAdContent().f16698d).f16098f;
        if (t0Var != null) {
            Orientation orientation = t0Var.f16153e;
            setActivityOrientation(orientation.allowOrientationChange, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public boolean isCloseButtonDisplay() {
        return this.f15783i.f19459d.getVisibility() == 0;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.fyber.inneractive.sdk.interfaces.f fVar = this.f15778d;
        if (fVar == null || !fVar.v()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.fyber.inneractive.sdk.interfaces.f fVar = this.f15778d;
        if (fVar != null) {
            int i10 = configuration.orientation;
            if (i10 != this.f15779e) {
                this.f15779e = i10;
                fVar.a();
                return;
            }
            int i11 = this.f15780f;
            int i12 = configuration.screenHeightDp;
            if (i11 == i12 && this.f15781g == configuration.screenWidthDp) {
                return;
            }
            this.f15780f = i12;
            this.f15781g = configuration.screenWidthDp;
            fVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("spotId");
        InneractiveAdSpot inneractiveAdSpot = null;
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.f("%sSpot id must be provided as an extra before calling createActivity with InneractiveInterstitialAdActivty", IAlog.a(this));
        } else {
            InneractiveAdSpot spot = InneractiveAdSpotManager.get().getSpot(stringExtra);
            if (spot == null) {
                IAlog.b("%sSpot id %s cannot be found in spot manager!", IAlog.a(this), stringExtra);
            }
            if (spot != null && spot.getAdContent() == null) {
                IAlog.a("%sSpot does not have a content. Cannot start activity", IAlog.a(this));
            }
            if (spot != null && spot.getAdContent() != null) {
                inneractiveAdSpot = spot;
            }
        }
        this.f15777c = inneractiveAdSpot;
        if (inneractiveAdSpot == null || inneractiveAdSpot.getAdContent() == null || this.f15777c.getAdContent().f16698d == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        InneractiveUnitController selectedUnitController = this.f15777c.getSelectedUnitController();
        if (selectedUnitController == null || !(selectedUnitController instanceof FullScreenRendererProvider)) {
            IAlog.f("%sno appropriate unit controller found for full screen ad. Aborting", IAlog.a(this));
            super.onCreate(bundle);
            finish();
            return;
        }
        com.fyber.inneractive.sdk.interfaces.f fullscreenRenderer = ((FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
        this.f15778d = fullscreenRenderer;
        initWindowFeatures(fullscreenRenderer);
        super.onCreate(bundle);
        IAlog.a("%sInterstitial for spot id %s created", IAlog.a(this), this.f15777c.getLocalUniqueId());
        this.f15779e = getResources().getConfiguration().orientation;
        this.f15780f = getResources().getConfiguration().screenHeightDp;
        this.f15781g = getResources().getConfiguration().screenWidthDp;
        if (this.f15778d == null) {
            IAlog.f("Interstitial Activity: Could not find an appropriate full screen ad renderer for content!", new Object[0]);
            finish();
            return;
        }
        try {
            setContentView(com.fyber.inneractive.sdk.R.layout.ia_layout_fullscreen_activity);
            this.f15776b = (ViewGroup) findViewById(com.fyber.inneractive.sdk.R.id.ia_ad_content);
            this.f15783i = new CloseButtonFlowManager(this);
            ((p0) this.f15778d).initialize(this.f15777c);
            try {
                this.f15778d.a(this, this);
                this.f15778d.b(this.f15783i);
                this.f15777c.getAdContent().f16699e = true;
            } catch (Resources.NotFoundException e10) {
                IAlog.f("Interstitial Activity: %s", e10.getMessage());
                finish();
            } catch (InneractiveUnitController.AdDisplayError e11) {
                IAlog.f("Interstitial Activity: %s", e11.getMessage());
                finish();
            }
        } catch (Throwable th2) {
            z.a(th2, this.f15777c.getAdContent().f16695a, this.f15777c.getAdContent().b());
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        ViewGroup viewGroup = this.f15776b;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f15776b = null;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f15777c;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot == null ? null : inneractiveAdSpot.getSelectedUnitController();
        if (selectedUnitController != null && (selectedUnitController instanceof OnInneractiveFullscreenAdDestroyListener)) {
            ((OnInneractiveFullscreenAdDestroyListener) selectedUnitController).onActivityDestroyed(this);
        }
        com.fyber.inneractive.sdk.interfaces.f fVar = this.f15778d;
        if (fVar != null) {
            fVar.a(this.f15783i);
            this.f15778d.l();
            this.f15778d.destroy();
            this.f15778d = null;
        }
        super.onDestroy();
        InneractiveAdSpot inneractiveAdSpot2 = this.f15777c;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (!isFinishing()) {
            com.fyber.inneractive.sdk.interfaces.f fVar = this.f15778d;
            if (fVar != null) {
                fVar.s();
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.interfaces.f fVar2 = this.f15778d;
        if (fVar2 != null) {
            fVar2.a(this.f15783i);
            this.f15778d.l();
            this.f15778d.destroy();
            this.f15778d = null;
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        com.fyber.inneractive.sdk.interfaces.f fVar = this.f15778d;
        if (fVar != null) {
            fVar.n();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (!z10) {
            com.fyber.inneractive.sdk.interfaces.f fVar = this.f15778d;
            if (fVar != null) {
                fVar.s();
                return;
            }
            return;
        }
        hideNavigationBar();
        com.fyber.inneractive.sdk.interfaces.f fVar2 = this.f15778d;
        if (fVar2 != null) {
            fVar2.n();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void secondEndCardWasDisplayed() {
        this.f15783i.f19461f = true;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void setActivityOrientation(boolean z10, Orientation orientation) {
        if (z10 && orientation.equals(Orientation.USER)) {
            setRequestedOrientation(13);
            return;
        }
        if (z10 && orientation.equals(Orientation.NONE)) {
            setRequestedOrientation(getRequestedOrientation());
            return;
        }
        if (orientation.equals(Orientation.LANDSCAPE)) {
            setRequestedOrientation(6);
            return;
        }
        if (orientation.equals(Orientation.PORTRAIT)) {
            setRequestedOrientation(7);
            return;
        }
        int i10 = getResources().getConfiguration().orientation;
        if (i10 == 1) {
            setRequestedOrientation(7);
        } else if (i10 == 2) {
            setRequestedOrientation(6);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void showCloseButton(boolean z10, int i10, int i11) {
        CloseButtonConfiguration closeButtonConfiguration = this.f15783i.f19462g;
        closeButtonConfiguration.f19451c = z10;
        closeButtonConfiguration.f19452d = i10;
        closeButtonConfiguration.f19453e = i11;
        closeButtonConfiguration.f19450b = true;
        closeButtonConfiguration.f19449a = false;
        closeButtonConfiguration.f19455g.a(closeButtonConfiguration);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void showCloseCountdown() {
        CloseButtonFlowManager closeButtonFlowManager = this.f15783i;
        closeButtonFlowManager.f19457b.setBackgroundResource(com.fyber.inneractive.sdk.R.drawable.ia_round_overlay_bg);
        CloseButtonConfiguration closeButtonConfiguration = closeButtonFlowManager.f19462g;
        closeButtonConfiguration.f19449a = true;
        closeButtonConfiguration.f19450b = false;
        closeButtonConfiguration.f19455g.a(closeButtonConfiguration);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void updateCloseCountdown(int i10) {
        CloseButtonFlowManager closeButtonFlowManager = this.f15783i;
        if (i10 > 0) {
            closeButtonFlowManager.f19457b.setText(Integer.toString(i10));
        } else {
            closeButtonFlowManager.getClass();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public boolean wasDismissedByUser() {
        return this.f15782h;
    }
}
