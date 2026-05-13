package com.unity3d.ads.core.data.model;

import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: CachedFile.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CachedFile {
    private final long contentLength;

    @Nullable
    private final String extension;

    @Nullable
    private final File file;

    @NotNull
    private final String name;
    private final int priority;

    @NotNull
    private final String protocol;

    @NotNull
    private final String url;

    public CachedFile(@NotNull String str, @NotNull String str2, @Nullable File file, @Nullable String str3, long j10, @NotNull String str4, int i10) {
        p.k(str, "url");
        p.k(str2, "name");
        p.k(str4, "protocol");
        this.url = str;
        this.name = str2;
        this.file = file;
        this.extension = str3;
        this.contentLength = j10;
        this.protocol = str4;
        this.priority = i10;
    }

    public /* synthetic */ CachedFile(String str, String str2, File file, String str3, long j10, String str4, int i10, int i11, i iVar) {
        this(str, str2, (i11 & 4) != 0 ? null : file, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? -1L : j10, (i11 & 32) != 0 ? "" : str4, (i11 & 64) != 0 ? Integer.MAX_VALUE : i10);
    }

    @NotNull
    public final String component1() {
        return this.url;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final File component3() {
        return this.file;
    }

    @Nullable
    public final String component4() {
        return this.extension;
    }

    public final long component5() {
        return this.contentLength;
    }

    @NotNull
    public final String component6() {
        return this.protocol;
    }

    public final int component7() {
        return this.priority;
    }

    @NotNull
    public final CachedFile copy(@NotNull String str, @NotNull String str2, @Nullable File file, @Nullable String str3, long j10, @NotNull String str4, int i10) {
        p.k(str, "url");
        p.k(str2, "name");
        p.k(str4, "protocol");
        return new CachedFile(str, str2, file, str3, j10, str4, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedFile)) {
            return false;
        }
        CachedFile cachedFile = (CachedFile) obj;
        return p.f(this.url, cachedFile.url) && p.f(this.name, cachedFile.name) && p.f(this.file, cachedFile.file) && p.f(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && p.f(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    @Nullable
    public final String getExtension() {
        return this.extension;
    }

    @Nullable
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    @NotNull
    public final String getProtocol() {
        return this.protocol;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + this.name.hashCode()) * 31;
        File file = this.file;
        int iHashCode2 = (iHashCode + (file == null ? 0 : file.hashCode())) * 31;
        String str = this.extension;
        return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Long.hashCode(this.contentLength)) * 31) + this.protocol.hashCode()) * 31) + Integer.hashCode(this.priority);
    }

    @NotNull
    public String toString() {
        return "CachedFile(url=" + this.url + ", name=" + this.name + ", file=" + this.file + ", extension=" + this.extension + ", contentLength=" + this.contentLength + ", protocol=" + this.protocol + ", priority=" + this.priority + ')';
    }
}
