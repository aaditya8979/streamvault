package yads;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class cq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nl3 f88583a;

    public /* synthetic */ cq0() {
        this(new nl3());
    }

    public cq0(nl3 nl3Var) {
        this.f88583a = nl3Var;
    }

    public final bq0 a(View view) {
        int iA;
        this.f88583a.getClass();
        RectF rectF = null;
        if (nl3.a(view)) {
            iA = kl3.a(view);
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect)) {
                rect.offset(view.getLeft(), view.getTop());
            } else {
                rect = null;
            }
            Context context = view.getContext();
            if (rect != null) {
                float fA = kl3.a(context, rect.left);
                float fD = vn.c.d(rect.top / context.getResources().getDisplayMetrics().density);
                float fD2 = vn.c.d(rect.right / context.getResources().getDisplayMetrics().density);
                float fD3 = vn.c.d(rect.bottom / context.getResources().getDisplayMetrics().density);
                float f10 = fD3 - fD;
                if (fD2 - fA > 0.0f && f10 > 0.0f) {
                    rectF = new RectF(fA, fD, fD2, fD3);
                }
            }
        } else {
            iA = 0;
        }
        return new bq0(iA, rectF);
    }
}
