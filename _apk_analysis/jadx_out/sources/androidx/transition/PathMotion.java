package androidx.transition;

import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class PathMotion {
    public PathMotion() {
    }

    public PathMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
    }

    @NonNull
    public abstract Path getPath(float f10, float f11, float f12, float f13);
}
