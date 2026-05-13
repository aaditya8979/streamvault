package ve;

import androidx.annotation.Nullable;
import com.tiktok.TikTokBusinessSdk;
import org.json.JSONObject;

/* JADX INFO: compiled from: TTUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f86029a = new a(b.class.getName(), TikTokBusinessSdk.a());

    public static JSONObject a(@Nullable Long l10) {
        if (l10 == null) {
            l10 = Long.valueOf(System.currentTimeMillis());
        }
        try {
            return new JSONObject().put("ts", l10);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }
}
