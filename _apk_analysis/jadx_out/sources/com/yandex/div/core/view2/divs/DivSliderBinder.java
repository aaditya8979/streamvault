package com.yandex.div.core.view2.divs;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.core.view.OneShotPreDrawListener;
import bn.r;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivTypefaceResolverKt;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.widget.slider.SliderTextStyle;
import com.yandex.div.internal.widget.slider.SliderView;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSlider;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;
import vn.c;

/* JADX INFO: compiled from: DivSliderBinder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivSliderBinder extends DivViewBinder<Div.m, DivSlider, DivSliderView> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Nullable
    private ErrorCollector errorCollector;

    @NotNull
    private final ErrorCollectors errorCollectors;
    private final float horizontalInterceptionAngle;

    @NotNull
    private final Div2Logger logger;

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

    @NotNull
    private final TwoWayIntegerVariableBinder variableBinder;
    private final boolean visualErrorsEnabled;

    /* JADX INFO: compiled from: DivSliderBinder.kt */
    public static final class Companion {

        /* JADX INFO: compiled from: DivSliderBinder.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DivSizeUnit.values().length];
                try {
                    iArr[DivSizeUnit.DP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DivSizeUnit.SP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DivSizeUnit.PX.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final int applyUnit(@NotNull DivEdgeInsets divEdgeInsets, long j10, @NotNull ExpressionResolver expressionResolver, @NotNull DisplayMetrics displayMetrics) {
            return castToUnit(j10, divEdgeInsets.f55205g.evaluate(expressionResolver), displayMetrics);
        }

        public final int castToUnit(long j10, @NotNull DivSizeUnit divSizeUnit, @NotNull DisplayMetrics displayMetrics) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[divSizeUnit.ordinal()];
            if (i10 == 1) {
                return BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j10), displayMetrics);
            }
            if (i10 == 2) {
                return BaseDivViewExtensionsKt.spToPx(Long.valueOf(j10), displayMetrics);
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            long j11 = j10 >> 31;
            if (j11 == 0 || j11 == -1) {
                return (int) j10;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + j10 + "' to Int");
            }
            return j10 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        @NotNull
        public final SliderTextStyle toSliderTextStyle(@NotNull DivSlider.TextStyle textStyle, @NotNull DisplayMetrics displayMetrics, @NotNull DivTypefaceResolver divTypefaceResolver, @NotNull ExpressionResolver expressionResolver) {
            DivTypefaceResolver divTypefaceResolver2;
            String strEvaluate;
            DivDimension divDimension;
            DivDimension divDimension2;
            int i10;
            long jLongValue = textStyle.f57058b.evaluate(expressionResolver).longValue();
            Expression<String> expression = textStyle.f57057a;
            Integer numValueOf = null;
            if (expression != null) {
                strEvaluate = expression.evaluate(expressionResolver);
                divTypefaceResolver2 = divTypefaceResolver;
            } else {
                divTypefaceResolver2 = divTypefaceResolver;
                strEvaluate = null;
            }
            DivTypefaceProvider typefaceProvider = divTypefaceResolver2.getTypefaceProvider(strEvaluate);
            String fontVariations = typefaceProvider.isVariable() ? TextViewExtensionsKt.getFontVariations(textStyle.f57061e, textStyle.f57062f, textStyle.f57060d, expressionResolver) : null;
            float fFontSizeToPx = BaseDivViewExtensionsKt.fontSizeToPx(jLongValue, textStyle.f57059c.evaluate(expressionResolver), displayMetrics);
            float fDoubleValue = ((float) textStyle.f57063g.evaluate(expressionResolver).doubleValue()) / jLongValue;
            Expression<DivFontWeight> expression2 = textStyle.f57061e;
            DivFontWeight divFontWeightEvaluate = expression2 != null ? expression2.evaluate(expressionResolver) : null;
            Expression<Long> expression3 = textStyle.f57062f;
            if (expression3 != null) {
                long jLongValue2 = expression3.evaluate(expressionResolver).longValue();
                long j10 = jLongValue2 >> 31;
                if (j10 == 0 || j10 == -1) {
                    i10 = (int) jLongValue2;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
                    }
                    i10 = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                numValueOf = Integer.valueOf(i10);
            }
            Typeface typeface = DivTypefaceResolverKt.getTypeface(divFontWeightEvaluate, numValueOf, typefaceProvider);
            DivPoint divPoint = textStyle.f57064h;
            float px = (divPoint == null || (divDimension2 = divPoint.f56563a) == null) ? 0.0f : BaseDivViewExtensionsKt.toPx(divDimension2, displayMetrics, expressionResolver);
            DivPoint divPoint2 = textStyle.f57064h;
            return new SliderTextStyle(fFontSizeToPx, fDoubleValue, typeface, px, (divPoint2 == null || (divDimension = divPoint2.f56564b) == null) ? 0.0f : BaseDivViewExtensionsKt.toPx(divDimension, displayMetrics, expressionResolver), textStyle.f57065i.evaluate(expressionResolver).intValue(), fontVariations);
        }
    }

    public DivSliderBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull Div2Logger div2Logger, @NotNull DivTypefaceResolver divTypefaceResolver, @NotNull TwoWayIntegerVariableBinder twoWayIntegerVariableBinder, @NotNull ErrorCollectors errorCollectors, float f10, boolean z10) {
        super(divBaseBinder);
        this.logger = div2Logger;
        this.typefaceResolver = divTypefaceResolver;
        this.variableBinder = twoWayIntegerVariableBinder;
        this.errorCollectors = errorCollectors;
        this.horizontalInterceptionAngle = f10;
        this.visualErrorsEnabled = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbSecondaryStyle(SliderView sliderView, ExpressionResolver expressionResolver, DivDrawable divDrawable) {
        sliderView.setThumbSecondaryDrawable(DivUtilKt.toDrawable(divDrawable, sliderView.getResources().getDisplayMetrics(), expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbSecondaryTextStyle(SliderView sliderView, ExpressionResolver expressionResolver, DivSlider.TextStyle textStyle) {
        sliderView.setThumbSecondTextDrawable(textStyle != null ? new TextDrawable(Companion.toSliderTextStyle(textStyle, sliderView.getResources().getDisplayMetrics(), this.typefaceResolver, expressionResolver)) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbStyle(SliderView sliderView, ExpressionResolver expressionResolver, DivDrawable divDrawable) {
        sliderView.setThumbDrawable(DivUtilKt.toDrawable(divDrawable, sliderView.getResources().getDisplayMetrics(), expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbTextStyle(SliderView sliderView, ExpressionResolver expressionResolver, DivSlider.TextStyle textStyle) {
        sliderView.setThumbTextDrawable(textStyle != null ? new TextDrawable(Companion.toSliderTextStyle(textStyle, sliderView.getResources().getDisplayMetrics(), this.typefaceResolver, expressionResolver)) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTickMarkActiveStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, DivDrawable divDrawable) {
        divSliderView.setActiveTickMarkDrawable(divDrawable != null ? DivUtilKt.toDrawable(divDrawable, divSliderView.getResources().getDisplayMetrics(), expressionResolver) : null);
        checkSliderTicks(divSliderView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTickMarkInactiveStyle(DivSliderView divSliderView, ExpressionResolver expressionResolver, DivDrawable divDrawable) {
        divSliderView.setInactiveTickMarkDrawable(divDrawable != null ? DivUtilKt.toDrawable(divDrawable, divSliderView.getResources().getDisplayMetrics(), expressionResolver) : null);
        checkSliderTicks(divSliderView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTrackActiveStyle(SliderView sliderView, ExpressionResolver expressionResolver, DivDrawable divDrawable) {
        sliderView.setActiveTrackDrawable(DivUtilKt.toDrawable(divDrawable, sliderView.getResources().getDisplayMetrics(), expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTrackInactiveStyle(SliderView sliderView, ExpressionResolver expressionResolver, DivDrawable divDrawable) {
        sliderView.setInactiveTrackDrawable(DivUtilKt.toDrawable(divDrawable, sliderView.getResources().getDisplayMetrics(), expressionResolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkSliderTicks(final DivSliderView divSliderView) {
        if (!this.visualErrorsEnabled || this.errorCollector == null) {
            return;
        }
        OneShotPreDrawListener.add(divSliderView, new Runnable() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$checkSliderTicks$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                ErrorCollector errorCollector;
                if (divSliderView.getActiveTickMarkDrawable() == null && divSliderView.getInactiveTickMarkDrawable() == null) {
                    return;
                }
                float maxValue = divSliderView.getMaxValue() - divSliderView.getMinValue();
                Drawable activeTickMarkDrawable = divSliderView.getActiveTickMarkDrawable();
                boolean z10 = false;
                int intrinsicWidth = activeTickMarkDrawable != null ? activeTickMarkDrawable.getIntrinsicWidth() : 0;
                if (Math.max(intrinsicWidth, divSliderView.getInactiveTickMarkDrawable() != null ? r3.getIntrinsicWidth() : 0) * maxValue <= divSliderView.getWidth() || this.errorCollector == null) {
                    return;
                }
                ErrorCollector errorCollector2 = this.errorCollector;
                p.h(errorCollector2);
                Iterator<Throwable> warnings = errorCollector2.getWarnings();
                while (warnings.hasNext()) {
                    if (p.f(warnings.next().getMessage(), "Slider ticks overlap each other.")) {
                        z10 = true;
                    }
                }
                if (z10 || (errorCollector = this.errorCollector) == null) {
                    return;
                }
                errorCollector.logWarning(new Throwable("Slider ticks overlap each other."));
            }
        });
    }

    private final void observeThumbSecondaryStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final DivDrawable divDrawable) {
        if (divDrawable == null) {
            return;
        }
        applyThumbSecondaryStyle(divSliderView, expressionResolver, divDrawable);
        ExpressionSubscribersKt.observeDrawable(divSliderView, divDrawable, expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.observeThumbSecondaryStyle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                DivSliderBinder.this.applyThumbSecondaryStyle(divSliderView, expressionResolver, divDrawable);
            }
        });
    }

    private final void observeThumbSecondaryTextStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final DivSlider.TextStyle textStyle) {
        applyThumbSecondaryTextStyle(divSliderView, expressionResolver, textStyle);
        if (textStyle == null) {
            return;
        }
        divSliderView.addSubscription(textStyle.f57065i.observe(expressionResolver, new l<Integer, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.observeThumbSecondaryTextStyle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Integer num) {
                invoke(num.intValue());
                return r.f5635a;
            }

            public final void invoke(int i10) {
                DivSliderBinder.this.applyThumbSecondaryTextStyle(divSliderView, expressionResolver, textStyle);
            }
        }));
    }

    private final void observeThumbSecondaryValue(final DivSliderView divSliderView, String str, final BindingContext bindingContext, DivStatePath divStatePath) {
        divSliderView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryValue$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable Long l10) {
                divSliderView.setThumbSecondaryValue(l10 != null ? Float.valueOf(l10.longValue()) : null, false);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull final l<? super Long, r> lVar) {
                final DivSliderView divSliderView2 = divSliderView;
                final DivSliderBinder divSliderBinder = this;
                final BindingContext bindingContext2 = bindingContext;
                divSliderView2.addOnThumbChangedListener(new SliderView.ChangedListener() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryValue$callbacks$1$setViewStateChangeListener$1
                    @Override // com.yandex.div.internal.widget.slider.SliderView.ChangedListener
                    public void onThumbSecondaryValueChanged(@Nullable Float f10) {
                        divSliderBinder.logger.logSliderDrag(bindingContext2.getDivView(), divSliderView2, f10);
                        lVar.invoke(Long.valueOf(f10 != null ? c.f(f10.floatValue()) : 0L));
                    }
                });
            }
        }, divStatePath));
    }

    private final void observeThumbStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final DivDrawable divDrawable) {
        applyThumbStyle(divSliderView, expressionResolver, divDrawable);
        ExpressionSubscribersKt.observeDrawable(divSliderView, divDrawable, expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.observeThumbStyle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                DivSliderBinder.this.applyThumbStyle(divSliderView, expressionResolver, divDrawable);
            }
        });
    }

    private final void observeThumbTextStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final DivSlider.TextStyle textStyle) {
        applyThumbTextStyle(divSliderView, expressionResolver, textStyle);
        if (textStyle == null) {
            return;
        }
        divSliderView.addSubscription(textStyle.f57065i.observe(expressionResolver, new l<Integer, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.observeThumbTextStyle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Integer num) {
                invoke(num.intValue());
                return r.f5635a;
            }

            public final void invoke(int i10) {
                DivSliderBinder.this.applyThumbTextStyle(divSliderView, expressionResolver, textStyle);
            }
        }));
    }

    private final void observeThumbValue(final DivSliderView divSliderView, DivSlider divSlider, final BindingContext bindingContext, DivStatePath divStatePath) {
        String str = divSlider.E;
        if (str == null) {
            return;
        }
        divSliderView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbValue$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable Long l10) {
                divSliderView.setThumbValue(l10 != null ? l10.longValue() : 0.0f, false);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull final l<? super Long, r> lVar) {
                final DivSliderView divSliderView2 = divSliderView;
                final DivSliderBinder divSliderBinder = this;
                final BindingContext bindingContext2 = bindingContext;
                divSliderView2.addOnThumbChangedListener(new SliderView.ChangedListener() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbValue$callbacks$1$setViewStateChangeListener$1
                    @Override // com.yandex.div.internal.widget.slider.SliderView.ChangedListener
                    public void onThumbValueChanged(float f10) {
                        divSliderBinder.logger.logSliderDrag(bindingContext2.getDivView(), divSliderView2, Float.valueOf(f10));
                        lVar.invoke(Long.valueOf(c.f(f10)));
                    }
                });
            }
        }, divStatePath));
    }

    private final void observeTickMarkActiveStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final DivDrawable divDrawable) {
        applyTickMarkActiveStyle(divSliderView, expressionResolver, divDrawable);
        ExpressionSubscribersKt.observeDrawable(divSliderView, divDrawable, expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.observeTickMarkActiveStyle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                DivSliderBinder.this.applyTickMarkActiveStyle(divSliderView, expressionResolver, divDrawable);
            }
        });
    }

    private final void observeTickMarkInactiveStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final DivDrawable divDrawable) {
        applyTickMarkInactiveStyle(divSliderView, expressionResolver, divDrawable);
        ExpressionSubscribersKt.observeDrawable(divSliderView, divDrawable, expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.observeTickMarkInactiveStyle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                DivSliderBinder.this.applyTickMarkInactiveStyle(divSliderView, expressionResolver, divDrawable);
            }
        });
    }

    private final void observeTrackActiveStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final DivDrawable divDrawable) {
        applyTrackActiveStyle(divSliderView, expressionResolver, divDrawable);
        ExpressionSubscribersKt.observeDrawable(divSliderView, divDrawable, expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.observeTrackActiveStyle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                DivSliderBinder.this.applyTrackActiveStyle(divSliderView, expressionResolver, divDrawable);
            }
        });
    }

    private final void observeTrackInactiveStyle(final DivSliderView divSliderView, final ExpressionResolver expressionResolver, final DivDrawable divDrawable) {
        applyTrackInactiveStyle(divSliderView, expressionResolver, divDrawable);
        ExpressionSubscribersKt.observeDrawable(divSliderView, divDrawable, expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.observeTrackInactiveStyle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                DivSliderBinder.this.applyTrackInactiveStyle(divSliderView, expressionResolver, divDrawable);
            }
        });
    }

    private final void setupRanges(final DivSliderView divSliderView, DivSlider divSlider, final ExpressionResolver expressionResolver) {
        Iterator it;
        divSliderView.getRanges().clear();
        List<DivSlider.Range> list = divSlider.f57037u;
        if (list == null) {
            return;
        }
        final DisplayMetrics displayMetrics = divSliderView.getResources().getDisplayMetrics();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            DivSlider.Range range = (DivSlider.Range) it2.next();
            final SliderView.Range range2 = new SliderView.Range();
            divSliderView.getRanges().add(range2);
            Expression<Long> expression = range.f57047c;
            if (expression == null) {
                expression = divSlider.f57035s;
            }
            divSliderView.addSubscription(expression.observeAndGet(expressionResolver, new l<Long, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(Long l10) {
                    invoke(l10.longValue());
                    return r.f5635a;
                }

                public final void invoke(long j10) {
                    DivSliderBinder.Companion unused = DivSliderBinder.Companion;
                    DivSliderView divSliderView2 = divSliderView;
                    range2.setStartValue(j10);
                    divSliderView2.requestLayout();
                    divSliderView2.invalidate();
                }
            }));
            Expression<Long> expression2 = range.f57045a;
            if (expression2 == null) {
                expression2 = divSlider.f57034r;
            }
            divSliderView.addSubscription(expression2.observeAndGet(expressionResolver, new l<Long, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(Long l10) {
                    invoke(l10.longValue());
                    return r.f5635a;
                }

                public final void invoke(long j10) {
                    DivSliderBinder.Companion unused = DivSliderBinder.Companion;
                    DivSliderView divSliderView2 = divSliderView;
                    range2.setEndValue(j10);
                    divSliderView2.requestLayout();
                    divSliderView2.invalidate();
                }
            }));
            final DivEdgeInsets divEdgeInsets = range.f57046b;
            if (divEdgeInsets == null) {
                range2.setMarginStart(0);
                range2.setMarginEnd(0);
                it = it2;
            } else {
                Expression<Long> expression3 = divEdgeInsets.f55203e;
                boolean z10 = (expression3 == null && divEdgeInsets.f55200b == null) ? false : true;
                if (!z10) {
                    expression3 = divEdgeInsets.f55201c;
                }
                final Expression<Long> expression4 = expression3;
                final Expression<Long> expression5 = z10 ? divEdgeInsets.f55200b : divEdgeInsets.f55202d;
                if (expression4 != null) {
                    it = it2;
                    divSliderView.addSubscription(expression4.observe(expressionResolver, new l<Long, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // sn.l
                        public /* bridge */ /* synthetic */ r invoke(Long l10) {
                            invoke(l10.longValue());
                            return r.f5635a;
                        }

                        public final void invoke(long j10) {
                            DivSliderBinder.Companion unused = DivSliderBinder.Companion;
                            DivSliderView divSliderView2 = divSliderView;
                            range2.setMarginStart(DivSliderBinder.Companion.applyUnit(divEdgeInsets, j10, expressionResolver, displayMetrics));
                            divSliderView2.requestLayout();
                            divSliderView2.invalidate();
                        }
                    }));
                } else {
                    it = it2;
                }
                if (expression5 != null) {
                    divSliderView.addSubscription(expression5.observe(expressionResolver, new l<Long, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$3$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // sn.l
                        public /* bridge */ /* synthetic */ r invoke(Long l10) {
                            invoke(l10.longValue());
                            return r.f5635a;
                        }

                        public final void invoke(long j10) {
                            DivSliderBinder.Companion unused = DivSliderBinder.Companion;
                            DivSliderView divSliderView2 = divSliderView;
                            range2.setMarginEnd(DivSliderBinder.Companion.applyUnit(divEdgeInsets, j10, expressionResolver, displayMetrics));
                            divSliderView2.requestLayout();
                            divSliderView2.invalidate();
                        }
                    }));
                }
                divEdgeInsets.f55205g.observeAndGet(expressionResolver, new l<DivSizeUnit, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$3$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(DivSizeUnit divSizeUnit) {
                        invoke2(divSizeUnit);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DivSizeUnit divSizeUnit) {
                        DivSliderBinder.Companion unused = DivSliderBinder.Companion;
                        DivSliderView divSliderView2 = divSliderView;
                        Expression<Long> expression6 = expression4;
                        Expression<Long> expression7 = expression5;
                        SliderView.Range range3 = range2;
                        ExpressionResolver expressionResolver2 = expressionResolver;
                        DisplayMetrics displayMetrics2 = displayMetrics;
                        if (expression6 != null) {
                            range3.setMarginStart(DivSliderBinder.Companion.castToUnit(expression6.evaluate(expressionResolver2).longValue(), divSizeUnit, displayMetrics2));
                        }
                        if (expression7 != null) {
                            range3.setMarginEnd(DivSliderBinder.Companion.castToUnit(expression7.evaluate(expressionResolver2).longValue(), divSizeUnit, displayMetrics2));
                        }
                        divSliderView2.requestLayout();
                        divSliderView2.invalidate();
                    }
                });
            }
            DivDrawable divDrawable = range.f57048d;
            if (divDrawable == null) {
                divDrawable = divSlider.I;
            }
            final DivDrawable divDrawable2 = divDrawable;
            l<Object, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$applyActiveTrackStyle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(Object obj) {
                    invoke2(obj);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Object obj) {
                    DivSliderBinder.Companion unused = DivSliderBinder.Companion;
                    DivSliderView divSliderView2 = divSliderView;
                    range2.setActiveTrackDrawable(DivUtilKt.toDrawable(divDrawable2, displayMetrics, expressionResolver));
                    divSliderView2.requestLayout();
                    divSliderView2.invalidate();
                }
            };
            r rVar = r.f5635a;
            lVar.invoke(rVar);
            ExpressionSubscribersKt.observeDrawable(divSliderView, divDrawable2, expressionResolver, lVar);
            DivDrawable divDrawable3 = range.f57049e;
            if (divDrawable3 == null) {
                divDrawable3 = divSlider.J;
            }
            final DivDrawable divDrawable4 = divDrawable3;
            l<Object, r> lVar2 = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$setupRanges$1$applyInactiveTrackStyle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(Object obj) {
                    invoke2(obj);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Object obj) {
                    DivSliderBinder.Companion unused = DivSliderBinder.Companion;
                    DivSliderView divSliderView2 = divSliderView;
                    range2.setInactiveTrackDrawable(DivUtilKt.toDrawable(divDrawable4, displayMetrics, expressionResolver));
                    divSliderView2.requestLayout();
                    divSliderView2.invalidate();
                }
            };
            lVar2.invoke(rVar);
            ExpressionSubscribersKt.observeDrawable(divSliderView, divDrawable4, expressionResolver, lVar2);
            it2 = it;
        }
    }

    private final void setupSecondaryThumb(DivSliderView divSliderView, DivSlider divSlider, BindingContext bindingContext, DivStatePath divStatePath) {
        String str = divSlider.B;
        r rVar = null;
        if (str == null) {
            divSliderView.setThumbSecondaryDrawable(null);
            divSliderView.setThumbSecondaryValue(null, false);
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        observeThumbSecondaryValue(divSliderView, str, bindingContext, divStatePath);
        DivDrawable divDrawable = divSlider.f57042z;
        if (divDrawable != null) {
            observeThumbSecondaryStyle(divSliderView, expressionResolver, divDrawable);
            rVar = r.f5635a;
        }
        if (rVar == null) {
            observeThumbSecondaryStyle(divSliderView, expressionResolver, divSlider.C);
        }
        observeThumbSecondaryTextStyle(divSliderView, expressionResolver, divSlider.A);
    }

    private final void setupThumb(DivSliderView divSliderView, DivSlider divSlider, BindingContext bindingContext, DivStatePath divStatePath) {
        observeThumbValue(divSliderView, divSlider, bindingContext, divStatePath);
        observeThumbStyle(divSliderView, bindingContext.getExpressionResolver(), divSlider.C);
        observeThumbTextStyle(divSliderView, bindingContext.getExpressionResolver(), divSlider.D);
    }

    private final void setupTickMarks(DivSliderView divSliderView, DivSlider divSlider, ExpressionResolver expressionResolver) {
        observeTickMarkActiveStyle(divSliderView, expressionResolver, divSlider.F);
        observeTickMarkInactiveStyle(divSliderView, expressionResolver, divSlider.G);
    }

    private final void setupTrack(DivSliderView divSliderView, DivSlider divSlider, ExpressionResolver expressionResolver) {
        observeTrackActiveStyle(divSliderView, expressionResolver, divSlider.I);
        observeTrackInactiveStyle(divSliderView, expressionResolver, divSlider.J);
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull final DivSliderView divSliderView, @NotNull BindingContext bindingContext, @NotNull DivSlider divSlider, @Nullable DivSlider divSlider2, @NotNull DivStatePath divStatePath) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        this.errorCollector = this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData());
        divSliderView.setInterceptionAngle(this.horizontalInterceptionAngle);
        divSliderView.addSubscription(divSlider.f57035s.observeAndGet(expressionResolver, new l<Long, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.bind.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Long l10) {
                invoke(l10.longValue());
                return r.f5635a;
            }

            public final void invoke(long j10) {
                divSliderView.setMinValue(j10);
                this.checkSliderTicks(divSliderView);
            }
        }));
        divSliderView.addSubscription(divSlider.f57034r.observeAndGet(expressionResolver, new l<Long, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.bind.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Long l10) {
                invoke(l10.longValue());
                return r.f5635a;
            }

            public final void invoke(long j10) {
                divSliderView.setMaxValue(j10);
                this.checkSliderTicks(divSliderView);
            }
        }));
        divSliderView.addSubscription(divSlider.f57031o.observeAndGet(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder.bind.3
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return r.f5635a;
            }

            public final void invoke(boolean z10) {
                divSliderView.setInteractive(z10);
            }
        }));
        divSliderView.clearOnThumbChangedListener();
        setupThumb(divSliderView, divSlider, bindingContext, divStatePath);
        setupSecondaryThumb(divSliderView, divSlider, bindingContext, divStatePath);
        setupTrack(divSliderView, divSlider, expressionResolver);
        setupTickMarks(divSliderView, divSlider, expressionResolver);
        setupRanges(divSliderView, divSlider, expressionResolver);
    }
}
