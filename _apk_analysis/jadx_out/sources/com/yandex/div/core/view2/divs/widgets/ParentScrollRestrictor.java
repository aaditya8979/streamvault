package com.yandex.div.core.view2.divs.widgets;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ParentScrollRestrictor.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ParentScrollRestrictor implements OnInterceptTouchEventListener {

    @NotNull
    public static final ParentScrollRestrictor INSTANCE = new ParentScrollRestrictor();

    private ParentScrollRestrictor() {
    }

    @Override // com.yandex.div.internal.widget.OnInterceptTouchEventListener
    public boolean onInterceptTouchEvent(@NotNull ViewGroup viewGroup, @NotNull MotionEvent motionEvent) {
        ViewParent parent = viewGroup.getParent();
        if (parent == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            parent.requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 1 || actionMasked == 3) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }
}
