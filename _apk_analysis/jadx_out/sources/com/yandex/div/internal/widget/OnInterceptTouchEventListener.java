package com.yandex.div.internal.widget;

import android.view.MotionEvent;
import android.view.ViewGroup;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OnInterceptTouchEventListener.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface OnInterceptTouchEventListener {
    boolean onInterceptTouchEvent(@NotNull ViewGroup viewGroup, @NotNull MotionEvent motionEvent);
}
