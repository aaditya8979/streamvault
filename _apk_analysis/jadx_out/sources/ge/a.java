package ge;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DefaultLogCat.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Lge/a;", "Lge/b;", "", "tag", NotificationCompat.CATEGORY_MESSAGE, "Lbn/r;", "c", "debug", "b", "d", "", "error", "a", "<init>", "()V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public final class a implements b {
    @Override // ge.b
    public void a(@NotNull String str, @NotNull String str2, @NotNull Throwable th2) {
        p.l(str, "tag");
        p.l(str2, NotificationCompat.CATEGORY_MESSAGE);
        p.l(th2, "error");
        Log.e(str, str2, th2);
    }

    @Override // ge.b
    public void b(@NotNull String str, @NotNull String str2) {
        p.l(str, "tag");
        p.l(str2, NotificationCompat.CATEGORY_MESSAGE);
        Log.w(str, str2);
    }

    @Override // ge.b
    public void c(@NotNull String str, @NotNull String str2) {
        p.l(str, "tag");
        p.l(str2, NotificationCompat.CATEGORY_MESSAGE);
        Log.i(str, str2);
    }

    @Override // ge.b
    public void d(@NotNull String str, @NotNull String str2) {
        p.l(str, "tag");
        p.l(str2, NotificationCompat.CATEGORY_MESSAGE);
        Log.e(str, str2);
    }

    @Override // ge.b
    public void debug(@NotNull String str, @NotNull String str2) {
        p.l(str, "tag");
        p.l(str2, NotificationCompat.CATEGORY_MESSAGE);
        Log.d(str, str2);
    }
}
