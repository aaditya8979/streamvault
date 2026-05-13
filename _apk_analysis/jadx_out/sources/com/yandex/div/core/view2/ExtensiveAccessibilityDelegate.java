package com.yandex.div.core.view2;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivAccessibilityBinder.kt */
/* JADX INFO: loaded from: classes.dex */
final class ExtensiveAccessibilityDelegate extends AccessibilityDelegateCompat {

    @NotNull
    private final String className;
    private final boolean isCheckable;

    @Nullable
    private Boolean isChecked;
    private final boolean isHeading;

    public ExtensiveAccessibilityDelegate(@NotNull String str, boolean z10, boolean z11) {
        this.className = str;
        this.isHeading = z10;
        this.isCheckable = z11;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(@NotNull View view, @NotNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (this.className.length() > 0) {
            accessibilityNodeInfoCompat.setClassName(this.className);
        }
        accessibilityNodeInfoCompat.setHeading(this.isHeading);
        if (this.isCheckable) {
            accessibilityNodeInfoCompat.setCheckable(true);
            Boolean bool = this.isChecked;
            if (bool != null) {
                accessibilityNodeInfoCompat.setChecked(bool.booleanValue());
            }
        }
    }

    public final void setChecked(@Nullable Boolean bool) {
        this.isChecked = bool;
    }
}
