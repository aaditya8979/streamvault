package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import bn.g;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.accompanist.drawablepainter.DrawablePainter$callback$2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import vn.c;
import zn.n;

/* JADX INFO: compiled from: DrawablePainter.kt */
/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b/\u00100J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0012\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\f\u0010\u0012\u001a\u00020\u0003*\u00020\u0011H\u0014R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R+\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R4\u0010(\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001b\u0010,\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010*\u001a\u0004\b#\u0010+R\u001d\u0010.\u001a\u00020\"8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b-\u0010%\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "Lbn/r;", "onRemembered", "onAbandoned", "onForgotten", "", "alpha", "", "applyAlpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "applyLayoutDirection", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDraw", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", InneractiveMediationDefs.GENDER_FEMALE, "()Landroid/graphics/drawable/Drawable;", "drawable", "", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "e", "()I", "h", "(I)V", "drawInvalidateTick", "Landroidx/compose/ui/geometry/Size;", "d", "g", "()J", "i", "(J)V", "drawableIntrinsicSize", "Landroid/graphics/drawable/Drawable$Callback;", "Lbn/g;", "()Landroid/graphics/drawable/Drawable$Callback;", "callback", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "drawablepainter_release"}, k = 1, mv = {1, 7, 1})
public final class DrawablePainter extends Painter implements RememberObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Drawable drawable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState drawInvalidateTick;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState drawableIntrinsicSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g callback;

    /* JADX INFO: compiled from: DrawablePainter.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DrawablePainter(@NotNull Drawable drawable) {
        p.k(drawable, "drawable");
        this.drawable = drawable;
        this.drawInvalidateTick = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.drawableIntrinsicSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m1440boximpl(DrawablePainterKt.c(drawable)), null, 2, null);
        this.callback = b.b(new sn.a<DrawablePainter$callback$2.a>() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2

            /* JADX INFO: compiled from: DrawablePainter.kt */
            @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"com/google/accompanist/drawablepainter/DrawablePainter$callback$2$a", "Landroid/graphics/drawable/Drawable$Callback;", "Landroid/graphics/drawable/Drawable;", "d", "Lbn/r;", "invalidateDrawable", "Ljava/lang/Runnable;", "what", "", "time", "scheduleDrawable", "unscheduleDrawable", "drawablepainter_release"}, k = 1, mv = {1, 7, 1})
            public static final class a implements Drawable.Callback {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DrawablePainter f19756b;

                public a(DrawablePainter drawablePainter) {
                    this.f19756b = drawablePainter;
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public void invalidateDrawable(@NotNull Drawable drawable) {
                    p.k(drawable, "d");
                    DrawablePainter drawablePainter = this.f19756b;
                    drawablePainter.h(drawablePainter.e() + 1);
                    DrawablePainter drawablePainter2 = this.f19756b;
                    drawablePainter2.i(DrawablePainterKt.c(drawablePainter2.getDrawable()));
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public void scheduleDrawable(@NotNull Drawable drawable, @NotNull Runnable runnable, long j10) {
                    p.k(drawable, "d");
                    p.k(runnable, "what");
                    DrawablePainterKt.d().postAtTime(runnable, j10);
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public void unscheduleDrawable(@NotNull Drawable drawable, @NotNull Runnable runnable) {
                    p.k(drawable, "d");
                    p.k(runnable, "what");
                    DrawablePainterKt.d().removeCallbacks(runnable);
                }
            }

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final a invoke() {
                return new a(this.this$0);
            }
        });
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float alpha) {
        this.drawable.setAlpha(n.n(c.d(alpha * 255), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        p.k(layoutDirection, "layoutDirection");
        Drawable drawable = this.drawable;
        int i10 = a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return drawable.setLayoutDirection(i11);
    }

    public final Drawable.Callback d() {
        return (Drawable.Callback) this.callback.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int e() {
        return ((Number) this.drawInvalidateTick.getValue()).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Drawable getDrawable() {
        return this.drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long g() {
        return ((Size) this.drawableIntrinsicSize.getValue()).getPackedValue();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        return g();
    }

    public final void h(int i10) {
        this.drawInvalidateTick.setValue(Integer.valueOf(i10));
    }

    public final void i(long j10) {
        this.drawableIntrinsicSize.setValue(Size.m1440boximpl(j10));
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        onForgotten();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        p.k(drawScope, "<this>");
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        e();
        this.drawable.setBounds(0, 0, c.d(Size.m1452getWidthimpl(drawScope.mo2113getSizeNHjbRc())), c.d(Size.m1449getHeightimpl(drawScope.mo2113getSizeNHjbRc())));
        try {
            canvas.save();
            this.drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        } finally {
            canvas.restore();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Object obj = this.drawable;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.drawable.setVisible(false, false);
        this.drawable.setCallback(null);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.drawable.setCallback(d());
        this.drawable.setVisible(true, true);
        Object obj = this.drawable;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }
}
