package s3;

import android.content.Context;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: MintegralFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface b {
    void a(@NotNull Context context, @NotNull String str, @NotNull String str2);

    void b(@NotNull NewInterstitialWithCodeListener newInterstitialWithCodeListener);

    void loadFromBid(@NotNull String str);

    void playVideoMute(int i10);

    void setExtraInfo(@NotNull JSONObject jSONObject);

    void showFromBid();
}
