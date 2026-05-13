package com.mgs.carparking.basecommon.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatTextView;
import com.mgs.carparking.R$styleable;
import vb.b;

/* JADX INFO: loaded from: classes2.dex */
public class VariedTextView extends AppCompatTextView implements b.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f42525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public vb.a f42526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f42527d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Typeface f42528a;

        public static synchronized Typeface a(Context context) {
            if (f42528a == null) {
                try {
                    f42528a = Typeface.createFromAsset(context.getAssets(), "iconfont.ttf");
                } catch (Exception unused) {
                }
            }
            return f42528a;
        }
    }

    public static class b extends vb.b {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public VariedTextView f42529o;

        public b(VariedTextView variedTextView) {
            this.f42529o = variedTextView;
        }
    }

    public VariedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public VariedTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c(context, attributeSet);
    }

    private void setShape(vb.b bVar) {
        wb.a aVarE = bVar.f() != 0.0f ? wb.a.i().f(bVar.getType()).j(bVar.f()).e(bVar.j(), bVar.i()) : wb.a.i().f(bVar.getType()).d(bVar.k(), bVar.l(), bVar.a(), bVar.b()).e(bVar.j(), bVar.i());
        if (bVar.e() == null || bVar.h() == null || bVar.d() == null) {
            aVarE.k(bVar.g());
        } else if (bVar.c() != null) {
            aVarE.a(bVar.e(), b(bVar.h()), b(bVar.c()), b(bVar.d()));
        } else {
            aVarE.c(bVar.e(), b(bVar.h()), b(bVar.d()));
        }
        aVarE.h(this);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom() + 1);
    }

    public void a() {
        b bVar = this.f42525b;
        if (bVar != null) {
            setShape(bVar);
        }
    }

    public final int b(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), 0);
    }

    public final void c(Context context, AttributeSet attributeSet) {
        this.f42527d = context;
        b bVar = new b(this);
        this.f42525b = bVar;
        setTypeface(a.a(getContext()));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = null;
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VariedTextView);
                bVar.f85939b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(12, 0);
                bVar.f85940c = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
                bVar.f85941d = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
                bVar.f85942e = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
                bVar.f85943f = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
                bVar.f85948k = d(typedArrayObtainStyledAttributes.getInt(2, 0));
                bVar.f85944g = typedArrayObtainStyledAttributes.getColor(10, -1);
                bVar.f85945h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(11, 0);
                bVar.f85946i = typedArrayObtainStyledAttributes.getColor(8, -1);
                bVar.f85947j = typedArrayObtainStyledAttributes.getInteger(7, 0);
                a();
            } catch (Exception unused) {
                if (typedArrayObtainStyledAttributes == null) {
                    return;
                }
            } catch (Throwable th2) {
                if (typedArrayObtainStyledAttributes != null) {
                    typedArrayObtainStyledAttributes.recycle();
                }
                throw th2;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final GradientDrawable.Orientation d(int i10) {
        switch (i10) {
            case 0:
                return GradientDrawable.Orientation.TOP_BOTTOM;
            case 1:
                return GradientDrawable.Orientation.TR_BL;
            case 2:
                return GradientDrawable.Orientation.RIGHT_LEFT;
            case 3:
                return GradientDrawable.Orientation.BR_TL;
            case 4:
                return GradientDrawable.Orientation.BOTTOM_TOP;
            case 5:
                return GradientDrawable.Orientation.BL_TR;
            case 6:
                return GradientDrawable.Orientation.LEFT_RIGHT;
            case 7:
                return GradientDrawable.Orientation.TL_BR;
            default:
                return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        vb.a aVar;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            vb.a aVar2 = this.f42526c;
            if (aVar2 == null || aVar2.a() == null) {
                return;
            }
            this.f42526c.a().m(this);
            return;
        }
        if ((i10 != 4 && i10 != 8) || (aVar = this.f42526c) == null || aVar.a() == null) {
            return;
        }
        this.f42526c.a().m(null);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        vb.a aVar = this.f42526c;
        if (aVar != null && z10) {
            if (aVar.b() != null) {
                setShape(this.f42526c.b());
            } else if (this.f42526c.c() != null) {
                setShape(this.f42526c.c());
            }
        }
        super.setEnabled(z10);
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z10) {
        vb.a aVar = this.f42526c;
        if (aVar != null) {
            if (z10) {
                if (aVar.a() != null) {
                    setShape(this.f42526c.a());
                } else if (this.f42526c.b() != null) {
                    setShape(this.f42526c.b());
                }
            } else if (aVar.b() != null) {
                setShape(this.f42526c.b());
            }
        }
        super.setSelected(z10);
    }
}
