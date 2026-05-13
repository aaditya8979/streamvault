package w9;

import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import xl.k;

/* JADX INFO: compiled from: RxView.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    @NonNull
    @CheckResult
    public static k<Object> a(@NonNull View view) {
        v9.b.b(view, "view == null");
        return new b(view);
    }

    @NonNull
    @CheckResult
    public static k<Object> b(@NonNull View view) {
        v9.b.b(view, "view == null");
        return new c(view, v9.a.f85930b);
    }
}
