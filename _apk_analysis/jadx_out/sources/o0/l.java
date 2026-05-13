package o0;

import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HardwareBitmaps.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0002R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lo0/l;", "", "Lo0/q;", "logger", "", "b", "a", "Ljava/io/File;", "Ljava/io/File;", "fileDescriptorList", "", "c", "I", "decodesSinceLastFileDescriptorCheck", "", "d", "J", "lastFileDescriptorCheckTimestamp", "e", "Z", "hasAvailableFileDescriptors", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f75978a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final File fileDescriptorList = new File("/proc/self/fd");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static int decodesSinceLastFileDescriptorCheck = 30;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static long lastFileDescriptorCheckTimestamp = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static boolean hasAvailableFileDescriptors = true;

    public final boolean a() {
        int i10 = decodesSinceLastFileDescriptorCheck;
        decodesSinceLastFileDescriptorCheck = i10 + 1;
        return i10 >= 30 || SystemClock.uptimeMillis() > lastFileDescriptorCheckTimestamp + ((long) 30000);
    }

    @WorkerThread
    public final synchronized boolean b(@Nullable q logger) {
        if (a()) {
            decodesSinceLastFileDescriptorCheck = 0;
            lastFileDescriptorCheckTimestamp = SystemClock.uptimeMillis();
            String[] list = fileDescriptorList.list();
            if (list == null) {
                list = new String[0];
            }
            int length = list.length;
            boolean z10 = length < 800;
            hasAvailableFileDescriptors = z10;
            if (!z10 && logger != null && logger.getLevel() <= 5) {
                logger.a("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
            }
        }
        return hasAvailableFileDescriptors;
    }
}
