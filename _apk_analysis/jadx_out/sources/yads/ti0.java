package yads;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class ti0 implements DivTypefaceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rw0 f95239a;

    public /* synthetic */ ti0(Context context) {
        this(new rw0(context.getApplicationContext()));
    }

    public ti0(rw0 rw0Var) {
        this.f95239a = rw0Var;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getBold() {
        Typeface typefaceA = this.f95239a.f94627b.a(sw0.f94961b);
        return typefaceA == null ? DivTypefaceProvider.DEFAULT.getBold() : typefaceA;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getLight() {
        Typeface typefaceA = this.f95239a.f94627b.a(sw0.f94962c);
        return typefaceA == null ? DivTypefaceProvider.DEFAULT.getLight() : typefaceA;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getMedium() {
        Typeface typefaceA = this.f95239a.f94627b.a(sw0.f94963d);
        return typefaceA == null ? DivTypefaceProvider.DEFAULT.getMedium() : typefaceA;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getRegular() {
        Typeface typefaceA = this.f95239a.f94627b.a(sw0.f94964e);
        return typefaceA == null ? DivTypefaceProvider.DEFAULT.getRegular() : typefaceA;
    }
}
