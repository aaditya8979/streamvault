package x9;

import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: RxTextView.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    @NonNull
    @CheckResult
    public static u9.a<c> a(@NonNull TextView textView) {
        v9.b.b(textView, "view == null");
        return new d(textView);
    }
}
