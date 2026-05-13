package s3;

import android.content.Context;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MintegralFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface h {
    void a(@NotNull Context context, @NotNull String str, @NotNull String str2);

    void b(@NotNull RewardVideoWithCodeListener rewardVideoWithCodeListener);

    void load();

    void playVideoMute(int i10);

    void show();
}
