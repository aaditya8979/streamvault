package com.yandex.div.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div.internal.widget.TransientViewMixin;
import com.yandex.div2.DivBorder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: DivViewWrapper.kt */
/* JADX INFO: loaded from: classes7.dex */
public class DivViewWrapper extends FrameContainerLayout implements DivBorderSupports, TransientView {
    private final /* synthetic */ TransientViewMixin $$delegate_0;

    public DivViewWrapper(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DivViewWrapper(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.$$delegate_0 = new TransientViewMixin();
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setImportantForAccessibility(2);
    }

    public /* synthetic */ DivViewWrapper(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view, int i10, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (!(getChildCount() == 0)) {
            throw new IllegalArgumentException("ViewWrapper can host only one child view".toString());
        }
        super.addView(view, 0, layoutParams);
    }

    @Nullable
    public final View getChild() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(0);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorderDrawer getDivBorderDrawer() {
        KeyEvent.Callback child = getChild();
        DivBorderSupports divBorderSupports = child instanceof DivBorderSupports ? (DivBorderSupports) child : null;
        if (divBorderSupports != null) {
            return divBorderSupports.getDivBorderDrawer();
        }
        return null;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        KeyEvent.Callback child = getChild();
        DivBorderSupports divBorderSupports = child instanceof DivBorderSupports ? (DivBorderSupports) child : null;
        if (divBorderSupports != null) {
            return divBorderSupports.getNeedClipping();
        }
        return true;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable DivBorder divBorder, @NotNull View view) {
        KeyEvent.Callback child = getChild();
        DivBorderSupports divBorderSupports = child instanceof DivBorderSupports ? (DivBorderSupports) child : null;
        if (divBorderSupports != null) {
            divBorderSupports.setBorder(bindingContext, divBorder, view);
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        KeyEvent.Callback child = getChild();
        DivBorderSupports divBorderSupports = child instanceof DivBorderSupports ? (DivBorderSupports) child : null;
        if (divBorderSupports == null) {
            return;
        }
        divBorderSupports.setNeedClipping(z10);
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
