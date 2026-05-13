package com.applovin.shadow.okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ao.i;
import cn.a0;
import com.ironsource.C3978d4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: ForwardingFileSystem.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class ForwardingFileSystem extends FileSystem {

    @NotNull
    private final FileSystem delegate;

    public ForwardingFileSystem(@NotNull FileSystem fileSystem) {
        p.k(fileSystem, "delegate");
        this.delegate = fileSystem;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public Sink appendingSink(@NotNull Path path, boolean z10) throws IOException {
        p.k(path, C3978d4.i.f31327b);
        return this.delegate.appendingSink(onPathParameter(path, "appendingSink", C3978d4.i.f31327b), z10);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void atomicMove(@NotNull Path path, @NotNull Path path2) throws IOException {
        p.k(path, "source");
        p.k(path2, TypedValues.AttributesType.S_TARGET);
        this.delegate.atomicMove(onPathParameter(path, "atomicMove", "source"), onPathParameter(path2, "atomicMove", TypedValues.AttributesType.S_TARGET));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public Path canonicalize(@NotNull Path path) throws IOException {
        p.k(path, "path");
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createDirectory(@NotNull Path path, boolean z10) throws IOException {
        p.k(path, "dir");
        this.delegate.createDirectory(onPathParameter(path, "createDirectory", "dir"), z10);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createSymlink(@NotNull Path path, @NotNull Path path2) throws IOException {
        p.k(path, "source");
        p.k(path2, TypedValues.AttributesType.S_TARGET);
        this.delegate.createSymlink(onPathParameter(path, "createSymlink", "source"), onPathParameter(path2, "createSymlink", TypedValues.AttributesType.S_TARGET));
    }

    @NotNull
    public final FileSystem delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void delete(@NotNull Path path, boolean z10) throws IOException {
        p.k(path, "path");
        this.delegate.delete(onPathParameter(path, "delete", "path"), z10);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public List<Path> list(@NotNull Path path) throws IOException {
        p.k(path, "dir");
        List<Path> list = this.delegate.list(onPathParameter(path, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "list"));
        }
        a0.C(arrayList);
        return arrayList;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @Nullable
    public List<Path> listOrNull(@NotNull Path path) {
        p.k(path, "dir");
        List<Path> listListOrNull = this.delegate.listOrNull(onPathParameter(path, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "listOrNull"));
        }
        a0.C(arrayList);
        return arrayList;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public i<Path> listRecursively(@NotNull Path path, boolean z10) {
        p.k(path, "dir");
        return SequencesKt___SequencesKt.K(this.delegate.listRecursively(onPathParameter(path, "listRecursively", "dir"), z10), new l<Path, Path>() { // from class: com.applovin.shadow.okio.ForwardingFileSystem.listRecursively.1
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Path invoke(@NotNull Path path2) {
                p.k(path2, "it");
                return ForwardingFileSystem.this.onPathResult(path2, "listRecursively");
            }
        });
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @Nullable
    public FileMetadata metadataOrNull(@NotNull Path path) throws IOException {
        p.k(path, "path");
        FileMetadata fileMetadataMetadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (fileMetadataMetadataOrNull == null) {
            return null;
        }
        return fileMetadataMetadataOrNull.getSymlinkTarget() == null ? fileMetadataMetadataOrNull : fileMetadataMetadataOrNull.copy((251 & 1) != 0 ? fileMetadataMetadataOrNull.isRegularFile : false, (251 & 2) != 0 ? fileMetadataMetadataOrNull.isDirectory : false, (251 & 4) != 0 ? fileMetadataMetadataOrNull.symlinkTarget : onPathResult(fileMetadataMetadataOrNull.getSymlinkTarget(), "metadataOrNull"), (251 & 8) != 0 ? fileMetadataMetadataOrNull.size : null, (251 & 16) != 0 ? fileMetadataMetadataOrNull.createdAtMillis : null, (251 & 32) != 0 ? fileMetadataMetadataOrNull.lastModifiedAtMillis : null, (251 & 64) != 0 ? fileMetadataMetadataOrNull.lastAccessedAtMillis : null, (251 & 128) != 0 ? fileMetadataMetadataOrNull.extras : null);
    }

    @NotNull
    public Path onPathParameter(@NotNull Path path, @NotNull String str, @NotNull String str2) {
        p.k(path, "path");
        p.k(str, C3978d4.g.f31290b);
        p.k(str2, "parameterName");
        return path;
    }

    @NotNull
    public Path onPathResult(@NotNull Path path, @NotNull String str) {
        p.k(path, "path");
        p.k(str, C3978d4.g.f31290b);
        return path;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public FileHandle openReadOnly(@NotNull Path path) throws IOException {
        p.k(path, C3978d4.i.f31327b);
        return this.delegate.openReadOnly(onPathParameter(path, "openReadOnly", C3978d4.i.f31327b));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public FileHandle openReadWrite(@NotNull Path path, boolean z10, boolean z11) throws IOException {
        p.k(path, C3978d4.i.f31327b);
        return this.delegate.openReadWrite(onPathParameter(path, "openReadWrite", C3978d4.i.f31327b), z10, z11);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public Sink sink(@NotNull Path path, boolean z10) throws IOException {
        p.k(path, C3978d4.i.f31327b);
        return this.delegate.sink(onPathParameter(path, "sink", C3978d4.i.f31327b), z10);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public Source source(@NotNull Path path) throws IOException {
        p.k(path, C3978d4.i.f31327b);
        return this.delegate.source(onPathParameter(path, "source", C3978d4.i.f31327b));
    }

    @NotNull
    public String toString() {
        return t.b(getClass()).getSimpleName() + '(' + this.delegate + ')';
    }
}
