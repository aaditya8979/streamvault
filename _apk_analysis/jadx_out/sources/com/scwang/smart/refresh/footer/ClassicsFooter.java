package com.scwang.smart.refresh.footer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.scwang.smart.refresh.classics.ClassicsAbstract;
import com.scwang.smart.refresh.footer.classics.R$id;
import com.scwang.smart.refresh.footer.classics.R$layout;
import com.scwang.smart.refresh.footer.classics.R$string;
import com.scwang.smart.refresh.footer.classics.R$styleable;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import oe.c;
import oe.f;
import se.b;

/* JADX INFO: loaded from: classes8.dex */
public class ClassicsFooter extends ClassicsAbstract<ClassicsFooter> implements c {
    public static String C;
    public static String D;
    public static String E;
    public static String F;
    public static String G;
    public static String H;
    public static String I;
    public String A;
    public boolean B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f53231u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f53232v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f53233w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f53234x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f53235y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f53236z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53237a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f53237a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53237a[RefreshState.PullUpToLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53237a[RefreshState.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53237a[RefreshState.LoadReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53237a[RefreshState.ReleaseToLoad.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53237a[RefreshState.Refreshing.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ClassicsFooter(Context context) {
        this(context, null);
    }

    public ClassicsFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.B = false;
        View.inflate(context, R$layout.srl_classics_footer, this);
        ImageView imageView = (ImageView) findViewById(R$id.srl_classics_arrow);
        this.f53210f = imageView;
        ImageView imageView2 = (ImageView) findViewById(R$id.srl_classics_progress);
        this.f53211g = imageView2;
        this.f53209e = (TextView) findViewById(R$id.srl_classics_title);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClassicsFooter);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClassicsFooter_srlDrawableMarginRight, b.c(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        int i10 = R$styleable.ClassicsFooter_srlDrawableArrowSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i10, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i10, layoutParams.height);
        int i11 = R$styleable.ClassicsFooter_srlDrawableProgressSize;
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i11, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i11, layoutParams2.height);
        int i12 = R$styleable.ClassicsFooter_srlDrawableSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams2.height);
        this.f53218n = typedArrayObtainStyledAttributes.getInt(R$styleable.ClassicsFooter_srlFinishDuration, this.f53218n);
        this.f78899c = pe.b.f77290i[typedArrayObtainStyledAttributes.getInt(R$styleable.ClassicsFooter_srlClassicsSpinnerStyle, this.f78899c.f77291a)];
        int i13 = R$styleable.ClassicsFooter_srlDrawableArrow;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f53210f.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i13));
        } else if (this.f53210f.getDrawable() == null) {
            ne.a aVar = new ne.a();
            this.f53213i = aVar;
            aVar.a(-10066330);
            this.f53210f.setImageDrawable(this.f53213i);
        }
        int i14 = R$styleable.ClassicsFooter_srlDrawableProgress;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f53211g.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i14));
        } else if (this.f53211g.getDrawable() == null) {
            me.b bVar = new me.b();
            this.f53214j = bVar;
            bVar.a(-10066330);
            this.f53211g.setImageDrawable(this.f53214j);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.ClassicsFooter_srlTextSizeTitle)) {
            this.f53209e.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(r3, b.c(16.0f)));
        }
        int i15 = R$styleable.ClassicsFooter_srlPrimaryColor;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            super.t(typedArrayObtainStyledAttributes.getColor(i15, 0));
        }
        int i16 = R$styleable.ClassicsFooter_srlAccentColor;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            super.s(typedArrayObtainStyledAttributes.getColor(i16, 0));
        }
        int i17 = R$styleable.ClassicsFooter_srlTextPulling;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            this.f53231u = typedArrayObtainStyledAttributes.getString(i17);
        } else {
            String str = C;
            if (str != null) {
                this.f53231u = str;
            } else {
                this.f53231u = context.getString(R$string.srl_footer_pulling);
            }
        }
        int i18 = R$styleable.ClassicsFooter_srlTextRelease;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            this.f53232v = typedArrayObtainStyledAttributes.getString(i18);
        } else {
            String str2 = D;
            if (str2 != null) {
                this.f53232v = str2;
            } else {
                this.f53232v = context.getString(R$string.srl_footer_release);
            }
        }
        int i19 = R$styleable.ClassicsFooter_srlTextLoading;
        if (typedArrayObtainStyledAttributes.hasValue(i19)) {
            this.f53233w = typedArrayObtainStyledAttributes.getString(i19);
        } else {
            String str3 = E;
            if (str3 != null) {
                this.f53233w = str3;
            } else {
                this.f53233w = context.getString(R$string.srl_footer_loading);
            }
        }
        int i20 = R$styleable.ClassicsFooter_srlTextRefreshing;
        if (typedArrayObtainStyledAttributes.hasValue(i20)) {
            this.f53234x = typedArrayObtainStyledAttributes.getString(i20);
        } else {
            String str4 = F;
            if (str4 != null) {
                this.f53234x = str4;
            } else {
                this.f53234x = context.getString(R$string.srl_footer_refreshing);
            }
        }
        int i21 = R$styleable.ClassicsFooter_srlTextFinish;
        if (typedArrayObtainStyledAttributes.hasValue(i21)) {
            this.f53235y = typedArrayObtainStyledAttributes.getString(i21);
        } else {
            String str5 = G;
            if (str5 != null) {
                this.f53235y = str5;
            } else {
                this.f53235y = context.getString(R$string.srl_footer_finish);
            }
        }
        int i22 = R$styleable.ClassicsFooter_srlTextFailed;
        if (typedArrayObtainStyledAttributes.hasValue(i22)) {
            this.f53236z = typedArrayObtainStyledAttributes.getString(i22);
        } else {
            String str6 = H;
            if (str6 != null) {
                this.f53236z = str6;
            } else {
                this.f53236z = context.getString(R$string.srl_footer_failed);
            }
        }
        int i23 = R$styleable.ClassicsFooter_srlTextNothing;
        if (typedArrayObtainStyledAttributes.hasValue(i23)) {
            this.A = typedArrayObtainStyledAttributes.getString(i23);
        } else {
            String str7 = I;
            if (str7 != null) {
                this.A = str7;
            } else {
                this.A = context.getString(R$string.srl_footer_nothing);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        this.f53209e.setText(isInEditMode() ? this.f53233w : this.f53231u);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
    }

    @Override // re.b, oe.c
    public boolean a(boolean z10) {
        if (this.B == z10) {
            return true;
        }
        this.B = z10;
        ImageView imageView = this.f53210f;
        if (z10) {
            this.f53209e.setText(this.A);
            imageView.setVisibility(8);
            return true;
        }
        this.f53209e.setText(this.f53231u);
        imageView.setVisibility(0);
        return true;
    }

    @Override // re.b, qe.h
    public void b(@NonNull f fVar, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        ImageView imageView = this.f53210f;
        if (this.B) {
            return;
        }
        switch (a.f53237a[refreshState2.ordinal()]) {
            case 1:
                imageView.setVisibility(0);
                break;
            case 2:
                break;
            case 3:
            case 4:
                imageView.setVisibility(8);
                this.f53209e.setText(this.f53233w);
                return;
            case 5:
                this.f53209e.setText(this.f53232v);
                imageView.animate().rotation(0.0f);
                return;
            case 6:
                this.f53209e.setText(this.f53234x);
                imageView.setVisibility(8);
                return;
            default:
                return;
        }
        this.f53209e.setText(this.f53231u);
        imageView.animate().rotation(180.0f);
    }

    @Override // com.scwang.smart.refresh.classics.ClassicsAbstract, re.b, oe.a
    public int j(@NonNull f fVar, boolean z10) {
        super.j(fVar, z10);
        if (this.B) {
            return 0;
        }
        this.f53209e.setText(z10 ? this.f53235y : this.f53236z);
        return this.f53218n;
    }

    @Override // com.scwang.smart.refresh.classics.ClassicsAbstract, re.b, oe.a
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (this.f78899c == pe.b.f77287f) {
            super.setPrimaryColors(iArr);
        }
    }
}
