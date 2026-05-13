package com.fyber.inneractive.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.network.w0;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class FyberAdIdentifierLocal extends IFyberAdIdentifier implements View.OnClickListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f19463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f19464n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f19465o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Animator f19466p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f19467q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f19468r;

    public FyberAdIdentifierLocal(r rVar) {
        super(rVar);
        this.f19465o = false;
        this.f19467q = 0.0f;
    }

    public static void a(ImageView imageView, String str) {
        if (TextUtils.isEmpty(str)) {
            com.fyber.inneractive.sdk.widget.a.a(imageView, null);
            return;
        }
        try {
            com.fyber.inneractive.sdk.widget.a.a(imageView, ColorStateList.valueOf(Color.parseColor(str)));
        } catch (Exception unused) {
            IAlog.f("could not parse color %s", str);
        }
    }

    public final void a() {
        this.f19465o = false;
        this.f19463m.setImageResource(R.drawable.ia_fyber_info_button);
        a(this.f19463m, this.f19481g);
        Animator animator = this.f19466p;
        if (animator != null) {
            animator.removeAllListeners();
            this.f19466p = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.ui.IFyberAdIdentifier
    public final void a(ViewGroup viewGroup) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.ia_identifier_overlay);
        int i10 = 0;
        ViewGroup viewGroup3 = (ViewGroup) layoutInflaterFrom.inflate(R.layout.ia_layout_fyber_ad_identifier, viewGroup2, false);
        this.f19463m = (ImageView) viewGroup3.findViewById(R.id.ia_fyber_identifier_image);
        TextView textView = (TextView) viewGroup3.findViewById(R.id.ia_fyber_identifier_text);
        this.f19464n = textView;
        if (this.f19484j) {
            int i11 = this.f19476b;
            int i12 = this.f19477c;
            if (textView != null && textView.getLayoutParams() != null) {
                textView.getLayoutParams().width = o.b(i11);
                textView.getLayoutParams().height = o.b(i12);
            }
            ImageView imageView = this.f19463m;
            int i13 = this.f19478d;
            int i14 = this.f19479e;
            if (imageView != null && imageView.getLayoutParams() != null) {
                imageView.getLayoutParams().width = o.b(i13);
                imageView.getLayoutParams().height = o.b(i14);
            }
            TextView textView2 = this.f19464n;
            int i15 = this.f19480f;
            if (textView2 instanceof TextView) {
                textView2.setTextSize(i15);
            }
            a(this.f19463m, this.f19481g);
            this.f19464n.setOnClickListener(this);
            this.f19464n.setText(this.f19482h);
            String str = this.f19483i;
            if (!TextUtils.isEmpty(str)) {
                IAConfigManager.O.f15973s.a(new w0(new b(this), viewGroup2.getContext(), new com.fyber.inneractive.sdk.cache.b(str)));
            }
        }
        IFyberAdIdentifier.Corner corner = this.f19485k;
        if (corner == IFyberAdIdentifier.Corner.TOP_LEFT || corner == IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            viewGroup3.removeView(this.f19464n);
            viewGroup3.addView(this.f19464n);
            viewGroup3.setLayoutDirection(0);
        }
        viewGroup3.addOnLayoutChangeListener(new c(this));
        this.f19463m.setOnClickListener(this);
        a();
        viewGroup2.addView(viewGroup3);
        IFyberAdIdentifier.Corner corner2 = this.f19485k;
        corner2.getClass();
        int i16 = j.f19499a[corner2.ordinal()];
        if (i16 == 1) {
            i10 = 51;
        } else if (i16 == 2) {
            i10 = 53;
        } else if (i16 == 3) {
            i10 = 83;
        } else if (i16 == 4) {
            i10 = 85;
        }
        o.a(viewGroup3, i10);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/ui/FyberAdIdentifierLocal;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.g.f53142p, view);
        safedk_FyberAdIdentifierLocal_onClick_89450e1d2505e7faa72ce8c17442a8db(view);
    }

    public void safedk_FyberAdIdentifierLocal_onClick_89450e1d2505e7faa72ce8c17442a8db(View view) {
        if (view != this.f19463m) {
            if (view == this.f19464n && this.f19486l == com.fyber.inneractive.sdk.config.global.features.a.OPEN) {
                a();
                IFyberAdIdentifier.ClickListener clickListener = this.f19475a;
                if (clickListener != null) {
                    clickListener.a();
                    return;
                }
                return;
            }
            return;
        }
        if (this.f19466p != null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ImageView imageView = this.f19463m;
        Property property = View.ROTATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 90.0f);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f19463m, "imageAlpha", 255, 25);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfInt);
        animatorSet2.addListener(new d(this, animatorSet));
        animatorSet2.setDuration(225L);
        this.f19466p = animatorSet2;
        animatorSet2.start();
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f19463m, (Property<ImageView, Float>) property, 0.0f);
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(this.f19463m, "imageAlpha", 25, 255);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(objectAnimatorOfFloat2, objectAnimatorOfInt2);
        animatorSet3.setDuration(225L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f19464n, (Property<TextView, Float>) View.TRANSLATION_X, this.f19465o ? this.f19467q : 0.0f);
        objectAnimatorOfFloat3.setDuration(450L);
        animatorSet.setDuration(450L);
        animatorSet.playTogether(objectAnimatorOfFloat3, animatorSet3);
        animatorSet.addListener(new e(this));
    }
}
