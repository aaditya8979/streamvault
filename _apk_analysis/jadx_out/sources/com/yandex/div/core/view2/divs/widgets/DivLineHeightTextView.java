package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.R$attr;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.util.text.DivTextRangesBackgroundHelper;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.spannable.ParticlesTicker;
import com.yandex.div.core.widget.AdaptiveMaxLines;
import com.yandex.div.internal.widget.TextViewWithAccessibleSpans;
import com.yandex.div2.Div;
import com.yandex.div2.DivBorder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DivLineHeightTextView.kt */
/* JADX INFO: loaded from: classes2.dex */
public class DivLineHeightTextView extends TextViewWithAccessibleSpans implements DivHolderView<Div.q> {
    private final /* synthetic */ DivHolderViewMixin<Div.q> $$delegate_0;

    @Nullable
    private AdaptiveMaxLines adaptiveMaxLines;
    private long animationStartDelay;

    @Nullable
    private ParticlesTicker particlesTicker;

    @Nullable
    private DivTextRangesBackgroundHelper textRoundedBgHelper;

    public DivLineHeightTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DivLineHeightTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.$$delegate_0 = new DivHolderViewMixin<>();
    }

    public /* synthetic */ DivLineHeightTextView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R$attr.divTextStyle : i10);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(@Nullable Disposable disposable) {
        this.$$delegate_0.addSubscription(disposable);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            divBorderDrawer.clipCorners(canvas);
            super.draw(canvas);
            divBorderDrawer.drawBorder(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Nullable
    public AdaptiveMaxLines getAdaptiveMaxLines$div_release() {
        return this.adaptiveMaxLines;
    }

    public long getAnimationStartDelay$div_release() {
        return this.animationStartDelay;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public Div.q getDiv() {
        return (Div.q) this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @NotNull
    public ParticlesTicker getParticlesTicker$div_release() {
        ParticlesTicker particlesTicker = this.particlesTicker;
        if (particlesTicker != null) {
            return particlesTicker;
        }
        ParticlesTicker particlesTicker2 = new ParticlesTicker(this);
        this.particlesTicker = particlesTicker2;
        return particlesTicker2;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Nullable
    public DivTextRangesBackgroundHelper getTextRoundedBgHelper$div_release() {
        return this.textRoundedBgHelper;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void onBoundsChanged(int i10, int i11) {
        this.$$delegate_0.onBoundsChanged(i10, i11);
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, android.view.View
    public void onDetachedFromWindow() {
        ParticlesTicker particlesTicker = this.particlesTicker;
        if (particlesTicker != null) {
            particlesTicker.stop();
        }
        this.particlesTicker = null;
        super.onDetachedFromWindow();
    }

    @Override // com.yandex.div.internal.widget.TextViewWithAccessibleSpans, android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        if ((getText() instanceof Spanned) && getLayout() != null) {
            DivTextRangesBackgroundHelper textRoundedBgHelper$div_release = getTextRoundedBgHelper$div_release();
            if (textRoundedBgHelper$div_release != null && textRoundedBgHelper$div_release.hasBackgroundSpan$div_release()) {
                float totalPaddingLeft = getTotalPaddingLeft();
                float totalPaddingTop = getTotalPaddingTop();
                int iSave = canvas.save();
                canvas.translate(totalPaddingLeft, totalPaddingTop);
                try {
                    DivTextRangesBackgroundHelper textRoundedBgHelper$div_release2 = getTextRoundedBgHelper$div_release();
                    if (textRoundedBgHelper$div_release2 != null) {
                        CharSequence text = getText();
                        p.i(text, "null cannot be cast to non-null type android.text.Spanned");
                        textRoundedBgHelper$div_release2.draw(canvas, (Spanned) text, getLayout());
                    }
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        }
        super.onDraw(canvas);
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        onBoundsChanged(i10, i11);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            ParticlesTicker particlesTicker = this.particlesTicker;
            if (particlesTicker != null) {
                particlesTicker.resumeIfNeeded();
                return;
            }
            return;
        }
        ParticlesTicker particlesTicker2 = this.particlesTicker;
        if (particlesTicker2 != null) {
            particlesTicker2.stop();
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public void setAdaptiveMaxLines$div_release(@Nullable AdaptiveMaxLines adaptiveMaxLines) {
        this.adaptiveMaxLines = adaptiveMaxLines;
    }

    public void setAnimationStartDelay$div_release(long j10) {
        this.animationStartDelay = j10;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(@Nullable BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable DivBorder divBorder, @NotNull View view) {
        this.$$delegate_0.setBorder(bindingContext, divBorder, view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(@Nullable Div.q qVar) {
        this.$$delegate_0.setDiv(qVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        this.$$delegate_0.setNeedClipping(z10);
    }

    public void setTextRoundedBgHelper$div_release(@Nullable DivTextRangesBackgroundHelper divTextRangesBackgroundHelper) {
        this.textRoundedBgHelper = divTextRangesBackgroundHelper;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        this.$$delegate_0.transitionStarted(view);
    }
}
