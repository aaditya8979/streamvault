package com.yandex.div.core.util;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: AccessibilityStateProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class AccessibilityStateProvider {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private static Boolean touchExplorationEnabled;
    private final boolean a11yConfigurationEnabled;

    /* JADX INFO: compiled from: AccessibilityStateProvider.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final void evaluateTouchModeEnabled(@NotNull Context context) {
            if (getTouchExplorationEnabled() != null) {
                return;
            }
            Object systemService = context.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            setTouchExplorationEnabled(accessibilityManager != null ? Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()) : Boolean.FALSE);
        }

        @Nullable
        public final Boolean getTouchExplorationEnabled() {
            return AccessibilityStateProvider.touchExplorationEnabled;
        }

        public final void setTouchExplorationEnabled(@Nullable Boolean bool) {
            AccessibilityStateProvider.touchExplorationEnabled = bool;
        }
    }

    public AccessibilityStateProvider(boolean z10) {
        this.a11yConfigurationEnabled = z10;
    }

    public final boolean isAccessibilityEnabled(@NotNull Context context) {
        if (!this.a11yConfigurationEnabled) {
            return false;
        }
        Boolean bool = touchExplorationEnabled;
        if (bool != null) {
            p.h(bool);
            return bool.booleanValue();
        }
        Companion.evaluateTouchModeEnabled(context);
        Boolean bool2 = touchExplorationEnabled;
        p.h(bool2);
        return bool2.booleanValue();
    }
}
