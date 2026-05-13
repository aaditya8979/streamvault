package n5;

import a6.k0;
import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: CaptionStyleCompat.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f75118g = new a(-1, ViewCompat.MEASURED_STATE_MASK, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f75122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f75123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Typeface f75124f;

    public a(int i10, int i11, int i12, int i13, int i14, @Nullable Typeface typeface) {
        this.f75119a = i10;
        this.f75120b = i11;
        this.f75121c = i12;
        this.f75122d = i13;
        this.f75123e = i14;
        this.f75124f = typeface;
    }

    @TargetApi(19)
    public static a a(CaptioningManager.CaptionStyle captionStyle) {
        return k0.f3574a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    @TargetApi(19)
    public static a b(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @TargetApi(21)
    public static a c(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f75118g.f75119a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f75118g.f75120b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f75118g.f75121c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f75118g.f75122d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f75118g.f75123e, captionStyle.getTypeface());
    }
}
