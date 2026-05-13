package s3;

import android.view.ViewGroup;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: MintegralFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface j {
    void a();

    void b(@NotNull String str, @NotNull String str2);

    void c(@NotNull MBSplashLoadWithCodeListener mBSplashLoadWithCodeListener);

    void d(@NotNull ViewGroup viewGroup, @NotNull String str);

    void e(@NotNull String str);

    void f(@NotNull MBSplashShowListener mBSplashShowListener);

    void g(@NotNull ViewGroup viewGroup);

    void onDestroy();

    void setExtraInfo(@NotNull JSONObject jSONObject);
}
