package io.bidmachine.util.network;

import android.content.Context;
import com.ironsource.C3978d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.util.UtilsKt;
import io.bidmachine.util.file.FileUtilsKt;
import java.io.File;
import java.io.InputStream;
import java.net.URLConnection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: FileResponseProcessor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/bidmachine/util/network/FileResponseProcessor;", "Lio/bidmachine/util/network/ResponseProcessor;", "Ljava/io/File;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", C3978d4.i.f31327b, "(Landroid/content/Context;Ljava/io/File;)V", "tempDir", "(Landroid/content/Context;Ljava/io/File;Ljava/io/File;)V", "applicationContext", "process", "urlConnection", "Ljava/net/URLConnection;", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FileResponseProcessor implements ResponseProcessor<File> {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final File file;

    @Nullable
    private final File tempDir;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileResponseProcessor(@NotNull Context context, @NotNull File file) {
        this(context, file, null);
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(file, C3978d4.i.f31327b);
    }

    public FileResponseProcessor(@NotNull Context context, @NotNull File file, @Nullable File file2) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(file, C3978d4.i.f31327b);
        this.file = file;
        this.tempDir = file2;
        Context applicationContext = context.getApplicationContext();
        p.j(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
    }

    public /* synthetic */ FileResponseProcessor(Context context, File file, File file2, int i10, i iVar) {
        this(context, file, (i10 & 4) != 0 ? null : file2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.util.network.ResponseProcessor
    @NotNull
    public File process(@NotNull URLConnection urlConnection) throws Throwable {
        p.k(urlConnection, "urlConnection");
        File cacheDir = this.tempDir;
        if (cacheDir == null) {
            cacheDir = this.applicationContext.getCacheDir();
        }
        if (cacheDir == null) {
            throw new IllegalStateException("Can't create temp file, temp dir is null".toString());
        }
        boolean z10 = true;
        File fileCreateTempFile$default = FileUtilsKt.createTempFile$default(cacheDir, null, 1, null);
        long contentLength = urlConnection.getContentLength();
        try {
            InputStream inputStream = urlConnection.getInputStream();
            p.j(inputStream, "urlConnection.getInputStream()");
            if (UtilsKt.readIntoFile(inputStream, fileCreateTempFile$default) != contentLength) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("The downloaded file size does not match the stated size".toString());
            }
            if (!FileUtilsKt.renameToSafely(fileCreateTempFile$default, this.file) && !FileUtilsKt.hasContent(this.file)) {
                throw new IllegalStateException("Can't rename temp file".toString());
            }
            return this.file;
        } catch (Throwable th2) {
            FileUtilsKt.deleteFile(fileCreateTempFile$default);
            throw th2;
        }
    }
}
