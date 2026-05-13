package com.fyber.inneractive.sdk.player.ui;

import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import com.fyber.inneractive.sdk.util.v;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends TextureView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f19024a;

    public g(s sVar) {
        super(sVar.getContext());
        this.f19024a = new WeakReference(sVar);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53142p, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        s sVar = (s) v.a(this.f19024a);
        if (sVar instanceof i) {
            sVar = ((i) sVar).f19025y;
        }
        if (sVar != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(sVar.f19080t.f19532a, 1073741824);
            i11 = View.MeasureSpec.makeMeasureSpec(sVar.f19080t.f19533b, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
