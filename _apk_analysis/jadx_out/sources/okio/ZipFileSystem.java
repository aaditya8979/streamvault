package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.d;
import cn.f0;
import com.ironsource.C3978d4;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import okio.Path;
import okio.internal.FixedLengthSource;
import okio.internal.ZipEntry;
import okio.internal.ZipFilesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ZipFileSystem.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ZipFileSystem extends FileSystem {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);

    @Nullable
    private final String comment;

    @NotNull
    private final Map<Path, ZipEntry> entries;

    @NotNull
    private final FileSystem fileSystem;

    @NotNull
    private final Path zipPath;

    /* JADX INFO: compiled from: ZipFileSystem.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final Path getROOT() {
            return ZipFileSystem.ROOT;
        }
    }

    public ZipFileSystem(@NotNull Path path, @NotNull FileSystem fileSystem, @NotNull Map<Path, ZipEntry> map, @Nullable String str) {
        p.k(path, "zipPath");
        p.k(fileSystem, "fileSystem");
        p.k(map, "entries");
        this.zipPath = path;
        this.fileSystem = fileSystem;
        this.entries = map;
        this.comment = str;
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    private final List<Path> list(Path path, boolean z10) throws IOException {
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(path));
        if (zipEntry != null) {
            return f0.g1(zipEntry.getChildren());
        }
        if (!z10) {
            return null;
        }
        throw new IOException("not a directory: " + path);
    }

    @Override // okio.FileSystem
    @NotNull
    public Sink appendingSink(@NotNull Path path, boolean z10) throws IOException {
        p.k(path, C3978d4.i.f31327b);
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void atomicMove(@NotNull Path path, @NotNull Path path2) throws IOException {
        p.k(path, "source");
        p.k(path2, TypedValues.AttributesType.S_TARGET);
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    @NotNull
    public Path canonicalize(@NotNull Path path) throws FileNotFoundException {
        p.k(path, "path");
        Path pathCanonicalizeInternal = canonicalizeInternal(path);
        if (this.entries.containsKey(pathCanonicalizeInternal)) {
            return pathCanonicalizeInternal;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    @Override // okio.FileSystem
    public void createDirectory(@NotNull Path path, boolean z10) throws IOException {
        p.k(path, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void createSymlink(@NotNull Path path, @NotNull Path path2) throws IOException {
        p.k(path, "source");
        p.k(path2, TypedValues.AttributesType.S_TARGET);
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void delete(@NotNull Path path, boolean z10) throws IOException {
        p.k(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    @NotNull
    public List<Path> list(@NotNull Path path) throws IOException {
        p.k(path, "dir");
        List<Path> list = list(path, true);
        p.h(list);
        return list;
    }

    @Override // okio.FileSystem
    @Nullable
    public List<Path> listOrNull(@NotNull Path path) {
        p.k(path, "dir");
        return list(path, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #3 {all -> 0x0089, blocks: (B:13:0x0054, B:29:0x007d, B:35:0x0088, B:26:0x0076, B:23:0x0071, B:14:0x0060), top: B:53:0x0054, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088 A[Catch: all -> 0x0089, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0089, blocks: (B:13:0x0054, B:29:0x007d, B:35:0x0088, B:26:0x0076, B:23:0x0071, B:14:0x0060), top: B:53:0x0054, inners: #1, #5 }] */
    @Override // okio.FileSystem
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okio.FileMetadata metadataOrNull(@org.jetbrains.annotations.NotNull okio.Path r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r0 = "path"
            tn.p.k(r14, r0)
            okio.Path r14 = r13.canonicalizeInternal(r14)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r0 = r13.entries
            java.lang.Object r14 = r0.get(r14)
            okio.internal.ZipEntry r14 = (okio.internal.ZipEntry) r14
            r0 = 0
            if (r14 != 0) goto L15
            return r0
        L15:
            okio.FileMetadata r12 = new okio.FileMetadata
            boolean r1 = r14.isDirectory()
            r2 = r1 ^ 1
            boolean r3 = r14.isDirectory()
            r4 = 0
            boolean r1 = r14.isDirectory()
            if (r1 == 0) goto L2a
            r5 = r0
            goto L33
        L2a:
            long r5 = r14.getSize()
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r5 = r1
        L33:
            r6 = 0
            java.lang.Long r7 = r14.getLastModifiedAtMillis()
            r8 = 0
            r9 = 0
            r10 = 128(0x80, float:1.8E-43)
            r11 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            long r1 = r14.getOffset()
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L4c
            return r12
        L4c:
            okio.FileSystem r1 = r13.fileSystem
            okio.Path r2 = r13.zipPath
            okio.FileHandle r1 = r1.openReadOnly(r2)
            long r2 = r14.getOffset()     // Catch: java.lang.Throwable -> L89
            okio.Source r14 = r1.source(r2)     // Catch: java.lang.Throwable -> L89
            okio.BufferedSource r14 = okio.Okio.buffer(r14)     // Catch: java.lang.Throwable -> L89
            okio.FileMetadata r2 = okio.internal.ZipFilesKt.readLocalHeader(r14, r12)     // Catch: java.lang.Throwable -> L6e
            if (r14 == 0) goto L6c
            r14.close()     // Catch: java.lang.Throwable -> L6a
            goto L6c
        L6a:
            r14 = move-exception
            goto L7b
        L6c:
            r14 = r0
            goto L7b
        L6e:
            r2 = move-exception
            if (r14 == 0) goto L79
            r14.close()     // Catch: java.lang.Throwable -> L75
            goto L79
        L75:
            r14 = move-exception
            bn.d.a(r2, r14)     // Catch: java.lang.Throwable -> L89
        L79:
            r14 = r2
            r2 = r0
        L7b:
            if (r14 != 0) goto L88
            tn.p.h(r2)     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L96
            r1.close()     // Catch: java.lang.Throwable -> L86
            goto L96
        L86:
            r0 = move-exception
            goto L96
        L88:
            throw r14     // Catch: java.lang.Throwable -> L89
        L89:
            r14 = move-exception
            if (r1 == 0) goto L94
            r1.close()     // Catch: java.lang.Throwable -> L90
            goto L94
        L90:
            r1 = move-exception
            bn.d.a(r14, r1)
        L94:
            r2 = r0
            r0 = r14
        L96:
            if (r0 != 0) goto L9c
            tn.p.h(r2)
            return r2
        L9c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ZipFileSystem.metadataOrNull(okio.Path):okio.FileMetadata");
    }

    @Override // okio.FileSystem
    @NotNull
    public FileHandle openReadOnly(@NotNull Path path) {
        p.k(path, C3978d4.i.f31327b);
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.FileSystem
    @NotNull
    public FileHandle openReadWrite(@NotNull Path path, boolean z10, boolean z11) throws IOException {
        p.k(path, C3978d4.i.f31327b);
        throw new IOException("zip entries are not writable");
    }

    @Override // okio.FileSystem
    @NotNull
    public Sink sink(@NotNull Path path, boolean z10) throws IOException {
        p.k(path, C3978d4.i.f31327b);
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    @NotNull
    public Source source(@NotNull Path path) throws Throwable {
        BufferedSource bufferedSourceBuffer;
        p.k(path, C3978d4.i.f31327b);
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(path));
        if (zipEntry == null) {
            throw new FileNotFoundException("no such file: " + path);
        }
        FileHandle fileHandleOpenReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        Throwable th2 = null;
        try {
            bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(zipEntry.getOffset()));
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th5) {
                    d.a(th4, th5);
                }
            }
            bufferedSourceBuffer = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        p.h(bufferedSourceBuffer);
        ZipFilesKt.skipLocalHeader(bufferedSourceBuffer);
        return zipEntry.getCompressionMethod() == 0 ? new FixedLengthSource(bufferedSourceBuffer, zipEntry.getSize(), true) : new FixedLengthSource(new InflaterSource(new FixedLengthSource(bufferedSourceBuffer, zipEntry.getCompressedSize(), true), new Inflater(true)), zipEntry.getSize(), false);
    }
}
