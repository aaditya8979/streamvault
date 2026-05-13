package com.yandex.div.internal.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import bn.r;
import com.yandex.div.core.view2.drawable.NoOpDrawable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;

/* JADX INFO: compiled from: SwitchView.kt */
/* JADX INFO: loaded from: classes7.dex */
public class SwitchView extends FrameLayout {

    @NotNull
    private static final int[] CHECKED;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final int[] DEFAULT;

    @NotNull
    private static final int[] DISABLED;

    @NotNull
    private static final int[][] STATES_ARRAY;

    @Nullable
    private Integer colorOn;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @NotNull
    private final SwitchCompat f3286switch;

    @NotNull
    private final int[] thumbTintColors;

    @NotNull
    private final int[] trackTintColors;

    /* JADX INFO: compiled from: SwitchView.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    static {
        int[] iArr = {-16842910};
        DISABLED = iArr;
        int[] iArr2 = {R.attr.state_checked};
        CHECKED = iArr2;
        int[] iArr3 = new int[0];
        DEFAULT = iArr3;
        STATES_ARRAY = new int[][]{iArr, iArr2, iArr3};
    }

    public SwitchView(@NotNull Context context) {
        super(context);
        SwitchCompat switchCompat = new SwitchCompat(context);
        this.f3286switch = switchCompat;
        this.trackTintColors = new int[3];
        this.thumbTintColors = new int[3];
        switchCompat.setShowText(false);
        switchCompat.setBackground(NoOpDrawable.INSTANCE);
        addView(switchCompat, new FrameLayout.LayoutParams(-2, -2, 17));
        setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.internal.widget.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f53993b.forwardClicksToSwitch();
            }
        });
        fillDefaultColors();
        updateTints();
    }

    private final int applyAlpha(int i10, float f10) {
        return setAlpha(i10, (int) (Color.alpha(i10) * f10));
    }

    private final void changeTints() {
        Integer num = this.colorOn;
        if (num != null) {
            int iIntValue = num.intValue();
            this.thumbTintColors[1] = iIntValue;
            this.trackTintColors[1] = applyAlpha(iIntValue, 0.3f);
            updateTints();
        }
    }

    private final void fillDefaultColors() {
        TypedValue typedValue = new TypedValue();
        int colorFromTheme = getColorFromTheme(R.attr.colorForeground, typedValue, false);
        int colorFromTheme2 = getColorFromTheme(R.attr.colorControlActivated, typedValue, false);
        int colorFromTheme3 = getColorFromTheme(androidx.appcompat.R.attr.colorSwitchThumbNormal, typedValue, true);
        this.trackTintColors[1] = applyAlpha(colorFromTheme2, 0.3f);
        this.trackTintColors[2] = setAlpha(colorFromTheme, 0.3f);
        this.trackTintColors[0] = setAlpha(colorFromTheme, 0.1f);
        int[] iArr = this.thumbTintColors;
        iArr[1] = colorFromTheme2;
        iArr[2] = colorFromTheme3;
        iArr[0] = lightenColor(colorFromTheme3, 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forwardClicksToSwitch() {
        if (isEnabled()) {
            this.f3286switch.performClick();
        }
    }

    private final int getColorFromTheme(int i10, TypedValue typedValue, boolean z10) {
        if (getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return (!z10 || typedValue.resourceId == 0) ? typedValue.data : ContextCompat.getColor(getContext(), typedValue.resourceId);
        }
        return 0;
    }

    @VisibleForTesting
    public static /* synthetic */ void getThumbTintList$div_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTrackTintList$div_release$annotations() {
    }

    private final int lightenColor(int i10, float f10) {
        return ColorUtils.blendARGB(i10, -1, f10);
    }

    private final int setAlpha(int i10, float f10) {
        return setAlpha(i10, (int) (f10 * 255));
    }

    private final int setAlpha(int i10, int i11) {
        return Color.argb(i11, Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnCheckedChangeListener$lambda$2(l lVar, CompoundButton compoundButton, boolean z10) {
        lVar.invoke(Boolean.valueOf(z10));
    }

    private final void updateTints() {
        SwitchCompat switchCompat = this.f3286switch;
        int[][] iArr = STATES_ARRAY;
        switchCompat.setTrackTintList(new ColorStateList(iArr, this.trackTintColors));
        this.f3286switch.setThumbTintList(new ColorStateList(iArr, this.thumbTintColors));
    }

    @Nullable
    public final Integer getColorOn() {
        return this.colorOn;
    }

    @Nullable
    public final ColorStateList getThumbTintList$div_release() {
        return this.f3286switch.getThumbTintList();
    }

    @Nullable
    public final ColorStateList getTrackTintList$div_release() {
        return this.f3286switch.getTrackTintList();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f3286switch.isEnabled();
    }

    public final void setChecked(boolean z10) {
        this.f3286switch.setChecked(z10);
    }

    public final void setColorOn(@Nullable Integer num) {
        this.colorOn = num;
        changeTints();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        this.f3286switch.setEnabled(z10);
    }

    public final void setOnCheckedChangeListener(@NotNull final l<? super Boolean, r> lVar) {
        this.f3286switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.yandex.div.internal.widget.c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                SwitchView.setOnCheckedChangeListener$lambda$2(lVar, compoundButton, z10);
            }
        });
    }
}
