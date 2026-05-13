package com.yandex.div.core.view2;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: AccessibilityListDelegate.kt */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class AccessibilityListDelegate$firstChild$1 extends FunctionReferenceImpl implements l<View, Integer> {
    public static final AccessibilityListDelegate$firstChild$1 INSTANCE = new AccessibilityListDelegate$firstChild$1();

    public AccessibilityListDelegate$firstChild$1() {
        super(1, View.class, "getTop", "getTop()I", 0);
    }

    @Override // sn.l
    @NotNull
    public final Integer invoke(@NotNull View view) {
        return Integer.valueOf(view.getTop());
    }
}
