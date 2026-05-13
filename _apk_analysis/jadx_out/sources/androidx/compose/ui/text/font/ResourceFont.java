package androidx.compose.ui.text.font;

import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.ui.text.ExperimentalTextApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Font.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B2\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b \u0010!J1\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ=\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R)\u0010\f\u001a\u00020\u000b8WX\u0097\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "", "resId", "Landroidx/compose/ui/text/font/FontWeight;", ActivityChooserModel.ATTRIBUTE_WEIGHT, "Landroidx/compose/ui/text/font/FontStyle;", "style", "copy-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/ResourceFont;", "copy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "loadingStrategy", "copy-YpTlLL0", "(ILandroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/ui/text/font/ResourceFont;", "", "other", "", "equals", "hashCode", "", "toString", "I", "getResId", "()I", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getStyle-_-LCdwA", "getLoadingStrategy-PKNRLFQ", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "<init>", "(ILandroidx/compose/ui/text/font/FontWeight;IILtn/i;)V", "ui-text_release"}, k = 1, mv = {1, 6, 0})
public final class ResourceFont implements Font {
    private final int loadingStrategy;
    private final int resId;
    private final int style;

    @NotNull
    private final FontWeight weight;

    private ResourceFont(int i10, FontWeight fontWeight, int i11, int i12) {
        this.resId = i10;
        this.weight = fontWeight;
        this.style = i11;
        this.loadingStrategy = i12;
    }

    public /* synthetic */ ResourceFont(int i10, FontWeight fontWeight, int i11, int i12, int i13, i iVar) {
        this(i10, (i13 & 2) != 0 ? FontWeight.INSTANCE.getNormal() : fontWeight, (i13 & 4) != 0 ? FontStyle.INSTANCE.m3557getNormal_LCdwA() : i11, (i13 & 8) != 0 ? FontLoadingStrategy.INSTANCE.m3543getAsyncPKNRLFQ() : i12, null);
    }

    public /* synthetic */ ResourceFont(int i10, FontWeight fontWeight, int i11, int i12, i iVar) {
        this(i10, fontWeight, i11, i12);
    }

    /* JADX INFO: renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m3583copyRetOiIg$default(ResourceFont resourceFont, int i10, FontWeight fontWeight, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = resourceFont.resId;
        }
        if ((i12 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i12 & 4) != 0) {
            i11 = resourceFont.getStyle();
        }
        return resourceFont.m3586copyRetOiIg(i10, fontWeight, i11);
    }

    /* JADX INFO: renamed from: copy-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m3584copyYpTlLL0$default(ResourceFont resourceFont, int i10, FontWeight fontWeight, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = resourceFont.resId;
        }
        if ((i13 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i13 & 4) != 0) {
            i11 = resourceFont.getStyle();
        }
        if ((i13 & 8) != 0) {
            i12 = resourceFont.getLoadingStrategy();
        }
        return resourceFont.m3587copyYpTlLL0(i10, fontWeight, i11, i12);
    }

    @ExperimentalTextApi
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m3585getLoadingStrategyPKNRLFQ$annotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: copy-RetOiIg, reason: not valid java name */
    public final ResourceFont m3586copyRetOiIg(int resId, @NotNull FontWeight weight, int style) {
        p.k(weight, ActivityChooserModel.ATTRIBUTE_WEIGHT);
        return m3587copyYpTlLL0(resId, weight, style, getLoadingStrategy());
    }

    @ExperimentalTextApi
    @NotNull
    /* JADX INFO: renamed from: copy-YpTlLL0, reason: not valid java name */
    public final ResourceFont m3587copyYpTlLL0(int resId, @NotNull FontWeight weight, int style, int loadingStrategy) {
        p.k(weight, ActivityChooserModel.ATTRIBUTE_WEIGHT);
        return new ResourceFont(resId, weight, style, loadingStrategy, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) other;
        return this.resId == resourceFont.resId && p.f(getWeight(), resourceFont.getWeight()) && FontStyle.m3552equalsimpl0(getStyle(), resourceFont.getStyle()) && FontLoadingStrategy.m3539equalsimpl0(getLoadingStrategy(), resourceFont.getLoadingStrategy());
    }

    @Override // androidx.compose.ui.text.font.Font
    @ExperimentalTextApi
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ, reason: from getter */
    public int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getStyle-_-LCdwA, reason: from getter */
    public int getStyle() {
        return this.style;
    }

    @Override // androidx.compose.ui.text.font.Font
    @NotNull
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((this.resId * 31) + getWeight().hashCode()) * 31) + FontStyle.m3553hashCodeimpl(getStyle())) * 31) + FontLoadingStrategy.m3540hashCodeimpl(getLoadingStrategy());
    }

    @NotNull
    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m3554toStringimpl(getStyle())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.m3541toStringimpl(getLoadingStrategy())) + ')';
    }
}
