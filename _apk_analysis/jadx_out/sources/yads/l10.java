package yads;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import com.ironsource.C3978d4;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.R$drawable;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class l10 extends FrameLayout {
    private ImageView A;
    private LinearLayout B;
    private CustomizableMediaView C;
    private LinearLayout D;
    private y00 E;
    private c42 F;
    private q32 G;
    private h02 H;
    private w02 I;
    private final k10 J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final og0 f91833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m10 f91834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io2 f91835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f91836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f91837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f91838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p10 f91839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextView f91840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f91841i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Button f91842j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f91843k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ImageView f91844l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ImageView f91845m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a33 f91846n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f91847o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f91848p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ImageView f91849q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private wl2 f91850r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TextView f91851s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageView f91852t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f91853u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private LinearLayout f91854v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private FrameLayout f91855w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private LinearLayout f91856x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private LinearLayout f91857y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private LinearLayout f91858z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l10(Context context, AttributeSet attributeSet, int i10, NativeTemplateAppearance nativeTemplateAppearance, cq3 cq3Var) {
        this(context, attributeSet, i10, nativeTemplateAppearance, new og0(), new m10(), cf.a(context, cq3Var));
        pu3 pu3Var = pu3.f93787a;
    }

    public l10(Context context, AttributeSet attributeSet, int i10, NativeTemplateAppearance nativeTemplateAppearance, og0 og0Var, m10 m10Var, io2 io2Var) {
        super(context, attributeSet, i10);
        this.f91833a = og0Var;
        this.f91834b = m10Var;
        this.f91835c = io2Var;
        Context context2 = getContext();
        og0Var.getClass();
        this.f91836d = og0.a(context2, 4.0f);
        this.f91837e = og0.a(getContext(), 8.0f);
        this.f91838f = og0.a(getContext(), 12.0f);
        this.f91839g = nativeTemplateAppearance;
        this.f91845m = d();
        this.J = new k10(this);
        c();
    }

    private static p31 a(h52 h52Var) {
        f52 f52VarA = ((SizeConstraint.SizeConstraintType) h52Var.getSizeConstraintType()).a();
        int i10 = f52VarA == null ? -1 : j10.f91070a[f52VarA.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? new n31(h52Var.getValue()) : new n31(h52Var.getValue()) : new m31(h52Var.getValue()) : new l31(h52Var.getValue());
    }

    private final void a() {
        float borderWidth = this.f91839g.getBannerAppearance().getBorderWidth();
        og0 og0Var = this.f91833a;
        Context context = getContext();
        og0Var.getClass();
        int iA = og0.a(context, borderWidth);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RectShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(this.f91839g.getBannerAppearance().getBackgroundColor());
        paint.setStyle(Paint.Style.FILL);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.setShape(new RectShape());
        Paint paint2 = shapeDrawable2.getPaint();
        paint2.setColor(this.f91839g.getBannerAppearance().getBorderColor());
        paint2.setStrokeWidth(iA * 2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        setBackground(new LayerDrawable(new Drawable[]{shapeDrawable, shapeDrawable2}));
        setPadding(iA, iA, iA, iA);
        c52 contentPadding = this.f91839g.getBannerAppearance().getContentPadding();
        a33 a33Var = null;
        if (contentPadding != null) {
            og0 og0Var2 = this.f91833a;
            Context context2 = getContext();
            float left = contentPadding.getLeft();
            og0Var2.getClass();
            int iA2 = og0.a(context2, left);
            og0 og0Var3 = this.f91833a;
            Context context3 = getContext();
            float right = contentPadding.getRight();
            og0Var3.getClass();
            int iA3 = og0.a(context3, right);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(iA2, this.f91837e, iA3, this.f91836d);
            LinearLayout linearLayout = this.f91856x;
            if (linearLayout == null) {
                tn.p.C("topContainer");
                linearLayout = null;
            }
            linearLayout.setLayoutParams(layoutParams);
            LinearLayout linearLayout2 = this.f91856x;
            if (linearLayout2 == null) {
                tn.p.C("topContainer");
                linearLayout2 = null;
            }
            linearLayout2.invalidate();
        }
        c52 contentPadding2 = this.f91839g.getBannerAppearance().getContentPadding();
        if (contentPadding2 != null) {
            og0 og0Var4 = this.f91833a;
            Context context4 = getContext();
            float left2 = contentPadding2.getLeft();
            og0Var4.getClass();
            int iA4 = og0.a(context4, left2);
            og0 og0Var5 = this.f91833a;
            Context context5 = getContext();
            float right2 = contentPadding2.getRight();
            og0Var5.getClass();
            int iA5 = og0.a(context5, right2);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.leftMargin = iA4;
            layoutParams2.rightMargin = iA5;
            layoutParams2.bottomMargin = this.f91836d;
            LinearLayout linearLayout3 = this.f91857y;
            if (linearLayout3 == null) {
                tn.p.C("centerContainer");
                linearLayout3 = null;
            }
            linearLayout3.setLayoutParams(layoutParams2);
            LinearLayout linearLayout4 = this.f91857y;
            if (linearLayout4 == null) {
                tn.p.C("centerContainer");
                linearLayout4 = null;
            }
            linearLayout4.invalidate();
        }
        c52 contentPadding3 = this.f91839g.getBannerAppearance().getContentPadding();
        if (contentPadding3 != null) {
            og0 og0Var6 = this.f91833a;
            Context context6 = getContext();
            float left3 = contentPadding3.getLeft();
            og0Var6.getClass();
            int iA6 = og0.a(context6, left3);
            og0 og0Var7 = this.f91833a;
            Context context7 = getContext();
            float right3 = contentPadding3.getRight();
            og0Var7.getClass();
            int iA7 = og0.a(context7, right3);
            TextView warningView = getWarningView();
            int i10 = this.f91836d;
            warningView.setPadding(iA6, i10, iA7, i10);
            getWarningView().invalidate();
        }
        i52 textAppearance = this.f91839g.getCallToActionAppearance().getTextAppearance();
        if (textAppearance != null) {
            getCallToActionView().setTextColor(textAppearance.getTextColor());
        }
        i52 textAppearance2 = this.f91839g.getCallToActionAppearance().getTextAppearance();
        if (textAppearance2 != null) {
            getCallToActionView().setTextSize(textAppearance2.getTextSize());
            Button callToActionView = getCallToActionView();
            i52 textAppearance3 = this.f91839g.getCallToActionAppearance().getTextAppearance();
            callToActionView.setTypeface(Typeface.create(textAppearance3 != null ? textAppearance3.getFontFamilyName() : null, textAppearance2.getFontStyle()));
        }
        og0 og0Var8 = this.f91833a;
        Context context8 = getContext();
        og0Var8.getClass();
        float fA = og0.a(context8, 5.0f);
        float[] fArr = new float[8];
        Arrays.fill(fArr, fA);
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, fArr);
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(roundRectShape);
        shapeDrawable3.getPaint().setColor(this.f91839g.getCallToActionAppearance().getPressedColor());
        ShapeDrawable shapeDrawable4 = new ShapeDrawable(roundRectShape);
        shapeDrawable4.getPaint().setColor(this.f91839g.getCallToActionAppearance().getNormalColor());
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, shapeDrawable3);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, shapeDrawable3);
        stateListDrawable.addState(new int[0], shapeDrawable4);
        og0 og0Var9 = this.f91833a;
        Context context9 = getContext();
        float borderWidth2 = this.f91839g.getCallToActionAppearance().getBorderWidth();
        og0Var9.getClass();
        int iA8 = og0.a(context9, borderWidth2);
        ShapeDrawable shapeDrawable5 = new ShapeDrawable();
        shapeDrawable5.setShape(roundRectShape);
        Paint paint3 = shapeDrawable5.getPaint();
        paint3.setColor(this.f91839g.getCallToActionAppearance().getBorderColor());
        paint3.setStrokeWidth(iA8);
        paint3.setStyle(style);
        getCallToActionView().setBackground(new LayerDrawable(new Drawable[]{stateListDrawable, shapeDrawable5}));
        wl2 wl2Var = this.f91850r;
        if (wl2Var == null) {
            tn.p.C("_ratingView");
            wl2Var = null;
        }
        Drawable progressDrawable = wl2Var.getProgressDrawable();
        tn.p.i(progressDrawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
        Drawable drawable = layerDrawable.getDrawable(2);
        int progressStarColor = this.f91839g.getRatingAppearance().getProgressStarColor();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        drawable.setColorFilter(progressStarColor, mode);
        layerDrawable.getDrawable(1).setColorFilter(this.f91839g.getRatingAppearance().getBackgroundStarColor(), mode);
        layerDrawable.getDrawable(0).setColorFilter(this.f91839g.getRatingAppearance().getBackgroundStarColor(), mode);
        getAgeView().setTypeface(Typeface.create(this.f91839g.getAgeAppearance().getFontFamilyName(), this.f91839g.getAgeAppearance().getFontStyle()));
        getAgeView().setTextColor(this.f91839g.getAgeAppearance().getTextColor());
        getAgeView().setTextSize(2, this.f91839g.getAgeAppearance().getTextSize());
        getBodyView().setTypeface(Typeface.create(this.f91839g.getBodyAppearance().getFontFamilyName(), this.f91839g.getBodyAppearance().getFontStyle()));
        getBodyView().setTextColor(this.f91839g.getBodyAppearance().getTextColor());
        getBodyView().setTextSize(2, this.f91839g.getBodyAppearance().getTextSize());
        getDomainView().setTypeface(Typeface.create(this.f91839g.getDomainAppearance().getFontFamilyName(), this.f91839g.getDomainAppearance().getFontStyle()));
        getDomainView().setTextColor(this.f91839g.getDomainAppearance().getTextColor());
        getDomainView().setTextSize(2, this.f91839g.getDomainAppearance().getTextSize());
        getReviewCountView().setTypeface(Typeface.create(this.f91839g.getReviewCountAppearance().getFontFamilyName(), this.f91839g.getReviewCountAppearance().getFontStyle()));
        getReviewCountView().setTextColor(this.f91839g.getReviewCountAppearance().getTextColor());
        getReviewCountView().setTextSize(2, this.f91839g.getReviewCountAppearance().getTextSize());
        a33 a33Var2 = this.f91846n;
        if (a33Var2 == null) {
            tn.p.C("_sponsoredView");
            a33Var2 = null;
        }
        a33Var2.setTypeface(Typeface.create(this.f91839g.getSponsoredAppearance().getFontFamilyName(), this.f91839g.getSponsoredAppearance().getFontStyle()));
        a33 a33Var3 = this.f91846n;
        if (a33Var3 == null) {
            tn.p.C("_sponsoredView");
            a33Var3 = null;
        }
        a33Var3.setTextColor(this.f91839g.getSponsoredAppearance().getTextColor());
        a33 a33Var4 = this.f91846n;
        if (a33Var4 == null) {
            tn.p.C("_sponsoredView");
        } else {
            a33Var = a33Var4;
        }
        a33Var.setTextSize(2, this.f91839g.getSponsoredAppearance().getTextSize());
        getTitleView().setTypeface(Typeface.create(this.f91839g.getTitleAppearance().getFontFamilyName(), this.f91839g.getTitleAppearance().getFontStyle()));
        getTitleView().setTextColor(this.f91839g.getTitleAppearance().getTextColor());
        getTitleView().setTextSize(2, this.f91839g.getTitleAppearance().getTextSize());
        getWarningView().setTypeface(Typeface.create(this.f91839g.getWarningAppearance().getFontFamilyName(), this.f91839g.getWarningAppearance().getFontStyle()));
        getWarningView().setTextColor(this.f91839g.getWarningAppearance().getTextColor());
        getWarningView().setTextSize(2, this.f91839g.getWarningAppearance().getTextSize());
        invalidate();
        requestLayout();
    }

    private final void b() {
        y00 y00Var = this.E;
        ju0 ju0Var = y00Var != null ? new ju0(getContext(), y00Var, new ku0(y00Var)) : null;
        if (ju0Var != null) {
            ImageView feedbackView = getFeedbackView();
            FrameLayout frameLayout = this.f91855w;
            if (frameLayout == null) {
                tn.p.C("feedbackContainer");
                frameLayout = null;
            }
            int i10 = this.f91838f;
            ku0 ku0Var = ju0Var.f91372c;
            if (ku0Var.f91751a.size() != 2 || !ku0Var.f91751a.contains("feedback") || !ku0Var.f91751a.contains(C3978d4.i.I0)) {
                int i11 = ju0.f91369f;
                Drawable drawable = ContextCompat.getDrawable(ju0Var.f91370a, R$drawable.monetization_ads_internal_ic_close_gray);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
                if (drawable != null) {
                    drawable.setColorFilter(porterDuffColorFilter);
                }
                feedbackView.setImageDrawable(drawable);
                ju0.a(frameLayout, null, 0);
                frameLayout.setVisibility(0);
                return;
            }
            y00 y00Var2 = ju0Var.f91371b;
            if (y00Var2.f96947a != null) {
                int i12 = ju0.f91369f;
                Drawable drawable2 = ContextCompat.getDrawable(ju0Var.f91370a, R$drawable.monetization_ads_internal_ic_close_gray);
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_ATOP);
                if (drawable2 != null) {
                    drawable2.setColorFilter(porterDuffColorFilter2);
                }
                feedbackView.setImageDrawable(drawable2);
                ju0.a(frameLayout, null, 0);
                frameLayout.setVisibility(8);
                return;
            }
            if (y00Var2.f96950d != null) {
                Drawable drawable3 = ContextCompat.getDrawable(ju0Var.f91370a, R$drawable.monetization_ads_internal_ic_close_gray);
                PorterDuffColorFilter porterDuffColorFilter3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
                if (drawable3 != null) {
                    drawable3.setColorFilter(porterDuffColorFilter3);
                }
                feedbackView.setImageDrawable(drawable3);
                ju0.a(frameLayout, new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ju0.f91367d, ju0.f91368e}), i10);
                frameLayout.setVisibility(0);
            }
        }
    }

    private final void c() {
        this.f91853u = d();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f91856x = linearLayout2;
        linearLayout2.setOrientation(0);
        LinearLayout linearLayout3 = this.f91856x;
        if (linearLayout3 == null) {
            tn.p.C("topContainer");
            linearLayout3 = null;
        }
        linearLayout3.setGravity(17);
        LinearLayout linearLayout4 = this.f91856x;
        if (linearLayout4 == null) {
            tn.p.C("topContainer");
            linearLayout4 = null;
        }
        linearLayout4.setWeightSum(4.0f);
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        LinearLayout linearLayout5 = new LinearLayout(getContext());
        linearLayout5.setGravity(17);
        linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 2.0f));
        a33 a33Var = new a33(getContext());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        a33Var.setEllipsize(truncateAt);
        a33Var.setMaxLines(1);
        a33Var.setGravity(17);
        og0 og0Var = this.f91833a;
        Context context = getContext();
        og0Var.getClass();
        a33Var.setPadding(0, 0, 0, og0.a(context, 4.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        a33Var.setLayoutParams(layoutParams);
        this.f91846n = a33Var;
        linearLayout5.addView(a33Var);
        LinearLayout linearLayout6 = new LinearLayout(getContext());
        linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(getContext());
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(GravityCompat.START);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.rightMargin = this.f91836d;
        textView.setLayoutParams(layoutParams2);
        this.f91840h = textView;
        linearLayout6.addView(getAgeView());
        LinearLayout linearLayout7 = this.f91856x;
        if (linearLayout7 == null) {
            tn.p.C("topContainer");
            linearLayout7 = null;
        }
        linearLayout7.addView(linearLayout6);
        ViewGroup viewGroup = this.f91856x;
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup == null) {
            tn.p.C("topContainer");
            viewGroup2 = null;
        }
        viewGroup2.addView(linearLayout5);
        LinearLayout linearLayout8 = this.f91856x;
        if (linearLayout8 == null) {
            tn.p.C("topContainer");
            linearLayout8 = null;
        }
        linearLayout8.addView(view);
        LinearLayout linearLayout9 = this.f91856x;
        if (linearLayout9 == null) {
            tn.p.C("topContainer");
            linearLayout9 = null;
        }
        LinearLayout linearLayout10 = new LinearLayout(getContext());
        this.f91857y = linearLayout10;
        linearLayout10.setOrientation(0);
        LinearLayout linearLayout11 = this.f91857y;
        if (linearLayout11 == null) {
            tn.p.C("centerContainer");
            linearLayout11 = null;
        }
        linearLayout11.setBaselineAligned(false);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = this.f91836d;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(layoutParams3);
        this.f91849q = d();
        ImageView imageView = new ImageView(getContext());
        imageView.setAdjustViewBounds(true);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        imageView.setScaleType(scaleType);
        this.f91852t = imageView;
        frameLayout.addView(getIconView());
        frameLayout.addView(this.f91845m);
        frameLayout.addView(getFaviconView());
        LinearLayout linearLayout12 = new LinearLayout(getContext());
        linearLayout12.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout12.setOrientation(1);
        TextView textView2 = new TextView(getContext());
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(2);
        textView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f91847o = textView2;
        TextView textView3 = new TextView(getContext());
        textView3.setEllipsize(truncateAt);
        textView3.setMaxLines(3);
        textView3.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f91841i = textView3;
        TextView textView4 = new TextView(getContext());
        textView4.setEllipsize(truncateAt);
        textView4.setMaxLines(1);
        textView4.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f91843k = textView4;
        linearLayout12.addView(getTitleView());
        linearLayout12.addView(getBodyView());
        linearLayout12.addView(getDomainView());
        LinearLayout linearLayout13 = new LinearLayout(getContext());
        this.f91858z = linearLayout13;
        linearLayout13.setOrientation(0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = this.f91837e;
        LinearLayout linearLayout14 = this.f91858z;
        if (linearLayout14 == null) {
            tn.p.C("callToActionContainer");
            linearLayout14 = null;
        }
        linearLayout14.setLayoutParams(layoutParams4);
        LinearLayout linearLayout15 = new LinearLayout(getContext());
        linearLayout15.setOrientation(1);
        linearLayout15.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        wl2 wl2Var = new wl2(getContext(), null, R.attr.ratingBarStyleSmall);
        wl2Var.setNumStars(5);
        wl2Var.setStepSize(0.5f);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.rightMargin = this.f91837e;
        wl2Var.setLayoutParams(layoutParams5);
        this.f91850r = wl2Var;
        TextView textView5 = new TextView(getContext());
        textView5.setEllipsize(truncateAt);
        textView5.setMaxLines(1);
        textView5.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f91851s = textView5;
        wl2 wl2Var2 = this.f91850r;
        if (wl2Var2 == null) {
            tn.p.C("_ratingView");
            wl2Var2 = null;
        }
        linearLayout15.addView(wl2Var2);
        linearLayout15.addView(getReviewCountView());
        LinearLayout linearLayout16 = new LinearLayout(getContext());
        linearLayout16.setOrientation(0);
        linearLayout16.setGravity(5);
        linearLayout16.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Button button = new Button(getContext(), null, R.attr.borderlessButtonStyle);
        button.setEllipsize(truncateAt);
        button.setMaxLines(1);
        button.setTransformationMethod(null);
        og0 og0Var2 = this.f91833a;
        Context context2 = getContext();
        og0Var2.getClass();
        int iA = og0.a(context2, 26.0f);
        button.setMinimumHeight(iA);
        button.setMinHeight(iA);
        button.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f91842j = button;
        linearLayout16.addView(getCallToActionView());
        LinearLayout linearLayout17 = this.f91858z;
        if (linearLayout17 == null) {
            tn.p.C("callToActionContainer");
            linearLayout17 = null;
        }
        linearLayout17.addView(linearLayout15);
        LinearLayout linearLayout18 = this.f91858z;
        if (linearLayout18 == null) {
            tn.p.C("callToActionContainer");
            linearLayout18 = null;
        }
        linearLayout18.addView(linearLayout16);
        LinearLayout linearLayout19 = this.f91858z;
        if (linearLayout19 == null) {
            tn.p.C("callToActionContainer");
            linearLayout19 = null;
        }
        linearLayout12.addView(linearLayout19);
        LinearLayout linearLayout20 = this.f91857y;
        if (linearLayout20 == null) {
            tn.p.C("centerContainer");
            linearLayout20 = null;
        }
        linearLayout20.addView(frameLayout);
        LinearLayout linearLayout21 = this.f91857y;
        if (linearLayout21 == null) {
            tn.p.C("centerContainer");
            linearLayout21 = null;
        }
        linearLayout21.addView(linearLayout12);
        LinearLayout linearLayout22 = this.f91857y;
        if (linearLayout22 == null) {
            tn.p.C("centerContainer");
            linearLayout22 = null;
        }
        LinearLayout linearLayout23 = new LinearLayout(getContext());
        linearLayout23.setOrientation(0);
        linearLayout23.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.B = linearLayout23;
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setAdjustViewBounds(true);
        imageView2.setScaleType(scaleType);
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.A = imageView2;
        LinearLayout linearLayout24 = this.B;
        if (linearLayout24 == null) {
            tn.p.C("largeImageContainer");
            linearLayout24 = null;
        }
        ImageView imageView3 = this.A;
        if (imageView3 == null) {
            tn.p.C("largeImageView");
            imageView3 = null;
        }
        linearLayout24.addView(imageView3);
        LinearLayout linearLayout25 = this.B;
        if (linearLayout25 == null) {
            tn.p.C("largeImageContainer");
            linearLayout25 = null;
        }
        LinearLayout linearLayout26 = new LinearLayout(getContext());
        linearLayout26.setOrientation(0);
        linearLayout26.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.D = linearLayout26;
        CustomizableMediaView customizableMediaView = new CustomizableMediaView(getContext());
        customizableMediaView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.C = customizableMediaView;
        LinearLayout linearLayout27 = this.D;
        if (linearLayout27 == null) {
            tn.p.C("mediaContainer");
            linearLayout27 = null;
        }
        linearLayout27.addView(getMediaView());
        LinearLayout linearLayout28 = this.D;
        if (linearLayout28 == null) {
            tn.p.C("mediaContainer");
            linearLayout28 = null;
        }
        TextView textView6 = new TextView(getContext());
        textView6.setEllipsize(truncateAt);
        this.f91848p = textView6;
        TextView warningView = getWarningView();
        linearLayout.addView(linearLayout9);
        linearLayout.addView(linearLayout22);
        linearLayout.addView(linearLayout25);
        linearLayout.addView(linearLayout28);
        linearLayout.addView(warningView);
        this.f91854v = linearLayout;
        c52 contentPadding = this.f91839g.getBannerAppearance().getContentPadding();
        if (contentPadding != null) {
            og0 og0Var3 = this.f91833a;
            Context context3 = getContext();
            float right = contentPadding.getRight();
            og0Var3.getClass();
            int iA2 = og0.a(context3, right) - this.f91837e;
            Context context4 = getContext();
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.f91855w = frameLayout2;
            int i10 = this.f91836d;
            ImageView imageView4 = new ImageView(context4);
            int iA3 = kl3.a(context4, 28.0f);
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(iA3, iA3);
            layoutParams6.gravity = GravityCompat.END;
            layoutParams6.rightMargin = iA2;
            layoutParams6.topMargin = i10;
            imageView4.setLayoutParams(layoutParams6);
            this.f91844l = imageView4;
            FrameLayout frameLayout3 = this.f91855w;
            if (frameLayout3 == null) {
                tn.p.C("feedbackContainer");
                frameLayout3 = null;
            }
            frameLayout3.addView(getFeedbackView());
            FrameLayout frameLayout4 = this.f91855w;
            if (frameLayout4 == null) {
                tn.p.C("feedbackContainer");
                frameLayout4 = null;
            }
            frameLayout4.setVisibility(8);
        }
        ImageView imageView5 = this.f91853u;
        if (imageView5 == null) {
            tn.p.C("adFoxView");
            imageView5 = null;
        }
        addView(imageView5, new ViewGroup.LayoutParams(-1, -2));
        LinearLayout linearLayout29 = this.f91854v;
        if (linearLayout29 == null) {
            tn.p.C("mainContainer");
            linearLayout29 = null;
        }
        addView(linearLayout29, new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout5 = this.f91855w;
        if (frameLayout5 == null) {
            tn.p.C("feedbackContainer");
            frameLayout5 = null;
        }
        addView(frameLayout5);
        hideContent();
        ImageView[] imageViewArr = new ImageView[5];
        imageViewArr[0] = getFaviconView();
        imageViewArr[1] = getIconView();
        imageViewArr[2] = this.f91845m;
        ImageView imageView6 = this.A;
        if (imageView6 == null) {
            tn.p.C("largeImageView");
            imageView6 = null;
        }
        imageViewArr[3] = imageView6;
        ImageView imageView7 = this.f91853u;
        if (imageView7 == null) {
            tn.p.C("adFoxView");
            imageView7 = null;
        }
        imageViewArr[4] = imageView7;
        this.H = new h02(imageViewArr);
        a();
    }

    private final ImageView d() {
        ImageView imageView = new ImageView(getContext());
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    @NotNull
    public final TextView getAgeView() {
        TextView textView = this.f91840h;
        if (textView != null) {
            return textView;
        }
        tn.p.C("ageView");
        return null;
    }

    @NotNull
    public final TextView getBodyView() {
        TextView textView = this.f91841i;
        if (textView != null) {
            return textView;
        }
        tn.p.C("bodyView");
        return null;
    }

    @NotNull
    public final Button getCallToActionView() {
        Button button = this.f91842j;
        if (button != null) {
            return button;
        }
        tn.p.C("callToActionView");
        return null;
    }

    @NotNull
    public final TextView getDomainView() {
        TextView textView = this.f91843k;
        if (textView != null) {
            return textView;
        }
        tn.p.C("domainView");
        return null;
    }

    @NotNull
    public final ImageView getFaviconView() {
        ImageView imageView = this.f91852t;
        if (imageView != null) {
            return imageView;
        }
        tn.p.C("faviconView");
        return null;
    }

    @NotNull
    public final ImageView getFeedbackView() {
        ImageView imageView = this.f91844l;
        if (imageView != null) {
            return imageView;
        }
        tn.p.C("feedbackView");
        return null;
    }

    @NotNull
    public final ImageView getIconView() {
        ImageView imageView = this.f91849q;
        if (imageView != null) {
            return imageView;
        }
        tn.p.C("iconView");
        return null;
    }

    @NotNull
    public final ImageView getImageView() {
        y00 y00Var;
        a10 a10Var;
        ImageView imageView = this.f91845m;
        if (this.G == null || (y00Var = this.E) == null || (a10Var = y00Var.f96950d) == null) {
            return imageView;
        }
        if (tn.p.f(VastAttributes.FILL_COLOR, a10Var.f87540b)) {
            ImageView imageView2 = this.f91853u;
            if (imageView2 != null) {
                return imageView2;
            }
            tn.p.C("adFoxView");
        } else {
            if (!q32.a(a10Var)) {
                return imageView;
            }
            ImageView imageView3 = this.A;
            if (imageView3 != null) {
                return imageView3;
            }
            tn.p.C("largeImageView");
        }
        return null;
    }

    @NotNull
    public final CustomizableMediaView getMediaView() {
        CustomizableMediaView customizableMediaView = this.C;
        if (customizableMediaView != null) {
            return customizableMediaView;
        }
        tn.p.C("mediaView");
        return null;
    }

    @NotNull
    public final View getRatingView() {
        wl2 wl2Var = this.f91850r;
        if (wl2Var != null) {
            return wl2Var;
        }
        tn.p.C("_ratingView");
        return null;
    }

    @NotNull
    public final TextView getReviewCountView() {
        TextView textView = this.f91851s;
        if (textView != null) {
            return textView;
        }
        tn.p.C("reviewCountView");
        return null;
    }

    @NotNull
    public final TextView getSponsoredView() {
        a33 a33Var = this.f91846n;
        if (a33Var != null) {
            return a33Var;
        }
        tn.p.C("_sponsoredView");
        return null;
    }

    @NotNull
    public final TextView getTitleView() {
        TextView textView = this.f91847o;
        if (textView != null) {
            return textView;
        }
        tn.p.C("titleView");
        return null;
    }

    @NotNull
    public final TextView getWarningView() {
        TextView textView = this.f91848p;
        if (textView != null) {
            return textView;
        }
        tn.p.C("warningView");
        return null;
    }

    @VisibleForTesting
    public final void hideContent() {
        ImageView imageView = this.f91853u;
        LinearLayout linearLayout = null;
        if (imageView == null) {
            tn.p.C("adFoxView");
            imageView = null;
        }
        imageView.setVisibility(8);
        LinearLayout linearLayout2 = this.f91854v;
        if (linearLayout2 == null) {
            tn.p.C("mainContainer");
        } else {
            linearLayout = linearLayout2;
        }
        linearLayout.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w02 w02Var = this.I;
        if (w02Var != null) {
            w02Var.b(this.J);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        w02 w02Var = this.I;
        if (w02Var != null) {
            w02Var.a(this.J);
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x028f  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.l10.onMeasure(int, int):void");
    }

    public final void setAd(@NotNull w02 w02Var) {
        w02 w02Var2 = this.I;
        if (w02Var2 != w02Var) {
            if (w02Var2 != null) {
                try {
                    w02Var2.a(this.J);
                } catch (j02 e10) {
                    boolean z10 = ad1.f87661a;
                    this.f91835c.reportError("Failed to set Native Ad", e10);
                    return;
                }
            }
            w02Var.b(this.J);
            cq2 adType = w02Var.getAdType();
            y00 adAssets = w02Var.getAdAssets();
            this.F = new c42(adAssets, adType);
            this.G = new q32(adAssets, adType);
            this.E = adAssets;
            b();
            this.f91834b.getClass();
            w02Var.a(m10.a(this));
            showContent();
            this.I = w02Var;
        }
    }

    @VisibleForTesting
    public final void showContent() {
        a10 a10Var;
        y00 y00Var = this.E;
        int i10 = 0;
        LinearLayout linearLayout = null;
        if (y00Var != null && (a10Var = y00Var.f96950d) != null) {
            if (this.G != null && tn.p.f(VastAttributes.FILL_COLOR, a10Var.f87540b)) {
                ImageView imageView = this.f91853u;
                if (imageView == null) {
                    tn.p.C("adFoxView");
                    imageView = null;
                }
                imageView.setVisibility(0);
                i10 = 8;
            }
            if (this.G != null && q32.a(a10Var)) {
                c42 c42Var = this.F;
                if (c42Var != null && !c42Var.a()) {
                    LinearLayout linearLayout2 = this.f91857y;
                    if (linearLayout2 == null) {
                        tn.p.C("centerContainer");
                        linearLayout2 = null;
                    }
                    linearLayout2.setVisibility(8);
                }
                c42 c42Var2 = this.F;
                if (c42Var2 != null) {
                    y00 y00Var2 = c42Var2.f88337a;
                    if (y00Var2.f96952f == null && y00Var2.f96959m == null && !c42Var2.a()) {
                        LinearLayout linearLayout3 = this.f91856x;
                        if (linearLayout3 == null) {
                            tn.p.C("topContainer");
                            linearLayout3 = null;
                        }
                        linearLayout3.setVisibility(8);
                    }
                }
            }
        }
        LinearLayout linearLayout4 = this.f91854v;
        if (linearLayout4 == null) {
            tn.p.C("mainContainer");
        } else {
            linearLayout = linearLayout4;
        }
        linearLayout.setVisibility(i10);
    }
}
