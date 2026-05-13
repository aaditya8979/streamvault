package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.view.View;
import bn.g;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTextRangeBackground;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: DivTextRangesBackgroundHelper.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivTextRangesBackgroundHelper {

    @NotNull
    private final ExpressionResolver resolver;

    @NotNull
    private final View view;

    @NotNull
    private ArrayList<DivBackgroundSpan> spans = new ArrayList<>();

    @NotNull
    private final g singleLineRenderer$delegate = b.b(new a<SingleLineRenderer>() { // from class: com.yandex.div.core.util.text.DivTextRangesBackgroundHelper$singleLineRenderer$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.a
        @NotNull
        public final SingleLineRenderer invoke() {
            return new SingleLineRenderer(this.this$0.getView(), this.this$0.getResolver());
        }
    });

    @NotNull
    private final g multiLineRenderer$delegate = b.b(new a<MultiLineRenderer>() { // from class: com.yandex.div.core.util.text.DivTextRangesBackgroundHelper$multiLineRenderer$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.a
        @NotNull
        public final MultiLineRenderer invoke() {
            return new MultiLineRenderer(this.this$0.getView(), this.this$0.getResolver());
        }
    });

    @NotNull
    private final g cloudBackgroundRenderer$delegate = b.b(new a<CloudTextRangeBackgroundRenderer>() { // from class: com.yandex.div.core.util.text.DivTextRangesBackgroundHelper$cloudBackgroundRenderer$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.a
        @NotNull
        public final CloudTextRangeBackgroundRenderer invoke() {
            return new CloudTextRangeBackgroundRenderer(this.this$0.getView().getContext(), this.this$0.getResolver());
        }
    });

    public DivTextRangesBackgroundHelper(@NotNull View view, @NotNull ExpressionResolver expressionResolver) {
        this.view = view;
        this.resolver = expressionResolver;
    }

    private final CloudTextRangeBackgroundRenderer getCloudBackgroundRenderer() {
        return (CloudTextRangeBackgroundRenderer) this.cloudBackgroundRenderer$delegate.getValue();
    }

    private final DivTextRangesBackgroundRenderer getMultiLineRenderer() {
        return (DivTextRangesBackgroundRenderer) this.multiLineRenderer$delegate.getValue();
    }

    private final DivTextRangesBackgroundRenderer getSingleLineRenderer() {
        return (DivTextRangesBackgroundRenderer) this.singleLineRenderer$delegate.getValue();
    }

    public final boolean addBackgroundSpan$div_release(@NotNull DivBackgroundSpan divBackgroundSpan) {
        return this.spans.add(divBackgroundSpan);
    }

    public final void draw(@NotNull Canvas canvas, @NotNull Spanned spanned, @NotNull Layout layout) {
        for (DivBackgroundSpan divBackgroundSpan : this.spans) {
            int spanStart = spanned.getSpanStart(divBackgroundSpan);
            int spanEnd = spanned.getSpanEnd(divBackgroundSpan);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            int primaryHorizontal = (int) layout.getPrimaryHorizontal(spanStart);
            int primaryHorizontal2 = (int) layout.getPrimaryHorizontal(spanEnd);
            if (divBackgroundSpan.getBackground() instanceof DivTextRangeBackground.a) {
                getCloudBackgroundRenderer().draw(canvas, layout, lineForOffset, lineForOffset2, primaryHorizontal, primaryHorizontal2, divBackgroundSpan.getBorder(), divBackgroundSpan.getBackground());
            } else {
                (lineForOffset == lineForOffset2 ? getSingleLineRenderer() : getMultiLineRenderer()).draw(canvas, layout, lineForOffset, lineForOffset2, primaryHorizontal, primaryHorizontal2, divBackgroundSpan.getBorder(), divBackgroundSpan.getBackground());
            }
        }
    }

    @NotNull
    public final ExpressionResolver getResolver() {
        return this.resolver;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    public final boolean hasBackgroundSpan$div_release() {
        return !this.spans.isEmpty();
    }

    public final boolean hasSameSpan$div_release(@NotNull CharSequence charSequence, @NotNull DivBackgroundSpan divBackgroundSpan, int i10, int i11) {
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable == null) {
            return false;
        }
        ArrayList<DivBackgroundSpan> arrayList = this.spans;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        for (DivBackgroundSpan divBackgroundSpan2 : arrayList) {
            if (p.f(divBackgroundSpan2.getBorder(), divBackgroundSpan.getBorder()) && p.f(divBackgroundSpan2.getBackground(), divBackgroundSpan.getBackground()) && i11 == spannable.getSpanEnd(divBackgroundSpan2) && i10 == spannable.getSpanStart(divBackgroundSpan2)) {
                return true;
            }
        }
        return false;
    }

    public final void invalidateSpansCache$div_release() {
        this.spans.clear();
    }
}
