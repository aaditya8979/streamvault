package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import com.yandex.div.R$id;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionViewHolder;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.KLog;
import com.yandex.div.logging.Severity;
import com.yandex.div2.Div;
import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX INFO: compiled from: DivGalleryViewHolder.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivGalleryViewHolder extends DivCollectionViewHolder {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final DivViewWrapper rootView;

    /* JADX INFO: compiled from: DivGalleryViewHolder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public DivGalleryViewHolder(@NotNull BindingContext bindingContext, @NotNull DivViewWrapper divViewWrapper, @NotNull DivBinder divBinder, @NotNull DivViewCreator divViewCreator) {
        super(divViewWrapper, bindingContext, divBinder, divViewCreator);
        this.rootView = divViewWrapper;
        this.divBinder = divBinder;
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    public void bind(@NotNull BindingContext bindingContext, @NotNull Div div, int i10, @NotNull DivStatePath divStatePath) {
        super.bind(bindingContext, div, i10, divStatePath);
        this.rootView.setTag(R$id.div_gallery_item_index, Integer.valueOf(i10));
        this.divBinder.attachIndicators$div_release();
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    public void logReuseError() {
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.DEBUG)) {
            kLog.print(3, "DivGalleryViewHolder", "Gallery holder reuse failed");
        }
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    public void updateWrapperLayoutParams(@NotNull View view) {
        this.rootView.setLayoutParams(view.getLayoutParams());
    }
}
