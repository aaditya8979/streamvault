package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import c8.i;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public interface ProgressUpdater {
    @NonNull
    i<Void> updateProgress(@NonNull Context context, @NonNull UUID uuid, @NonNull Data data);
}
