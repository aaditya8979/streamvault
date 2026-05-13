package com.yandex.div.core.view2;

import ah.e2;
import android.view.View;
import bn.r;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div2.Div;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DivViewBinder.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class DivViewBinder<TData extends Div, TDataValue extends e2, TView extends View> {

    @NotNull
    private final DivBaseBinder baseBinder;

    public DivViewBinder(@NotNull DivBaseBinder divBaseBinder) {
        this.baseBinder = divBaseBinder;
    }

    private final void bindViewInternal(BindingContext bindingContext, TView tview, TData tdata, DivStatePath divStatePath) {
        r rVar;
        p.i(tview, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<TData of com.yandex.div.core.view2.DivViewBinder>");
        Div div = ((DivHolderView) tview).getDiv();
        if (tdata == div) {
            return;
        }
        this.baseBinder.bindView(bindingContext, tview, tdata, div);
        if (divStatePath != null) {
            e2 e2VarB = tdata.b();
            p.i(e2VarB, "null cannot be cast to non-null type TDataValue of com.yandex.div.core.view2.DivViewBinder.bindViewInternal$lambda$0");
            bind(tview, bindingContext, e2VarB, div != null ? div.b() : null, divStatePath);
            rVar = r.f5635a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            e2 e2VarB2 = tdata.b();
            p.i(e2VarB2, "null cannot be cast to non-null type TDataValue of com.yandex.div.core.view2.DivViewBinder");
            bind(tview, bindingContext, e2VarB2, div != null ? div.b() : null);
        }
    }

    public void bind(@NotNull TView tview, @NotNull BindingContext bindingContext, @NotNull TDataValue tdatavalue, @Nullable TDataValue tdatavalue2) {
    }

    public void bind(@NotNull TView tview, @NotNull BindingContext bindingContext, @NotNull TDataValue tdatavalue, @Nullable TDataValue tdatavalue2, @NotNull DivStatePath divStatePath) {
        bind(tview, bindingContext, tdatavalue, tdatavalue2);
    }

    public void bindView(@NotNull BindingContext bindingContext, @NotNull TView tview, @NotNull TData tdata) {
        bindViewInternal(bindingContext, tview, tdata, null);
    }

    public void bindView(@NotNull BindingContext bindingContext, @NotNull TView tview, @NotNull TData tdata, @NotNull DivStatePath divStatePath) {
        bindViewInternal(bindingContext, tview, tdata, divStatePath);
    }
}
