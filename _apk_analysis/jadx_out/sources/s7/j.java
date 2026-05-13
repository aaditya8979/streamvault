package s7;

import android.util.Pair;
import java.lang.Throwable;

/* JADX INFO: compiled from: ErrorMessageProvider.java */
/* JADX INFO: loaded from: classes5.dex */
public interface j<T extends Throwable> {
    Pair<Integer, String> getErrorMessage(T t10);
}
