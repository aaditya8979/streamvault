package com.yandex.div.core.view2.divs.pager;

import ah.e2;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.GravityCompat;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionViewHolder;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivPager;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.i;

/* JADX INFO: compiled from: DivPagerViewHolder.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivPagerViewHolder extends DivCollectionViewHolder {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final a<DivPager.ItemAlignment> crossAxisAlignment;

    @NotNull
    private final a<Boolean> isHorizontal;

    @NotNull
    private final DivPagerPageLayout pageLayout;

    @NotNull
    private final BindingContext parentContext;

    /* JADX INFO: compiled from: DivPagerViewHolder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View$OnAttachStateChangeListener, com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$1] */
    public DivPagerViewHolder(@NotNull BindingContext bindingContext, @NotNull DivPagerPageLayout divPagerPageLayout, @NotNull DivBinder divBinder, @NotNull DivViewCreator divViewCreator, @NotNull a<Boolean> aVar, @NotNull a<? extends DivPager.ItemAlignment> aVar2) {
        super(divPagerPageLayout, bindingContext, divBinder, divViewCreator);
        this.parentContext = bindingContext;
        this.pageLayout = divPagerPageLayout;
        this.isHorizontal = aVar;
        this.crossAxisAlignment = aVar2;
        final View view = this.itemView;
        final ?? r22 = new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view2) {
                Div oldDiv = this.this$0.getOldDiv();
                if (oldDiv == null) {
                    return;
                }
                this.this$0.parentContext.getDivView().getDiv2Component$div_release().getVisibilityActionTracker().startTrackingViewsHierarchy(this.this$0.parentContext, view2, oldDiv);
            }
        };
        view.addOnAttachStateChangeListener(r22);
        new Disposable() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$2
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                view.removeOnAttachStateChangeListener(r22);
            }
        };
    }

    private final void setCrossAxisAlignment(DivLayoutParams divLayoutParams, e2 e2Var, ExpressionResolver expressionResolver) {
        Enum enumInvoke;
        Expression expressionM = this.isHorizontal.invoke().booleanValue() ? e2Var.m() : e2Var.g();
        if (expressionM == null || (enumInvoke = (Enum) expressionM.evaluate(expressionResolver)) == null) {
            enumInvoke = this.crossAxisAlignment.invoke();
        }
        int i10 = 17;
        if (this.isHorizontal.invoke().booleanValue()) {
            if (!(enumInvoke == DivPager.ItemAlignment.CENTER || enumInvoke == DivAlignmentVertical.CENTER)) {
                i10 = enumInvoke == DivPager.ItemAlignment.END || enumInvoke == DivAlignmentVertical.BOTTOM ? 80 : 48;
            }
        } else {
            if (!(enumInvoke == DivPager.ItemAlignment.CENTER || enumInvoke == DivAlignmentHorizontal.CENTER)) {
                i10 = enumInvoke == DivPager.ItemAlignment.END || enumInvoke == DivAlignmentHorizontal.END ? GravityCompat.END : enumInvoke == DivAlignmentHorizontal.LEFT ? 3 : enumInvoke == DivAlignmentHorizontal.RIGHT ? 5 : GravityCompat.START;
            }
        }
        divLayoutParams.setGravity(i10);
        this.pageLayout.requestLayout();
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    public void bind(@NotNull BindingContext bindingContext, @NotNull Div div, int i10, @NotNull DivStatePath divStatePath) {
        super.bind(bindingContext, div, i10, divStatePath);
        View child = this.pageLayout.getChild();
        ViewGroup.LayoutParams layoutParams = child != null ? child.getLayoutParams() : null;
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams != null) {
            setCrossAxisAlignment(divLayoutParams, div.b(), bindingContext.getExpressionResolver());
        }
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    public void logReuseError() {
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.DEBUG)) {
            kLog.print(3, "DivPagerViewHolder", "Pager holder reuse failed");
        }
    }
}
