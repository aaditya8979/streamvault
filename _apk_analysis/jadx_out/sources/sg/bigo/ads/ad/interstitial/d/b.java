package sg.bigo.ads.ad.interstitial.d;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.d.a;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.common.w.b;

/* JADX INFO: loaded from: classes11.dex */
public class b extends sg.bigo.ads.ad.interstitial.d.a implements sg.bigo.ads.ad.interstitial.f.c {

    @Nullable
    public ViewGroup A;

    @Nullable
    public Button B;

    @Nullable
    public RoundedFrameLayout C;

    @Nullable
    public MediaView D;

    @Nullable
    public TextView E;

    @Nullable
    public TextView F;

    @Nullable
    public Button G;

    @Nullable
    public Button H;

    @Nullable
    public RoundedImageView I;
    public int J;
    public int K;
    public boolean L;
    private int M;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RelativeLayout f80636x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public RealtimeBlurLinearLayout f80637y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ViewGroup f80638z;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.d.b$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80648a;

        static {
            int[] iArr = new int[sg.bigo.ads.ad.interstitial.b.values().length];
            f80648a = iArr;
            try {
                iArr[sg.bigo.ads.ad.interstitial.b.f80348a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80648a[sg.bigo.ads.ad.interstitial.b.f80350c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80648a[sg.bigo.ads.ad.interstitial.b.f80349b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f80648a[sg.bigo.ads.ad.interstitial.b.f80352e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f80648a[sg.bigo.ads.ad.interstitial.b.f80351d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @RequiresApi(api = 19)
    public class a extends b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RectF f80650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RectF f80651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RectF f80652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f80653e = Float.NaN;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private RectF f80654f;

        public a() {
        }

        @Override // sg.bigo.ads.common.utils.b.a
        @CallSuper
        public final void a(TransitionValues transitionValues, TransitionValues transitionValues2) {
            if (transitionValues.view == b.this.f80637y) {
                Rect rect = (Rect) transitionValues.values.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) transitionValues2.values.get("android:changeBounds:bounds");
                b bVar = b.this;
                Rect rect3 = new Rect(sg.bigo.ads.common.utils.u.a(bVar.B, bVar.J));
                this.f80650b = new RectF(rect3);
                if (rect3.intersect(rect2)) {
                    this.f80651c = new RectF(rect);
                    this.f80652d = new RectF(rect2);
                    this.f80653e = b.this.B.getTranslationY();
                    this.f80654f = new RectF(rect2);
                }
            }
        }

        @Override // sg.bigo.ads.common.utils.b.a
        public final void a(Object obj, Object obj2) {
            if (obj != b.this.f80637y || this.f80651c == null || this.f80652d == null || this.f80654f == null || this.f80650b == null || !(obj2 instanceof PointF) || Float.isNaN(this.f80653e)) {
                return;
            }
            PointF pointF = (PointF) obj2;
            if (this.f80651c.centerX() != this.f80652d.centerX()) {
                b.this.B.setTranslationY(this.f80653e - (Math.abs(this.f80654f.top - this.f80650b.bottom) * (Math.abs(pointF.x - this.f80651c.left) / Math.abs(this.f80652d.left - this.f80651c.left))));
            } else {
                this.f80654f.offsetTo(pointF.x, pointF.y);
                if (new RectF(this.f80650b).intersect(this.f80654f)) {
                    b.this.B.setTranslationY((this.f80653e + this.f80654f.top) - this.f80650b.bottom);
                }
            }
        }
    }

    public b(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
        this.K = -1;
        this.L = false;
    }

    private boolean M() {
        return ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) this).f81420c.f()).aR();
    }

    private void a(@ColorInt int i10, @ColorInt int i11, int i12) {
        if (this.f80637y != null) {
            float f10 = i12;
            this.f80637y.setBackground(sg.bigo.ads.common.utils.d.a(f10, f10, f10, f10, i10, i11, sg.bigo.ads.common.utils.e.a(r0.getContext(), 1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public sg.bigo.ads.common.p b(int i10, int i11, int i12, int i13) {
        sg.bigo.ads.common.p pVar;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.C.getLayoutParams();
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.r.a(((sg.bigo.ads.ad.interstitial.t) this).f81420c);
        if (pVarA.a(i10, i11)) {
            this.C.setCornerRadius(0.0f);
            marginLayoutParams.setMargins(0, 0, 0, 0);
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            pVar = new sg.bigo.ads.common.p(i10, i11);
        } else {
            this.C.setCornerRadius(sg.bigo.ads.common.utils.e.a(r2.getContext(), 8));
            marginLayoutParams.setMargins(i12, i13, i12, i13);
            sg.bigo.ads.common.p pVarA2 = sg.bigo.ads.common.p.a(pVarA.f82290b, pVarA.f82291c, i10 - (i12 * 2), i11 - (i13 * 2));
            int i14 = pVarA2.f82290b;
            marginLayoutParams.width = i14;
            int i15 = pVarA2.f82291c;
            marginLayoutParams.height = i15;
            pVar = new sg.bigo.ads.common.p(i14, i15);
        }
        sg.bigo.ads.common.utils.u.c(this.D, -1, -1);
        this.C.setLayoutParams(marginLayoutParams);
        return pVar;
    }

    private void b(@ColorInt int i10, @ColorInt int i11, int i12) {
        if (this.f80637y != null) {
            float f10 = i12;
            this.f80637y.setBlurStyle(new sg.bigo.ads.common.view.a.b(f10, f10, f10, f10, i10, i11, sg.bigo.ads.common.utils.e.a(r0.getContext(), 1)));
        }
    }

    public void A() {
        B();
    }

    public final void B() {
        if (v()) {
            Button button = this.G;
            if (button != null) {
                sg.bigo.ads.ad.interstitial.c.e(button);
            }
            Button button2 = this.H;
            if (button2 != null) {
                sg.bigo.ads.ad.interstitial.c.e(button2);
            }
        }
    }

    public final void C() {
        Button button;
        if (this.f80602q == null || (button = this.B) == null || button.getVisibility() != 0) {
            return;
        }
        float translationY = this.B.getTranslationY();
        RectF rectF = new RectF(sg.bigo.ads.common.utils.u.a(this.B, this.J));
        rectF.offset(0.0f, -translationY);
        float f10 = rectF.top;
        RectF rectF2 = new RectF(sg.bigo.ads.common.utils.u.a(this.f80607v, 0));
        float f11 = rectF2.top;
        if (rectF2.intersect(rectF)) {
            rectF.offset(0.0f, f11 - rectF.bottom);
        }
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.f80637y;
        if (realtimeBlurLinearLayout != null && realtimeBlurLinearLayout.getVisibility() == 0) {
            RectF rectF3 = new RectF(sg.bigo.ads.common.utils.u.a(this.f80637y, 0));
            float f12 = rectF3.top;
            if (rectF3.intersect(rectF)) {
                rectF.offset(0.0f, f12 - rectF.bottom);
            }
        }
        float f13 = rectF.top;
        if (f13 != f10) {
            this.B.setTranslationY(f13 - f10);
        } else {
            this.B.setTranslationY(0.0f);
        }
    }

    public final void D() {
        sg.bigo.ads.common.utils.u.a(this.C, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.b.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                b.this.C();
            }
        });
    }

    public void E() {
        if (this.f80637y == null) {
            return;
        }
        final int iY = y();
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.b.4
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f80637y.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.b.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        b.this.a(iY > 0);
                    }
                });
            }
        };
        if (iY == 0) {
            runnable.run();
        } else {
            a(iY, runnable);
        }
    }

    public void F() {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.f80637y;
        if (realtimeBlurLinearLayout == null || this.f80602q == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -(this.f80602q.getMeasuredHeight() - sg.bigo.ads.common.utils.u.a(this.f80602q, this.f80637y).y);
            this.f80637y.requestLayout();
        }
    }

    public void G() {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.f80637y;
        if (realtimeBlurLinearLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.M;
            this.f80637y.requestLayout();
        }
    }

    public void H() {
        sg.bigo.ads.ad.interstitial.w wVar = this.f80604s;
        int i10 = wVar != null ? wVar.f81495i : 0;
        View viewFindViewById = this.f80602q.findViewById(R.id.inter_media_container);
        sg.bigo.ads.ad.b.a.a(viewFindViewById, 9);
        sg.bigo.ads.ad.interstitial.w wVar2 = this.f80604s;
        if (wVar2 == null || !wVar2.f81493g) {
            MediaView mediaView = this.D;
            if (mediaView != null) {
                mediaView.setOtherClickAreaClick(false);
            }
            if (viewFindViewById != null) {
                sg.bigo.ads.ad.b.a.a(this.f80602q, viewFindViewById, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
            }
        } else {
            MediaView mediaView2 = this.D;
            if (mediaView2 != null) {
                mediaView2.setOtherClickAreaClick(true);
            }
            if (viewFindViewById != null) {
                sg.bigo.ads.ad.b.a.a(this.f80602q, viewFindViewById, 8, ((sg.bigo.ads.ad.interstitial.t) this).f81420c, i10);
            }
        }
        sg.bigo.ads.ad.interstitial.w wVar3 = this.f80604s;
        boolean z10 = wVar3 != null && wVar3.f81492f;
        MediaView mediaView3 = this.D;
        if (mediaView3 != null) {
            sg.bigo.ads.ad.b.a.a(this.f80602q, mediaView3, 8, ((sg.bigo.ads.ad.interstitial.t) this).f81420c, i10);
            this.D.setMediaAreaClickable(z10);
            this.D.b().a(!z10);
        }
        sg.bigo.ads.ad.interstitial.w wVar4 = this.f80604s;
        boolean z11 = wVar4 != null && wVar4.f81494h;
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.f80637y;
        if (realtimeBlurLinearLayout != null) {
            sg.bigo.ads.ad.b.a.a(realtimeBlurLinearLayout, 18);
            ViewGroup viewGroup = this.f80602q;
            if (z11) {
                sg.bigo.ads.ad.b.a.a(viewGroup, this.f80637y, 8, ((sg.bigo.ads.ad.interstitial.t) this).f81420c, this.f80604s.f81495i);
            } else {
                sg.bigo.ads.ad.b.a.a(viewGroup, this.f80637y, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final int I() {
        if (this.K == -1) {
            sg.bigo.ads.api.a.m mVar = this.f80605t;
            this.K = mVar != null ? mVar.a("video_play_page.webview_layout") : 0;
        }
        int i10 = this.K;
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return i10;
            default:
                return 0;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final int J() {
        return sg.bigo.ads.ad.interstitial.d.a.b(this.f80605t, "video_play_page.webview_force_time");
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final boolean K() {
        int I = I();
        return I == 5 || I == 6;
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final boolean L() {
        return this.L;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void a(double d10) {
        if (d10 <= 3.0d) {
            TextView textView = this.f80607v;
            if (textView != null) {
                textView.setTextColor(sg.bigo.ads.common.w.b.a(sg.bigo.ads.ad.interstitial.d.f80589b, 0.6f));
                return;
            }
            return;
        }
        TextView textView2 = this.f80607v;
        if (textView2 != null) {
            textView2.setTextColor(sg.bigo.ads.common.w.b.a(sg.bigo.ads.ad.interstitial.d.f80588a, 0.6f));
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.c
    public final void a(int i10, int i11, int i12, int i13) {
        if (K()) {
            if (i10 >= i12) {
                this.L = true;
                return;
            }
            this.L = false;
            if (this.f80636x != null) {
                int iMin = (i12 - Math.min(i10, i11)) + i13;
                ViewGroup.LayoutParams layoutParams = this.f80636x.getLayoutParams();
                if (iMin != layoutParams.height) {
                    layoutParams.height = iMin;
                    this.f80636x.requestLayout();
                    b(this.f80636x.getMeasuredWidth(), layoutParams.height, sg.bigo.ads.common.utils.e.a(this.C.getContext(), 12), sg.bigo.ads.common.utils.e.a(this.C.getContext(), 12));
                    C();
                }
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.t
    public final void a(@NonNull ViewGroup viewGroup, @NonNull View view, int i10, int i11, int i12, @Nullable View... viewArr) {
        super.a(viewGroup, view, i10, i11, i12, viewArr);
        H();
        sg.bigo.ads.ad.interstitial.t.a((View) this.f80602q);
    }

    public final void a(boolean z10) {
        if (this.f80637y == null || this.f80608w) {
            return;
        }
        final a.C0989a c0989aU = u();
        Button button = this.G;
        if (button != null) {
            sg.bigo.ads.ad.interstitial.d.b(button, c0989aU.f80630a);
        }
        if (z10) {
            F();
            this.f80637y.setVisibility(0);
            this.f80637y.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.b.5
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(b.this.new a());
                    transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.d.b.5.1
                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionEnd(Transition transition) {
                            b.this.A();
                            AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                            if (c0989aU.f80631b) {
                                b bVar = b.this;
                                bVar.a(bVar.G, new b.a());
                            }
                        }

                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionStart(Transition transition) {
                        }
                    });
                    transitionSet.setDuration(300L);
                    TransitionManager.beginDelayedTransition(b.this.f80603r, transitionSet);
                    b.this.G();
                }
            });
        } else {
            this.f80637y.setVisibility(0);
            C();
            A();
            if (c0989aU.f80631b) {
                a(this.G, new b.a());
            }
        }
    }

    public boolean a(@NonNull sg.bigo.ads.ad.interstitial.b bVar) {
        ViewGroup viewGroup;
        if (y() < 0 || (viewGroup = this.f80602q) == null) {
            return false;
        }
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(z());
        if (viewStub != null) {
            this.f80638z = (ViewGroup) viewStub.inflate();
        }
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = (RealtimeBlurLinearLayout) this.f80602q.findViewById(R.id.inter_component_layout);
        this.f80637y = realtimeBlurLinearLayout;
        if (realtimeBlurLinearLayout == null) {
            return false;
        }
        this.I = (RoundedImageView) realtimeBlurLinearLayout.findViewById(R.id.inter_icon);
        this.E = (TextView) this.f80637y.findViewById(R.id.inter_title);
        TextView textView = (TextView) this.f80637y.findViewById(R.id.inter_description);
        this.F = textView;
        bVar.a(this.E, textView);
        bVar.a(this.I);
        sg.bigo.ads.common.utils.u.a(this.f80637y, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.b.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                b.this.E();
            }
        });
        ViewGroup.LayoutParams layoutParams = this.f80637y.getLayoutParams();
        layoutParams.width = -1;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.M = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        this.f80637y.setVisibility(4);
        this.f80637y.requestLayout();
        return true;
    }

    public void b(@NonNull sg.bigo.ads.ad.interstitial.b bVar) {
        float fA = sg.bigo.ads.common.utils.e.a(this.f80637y.getContext(), 8);
        Button button = (Button) this.f80637y.findViewById(R.id.inter_btn_cta_main);
        this.H = button;
        if (button != null) {
            button.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, -16724924));
            bVar.a(this.H);
        }
        Button button2 = (Button) this.f80637y.findViewById(R.id.inter_btn_cta);
        this.G = button2;
        if (button2 != null) {
            button2.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, 0));
            bVar.a(this.G);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final ViewGroup k() {
        return this.C;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final MediaView l() {
        return this.D;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final Button m() {
        return this.B;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final boolean n() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void q() {
        String strI = ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) this).f81420c.f()).i();
        TextView textView = (TextView) this.f80602q.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(strI)) {
            textView.setVisibility(8);
        } else {
            textView.setText(strI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0115  */
    @Override // sg.bigo.ads.ad.interstitial.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t() {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.d.b.t():void");
    }

    public int z() {
        return R.id.inter_component_19;
    }
}
