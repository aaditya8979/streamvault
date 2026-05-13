package com.fyber.inneractive.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f19494a;

    public e(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f19494a = fyberAdIdentifierLocal;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f19494a;
        fyberAdIdentifierLocal.f19466p = null;
        fyberAdIdentifierLocal.f19465o = !fyberAdIdentifierLocal.f19465o;
    }
}
