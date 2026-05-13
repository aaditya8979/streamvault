package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.d;
import com.ironsource.C3978d4;
import java.io.IOException;
import java.util.List;
import okio.Path;
import okio.internal.ResourceFileSystem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.n;
import tn.p;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class FileSystem {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final FileSystem RESOURCES;

    @NotNull
    public static final FileSystem SYSTEM;

    @NotNull
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    /* JADX INFO: compiled from: FileSystem.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final FileSystem get(@NotNull java.nio.file.FileSystem fileSystem) {
            p.k(fileSystem, "<this>");
            return new NioFileSystemWrappingFileSystem(fileSystem);
        }
    }

    /* JADX INFO: renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m7692write$default(FileSystem fileSystem, Path path, boolean z10, l lVar, int i10, Object obj) throws Throwable {
        Object objInvoke;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        p.k(path, C3978d4.i.f31327b);
        p.k(lVar, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(path, z10));
        Throwable th2 = null;
        try {
            objInvoke = lVar.invoke(bufferedSinkBuffer);
            n.b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            n.a(1);
        } catch (Throwable th4) {
            n.b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th5) {
                    d.a(th4, th5);
                }
            }
            n.a(1);
            objInvoke = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        p.h(objInvoke);
        return objInvoke;
    }

    static {
        FileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        SYSTEM = jvmSystemFileSystem;
        Path.Companion companion = Path.Companion;
        String property = System.getProperty("java.io.tmpdir");
        p.j(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get$default(companion, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        p.j(classLoader, "getClassLoader(...)");
        RESOURCES = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ Sink appendingSink$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.appendingSink(path, z10);
    }

    public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.createDirectories(path, z10);
    }

    public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.createDirectory(path, z10);
    }

    public static /* synthetic */ void delete$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.delete(path, z10);
    }

    public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystem.deleteRecursively(path, z10);
    }

    @NotNull
    public static final FileSystem get(@NotNull java.nio.file.FileSystem fileSystem) {
        return Companion.get(fileSystem);
    }

    public static /* synthetic */ ao.i listRecursively$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.listRecursively(path, z10);
    }

    public static /* synthetic */ FileHandle openReadWrite$default(FileSystem fileSystem, Path path, boolean z10, boolean z11, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return fileSystem.openReadWrite(path, z10, z11);
    }

    public static /* synthetic */ Sink sink$default(FileSystem fileSystem, Path path, boolean z10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fileSystem.sink(path, z10);
    }

    /* JADX INFO: renamed from: -read, reason: not valid java name */
    public final <T> T m7693read(@NotNull Path path, @NotNull l<? super BufferedSource, ? extends T> lVar) throws Throwable {
        T tInvoke;
        p.k(path, C3978d4.i.f31327b);
        p.k(lVar, "readerAction");
        BufferedSource bufferedSourceBuffer = Okio.buffer(source(path));
        Throwable th2 = null;
        try {
            tInvoke = lVar.invoke(bufferedSourceBuffer);
            n.b(1);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            n.a(1);
        } catch (Throwable th4) {
            n.b(1);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th5) {
                    d.a(th4, th5);
                }
            }
            n.a(1);
            th2 = th4;
            tInvoke = null;
        }
        if (th2 != null) {
            throw th2;
        }
        p.h(tInvoke);
        return tInvoke;
    }

    /* JADX INFO: renamed from: -write, reason: not valid java name */
    public final <T> T m7694write(@NotNull Path path, boolean z10, @NotNull l<? super BufferedSink, ? extends T> lVar) throws Throwable {
        T tInvoke;
        p.k(path, C3978d4.i.f31327b);
        p.k(lVar, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(sink(path, z10));
        Throwable th2 = null;
        try {
            tInvoke = lVar.invoke(bufferedSinkBuffer);
            n.b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            n.a(1);
        } catch (Throwable th4) {
            n.b(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th5) {
                    d.a(th4, th5);
                }
            }
            n.a(1);
            tInvoke = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        p.h(tInvoke);
        return tInvoke;
    }

    @NotNull
    public final Sink appendingSink(@NotNull Path path) throws IOException {
        p.k(path, C3978d4.i.f31327b);
        return appendingSink(path, false);
    }

    @NotNull
    public abstract Sink appendingSink(@NotNull Path path, boolean z10) throws IOException;

    public abstract void atomicMove(@NotNull Path path, @NotNull Path path2) throws IOException;

    @NotNull
    public abstract Path canonicalize(@NotNull Path path) throws IOException;

    public void copy(@NotNull Path path, @NotNull Path path2) throws IOException {
        p.k(path, "source");
        p.k(path2, TypedValues.AttributesType.S_TARGET);
        okio.internal.FileSystem.commonCopy(this, path, path2);
    }

    public final void createDirectories(@NotNull Path path) throws IOException {
        p.k(path, "dir");
        createDirectories(path, false);
    }

    public final void createDirectories(@NotNull Path path, boolean z10) throws IOException {
        p.k(path, "dir");
        okio.internal.FileSystem.commonCreateDirectories(this, path, z10);
    }

    public final void createDirectory(@NotNull Path path) throws IOException {
        p.k(path, "dir");
        createDirectory(path, false);
    }

    public abstract void createDirectory(@NotNull Path path, boolean z10) throws IOException;

    public abstract void createSymlink(@NotNull Path path, @NotNull Path path2) throws IOException;

    public final void delete(@NotNull Path path) throws IOException {
        p.k(path, "path");
        delete(path, false);
    }

    public abstract void delete(@NotNull Path path, boolean z10) throws IOException;

    public final void deleteRecursively(@NotNull Path path) throws IOException {
        p.k(path, "fileOrDirectory");
        deleteRecursively(path, false);
    }

    public void deleteRecursively(@NotNull Path path, boolean z10) throws IOException {
        p.k(path, "fileOrDirectory");
        okio.internal.FileSystem.commonDeleteRecursively(this, path, z10);
    }

    public final boolean exists(@NotNull Path path) throws IOException {
        p.k(path, "path");
        return okio.internal.FileSystem.commonExists(this, path);
    }

    @NotNull
    public abstract List<Path> list(@NotNull Path path) throws IOException;

    @Nullable
    public abstract List<Path> listOrNull(@NotNull Path path);

    @NotNull
    public final ao.i<Path> listRecursively(@NotNull Path path) {
        p.k(path, "dir");
        return listRecursively(path, false);
    }

    @NotNull
    public ao.i<Path> listRecursively(@NotNull Path path, boolean z10) {
        p.k(path, "dir");
        return okio.internal.FileSystem.commonListRecursively(this, path, z10);
    }

    @NotNull
    public final FileMetadata metadata(@NotNull Path path) throws IOException {
        p.k(path, "path");
        return okio.internal.FileSystem.commonMetadata(this, path);
    }

    @Nullable
    public abstract FileMetadata metadataOrNull(@NotNull Path path) throws IOException;

    @NotNull
    public abstract FileHandle openReadOnly(@NotNull Path path) throws IOException;

    @NotNull
    public final FileHandle openReadWrite(@NotNull Path path) throws IOException {
        p.k(path, C3978d4.i.f31327b);
        return openReadWrite(path, false, false);
    }

    @NotNull
    public abstract FileHandle openReadWrite(@NotNull Path path, boolean z10, boolean z11) throws IOException;

    @NotNull
    public final Sink sink(@NotNull Path path) throws IOException {
        p.k(path, C3978d4.i.f31327b);
        return sink(path, false);
    }

    @NotNull
    public abstract Sink sink(@NotNull Path path, boolean z10) throws IOException;

    @NotNull
    public abstract Source source(@NotNull Path path) throws IOException;
}
