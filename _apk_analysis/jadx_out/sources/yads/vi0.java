package yads;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;

/* JADX INFO: loaded from: classes9.dex */
public final class vi0 implements DivTypefaceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f96105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bn.g f96106b;

    public vi0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f96105a = applicationContext != null ? applicationContext : context;
        this.f96106b = kotlin.b.b(new ui0(this));
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getBold() {
        Typeface typeface;
        yw0 yw0Var = (yw0) this.f96106b.getValue();
        return (yw0Var == null || (typeface = yw0Var.f97314d) == null) ? Typeface.DEFAULT_BOLD : typeface;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getLight() {
        yw0 yw0Var = (yw0) this.f96106b.getValue();
        if (yw0Var != null) {
            return yw0Var.f97311a;
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getMedium() {
        yw0 yw0Var = (yw0) this.f96106b.getValue();
        if (yw0Var != null) {
            return yw0Var.f97313c;
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getRegular() {
        yw0 yw0Var = (yw0) this.f96106b.getValue();
        if (yw0Var != null) {
            return yw0Var.f97312b;
        }
        return null;
    }
}
