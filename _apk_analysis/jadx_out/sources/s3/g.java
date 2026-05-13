package s3;

import android.content.Context;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MintegralFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface g {
    void a(@NotNull Context context, @NotNull String str, @NotNull String str2);

    void b(@NotNull NewInterstitialWithCodeListener newInterstitialWithCodeListener);

    void load();

    void playVideoMute(int i10);

    void show();
}
