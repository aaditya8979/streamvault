package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiAudio;

/* JADX INFO: loaded from: classes9.dex */
public final class S8 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiAudio f26290a;

    public S8(InMobiAudio inMobiAudio) {
        this.f26290a = inMobiAudio;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            this.f26290a.f25077f = F3.b(r0.getMeasuredWidth() / J5.b());
            this.f26290a.f25078g = F3.b(r0.getMeasuredHeight() / J5.b());
            if (InMobiAudio.access$hasValidSize(this.f26290a)) {
                this.f26290a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception e10) {
            Kb.a((byte) 1, "InMobiAudio", "InMobiAudio$1.onGlobalLayout() handler threw unexpected error");
            e10.getMessage();
        }
    }
}
