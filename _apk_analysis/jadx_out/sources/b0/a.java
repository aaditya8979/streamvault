package b0;

import android.os.StatFs;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import okio.FileSystem;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;
import p000do.w0;
import zn.n;

/* JADX INFO: compiled from: DiskCache.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0003\u0007\u000e\u000fJ\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H'R\u001a\u0010\r\u001a\u00020\b8&X§\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lb0/a;", "", "", "key", "Lb0/a$c;", "get", "Lb0/a$b;", "a", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "getFileSystem$annotations", "()V", "fileSystem", "b", "c", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public interface a {

    /* JADX INFO: renamed from: b0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DiskCache.kt */
    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lb0/a$a;", "", "Ljava/io/File;", "directory", "b", "Lokio/Path;", "c", "Lb0/a;", "a", "Lokio/Path;", "Lokio/FileSystem;", "Lokio/FileSystem;", "fileSystem", "", "D", "maxSizePercent", "", "d", "J", "minimumMaxSizeBytes", "e", "maximumMaxSizeBytes", InneractiveMediationDefs.GENDER_FEMALE, "maxSizeBytes", "Ldo/h0;", "g", "Ldo/h0;", "cleanupDispatcher", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class C0120a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Path directory;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public long maxSizeBytes;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public FileSystem fileSystem = FileSystem.SYSTEM;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public double maxSizePercent = 0.02d;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public long minimumMaxSizeBytes = 10485760;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public long maximumMaxSizeBytes = 262144000;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public h0 cleanupDispatcher = w0.b();

        @NotNull
        public final a a() {
            long jP;
            Path path = this.directory;
            if (path == null) {
                throw new IllegalStateException("directory == null".toString());
            }
            if (this.maxSizePercent > 0.0d) {
                try {
                    StatFs statFs = new StatFs(path.toFile().getAbsolutePath());
                    jP = n.p((long) (this.maxSizePercent * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.minimumMaxSizeBytes, this.maximumMaxSizeBytes);
                } catch (Exception unused) {
                    jP = this.minimumMaxSizeBytes;
                }
            } else {
                jP = this.maxSizeBytes;
            }
            return new b0.c(jP, path, this.fileSystem, this.cleanupDispatcher);
        }

        @NotNull
        public final C0120a b(@NotNull File directory) {
            return c(Path.Companion.get$default(Path.Companion, directory, false, 1, (Object) null));
        }

        @NotNull
        public final C0120a c(@NotNull Path directory) {
            this.directory = directory;
            return this;
        }
    }

    /* JADX INFO: compiled from: DiskCache.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lb0/a$b;", "", "Lb0/a$c;", "a", "Lbn/r;", "abort", "Lokio/Path;", "getMetadata", "()Lokio/Path;", "metadata", "getData", "data", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public interface b {
        @Nullable
        c a();

        void abort();

        @NotNull
        Path getData();

        @NotNull
        Path getMetadata();
    }

    /* JADX INFO: compiled from: DiskCache.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00060\u0001j\u0002`\u0002J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Lb0/a$c;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Lb0/a$b;", "v", "Lokio/Path;", "getMetadata", "()Lokio/Path;", "metadata", "getData", "data", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public interface c extends Closeable {
        @NotNull
        Path getData();

        @NotNull
        Path getMetadata();

        @Nullable
        b v();
    }

    @Nullable
    b a(@NotNull String key);

    @Nullable
    c get(@NotNull String key);

    @NotNull
    FileSystem getFileSystem();
}
