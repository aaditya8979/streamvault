package com.applovin.shadow.okio;

import cn.x;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class Path implements Comparable<Path> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String DIRECTORY_SEPARATOR;

    @NotNull
    private final ByteString bytes;

    /* JADX INFO: compiled from: Path.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public static /* synthetic */ Path get$default(Companion companion, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(file, z10);
        }

        public static /* synthetic */ Path get$default(Companion companion, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(str, z10);
        }

        public static /* synthetic */ Path get$default(Companion companion, java.nio.file.Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(path, z10);
        }

        @NotNull
        public final Path get(@NotNull File file) {
            p.k(file, "<this>");
            return get$default(this, file, false, 1, (Object) null);
        }

        @NotNull
        public final Path get(@NotNull File file, boolean z10) {
            p.k(file, "<this>");
            String string = file.toString();
            p.j(string, "toString(...)");
            return get(string, z10);
        }

        @NotNull
        public final Path get(@NotNull String str) {
            p.k(str, "<this>");
            return get$default(this, str, false, 1, (Object) null);
        }

        @NotNull
        public final Path get(@NotNull String str, boolean z10) {
            p.k(str, "<this>");
            return com.applovin.shadow.okio.internal.Path.commonToPath(str, z10);
        }

        @NotNull
        public final Path get(@NotNull java.nio.file.Path path) {
            p.k(path, "<this>");
            return get$default(this, path, false, 1, (Object) null);
        }

        @NotNull
        public final Path get(@NotNull java.nio.file.Path path, boolean z10) {
            p.k(path, "<this>");
            return get(path.toString(), z10);
        }
    }

    static {
        String str = File.separator;
        p.j(str, "separator");
        DIRECTORY_SEPARATOR = str;
    }

    public Path(@NotNull ByteString byteString) {
        p.k(byteString, "bytes");
        this.bytes = byteString;
    }

    @NotNull
    public static final Path get(@NotNull File file) {
        return Companion.get(file);
    }

    @NotNull
    public static final Path get(@NotNull File file, boolean z10) {
        return Companion.get(file, z10);
    }

    @NotNull
    public static final Path get(@NotNull String str) {
        return Companion.get(str);
    }

    @NotNull
    public static final Path get(@NotNull String str, boolean z10) {
        return Companion.get(str, z10);
    }

    @NotNull
    public static final Path get(@NotNull java.nio.file.Path path) {
        return Companion.get(path);
    }

    @NotNull
    public static final Path get(@NotNull java.nio.file.Path path, boolean z10) {
        return Companion.get(path, z10);
    }

    public static /* synthetic */ Path resolve$default(Path path, ByteString byteString, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(byteString, z10);
    }

    public static /* synthetic */ Path resolve$default(Path path, Path path2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(path2, z10);
    }

    public static /* synthetic */ Path resolve$default(Path path, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(str, z10);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Path path) {
        p.k(path, "other");
        return getBytes$okio().compareTo(path.getBytes$okio());
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Path) && p.f(((Path) obj).getBytes$okio(), getBytes$okio());
    }

    @NotNull
    public final ByteString getBytes$okio() {
        return this.bytes;
    }

    @Nullable
    public final Path getRoot() {
        int iRootLength = com.applovin.shadow.okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            return null;
        }
        return new Path(getBytes$okio().substring(0, iRootLength));
    }

    @NotNull
    public final List<String> getSegments() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = com.applovin.shadow.okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes$okio().size() && getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes$okio().size();
        int i10 = iRootLength;
        while (iRootLength < size) {
            if (getBytes$okio().getByte(iRootLength) == 47 || getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i10, iRootLength));
                i10 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i10 < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(i10, getBytes$okio().size()));
        }
        ArrayList arrayList2 = new ArrayList(x.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    @NotNull
    public final List<ByteString> getSegmentsBytes() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = com.applovin.shadow.okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes$okio().size() && getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes$okio().size();
        int i10 = iRootLength;
        while (iRootLength < size) {
            if (getBytes$okio().getByte(iRootLength) == 47 || getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i10, iRootLength));
                i10 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i10 < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(i10, getBytes$okio().size()));
        }
        return arrayList;
    }

    public int hashCode() {
        return getBytes$okio().hashCode();
    }

    public final boolean isAbsolute() {
        return com.applovin.shadow.okio.internal.Path.rootLength(this) != -1;
    }

    public final boolean isRelative() {
        return com.applovin.shadow.okio.internal.Path.rootLength(this) == -1;
    }

    public final boolean isRoot() {
        return com.applovin.shadow.okio.internal.Path.rootLength(this) == getBytes$okio().size();
    }

    @NotNull
    public final String name() {
        return nameBytes().utf8();
    }

    @NotNull
    public final ByteString nameBytes() {
        int indexOfLastSlash = com.applovin.shadow.okio.internal.Path.getIndexOfLastSlash(this);
        return indexOfLastSlash != -1 ? ByteString.substring$default(getBytes$okio(), indexOfLastSlash + 1, 0, 2, null) : (volumeLetter() == null || getBytes$okio().size() != 2) ? getBytes$okio() : ByteString.EMPTY;
    }

    @NotNull
    public final Path normalized() {
        return Companion.get(toString(), true);
    }

    @Nullable
    public final Path parent() {
        Path path;
        if (p.f(getBytes$okio(), com.applovin.shadow.okio.internal.Path.DOT) || p.f(getBytes$okio(), com.applovin.shadow.okio.internal.Path.SLASH) || p.f(getBytes$okio(), com.applovin.shadow.okio.internal.Path.BACKSLASH) || com.applovin.shadow.okio.internal.Path.lastSegmentIsDotDot(this)) {
            return null;
        }
        int indexOfLastSlash = com.applovin.shadow.okio.internal.Path.getIndexOfLastSlash(this);
        if (indexOfLastSlash != 2 || volumeLetter() == null) {
            if (indexOfLastSlash == 1 && getBytes$okio().startsWith(com.applovin.shadow.okio.internal.Path.BACKSLASH)) {
                return null;
            }
            if (indexOfLastSlash != -1 || volumeLetter() == null) {
                if (indexOfLastSlash == -1) {
                    return new Path(com.applovin.shadow.okio.internal.Path.DOT);
                }
                if (indexOfLastSlash != 0) {
                    return new Path(ByteString.substring$default(getBytes$okio(), 0, indexOfLastSlash, 1, null));
                }
                path = new Path(ByteString.substring$default(getBytes$okio(), 0, 1, 1, null));
            } else {
                if (getBytes$okio().size() == 2) {
                    return null;
                }
                path = new Path(ByteString.substring$default(getBytes$okio(), 0, 2, 1, null));
            }
        } else {
            if (getBytes$okio().size() == 3) {
                return null;
            }
            path = new Path(ByteString.substring$default(getBytes$okio(), 0, 3, 1, null));
        }
        return path;
    }

    @NotNull
    public final Path relativeTo(@NotNull Path path) {
        p.k(path, "other");
        if (!p.f(getRoot(), path.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + path).toString());
        }
        List<ByteString> segmentsBytes = getSegmentsBytes();
        List<ByteString> segmentsBytes2 = path.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i10 = 0;
        while (i10 < iMin && p.f(segmentsBytes.get(i10), segmentsBytes2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && getBytes$okio().size() == path.getBytes$okio().size()) {
            return Companion.get$default(Companion, ".", false, 1, (Object) null);
        }
        if (!(segmentsBytes2.subList(i10, segmentsBytes2.size()).indexOf(com.applovin.shadow.okio.internal.Path.DOT_DOT) == -1)) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + path).toString());
        }
        Buffer buffer = new Buffer();
        ByteString slash = com.applovin.shadow.okio.internal.Path.getSlash(path);
        if (slash == null && (slash = com.applovin.shadow.okio.internal.Path.getSlash(this)) == null) {
            slash = com.applovin.shadow.okio.internal.Path.toSlash(DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i11 = i10; i11 < size; i11++) {
            buffer.write(com.applovin.shadow.okio.internal.Path.DOT_DOT);
            buffer.write(slash);
        }
        int size2 = segmentsBytes.size();
        while (i10 < size2) {
            buffer.write(segmentsBytes.get(i10));
            buffer.write(slash);
            i10++;
        }
        return com.applovin.shadow.okio.internal.Path.toPath(buffer, false);
    }

    @NotNull
    public final Path resolve(@NotNull ByteString byteString) {
        p.k(byteString, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().write(byteString), false), false);
    }

    @NotNull
    public final Path resolve(@NotNull ByteString byteString, boolean z10) {
        p.k(byteString, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().write(byteString), false), z10);
    }

    @NotNull
    public final Path resolve(@NotNull Path path) {
        p.k(path, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, path, false);
    }

    @NotNull
    public final Path resolve(@NotNull Path path, boolean z10) {
        p.k(path, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, path, z10);
    }

    @NotNull
    public final Path resolve(@NotNull String str) {
        p.k(str, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().writeUtf8(str), false), false);
    }

    @NotNull
    public final Path resolve(@NotNull String str, boolean z10) {
        p.k(str, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().writeUtf8(str), false), z10);
    }

    @NotNull
    public final File toFile() {
        return new File(toString());
    }

    @NotNull
    public final java.nio.file.Path toNioPath() {
        java.nio.file.Path path = Paths.get(toString(), new String[0]);
        p.j(path, "get(...)");
        return path;
    }

    @NotNull
    public String toString() {
        return getBytes$okio().utf8();
    }

    @Nullable
    public final Character volumeLetter() {
        boolean z10 = false;
        if (ByteString.indexOf$default(getBytes$okio(), com.applovin.shadow.okio.internal.Path.SLASH, 0, 2, (Object) null) != -1 || getBytes$okio().size() < 2 || getBytes$okio().getByte(1) != 58) {
            return null;
        }
        char c10 = (char) getBytes$okio().getByte(0);
        if (!('a' <= c10 && c10 < '{')) {
            if ('A' <= c10 && c10 < '[') {
                z10 = true;
            }
            if (!z10) {
                return null;
            }
        }
        return Character.valueOf(c10);
    }
}
