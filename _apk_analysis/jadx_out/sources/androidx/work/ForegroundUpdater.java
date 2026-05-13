package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import c8.i;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public interface ForegroundUpdater {
    @NonNull
    i<Void> setForegroundAsync(@NonNull Context context, @NonNull UUID uuid, @NonNull ForegroundInfo foregroundInfo);
}
