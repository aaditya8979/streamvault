package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import bn.g;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: LayoutIntrinsics.kt */
/* JADX INFO: loaded from: classes2.dex */
@InternalPlatformTextApi
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/android/LayoutIntrinsics;", "", "Landroid/text/BoringLayout$Metrics;", "boringMetrics$delegate", "Lbn/g;", "getBoringMetrics", "()Landroid/text/BoringLayout$Metrics;", "boringMetrics", "", "minIntrinsicWidth$delegate", "getMinIntrinsicWidth", "()F", "minIntrinsicWidth", "maxIntrinsicWidth$delegate", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "", "charSequence", "Landroid/text/TextPaint;", "textPaint", "", "textDirectionHeuristic", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", "ui-text_release"}, k = 1, mv = {1, 6, 0})
public final class LayoutIntrinsics {

    /* JADX INFO: renamed from: boringMetrics$delegate, reason: from kotlin metadata */
    @NotNull
    private final g boringMetrics;

    /* JADX INFO: renamed from: maxIntrinsicWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final g maxIntrinsicWidth;

    /* JADX INFO: renamed from: minIntrinsicWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final g minIntrinsicWidth;

    public LayoutIntrinsics(@NotNull final CharSequence charSequence, @NotNull final TextPaint textPaint, final int i10) {
        p.k(charSequence, "charSequence");
        p.k(textPaint, "textPaint");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.boringMetrics = kotlin.b.a(lazyThreadSafetyMode, new sn.a<BoringLayout.Metrics>() { // from class: androidx.compose.ui.text.android.LayoutIntrinsics$boringMetrics$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @Nullable
            public final BoringLayout.Metrics invoke() {
                return BoringLayoutFactory.INSTANCE.measure(charSequence, textPaint, TextLayoutKt.getTextDirectionHeuristic(i10));
            }
        });
        this.minIntrinsicWidth = kotlin.b.a(lazyThreadSafetyMode, new sn.a<Float>() { // from class: androidx.compose.ui.text.android.LayoutIntrinsics$minIntrinsicWidth$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final Float invoke() {
                return Float.valueOf(LayoutIntrinsicsKt.minIntrinsicWidth(charSequence, textPaint));
            }
        });
        this.maxIntrinsicWidth = kotlin.b.a(lazyThreadSafetyMode, new sn.a<Float>() { // from class: androidx.compose.ui.text.android.LayoutIntrinsics$maxIntrinsicWidth$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final Float invoke() {
                float desiredWidth;
                BoringLayout.Metrics boringMetrics = this.this$0.getBoringMetrics();
                if (boringMetrics != null) {
                    desiredWidth = boringMetrics.width;
                } else {
                    CharSequence charSequence2 = charSequence;
                    desiredWidth = Layout.getDesiredWidth(charSequence2, 0, charSequence2.length(), textPaint);
                }
                if (LayoutIntrinsicsKt.shouldIncreaseMaxIntrinsic(desiredWidth, charSequence, textPaint)) {
                    desiredWidth += 0.5f;
                }
                return Float.valueOf(desiredWidth);
            }
        });
    }

    @Nullable
    public final BoringLayout.Metrics getBoringMetrics() {
        return (BoringLayout.Metrics) this.boringMetrics.getValue();
    }

    public final float getMaxIntrinsicWidth() {
        return ((Number) this.maxIntrinsicWidth.getValue()).floatValue();
    }

    public final float getMinIntrinsicWidth() {
        return ((Number) this.minIntrinsicWidth.getValue()).floatValue();
    }
}
