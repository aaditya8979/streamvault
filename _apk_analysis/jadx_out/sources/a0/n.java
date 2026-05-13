package a0;

import a0.k;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3978d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import kotlin.Metadata;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ImageSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"La0/n;", "La0/k;", "Lokio/BufferedSource;", "h", "Lbn/r;", "close", CampaignEx.JSON_KEY_AD_K, "Ljava/io/File;", "b", "Ljava/io/File;", "cacheDirectory", "La0/k$a;", "c", "La0/k$a;", "d", "()La0/k$a;", "metadata", "", "Z", "isClosed", "e", "Lokio/BufferedSource;", "source", "Lokio/Path;", InneractiveMediationDefs.GENDER_FEMALE, "Lokio/Path;", C3978d4.i.f31327b, "Lokio/FileSystem;", "l", "()Lokio/FileSystem;", "fileSystem", "<init>", "(Lokio/BufferedSource;Ljava/io/File;La0/k$a;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class n extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final File cacheDirectory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final k.a metadata;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isClosed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public BufferedSource source;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Path file;

    public n(@NotNull BufferedSource bufferedSource, @NotNull File file, @Nullable k.a aVar) {
        super(null);
        this.cacheDirectory = file;
        this.metadata = aVar;
        this.source = bufferedSource;
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("cacheDirectory must be a directory.".toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.isClosed = true;
        BufferedSource bufferedSource = this.source;
        if (bufferedSource != null) {
            o0.i.d(bufferedSource);
        }
        Path path = this.file;
        if (path != null) {
            l().delete(path);
        }
    }

    @Override // a0.k
    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public k.a getMetadata() {
        return this.metadata;
    }

    @Override // a0.k
    @NotNull
    public synchronized BufferedSource h() {
        k();
        BufferedSource bufferedSource = this.source;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        FileSystem fileSystemL = l();
        Path path = this.file;
        p.h(path);
        BufferedSource bufferedSourceBuffer = Okio.buffer(fileSystemL.source(path));
        this.source = bufferedSourceBuffer;
        return bufferedSourceBuffer;
    }

    public final void k() {
        if (!(!this.isClosed)) {
            throw new IllegalStateException("closed".toString());
        }
    }

    @NotNull
    public FileSystem l() {
        return FileSystem.SYSTEM;
    }
}
