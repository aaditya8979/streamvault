package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.webkit.Profile;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Magnifier.kt */
/* JADX INFO: loaded from: classes6.dex */
@Stable
@ExperimentalFoundationApi
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B<\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fB>\b\u0017\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010 J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\t\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u000e\u001a\u00020\r8\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\fR\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/MagnifierStyle;", "", "other", "", "equals", "", "hashCode", "", "toString", "useTextDefault", "Z", "getUseTextDefault$foundation_release", "()Z", "Landroidx/compose/ui/unit/DpSize;", "size", "J", "getSize-MYxV2XQ$foundation_release", "()J", "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "F", "getCornerRadius-D9Ej5fM$foundation_release", "()F", "elevation", "getElevation-D9Ej5fM$foundation_release", "clippingEnabled", "getClippingEnabled$foundation_release", "fishEyeEnabled", "getFishEyeEnabled$foundation_release", "isSupported", "<init>", "(ZJFFZZLtn/i;)V", "(JFFZZLtn/i;)V", VastTagName.COMPANION, "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class MagnifierStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MagnifierStyle Default;

    @NotNull
    private static final MagnifierStyle TextDefault;
    private final boolean clippingEnabled;
    private final float cornerRadius;
    private final float elevation;
    private final boolean fishEyeEnabled;
    private final long size;
    private final boolean useTextDefault;

    /* JADX INFO: compiled from: Magnifier.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/MagnifierStyle$Companion;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/foundation/MagnifierStyle;", "getDefault$annotations", "getDefault", "()Landroidx/compose/foundation/MagnifierStyle;", "TextDefault", "getTextDefault$annotations", "getTextDefault", "isStyleSupported", "", "style", "sdkVersion", "", "isStyleSupported$foundation_release", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @ExperimentalFoundationApi
        public static /* synthetic */ void getDefault$annotations() {
        }

        @ExperimentalFoundationApi
        public static /* synthetic */ void getTextDefault$annotations() {
        }

        public static /* synthetic */ boolean isStyleSupported$foundation_release$default(Companion companion, MagnifierStyle magnifierStyle, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = Build.VERSION.SDK_INT;
            }
            return companion.isStyleSupported$foundation_release(magnifierStyle, i10);
        }

        @NotNull
        public final MagnifierStyle getDefault() {
            return MagnifierStyle.Default;
        }

        @NotNull
        public final MagnifierStyle getTextDefault() {
            return MagnifierStyle.TextDefault;
        }

        public final boolean isStyleSupported$foundation_release(@NotNull MagnifierStyle style, int sdkVersion) {
            p.k(style, "style");
            return MagnifierKt.isPlatformMagnifierSupported(sdkVersion) && !style.getFishEyeEnabled() && (style.getUseTextDefault() || p.f(style, getDefault()) || sdkVersion >= 29);
        }
    }

    static {
        MagnifierStyle magnifierStyle = new MagnifierStyle(0L, 0.0f, 0.0f, false, false, 31, (i) null);
        Default = magnifierStyle;
        TextDefault = new MagnifierStyle(true, magnifierStyle.size, magnifierStyle.cornerRadius, magnifierStyle.elevation, magnifierStyle.clippingEnabled, magnifierStyle.fishEyeEnabled, (i) null);
    }

    private MagnifierStyle(long j10, float f10, float f11, boolean z10, boolean z11) {
        this(false, j10, f10, f11, z10, z11, (i) null);
    }

    public /* synthetic */ MagnifierStyle(long j10, float f10, float f11, boolean z10, boolean z11, int i10, i iVar) {
        this((i10 & 1) != 0 ? DpSize.INSTANCE.m3933getUnspecifiedMYxV2XQ() : j10, (i10 & 2) != 0 ? Dp.INSTANCE.m3846getUnspecifiedD9Ej5fM() : f10, (i10 & 4) != 0 ? Dp.INSTANCE.m3846getUnspecifiedD9Ej5fM() : f11, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? false : z11, (i) null);
    }

    @ExperimentalFoundationApi
    public /* synthetic */ MagnifierStyle(long j10, float f10, float f11, boolean z10, boolean z11, i iVar) {
        this(j10, f10, f11, z10, z11);
    }

    private MagnifierStyle(boolean z10, long j10, float f10, float f11, boolean z11, boolean z12) {
        this.useTextDefault = z10;
        this.size = j10;
        this.cornerRadius = f10;
        this.elevation = f11;
        this.clippingEnabled = z11;
        this.fishEyeEnabled = z12;
    }

    public /* synthetic */ MagnifierStyle(boolean z10, long j10, float f10, float f11, boolean z11, boolean z12, i iVar) {
        this(z10, j10, f10, f11, z11, z12);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MagnifierStyle)) {
            return false;
        }
        MagnifierStyle magnifierStyle = (MagnifierStyle) other;
        return this.useTextDefault == magnifierStyle.useTextDefault && DpSize.m3921equalsimpl0(this.size, magnifierStyle.size) && Dp.m3831equalsimpl0(this.cornerRadius, magnifierStyle.cornerRadius) && Dp.m3831equalsimpl0(this.elevation, magnifierStyle.elevation) && this.clippingEnabled == magnifierStyle.clippingEnabled && this.fishEyeEnabled == magnifierStyle.fishEyeEnabled;
    }

    /* JADX INFO: renamed from: getClippingEnabled$foundation_release, reason: from getter */
    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    /* JADX INFO: renamed from: getCornerRadius-D9Ej5fM$foundation_release, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM$foundation_release, reason: not valid java name and from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: getFishEyeEnabled$foundation_release, reason: from getter */
    public final boolean getFishEyeEnabled() {
        return this.fishEyeEnabled;
    }

    /* JADX INFO: renamed from: getSize-MYxV2XQ$foundation_release, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: getUseTextDefault$foundation_release, reason: from getter */
    public final boolean getUseTextDefault() {
        return this.useTextDefault;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.useTextDefault) * 31) + DpSize.m3926hashCodeimpl(this.size)) * 31) + Dp.m3832hashCodeimpl(this.cornerRadius)) * 31) + Dp.m3832hashCodeimpl(this.elevation)) * 31) + Boolean.hashCode(this.clippingEnabled)) * 31) + Boolean.hashCode(this.fishEyeEnabled);
    }

    public final boolean isSupported() {
        return Companion.isStyleSupported$foundation_release$default(INSTANCE, this, 0, 2, null);
    }

    @NotNull
    public String toString() {
        if (this.useTextDefault) {
            return "MagnifierStyle.TextDefault";
        }
        return "MagnifierStyle(size=" + ((Object) DpSize.m3931toStringimpl(this.size)) + ", cornerRadius=" + ((Object) Dp.m3837toStringimpl(this.cornerRadius)) + ", elevation=" + ((Object) Dp.m3837toStringimpl(this.elevation)) + ", clippingEnabled=" + this.clippingEnabled + ", fishEyeEnabled=" + this.fishEyeEnabled + ')';
    }
}
