package com.yandex.div.core.view2.divs.widgets;

import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div2.Div;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivHolderView.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface DivHolderView<T extends Div> extends DivBorderSupports, TransientView, ExpressionSubscriber {
    @Nullable
    BindingContext getBindingContext();

    @Nullable
    T getDiv();

    default void release() {
        super.release();
        setDiv(null);
        setBindingContext(null);
        releaseBorderDrawer();
    }

    void setBindingContext(@Nullable BindingContext bindingContext);

    void setDiv(@Nullable T t10);
}
