package ah;

import android.net.Uri;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivActionTyped;
import com.yandex.div2.DivDownloadCallbacks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSightAction.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface c9 {
    @Nullable
    DivDownloadCallbacks a();

    @NotNull
    Expression<String> b();

    @NotNull
    Expression<Long> c();

    @Nullable
    DivActionTyped d();

    @Nullable
    String e();

    @Nullable
    Expression<Uri> f();

    @Nullable
    JSONObject getPayload();

    @Nullable
    Expression<Uri> getUrl();

    @NotNull
    Expression<Boolean> isEnabled();
}
