package io.bidmachine.rendering.ad.fullscreen;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.ad.fullscreen.FullScreenAdListener;
import io.bidmachine.rendering.ad.view.AdView;
import io.bidmachine.rendering.ad.view.AdViewListener;
import io.bidmachine.rendering.internal.state.d;
import io.bidmachine.rendering.model.AdParams;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.util.Executable;
import io.bidmachine.util.UiUtils;
import io.bidmachine.util.Utils;
import io.bidmachine.util.ViewUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class FullScreenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.state.a f70012a = new d("FullScreenAd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdView f70013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FullScreenAdListener f70014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference f70015d;

    public class b implements AdViewListener {
        private b() {
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdAppeared(AdView adView) {
            FullScreenAd.this.k();
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBrokenCreativeEvent(AdView adView, BrokenCreativeEvent brokenCreativeEvent) {
            FullScreenAd.this.b(brokenCreativeEvent);
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdFailToLoad(AdView adView, Error error) {
            FullScreenAd.this.c(error);
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onOpenPrivacySheet(AdView adView, PrivacySheetParams privacySheetParams) {
            FullScreenAd.this.b(privacySheetParams);
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onAdClicked(AdView adView) {
            FullScreenAd.this.l();
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onAdFailToShow(AdView adView, Error error) {
            FullScreenAd.this.d(error);
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onAdDisappeared(AdView adView) {
            FullScreenAd.this.m();
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onAdExpired(AdView adView) {
            FullScreenAd.this.n();
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onAdFinished(AdView adView) {
            FullScreenAd.this.r();
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(AdView adView) {
            FullScreenAd.this.p();
        }

        @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onAdShown(AdView adView) {
            FullScreenAd.this.q();
        }
    }

    public FullScreenAd(@NonNull Context context, @NonNull AdParams adParams) {
        this.f70013b = new AdView(context.getApplicationContext(), adParams);
    }

    private void a() {
        Activity activityC = c();
        if (activityC != null) {
            try {
                UiUtils.finishActivityWithoutAnimation(activityC);
            } catch (Throwable unused) {
            }
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final BrokenCreativeEvent brokenCreativeEvent) {
        Utils.ifNotNull(this.f70014c, new Executable() { // from class: fk.g
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                this.f61744a.a(brokenCreativeEvent, (FullScreenAdListener) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(BrokenCreativeEvent brokenCreativeEvent, FullScreenAdListener fullScreenAdListener) {
        fullScreenAdListener.onBrokenCreativeEvent(this, brokenCreativeEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Error error) {
        FullScreenAdListener fullScreenAdListener = this.f70014c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdFailToLoad(this, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final PrivacySheetParams privacySheetParams) {
        Utils.ifNotNull(this.f70014c, new Executable() { // from class: fk.f
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                this.f61742a.a(privacySheetParams, (FullScreenAdListener) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(PrivacySheetParams privacySheetParams, FullScreenAdListener fullScreenAdListener) {
        fullScreenAdListener.onOpenPrivacySheet(this, privacySheetParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final BrokenCreativeEvent brokenCreativeEvent) {
        if (this.f70012a.h()) {
            return;
        }
        io.bidmachine.rendering.utils.UiUtils.onUiThread(new Runnable() { // from class: fk.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f61737b.a(brokenCreativeEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Error error) {
        FullScreenAdListener fullScreenAdListener = this.f70014c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdFailToShow(this, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final PrivacySheetParams privacySheetParams) {
        io.bidmachine.rendering.utils.UiUtils.onUiThread(new Runnable() { // from class: fk.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f61748b.a(privacySheetParams);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final Error error) {
        if (this.f70012a.a(false)) {
            io.bidmachine.rendering.utils.UiUtils.onUiThread(new Runnable() { // from class: fk.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61734b.a(error);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        FullScreenAdListener fullScreenAdListener = this.f70014c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdAppeared(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        FullScreenAdListener fullScreenAdListener = this.f70014c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        FullScreenAdListener fullScreenAdListener = this.f70014c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdDisappeared(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        FullScreenAdListener fullScreenAdListener = this.f70014c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdExpired(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        FullScreenAdListener fullScreenAdListener = this.f70014c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdFinished(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        FullScreenAdListener fullScreenAdListener = this.f70014c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdLoaded(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        FullScreenAdListener fullScreenAdListener = this.f70014c;
        if (fullScreenAdListener != null) {
            fullScreenAdListener.onAdShown(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f70012a.b(true)) {
            io.bidmachine.rendering.utils.UiUtils.onUiThread(new Runnable() { // from class: fk.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61739b.d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.f70012a.e();
        io.bidmachine.rendering.utils.UiUtils.onUiThread(new Runnable() { // from class: fk.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f61746b.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f70012a.b(false)) {
            io.bidmachine.rendering.utils.UiUtils.onUiThread(new Runnable() { // from class: fk.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61751b.f();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.f70012a.k()) {
            io.bidmachine.rendering.utils.UiUtils.onUiThread(new Runnable() { // from class: fk.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61750b.g();
                }
            });
        }
    }

    private void o() {
        if (this.f70012a.j()) {
            io.bidmachine.rendering.utils.UiUtils.onUiThread(new Runnable() { // from class: fk.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61736b.h();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (this.f70012a.a(true)) {
            io.bidmachine.rendering.utils.UiUtils.onUiThread(new Runnable() { // from class: fk.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61747b.i();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (this.f70012a.i()) {
            io.bidmachine.rendering.utils.UiUtils.onUiThread(new Runnable() { // from class: fk.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61752b.j();
                }
            });
        }
    }

    public void a(Activity activity) {
        this.f70015d = new WeakReference(activity);
    }

    public void b() {
        WeakReference weakReference = this.f70015d;
        if (weakReference != null) {
            weakReference.clear();
            this.f70015d = null;
        }
    }

    public void b(Activity activity) {
        a(activity);
        io.bidmachine.rendering.utils.UiUtils.setupActivityOrientation(activity, this.f70013b.getRequiredOrientation());
        io.bidmachine.iab.utils.Utils.applyFullscreenActivityFlags(activity);
        io.bidmachine.iab.utils.Utils.removeFromParent(this.f70013b);
        io.bidmachine.rendering.utils.UiUtils.applyInsets(activity, this.f70013b, false);
        activity.setContentView(this.f70013b, ViewUtils.createMatchParentParams());
    }

    public Activity c() {
        WeakReference weakReference = this.f70015d;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public void d(final Error error) {
        io.bidmachine.rendering.utils.UiUtils.onUiThread(new Runnable() { // from class: fk.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f61740b.b(error);
            }
        });
    }

    public void destroy() {
        this.f70012a.a();
        this.f70013b.destroy();
        a();
    }

    public boolean isFinished() {
        return this.f70012a.g();
    }

    public boolean isLoaded() {
        return this.f70012a.b();
    }

    public void load() {
        if (this.f70012a.c()) {
            this.f70013b.setAdViewListener(new b());
            this.f70013b.load();
        }
    }

    public void r() {
        a();
        m();
        o();
    }

    public void setFullScreenAdListener(@Nullable FullScreenAdListener fullScreenAdListener) {
        this.f70014c = fullScreenAdListener;
    }

    public void show(@NonNull Context context) {
        if (isLoaded()) {
            FullScreenActivity.show(context, this);
        } else {
            d(new Error("FullScreenAd not loaded"));
        }
    }
}
