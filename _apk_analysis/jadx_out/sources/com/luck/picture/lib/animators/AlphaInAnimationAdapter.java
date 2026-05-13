package com.luck.picture.lib.animators;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class AlphaInAnimationAdapter extends BaseAnimationAdapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f34934n;

    public AlphaInAnimationAdapter(RecyclerView.Adapter adapter) {
        this(adapter, 0.0f);
    }

    public AlphaInAnimationAdapter(RecyclerView.Adapter adapter, float f10) {
        super(adapter);
        this.f34934n = f10;
    }

    @Override // com.luck.picture.lib.animators.BaseAnimationAdapter
    public Animator[] c(View view) {
        return new Animator[]{ObjectAnimator.ofFloat(view, "alpha", this.f34934n, 1.0f)};
    }
}
