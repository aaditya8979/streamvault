package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes8.dex */
public class r extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f9687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppLovinSdkUtils.Size f9688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f9689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RelativeLayout f9690d;

    public r(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f9687a = viewGroup;
        this.f9688b = size;
        this.f9689c = activity;
        requestWindowFeature(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f9690d.removeView(this.f9687a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f9689c, this.f9688b.getWidth()), AppLovinSdkUtils.dpToPx(this.f9689c, this.f9688b.getHeight()));
        layoutParams.addRule(13);
        this.f9687a.setLayoutParams(layoutParams);
        int iDpToPx = AppLovinSdkUtils.dpToPx(this.f9689c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f9689c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f9689c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.od
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9486b.a(view);
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f9689c);
        this.f9690d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f9690d.setBackgroundColor(Integer.MIN_VALUE);
        this.f9690d.addView(imageButton);
        this.f9690d.addView(this.f9687a);
        this.f9690d.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.pd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9562b.b(view);
            }
        });
        setContentView(this.f9690d);
    }
}
