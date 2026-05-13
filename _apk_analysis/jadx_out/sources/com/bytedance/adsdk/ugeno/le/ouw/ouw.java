package com.bytedance.adsdk.ugeno.le.ouw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.internal.view.SupportMenu;
import com.bytedance.adsdk.ugeno.le.yu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ouw extends LinearLayout {
    private boolean bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private float f11722cf;
    public int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f11723le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f11724lh;
    public List<View> ouw;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f11725ra;
    private String ryl;
    private float tlj;
    public int vt;
    public Context yu;

    public ouw(Context context) {
        super(context);
        this.vt = SupportMenu.CATEGORY_MASK;
        this.f11724lh = -16776961;
        this.pno = 5;
        this.fkw = 40;
        this.f11723le = 20;
        this.ryl = "row";
        this.yu = context;
        this.ouw = new ArrayList();
        setOrientation(0);
    }

    public static /* synthetic */ void ouw(ouw ouwVar) {
        FrameLayout frameLayout = (FrameLayout) ouwVar.getParent();
        if (frameLayout != null) {
            float width = frameLayout.getWidth();
            float height = frameLayout.getHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ouwVar.getLayoutParams();
            float width2 = ouwVar.getWidth();
            layoutParams.topMargin = (int) (((int) ((height * r5) / 100.0f)) - ((ouwVar.getHeight() * ouwVar.f11722cf) / 100.0f));
            layoutParams.leftMargin = (int) (((int) ((width * r0) / 100.0f)) - ((width2 * ouwVar.tlj) / 100.0f));
            ouwVar.setLayoutParams(layoutParams);
        }
    }

    public int getSize() {
        return this.ouw.size();
    }

    public final void ouw() {
        View view = new View(getContext());
        view.setClickable(false);
        if (this instanceof vt) {
            this.f11723le = this.fkw;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.fkw, this.f11723le);
        if (getOrientation() == 1) {
            int i10 = this.pno;
            layoutParams.topMargin = i10;
            layoutParams.bottomMargin = i10;
        } else {
            int i11 = this.pno;
            layoutParams.leftMargin = i11;
            layoutParams.rightMargin = i11;
        }
        addView(view, layoutParams);
        view.setBackground(vt(this.f11724lh));
        this.ouw.add(view);
    }

    public final void ouw(int i10) {
        if (this instanceof vt) {
            this.f11723le = this.fkw;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.fkw, this.f11723le);
        if (getOrientation() == 1) {
            int i11 = this.pno;
            layoutParams.topMargin = i11;
            layoutParams.bottomMargin = i11;
        } else {
            int i12 = this.pno;
            layoutParams.leftMargin = i12;
            layoutParams.rightMargin = i12;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.fkw, this.f11723le);
        if (getOrientation() == 1) {
            int i13 = this.pno;
            layoutParams2.topMargin = i13;
            layoutParams2.bottomMargin = i13;
        } else {
            int i14 = this.pno;
            layoutParams2.leftMargin = i14;
            layoutParams2.rightMargin = i14;
        }
        int iOuw = yu.ouw(this.bly, this.f11725ra, this.ouw.size());
        int iOuw2 = yu.ouw(this.bly, i10, this.ouw.size());
        if (this.ouw.size() == 0) {
            iOuw2 = 0;
        }
        if (!this.ouw.isEmpty() && yu.ouw(iOuw, this.ouw) && yu.ouw(iOuw2, this.ouw)) {
            this.ouw.get(iOuw).setBackground(vt(this.f11724lh));
            this.ouw.get(iOuw).setLayoutParams(layoutParams2);
            this.ouw.get(iOuw2).setBackground(vt(this.vt));
            this.ouw.get(iOuw2).setLayoutParams(layoutParams);
            this.f11725ra = i10;
        }
    }

    public void setIndicatorDirection(String str) {
        this.ryl = str;
        if (TextUtils.equals(str, "column")) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
    }

    public void setIndicatorHeight(int i10) {
        this.f11723le = i10;
    }

    public void setIndicatorWidth(int i10) {
        this.fkw = i10;
    }

    public void setIndicatorX(float f10) {
        this.tlj = f10;
    }

    public void setIndicatorY(float f10) {
        this.f11722cf = f10;
    }

    public void setLoop(boolean z10) {
        this.bly = z10;
    }

    public void setSelectedColor(int i10) {
        this.vt = i10;
    }

    public void setUnSelectedColor(int i10) {
        this.f11724lh = i10;
    }

    public abstract Drawable vt(int i10);
}
