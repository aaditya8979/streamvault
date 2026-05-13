package com.yandex.div.core.widget;

import android.view.View;
import org.jetbrains.annotations.NotNull;
import sn.l;
import wn.d;
import zn.n;

/* JADX INFO: compiled from: AspectView.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface AspectView {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: AspectView.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final d<View, Float> aspectRatioProperty$div_release() {
            return ViewsKt.dimensionAffecting(Float.valueOf(0.0f), new l<Float, Float>() { // from class: com.yandex.div.core.widget.AspectView$Companion$aspectRatioProperty$1
                @NotNull
                public final Float invoke(float f10) {
                    return Float.valueOf(n.d(f10, 0.0f));
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                    return invoke(f10.floatValue());
                }
            });
        }
    }

    void setAspectRatio(float f10);
}
