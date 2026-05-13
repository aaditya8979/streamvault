package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTabs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivTabsAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivSimpleTab implements BaseDivTabbedCardUi.Input.TabBase {

    @NotNull
    private final DisplayMetrics displayMetrics;

    @NotNull
    private final DivTabs.Item item;

    @NotNull
    private final ExpressionResolver resolver;

    public DivSimpleTab(@NotNull DivTabs.Item item, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        this.item = item;
        this.displayMetrics = displayMetrics;
        this.resolver = expressionResolver;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @Nullable
    public DivAction getActionable() {
        return this.item.f57423c;
    }

    @NotNull
    public DivTabs.Item getItem() {
        return this.item;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @Nullable
    public Integer getTabHeight() {
        DivSize height = this.item.f57421a.b().getHeight();
        if (height instanceof DivSize.b) {
            return Integer.valueOf(DivUtilKt.toLayoutParamsSize$default(height, this.displayMetrics, this.resolver, null, 4, null));
        }
        return null;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @NotNull
    public Integer getTabHeightLayoutParam() {
        return Integer.valueOf(DivUtilKt.toLayoutParamsSize$default(this.item.f57421a.b().getHeight(), this.displayMetrics, this.resolver, null, 4, null));
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @NotNull
    public String getTitle() {
        return this.item.f57422b.evaluate(this.resolver);
    }
}
