package com.yk.e.subad;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ImageHandler;
import com.yk.e.util.LogUtil;
import j.i;
import j.l2;

/* JADX INFO: loaded from: classes10.dex */
public class BannerView extends LinearLayout {
    public boolean I1I;
    public final Activity IL1Iii;
    public l2 ILil;

    /* JADX INFO: renamed from: I丨L, reason: contains not printable characters */
    public final ImageView f3386IL;

    public BannerView(Activity activity) {
        super(activity);
        this.I1I = false;
        this.IL1Iii = activity;
        View viewInflate = LayoutInflater.from(activity).inflate(IDUtil.getLayoutID(activity, "main_layout_banner"), (ViewGroup) null, false);
        addView(viewInflate);
        this.f3386IL = (ImageView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_img_gif_banner"));
        setVisibility(8);
    }

    public final void IL1Iii(String str, int i10, int i11) {
        this.f3386IL.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f3386IL.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        this.f3386IL.setLayoutParams(layoutParams);
        setVisibility(0);
        new ImageHandler().loadImg(this.IL1Iii, str, this.f3386IL, "", new i());
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (i10 != 0) {
            if (i10 == 4 || i10 == 8) {
                LogUtil.d("zhazha", "不可见");
                return;
            }
            return;
        }
        LogUtil.d("zhazha", "可见");
        if (this.I1I) {
            return;
        }
        this.I1I = true;
        this.ILil.a();
    }

    public void setNativeCallBack(l2 l2Var) {
        this.ILil = l2Var;
    }
}
