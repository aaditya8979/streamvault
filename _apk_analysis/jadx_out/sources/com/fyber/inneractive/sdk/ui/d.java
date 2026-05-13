package com.fyber.inneractive.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.R;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatorSet f19492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f19493b;

    public d(FyberAdIdentifierLocal fyberAdIdentifierLocal, AnimatorSet animatorSet) {
        this.f19493b = fyberAdIdentifierLocal;
        this.f19492a = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f19493b;
        if (fyberAdIdentifierLocal.f19465o) {
            fyberAdIdentifierLocal.f19463m.setImageResource(R.drawable.ia_fyber_info_button);
            FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f19493b;
            FyberAdIdentifierLocal.a(fyberAdIdentifierLocal2.f19463m, fyberAdIdentifierLocal2.f19481g);
        } else {
            Bitmap bitmap = fyberAdIdentifierLocal.f19468r;
            if (bitmap != null) {
                fyberAdIdentifierLocal.f19463m.setImageBitmap(bitmap);
            } else {
                fyberAdIdentifierLocal.f19463m.setImageResource(R.drawable.ia_digital_turbine_logo);
            }
            FyberAdIdentifierLocal.a(this.f19493b.f19463m, null);
        }
        this.f19492a.start();
        this.f19493b.f19466p = this.f19492a;
    }
}
