package com.yandex.div.core.player;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.div.R$attr;
import com.yandex.div2.DivVideoScale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: DivPlayerView.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class DivPlayerView extends FrameLayout implements DivVideoAttachable {
    public DivPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public /* synthetic */ DivPlayerView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R$attr.divImageStyle : i10);
    }

    @Nullable
    public /* bridge */ /* synthetic */ DivPlayer getAttachedPlayer() {
        return super.getAttachedPlayer();
    }

    public /* bridge */ /* synthetic */ void setScale(@NotNull DivVideoScale divVideoScale) {
        super.setScale(divVideoScale);
    }

    public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z10) {
        super.setVisibleOnScreen(z10);
    }
}
