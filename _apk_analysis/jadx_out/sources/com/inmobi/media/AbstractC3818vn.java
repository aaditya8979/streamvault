package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ProgressBar;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: renamed from: com.inmobi.media.vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3818vn {
    public static final void a(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public static final void a(ProgressBar progressBar, int i10) {
        tn.p.k(progressBar, "<this>");
        progressBar.setProgress(i10, true);
    }

    public static final boolean a(View view, ViewGroup viewGroup) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(viewGroup, "parentView");
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            if (tn.p.f(parent, viewGroup)) {
                return true;
            }
            parent = parent instanceof ViewGroup ? ((ViewGroup) parent).getParent() : null;
        }
        return false;
    }

    public static final boolean b(View view, ViewGroup viewGroup) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(viewGroup, "parentView");
        if (view.isAttachedToWindow()) {
            return a(view, viewGroup);
        }
        return false;
    }
}
