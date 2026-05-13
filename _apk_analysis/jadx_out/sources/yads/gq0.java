package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class gq0 extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a53 f90087b;

    public gq0(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public gq0(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        super(context, attributeSet, i10);
    }

    @Nullable
    public final wd3 getAdUiElements() {
        return null;
    }

    @Nullable
    public final a53 getPlayerView() {
        return this.f90087b;
    }

    public final void setAdUiElements(@Nullable wd3 wd3Var) {
    }

    public final void setPlayerView(@Nullable a53 a53Var) {
        this.f90087b = a53Var;
    }
}
