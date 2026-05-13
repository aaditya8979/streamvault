package io.bidmachine.util.file;

import android.content.Context;
import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bo.c;
import com.ironsource.C3978d4;
import com.ironsource.Y5;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.util.Utils;
import io.bidmachine.util.UtilsKt;
import java.io.File;
import java.math.BigInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: FileUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0006H\u0007J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0006H\u0007J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0007J\u001c\u0010\u0013\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0006H\u0007J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0007J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0007J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0007J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u0002H\u0007J\u0012\u0010\u001f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010 \u001a\u00020\u0004H\u0007J\u0012\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010\"\u001a\u00020!H\u0007J\u0012\u0010$\u001a\u0004\u0018\u00010\u00022\u0006\u0010\"\u001a\u00020!H\u0007R\u0014\u0010%\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lio/bidmachine/util/file/FileUtils;", "", "Ljava/io/File;", C3978d4.i.f31327b, "", "hasContent", "", "prefix", "startWith", "readSafely", "text", "writeSafely", "Landroid/net/Uri;", "toUri", "toUriSafely", "dir", "childPathname", "createFile", "createSubDir", "createTempFile", "tempFilePrefix", "url", "createFileByUrl", "generateFileName", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "renameToSafely", "filePrefix", "Lbn/r;", "deleteFiles", "deleteTempFiles", Y5.b.f30718b, "canUseExternalFilesDir", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "getExternalDir", "getExternalDirDirty", "TEMP_PREFIX", "Ljava/lang/String;", "<init>", "()V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public final class FileUtils {

    @NotNull
    public static final FileUtils INSTANCE = new FileUtils();

    @NotNull
    public static final String TEMP_PREFIX = "temp";

    private FileUtils() {
    }

    public static final boolean canUseExternalFilesDir() {
        return Utils.isExternalMemoryAvailable();
    }

    @NotNull
    public static final File createFile(@Nullable File dir, @NotNull String childPathname) {
        p.k(childPathname, "childPathname");
        return FileUtilsKt.createFile(dir, childPathname);
    }

    @Nullable
    public static final File createFileByUrl(@Nullable File dir, @NotNull String url) {
        p.k(url, "url");
        return FileUtilsKt.createFileByUrl(dir, url);
    }

    @Nullable
    public static final File createSubDir(@Nullable File dir, @NotNull String childPathname) {
        p.k(childPathname, "childPathname");
        return FileUtilsKt.createSubDir(dir, childPathname);
    }

    @NotNull
    public static final File createTempFile(@Nullable File dir) {
        return createTempFile(dir, "temp");
    }

    @NotNull
    public static final File createTempFile(@Nullable File dir, @NotNull String tempFilePrefix) {
        p.k(tempFilePrefix, "tempFilePrefix");
        return FileUtilsKt.createTempFile(dir, tempFilePrefix);
    }

    public static /* synthetic */ File createTempFile$default(File file, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "temp";
        }
        return createTempFile(file, str);
    }

    public static final boolean deleteFile(@Nullable File file) {
        return FileUtilsKt.deleteFile(file);
    }

    public static final void deleteFiles(@NotNull File file, @NotNull String str) {
        p.k(file, "dir");
        p.k(str, "filePrefix");
        FileUtilsKt.deleteFiles(file, str);
    }

    public static final void deleteTempFiles(@NotNull File file) {
        p.k(file, "dir");
        FileUtilsKt.deleteTempFiles(file);
    }

    @Nullable
    public static final String generateFileName(@NotNull String url) {
        p.k(url, "url");
        byte[] bytes = url.getBytes(c.f5639b);
        p.j(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrApplyMD5 = UtilsKt.applyMD5(bytes);
        if (bArrApplyMD5 == null) {
            return null;
        }
        return new BigInteger(bArrApplyMD5).abs().toString(36);
    }

    @Nullable
    public static final File getExternalDir(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return FileUtilsKt.getExternalDir(context);
    }

    @Nullable
    public static final File getExternalDirDirty(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return FileUtilsKt.getExternalDirDirty(context);
    }

    public static final boolean hasContent(@Nullable File file) {
        return FileUtilsKt.hasContent(file);
    }

    @Nullable
    public static final String readSafely(@NotNull File file) {
        p.k(file, C3978d4.i.f31327b);
        return FileUtilsKt.readSafely(file);
    }

    public static final boolean renameToSafely(@NotNull File from, @NotNull File to2) {
        p.k(from, TypedValues.TransitionType.S_FROM);
        p.k(to2, TypedValues.TransitionType.S_TO);
        return FileUtilsKt.renameToSafely(from, to2);
    }

    public static final boolean startWith(@NotNull File file, @NotNull String prefix) {
        p.k(file, C3978d4.i.f31327b);
        p.k(prefix, "prefix");
        return FileUtilsKt.startWith(file, prefix);
    }

    @NotNull
    public static final Uri toUri(@NotNull File file) {
        p.k(file, C3978d4.i.f31327b);
        return FileUtilsKt.toUri(file);
    }

    @Nullable
    public static final Uri toUriSafely(@Nullable File file) {
        return FileUtilsKt.toUriSafely(file);
    }

    public static final boolean writeSafely(@NotNull File file, @NotNull String text) {
        p.k(file, C3978d4.i.f31327b);
        p.k(text, "text");
        return FileUtilsKt.writeSafely(file, text);
    }
}
