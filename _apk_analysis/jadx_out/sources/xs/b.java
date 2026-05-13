package xs;

import android.view.View;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: IControlComponent.java */
/* JADX INFO: loaded from: classes12.dex */
public interface b {
    void a(boolean z10);

    void b(@NonNull a aVar);

    void e(boolean z10, Animation animation);

    void f(int i10, int i11);

    @Nullable
    View getView();

    void onPlayStateChanged(int i10);

    void onPlayerStateChanged(int i10);
}
