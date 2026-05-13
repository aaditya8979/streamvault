package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class fak {
    public static float ouw(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    Rect rect = new Rect();
                    if (!view.getGlobalVisibleRect(rect)) {
                        return -1.0f;
                    }
                    long jHeight = ((long) rect.height()) * ((long) rect.width());
                    long height = ((long) view.getHeight()) * ((long) view.getWidth());
                    if (height <= 0) {
                        return -1.0f;
                    }
                    return jHeight / height;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    public static boolean ouw(View view, int i10, int i11, boolean z10) {
        boolean z11;
        if (i11 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if ((view instanceof com.bytedance.sdk.openadsdk.core.bly.qbp) || (view instanceof com.bytedance.sdk.openadsdk.core.yu.yu)) {
                        break;
                    }
                    view = (View) view.getParent();
                } catch (Throwable unused) {
                }
            }
            if (z10) {
                i10 = 0;
            }
        }
        char c10 = 3;
        if (view.getWindowVisibility() != 0) {
            c10 = 4;
        } else {
            if (view.isShown()) {
                int iYu = i11 == 3 ? (int) (((double) com.bytedance.sdk.openadsdk.utils.osn.yu(view.getContext().getApplicationContext())) * 0.7d) : 20;
                int iLe = i11 == 3 ? com.bytedance.sdk.openadsdk.utils.osn.le(view.getContext().getApplicationContext()) / 2 : 20;
                if (i11 == 1 && z10) {
                    if (view.getWidth() > 0 && view.getHeight() > 0) {
                    }
                } else {
                    z11 = view.getWidth() >= iYu && view.getHeight() >= iLe;
                }
                if (z11) {
                    float fOuw = ouw(view);
                    if (fOuw > 0.0f && fOuw >= ((float) i10) / 100.0f) {
                        c10 = 0;
                    }
                } else {
                    c10 = 6;
                }
            } else {
                c10 = 1;
            }
        }
        return c10 == 0;
    }
}
