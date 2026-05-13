package ie;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.annotation.StyleableRes;
import com.ruffian.library.widget.R$styleable;

/* JADX INFO: compiled from: RTextViewHelper.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends a<TextView> {
    public int A1;
    public int B1;
    public int C1;
    public ColorStateList D1;
    public int[][] E1;
    public String F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public Drawable J0;
    public boolean J1;
    public Drawable K0;
    public boolean K1;
    public Drawable L0;
    public int L1;
    public Drawable M0;
    public int M1;
    public Drawable N0;
    public int N1;
    public Drawable O0;
    public int O1;
    public int P0;
    public String P1;
    public int Q0;
    public String Q1;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public Drawable f64168a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public Drawable f64169b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public Drawable f64170c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public Drawable f64171d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public Drawable f64172e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public Drawable f64173f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public Drawable f64174g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public Drawable f64175h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public Drawable f64176i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public Drawable f64177j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public Drawable f64178k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public Drawable f64179l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public Drawable f64180m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public Drawable f64181n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public Drawable f64182o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public Drawable f64183p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public Drawable f64184q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public Drawable f64185r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public Drawable f64186s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public Drawable f64187t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public Drawable f64188u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public Drawable f64189v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public Drawable f64190w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public Drawable f64191x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public int f64192y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public int f64193z1;

    public c(Context context, TextView textView, AttributeSet attributeSet) {
        super(context, textView, attributeSet);
        this.J0 = null;
        this.f64168a1 = null;
        this.f64174g1 = null;
        this.f64180m1 = null;
        this.f64186s1 = null;
        this.f64192y1 = 0;
        this.f64193z1 = 0;
        this.A1 = 0;
        this.B1 = 0;
        this.C1 = 0;
        this.E1 = new int[6][];
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = false;
        h(context, attributeSet);
    }

    @SuppressLint({"NewApi"})
    private void h(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            y();
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RTextView);
        this.f64169b1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_normal_left);
        this.f64170c1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_pressed_left);
        this.f64171d1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_unable_left);
        this.f64172e1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_selected_left);
        this.f64173f1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_checked_left);
        this.f64187t1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_normal_right);
        this.f64188u1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_pressed_right);
        this.f64189v1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_unable_right);
        this.f64190w1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_selected_right);
        this.f64191x1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_checked_right);
        this.f64175h1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_normal_top);
        this.f64176i1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_pressed_top);
        this.f64177j1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_unable_top);
        this.f64178k1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_selected_top);
        this.f64179l1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_checked_top);
        this.f64181n1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_normal_bottom);
        this.f64182o1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_pressed_bottom);
        this.f64183p1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_unable_bottom);
        this.f64184q1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_selected_bottom);
        this.f64185r1 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_checked_bottom);
        Drawable drawableG = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_android_drawableLeft);
        Drawable drawableG2 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_android_drawableRight);
        Drawable drawableG3 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_android_drawableTop);
        Drawable drawableG4 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_android_drawableBottom);
        Drawable drawableG5 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_android_drawableStart);
        Drawable drawableG6 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_android_drawableEnd);
        this.K0 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_src_normal);
        this.L0 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_src_pressed);
        this.M0 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_src_unable);
        this.N0 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_src_selected);
        this.O0 = G(context, typedArrayObtainStyledAttributes, R$styleable.RTextView_icon_src_checked);
        if (a.k()) {
            if (drawableG6 != null) {
                drawableG = drawableG6;
            }
            if (drawableG5 != null) {
                drawableG2 = drawableG5;
            }
        } else {
            if (drawableG5 != null) {
                drawableG = drawableG5;
            }
            if (drawableG6 != null) {
                drawableG2 = drawableG6;
            }
        }
        if (drawableG != null) {
            this.f64169b1 = drawableG;
        }
        if (drawableG2 != null) {
            this.f64187t1 = drawableG2;
        }
        if (drawableG3 != null) {
            this.f64175h1 = drawableG3;
        }
        if (drawableG4 != null) {
            this.f64181n1 = drawableG4;
        }
        this.T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RTextView_icon_width_left, 0);
        this.S0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RTextView_icon_height_left, 0);
        this.V0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RTextView_icon_width_right, 0);
        this.U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RTextView_icon_height_right, 0);
        this.Z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RTextView_icon_width_bottom, 0);
        this.Y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RTextView_icon_height_bottom, 0);
        this.X0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RTextView_icon_width_top, 0);
        this.W0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RTextView_icon_height_top, 0);
        this.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RTextView_icon_width, 0);
        this.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RTextView_icon_height, 0);
        this.R0 = typedArrayObtainStyledAttributes.getInt(R$styleable.RTextView_icon_direction, 1);
        this.f64192y1 = typedArrayObtainStyledAttributes.getColor(R$styleable.RTextView_text_color_normal, ((TextView) this.G0).getCurrentTextColor());
        this.f64193z1 = typedArrayObtainStyledAttributes.getColor(R$styleable.RTextView_text_color_pressed, 0);
        this.A1 = typedArrayObtainStyledAttributes.getColor(R$styleable.RTextView_text_color_unable, 0);
        this.B1 = typedArrayObtainStyledAttributes.getColor(R$styleable.RTextView_text_color_selected, 0);
        this.C1 = typedArrayObtainStyledAttributes.getColor(R$styleable.RTextView_text_color_checked, 0);
        this.F1 = typedArrayObtainStyledAttributes.getString(R$styleable.RTextView_text_typeface);
        this.G1 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RTextView_icon_with_text, false);
        typedArrayObtainStyledAttributes.recycle();
        y();
    }

    private void y() {
        if (!((TextView) this.G0).isEnabled()) {
            this.J0 = this.M0;
            this.f64168a1 = this.f64171d1;
            this.f64186s1 = this.f64189v1;
            this.f64174g1 = this.f64177j1;
            this.f64180m1 = this.f64183p1;
        } else if (((TextView) this.G0).isSelected()) {
            this.J0 = this.N0;
            this.f64168a1 = this.f64172e1;
            this.f64186s1 = this.f64190w1;
            this.f64174g1 = this.f64178k1;
            this.f64180m1 = this.f64184q1;
        } else if (M()) {
            this.J0 = this.O0;
            this.f64168a1 = this.f64173f1;
            this.f64186s1 = this.f64191x1;
            this.f64174g1 = this.f64179l1;
            this.f64180m1 = this.f64185r1;
        } else {
            this.J0 = this.K0;
            this.f64168a1 = this.f64169b1;
            this.f64186s1 = this.f64187t1;
            this.f64174g1 = this.f64175h1;
            this.f64180m1 = this.f64181n1;
        }
        int[][] iArr = this.E1;
        iArr[0] = new int[]{-16842910};
        iArr[1] = new int[]{R.attr.state_focused};
        iArr[2] = new int[]{R.attr.state_pressed};
        iArr[3] = new int[]{R.attr.state_checked};
        iArr[4] = new int[]{R.attr.state_selected};
        iArr[5] = new int[]{R.attr.state_enabled};
        z(true);
        c0();
        S();
        d0();
    }

    private void z(boolean z10) {
        if (z10) {
            this.H1 = this.f64193z1 != 0;
            this.I1 = this.A1 != 0;
            this.J1 = this.B1 != 0;
            this.K1 = this.C1 != 0;
        }
        if (!this.H1) {
            this.f64193z1 = this.f64192y1;
        }
        if (!this.I1) {
            this.A1 = this.f64192y1;
        }
        if (!this.J1) {
            this.B1 = this.f64192y1;
        }
        if (this.K1) {
            return;
        }
        this.C1 = this.f64192y1;
    }

    public void F() {
        if (N()) {
            b0();
        } else {
            Y();
        }
    }

    public final Drawable G(Context context, TypedArray typedArray, @StyleableRes int i10) {
        return typedArray.getDrawable(i10);
    }

    @Deprecated
    public Drawable H() {
        return this.K0;
    }

    public Drawable I() {
        return this.f64181n1;
    }

    public Drawable J() {
        return this.f64169b1;
    }

    public Drawable K() {
        return this.f64187t1;
    }

    public Drawable L() {
        return this.f64175h1;
    }

    public boolean M() {
        return false;
    }

    public boolean N() {
        return (this.K0 == null && this.L0 == null && this.M0 == null && this.N0 == null && this.O0 == null) ? false : true;
    }

    public void O(MotionEvent motionEvent) {
        if (!((TextView) this.G0).isEnabled() || M() || ((TextView) this.G0).isSelected()) {
            return;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            Drawable drawable = this.f64170c1;
            if (drawable != null) {
                this.f64168a1 = drawable;
            }
            Drawable drawable2 = this.f64188u1;
            if (drawable2 != null) {
                this.f64186s1 = drawable2;
            }
            Drawable drawable3 = this.f64176i1;
            if (drawable3 != null) {
                this.f64174g1 = drawable3;
            }
            Drawable drawable4 = this.f64182o1;
            if (drawable4 != null) {
                this.f64180m1 = drawable4;
            }
            Drawable drawable5 = this.L0;
            if (drawable5 != null) {
                this.J0 = drawable5;
            }
            S();
            return;
        }
        if (action != 1) {
            if (action == 2) {
                if (j((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    this.f64168a1 = this.f64169b1;
                    this.f64186s1 = this.f64187t1;
                    this.f64174g1 = this.f64175h1;
                    this.f64180m1 = this.f64181n1;
                    this.J0 = this.K0;
                    S();
                    return;
                }
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.f64168a1 = this.f64169b1;
        this.f64186s1 = this.f64187t1;
        this.f64174g1 = this.f64175h1;
        this.f64180m1 = this.f64181n1;
        this.J0 = this.K0;
        S();
    }

    public void P(boolean z10) {
        V(z10 ? this.f64173f1 : J());
        W(z10 ? this.f64191x1 : K());
        X(z10 ? this.f64179l1 : L());
        U(z10 ? this.f64185r1 : I());
        T(z10 ? this.O0 : H());
    }

    public final void Q(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable.setBounds(0, 0, this.T0, this.S0);
        }
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, this.V0, this.U0);
        }
        if (drawable3 != null) {
            drawable3.setBounds(0, 0, this.X0, this.W0);
        }
        if (drawable4 != null) {
            drawable4.setBounds(0, 0, this.Z0, this.Y0);
        }
        boolean zK = a.k();
        TextView textView = (TextView) this.G0;
        Drawable drawable5 = zK ? drawable2 : drawable;
        if (!zK) {
            drawable = drawable2;
        }
        textView.setCompoundDrawables(drawable5, drawable3, drawable, drawable4);
    }

    public void R(boolean z10) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        if (z10 || (drawable = this.f64171d1) == null) {
            drawable = this.f64169b1;
        }
        this.f64168a1 = drawable;
        if (z10 || (drawable2 = this.f64189v1) == null) {
            drawable2 = this.f64187t1;
        }
        this.f64186s1 = drawable2;
        if (z10 || (drawable3 = this.f64177j1) == null) {
            drawable3 = this.f64175h1;
        }
        this.f64174g1 = drawable3;
        if (z10 || (drawable4 = this.f64183p1) == null) {
            drawable4 = this.f64181n1;
        }
        this.f64180m1 = drawable4;
        if (z10 || (drawable5 = this.M0) == null) {
            drawable5 = this.K0;
        }
        this.J0 = drawable5;
        S();
    }

    public final void S() {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        if (this.S0 == 0 && this.T0 == 0 && (drawable5 = this.f64168a1) != null) {
            this.T0 = drawable5.getIntrinsicWidth();
            this.S0 = this.f64168a1.getIntrinsicHeight();
        }
        if (this.U0 == 0 && this.V0 == 0 && (drawable4 = this.f64186s1) != null) {
            this.V0 = drawable4.getIntrinsicWidth();
            this.U0 = this.f64186s1.getIntrinsicHeight();
        }
        if (this.W0 == 0 && this.X0 == 0 && (drawable3 = this.f64174g1) != null) {
            this.X0 = drawable3.getIntrinsicWidth();
            this.W0 = this.f64174g1.getIntrinsicHeight();
        }
        if (this.Y0 == 0 && this.Z0 == 0 && (drawable2 = this.f64180m1) != null) {
            this.Z0 = drawable2.getIntrinsicWidth();
            this.Y0 = this.f64180m1.getIntrinsicHeight();
        }
        if (this.P0 == 0 && this.Q0 == 0 && (drawable = this.J0) != null) {
            this.Q0 = drawable.getIntrinsicWidth();
            this.P0 = this.J0.getIntrinsicHeight();
        }
        if (N()) {
            a0(this.J0, this.Q0, this.P0, this.R0);
        } else {
            Q(this.f64168a1, this.f64186s1, this.f64174g1, this.f64180m1);
        }
    }

    @Deprecated
    public void T(Drawable drawable) {
        this.J0 = drawable;
        S();
    }

    public void U(Drawable drawable) {
        this.f64180m1 = drawable;
        S();
    }

    public void V(Drawable drawable) {
        this.f64168a1 = drawable;
        S();
    }

    public void W(Drawable drawable) {
        this.f64186s1 = drawable;
        S();
    }

    public void X(Drawable drawable) {
        this.f64174g1 = drawable;
        S();
    }

    public final void Y() {
        T t10;
        if (!this.G1 || (t10 = this.G0) == 0 || ((TextView) t10).getWidth() == 0) {
            return;
        }
        int compoundDrawablePadding = ((TextView) this.G0).getCompoundDrawablePadding();
        int i10 = this.f64168a1 != null ? compoundDrawablePadding + 0 : 0;
        if (this.f64186s1 != null) {
            i10 += compoundDrawablePadding;
        }
        int i11 = this.f64174g1 != null ? compoundDrawablePadding + 0 : 0;
        if (this.f64180m1 != null) {
            i11 += compoundDrawablePadding;
        }
        int i12 = i11;
        int i13 = this.T0 + this.V0;
        int i14 = this.W0 + this.Y0;
        int width = ((int) ((((TextView) this.G0).getWidth() - (this.L1 + this.M1)) - ((le.c.a().c((TextView) this.G0, i13, this.L1, this.M1, i10) + i13) + i10))) / 2;
        if (width < 0) {
            width = 0;
        }
        int height = ((int) ((((TextView) this.G0).getHeight() - (this.N1 + this.O1)) - ((Math.max(le.c.a().b((TextView) this.G0, i14, this.N1, this.O1, i12), Math.max(this.S0, this.U0)) + i14) + i12))) / 2;
        int i15 = height >= 0 ? height : 0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TextView) this.G0).getWidth());
        sb2.append(((TextView) this.G0).getHeight());
        sb2.append(width);
        sb2.append(this.L1);
        sb2.append(i15);
        sb2.append(this.N1);
        sb2.append(width);
        sb2.append(this.M1);
        sb2.append(i15);
        sb2.append(this.O1);
        String string = sb2.toString();
        if (string.equals(this.Q1)) {
            return;
        }
        this.Q1 = string;
        ((TextView) this.G0).setPadding(this.L1 + width, this.N1 + i15, width + this.M1, i15 + this.O1);
    }

    public void Z(boolean z10) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        if (((TextView) this.G0).isEnabled()) {
            if (!z10 || (drawable = this.f64172e1) == null) {
                drawable = this.f64169b1;
            }
            this.f64168a1 = drawable;
            if (!z10 || (drawable2 = this.f64190w1) == null) {
                drawable2 = this.f64187t1;
            }
            this.f64186s1 = drawable2;
            if (!z10 || (drawable3 = this.f64178k1) == null) {
                drawable3 = this.f64175h1;
            }
            this.f64174g1 = drawable3;
            if (!z10 || (drawable4 = this.f64184q1) == null) {
                drawable4 = this.f64181n1;
            }
            this.f64180m1 = drawable4;
            if (!z10 || (drawable5 = this.N0) == null) {
                drawable5 = this.K0;
            }
            this.J0 = drawable5;
            S();
        }
    }

    @Deprecated
    public final void a0(Drawable drawable, int i10, int i11, int i12) {
        if (drawable != null) {
            drawable.setBounds(0, 0, i10, i11);
        }
        if (a.k()) {
            TextView textView = (TextView) this.G0;
            Drawable drawable2 = i12 == 3 ? drawable : null;
            Drawable drawable3 = i12 == 2 ? drawable : null;
            Drawable drawable4 = i12 == 1 ? drawable : null;
            if (i12 != 4) {
                drawable = null;
            }
            textView.setCompoundDrawables(drawable2, drawable3, drawable4, drawable);
            return;
        }
        TextView textView2 = (TextView) this.G0;
        Drawable drawable5 = i12 == 1 ? drawable : null;
        Drawable drawable6 = i12 == 2 ? drawable : null;
        Drawable drawable7 = i12 == 3 ? drawable : null;
        if (i12 != 4) {
            drawable = null;
        }
        textView2.setCompoundDrawables(drawable5, drawable6, drawable7, drawable);
    }

    public final void b0() {
        T t10;
        int i10;
        if (!this.G1 || (t10 = this.G0) == 0 || ((TextView) t10).getWidth() == 0) {
            return;
        }
        int compoundDrawablePadding = ((TextView) this.G0).getCompoundDrawablePadding();
        int i11 = this.Q0;
        int i12 = this.P0;
        int i13 = this.R0;
        if (i13 == 1 || i13 == 3) {
            i12 = 0;
            i10 = 0;
        } else {
            i10 = compoundDrawablePadding;
        }
        if (i13 == 2 || i13 == 4) {
            compoundDrawablePadding = 0;
            i11 = 0;
        }
        int width = ((int) ((((TextView) this.G0).getWidth() - (this.L1 + this.M1)) - ((le.c.a().c((TextView) this.G0, i11, this.L1, this.M1, compoundDrawablePadding) + i11) + compoundDrawablePadding))) / 2;
        if (width < 0) {
            width = 0;
        }
        int height = ((int) ((((TextView) this.G0).getHeight() - (this.N1 + this.O1)) - ((Math.max(le.c.a().b((TextView) this.G0, i12, this.N1, this.O1, i10), Math.max(this.S0, this.U0)) + i12) + i10))) / 2;
        int i14 = height >= 0 ? height : 0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TextView) this.G0).getWidth());
        sb2.append(((TextView) this.G0).getHeight());
        sb2.append(width);
        sb2.append(this.L1);
        sb2.append(i14);
        sb2.append(this.N1);
        sb2.append(width);
        sb2.append(this.M1);
        sb2.append(i14);
        sb2.append(this.O1);
        String string = sb2.toString();
        if (string.equals(this.P1)) {
            return;
        }
        this.P1 = string;
        ((TextView) this.G0).setPadding(this.L1 + width, this.N1 + i14, width + this.M1, i14 + this.O1);
    }

    public void c0() {
        int i10 = this.f64193z1;
        ColorStateList colorStateList = new ColorStateList(this.E1, new int[]{this.A1, i10, i10, this.C1, this.B1, this.f64192y1});
        this.D1 = colorStateList;
        ((TextView) this.G0).setTextColor(colorStateList);
    }

    public final void d0() {
        if (TextUtils.isEmpty(this.F1)) {
            return;
        }
        ((TextView) this.G0).setTypeface(Typeface.createFromAsset(this.f64145p0.getAssets(), this.F1));
    }

    @Override // ie.a, android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        super.onGlobalLayout();
        this.L1 = ((TextView) this.G0).getPaddingLeft();
        this.M1 = ((TextView) this.G0).getPaddingRight();
        this.N1 = ((TextView) this.G0).getPaddingTop();
        this.O1 = ((TextView) this.G0).getPaddingBottom();
    }
}
