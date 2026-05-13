package yads;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class z63 extends CheckBox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f97412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f97413b;

    public z63(@NotNull Context context) {
        super(context);
    }

    public z63(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public z63(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setButtonDrawable((Drawable) null);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f97412a);
        stateListDrawable.addState(new int[0], this.f97413b);
        setBackground(stateListDrawable);
    }

    public final void setCheckedIcon(@NotNull Drawable drawable) {
        this.f97412a = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f97412a);
        stateListDrawable.addState(new int[0], this.f97413b);
        setBackground(stateListDrawable);
    }

    public final void setUncheckedIcon(@NotNull Drawable drawable) {
        this.f97413b = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f97412a);
        stateListDrawable.addState(new int[0], this.f97413b);
        setBackground(stateListDrawable);
    }
}
