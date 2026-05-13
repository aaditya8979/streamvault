package io.bidmachine.rendering.internal.view;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.rendering.internal.controller.g;
import io.bidmachine.rendering.internal.controller.h;
import io.bidmachine.rendering.internal.i;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.Tag;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.ViewUtils;

/* JADX INFO: loaded from: classes10.dex */
public class f extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tag f70656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.view.d f70657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.controller.e f70658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f70659d;

    public final class b implements io.bidmachine.rendering.internal.controller.f {
        private b() {
        }

        @Override // io.bidmachine.rendering.internal.controller.f
        public void a(io.bidmachine.rendering.internal.controller.e eVar) {
            o.b(f.this.f70656a, "onAdPhaseLoaded (%s)", eVar);
            if (eVar.a(f.this)) {
                eVar.a(new c());
                f.this.g();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.f
        public void a(io.bidmachine.rendering.internal.controller.e eVar, Error error) {
            o.a(f.this.f70656a, "onAdPhaseFailToLoad (%s) - %s", eVar, error);
            eVar.a();
        }
    }

    public final class c implements g {
        private c() {
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void a() {
            f.this.f70657b.c();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void a(BrokenCreativeEvent brokenCreativeEvent) {
            f.this.b(brokenCreativeEvent);
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void a(PrivacySheetParams privacySheetParams) {
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void b() {
            f.this.a();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void c() {
            f.this.f70657b.a();
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void d() {
        }

        @Override // io.bidmachine.rendering.internal.controller.g
        public void e() {
            f.this.a();
        }
    }

    public interface d {
        void a();

        void a(BrokenCreativeEvent brokenCreativeEvent);

        void onLoaded();
    }

    public f(Context context, AdPhaseParams adPhaseParams, io.bidmachine.rendering.internal.animation.b bVar) {
        super(context);
        this.f70656a = new Tag("PlaceholderView");
        AdPhaseParams adPhaseParamsA = adPhaseParams == null ? i.a() : adPhaseParams;
        Tag tag = new Tag("PlaceholderViewAdPhaseController");
        this.f70658c = new h(context, adPhaseParamsA, tag, new io.bidmachine.rendering.internal.state.c(tag.toString(), io.bidmachine.rendering.internal.h.f()), new b(), bVar);
        io.bidmachine.rendering.internal.view.d dVar = new io.bidmachine.rendering.internal.view.d(context);
        this.f70657b = dVar;
        addView(dVar, ViewUtils.createMatchParentParams());
        dVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(BrokenCreativeEvent brokenCreativeEvent) {
        d dVar = this.f70659d;
        if (dVar != null) {
            dVar.a(brokenCreativeEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final BrokenCreativeEvent brokenCreativeEvent) {
        o.b(this.f70656a, "notifyBrokenCreativeEvent", new Object[0]);
        UiUtils.onUiThread(new Runnable() { // from class: mk.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f74321b.a(brokenCreativeEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d dVar = this.f70659d;
        if (dVar != null) {
            dVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        d dVar = this.f70659d;
        if (dVar != null) {
            dVar.onLoaded();
        }
    }

    private void f() {
        o.b(this.f70656a, "notifyPlaceholderClosed", new Object[0]);
        UiUtils.onUiThread(new Runnable() { // from class: mk.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f74323b.c();
            }
        });
    }

    public void a() {
        f();
    }

    public void b() {
        this.f70659d = null;
        this.f70658c.a();
        UiUtils.onUiThread(new Runnable() { // from class: mk.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f74324b.removeAllViews();
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void e() {
        o.b(this.f70656a, "load", new Object[0]);
        this.f70658c.c();
    }

    public void g() {
        o.b(this.f70656a, "notifyPlaceholderLoaded", new Object[0]);
        UiUtils.onUiThread(new Runnable() { // from class: mk.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f74320b.d();
            }
        });
    }

    public void h() {
        this.f70658c.onShown();
    }

    public void i() {
        this.f70658c.a(true);
    }

    public void j() {
        this.f70658c.d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setListener(@Nullable d dVar) {
        this.f70659d = dVar;
    }
}
