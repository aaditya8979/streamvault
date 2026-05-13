package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Rect f84196a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Rect f84197b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Rect f84198c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Rect f84199d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Rect f84200e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Rect f84201f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Rect f84202g = new Rect();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Rect f84203h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private final Context f84204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f84205j;

    public j(Context context, float f10) {
        this.f84204i = context.getApplicationContext();
        this.f84205j = f10;
    }

    public final void a(Rect rect, Rect rect2) {
        rect2.set(sg.bigo.ads.common.utils.e.a(this.f84204i, rect.left), sg.bigo.ads.common.utils.e.a(this.f84204i, rect.top), sg.bigo.ads.common.utils.e.a(this.f84204i, rect.right), sg.bigo.ads.common.utils.e.a(this.f84204i, rect.bottom));
    }
}
