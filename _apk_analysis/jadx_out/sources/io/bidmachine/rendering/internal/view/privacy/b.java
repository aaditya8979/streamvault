package io.bidmachine.rendering.internal.view.privacy;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.widget.FrameLayout;
import bn.g;
import bn.r;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.internal.view.privacy.b;
import io.bidmachine.util.UtilsKt;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes.dex */
public final class b extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f70662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private sn.a f70663b;

    public static final class a extends Lambda implements sn.a {
        public a() {
            super(0);
        }

        public final void a() {
            b.this.getOnCloseClickListener().invoke();
        }

        @Override // sn.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.view.privacy.b$b, reason: collision with other inner class name */
    public static final class C0841b extends Lambda implements sn.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0841b f70665a = new C0841b();

        public C0841b() {
            super(0);
        }

        public final void a() {
        }

        @Override // sn.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return r.f5635a;
        }
    }

    public static final class c extends Lambda implements sn.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f70666a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.f70666a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(View view) {
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.rendering.internal.view.privacy.c invoke() {
            io.bidmachine.rendering.internal.view.privacy.c cVar = new io.bidmachine.rendering.internal.view.privacy.c(this.f70666a);
            cVar.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.rendering.internal.view.privacy.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.c.a(view);
                }
            });
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.f70662a = kotlin.b.b(new c(context));
        this.f70663b = C0841b.f70665a;
        setOnClickListener(new View.OnClickListener() { // from class: nk.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                io.bidmachine.rendering.internal.view.privacy.b.a(this.f75892b, view);
            }
        });
        io.bidmachine.rendering.internal.view.privacy.c privacySheetView = getPrivacySheetView();
        privacySheetView.setOnCloseButtonClickListener(new a());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        r rVar = r.f5635a;
        addView(privacySheetView, layoutParams);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets a(b bVar, int i10, View view, WindowInsets windowInsets) {
        Rect rect;
        p.k(bVar, "this$0");
        p.k(view, "<anonymous parameter 0>");
        p.k(windowInsets, "insets");
        if (Build.VERSION.SDK_INT >= 30) {
            Insets insets = windowInsets.getInsets(WindowInsets$Type.systemBars());
            rect = new Rect(insets.left, insets.top, insets.right, insets.bottom);
        } else {
            rect = new Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        bVar.getPrivacySheetView().setPadding(bVar.getPrivacySheetView().getPaddingLeft(), bVar.getPrivacySheetView().getPaddingTop(), bVar.getPrivacySheetView().getPaddingRight(), i10 + rect.bottom);
        bVar.setPadding(0, rect.top, 0, 0);
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(b bVar, View view) {
        p.k(bVar, "this$0");
        bVar.f70663b.invoke();
    }

    private final void b() {
        final int paddingBottom = getPrivacySheetView().getPaddingBottom();
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: nk.a
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return io.bidmachine.rendering.internal.view.privacy.b.a(this.f75890a, paddingBottom, view, windowInsets);
            }
        });
    }

    private final io.bidmachine.rendering.internal.view.privacy.c getPrivacySheetView() {
        return (io.bidmachine.rendering.internal.view.privacy.c) this.f70662a.getValue();
    }

    public final void a() {
        getPrivacySheetView().a();
    }

    public final void a(String str, Drawable drawable, sn.a aVar) {
        p.k(str, "title");
        p.k(aVar, "clickListener");
        getPrivacySheetView().a(str, drawable, aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @NotNull
    public final sn.a<r> getOnCloseClickListener() {
        return this.f70663b;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        p.k(view, "child");
        int size = View.MeasureSpec.getSize(i10);
        Context context = getContext();
        p.j(context, GAMConfig.KEY_CONTEXT);
        int iDpToPx = UtilsKt.dpToPx(context, 600.0f);
        Context context2 = getContext();
        p.j(context2, GAMConfig.KEY_CONTEXT);
        if (size >= UtilsKt.dpToPx(context2, 32.0f) + iDpToPx) {
            i10 = View.MeasureSpec.makeMeasureSpec(iDpToPx, 1073741824);
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public final void setOnCloseClickListener(@NotNull sn.a<r> aVar) {
        p.k(aVar, "<set-?>");
        this.f70663b = aVar;
    }

    public final void setSubtitle(@NotNull String str) {
        p.k(str, "subtitle");
        getPrivacySheetView().setSubtitle(str);
    }

    public final void setTitle(@NotNull String str) {
        p.k(str, "title");
        getPrivacySheetView().setTitle(str);
    }
}
