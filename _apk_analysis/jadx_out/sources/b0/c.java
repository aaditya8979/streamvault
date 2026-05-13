package b0;

import b0.a;
import coil.disk.DiskLruCache;
import kotlin.Metadata;
import okio.ByteString;
import okio.FileSystem;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;

/* JADX INFO: compiled from: RealDiskCache.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0003\u0007\u000f\u000bB'\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0002*\u00020\u0002H\u0002R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006 "}, d2 = {"Lb0/c;", "Lb0/a;", "", "key", "Lb0/a$c;", "get", "Lb0/a$b;", "a", "d", "", "J", "c", "()J", "maxSize", "Lokio/Path;", "b", "Lokio/Path;", "()Lokio/Path;", "directory", "Lokio/FileSystem;", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "fileSystem", "Lcoil/disk/DiskLruCache;", "Lcoil/disk/DiskLruCache;", "cache", "Ldo/h0;", "cleanupDispatcher", "<init>", "(JLokio/Path;Lokio/FileSystem;Ldo/h0;)V", "e", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long maxSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Path directory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FileSystem fileSystem;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DiskLruCache cache;

    /* JADX INFO: compiled from: RealDiskCache.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u00060\u0006R\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006R\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lb0/c$b;", "Lb0/a$b;", "Lb0/c$c;", "b", "Lbn/r;", "abort", "Lcoil/disk/DiskLruCache$b;", "Lcoil/disk/DiskLruCache;", "a", "Lcoil/disk/DiskLruCache$b;", "editor", "Lokio/Path;", "getMetadata", "()Lokio/Path;", "metadata", "getData", "data", "<init>", "(Lcoil/disk/DiskLruCache$b;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final DiskLruCache.b editor;

        public b(@NotNull DiskLruCache.b bVar) {
            this.editor = bVar;
        }

        @Override // b0.a.b
        public void abort() {
            this.editor.a();
        }

        @Override // b0.a.b
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0121c a() {
            DiskLruCache.d dVarC = this.editor.c();
            if (dVarC != null) {
                return new C0121c(dVarC);
            }
            return null;
        }

        @Override // b0.a.b
        @NotNull
        public Path getData() {
            return this.editor.f(1);
        }

        @Override // b0.a.b
        @NotNull
        public Path getMetadata() {
            return this.editor.f(0);
        }
    }

    /* JADX INFO: renamed from: b0.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RealDiskCache.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u00060\u0006R\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006R\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lb0/c$c;", "Lb0/a$c;", "Lbn/r;", "close", "Lb0/c$b;", "d", "Lcoil/disk/DiskLruCache$d;", "Lcoil/disk/DiskLruCache;", "b", "Lcoil/disk/DiskLruCache$d;", "snapshot", "Lokio/Path;", "getMetadata", "()Lokio/Path;", "metadata", "getData", "data", "<init>", "(Lcoil/disk/DiskLruCache$d;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class C0121c implements a.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final DiskLruCache.d snapshot;

        public C0121c(@NotNull DiskLruCache.d dVar) {
            this.snapshot = dVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.snapshot.close();
        }

        @Override // b0.a.c
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b v() {
            DiskLruCache.b bVarD = this.snapshot.d();
            if (bVarD != null) {
                return new b(bVarD);
            }
            return null;
        }

        @Override // b0.a.c
        @NotNull
        public Path getData() {
            return this.snapshot.e(1);
        }

        @Override // b0.a.c
        @NotNull
        public Path getMetadata() {
            return this.snapshot.e(0);
        }
    }

    public c(long j10, @NotNull Path path, @NotNull FileSystem fileSystem, @NotNull h0 h0Var) {
        this.maxSize = j10;
        this.directory = path;
        this.fileSystem = fileSystem;
        this.cache = new DiskLruCache(getFileSystem(), getDirectory(), h0Var, getMaxSize(), 1, 2);
    }

    @Override // b0.a
    @Nullable
    public a.b a(@NotNull String key) {
        DiskLruCache.b bVarB = this.cache.B(d(key));
        if (bVarB != null) {
            return new b(bVarB);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public Path getDirectory() {
        return this.directory;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public long getMaxSize() {
        return this.maxSize;
    }

    public final String d(String str) {
        return ByteString.Companion.encodeUtf8(str).sha256().hex();
    }

    @Override // b0.a
    @Nullable
    public a.c get(@NotNull String key) {
        DiskLruCache.d dVarC = this.cache.C(d(key));
        if (dVarC != null) {
            return new C0121c(dVarC);
        }
        return null;
    }

    @Override // b0.a
    @NotNull
    public FileSystem getFileSystem() {
        return this.fileSystem;
    }
}
