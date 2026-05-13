package io.bidmachine.util.file;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bo.a0;
import com.ironsource.Y5;
import java.io.File;
import kotlin.Metadata;
import on.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: FileUtils.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\u0000\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\u0000\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\u0000\u001a\u0014\u0010\u000e\u001a\u00020\u0000*\u0004\u0018\u00010\u00002\u0006\u0010\r\u001a\u00020\u0004\u001a\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\u0006\u0010\r\u001a\u00020\u0004\u001a\u0016\u0010\u0011\u001a\u00020\u0000*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u001a\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u0004\u001a\u0012\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000\u001a\u0012\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004\u001a\n\u0010\u0019\u001a\u00020\u0017*\u00020\u0000\u001a\f\u0010\u001a\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u001a\f\u0010\u001c\u001a\u0004\u0018\u00010\u0000*\u00020\u001b\u001a\f\u0010\u001d\u001a\u0004\u0018\u00010\u0000*\u00020\u001b¨\u0006\u001e"}, d2 = {"Ljava/io/File;", "", "existsSafely", "hasContent", "", "prefix", "startWith", "readSafely", "text", "writeSafely", "Landroid/net/Uri;", "toUri", "toUriSafely", "childPathname", "createFile", "createSubDir", "tempFilePrefix", "createTempFile", "url", "createFileByUrl", TypedValues.TransitionType.S_TO, "renameToSafely", "filePrefix", "Lbn/r;", "deleteFiles", "deleteTempFiles", Y5.b.f30718b, "Landroid/content/Context;", "getExternalDir", "getExternalDirDirty", "bidmachine-android-util_d_0_13_0"}, k = 2, mv = {1, 7, 1})
public final class FileUtilsKt {
    @NotNull
    public static final File createFile(@Nullable File file, @NotNull String str) {
        p.k(str, "childPathname");
        return new File(file, str);
    }

    @Nullable
    public static final File createFileByUrl(@Nullable File file, @NotNull String str) {
        p.k(str, "url");
        String strGenerateFileName = FileUtils.generateFileName(str);
        if (strGenerateFileName != null) {
            return createFile(file, strGenerateFileName);
        }
        return null;
    }

    @Nullable
    public static final File createSubDir(@Nullable File file, @NotNull String str) {
        p.k(str, "childPathname");
        File fileCreateFile = createFile(file, str);
        if (existsSafely(fileCreateFile) || fileCreateFile.mkdirs()) {
            return fileCreateFile;
        }
        return null;
    }

    @NotNull
    public static final File createTempFile(@Nullable File file, @NotNull String str) {
        p.k(str, "tempFilePrefix");
        return createFile(file, str + System.nanoTime());
    }

    public static /* synthetic */ File createTempFile$default(File file, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "temp";
        }
        return createTempFile(file, str);
    }

    public static final boolean deleteFile(@Nullable File file) {
        Boolean boolValueOf;
        File[] fileArrListFiles;
        if (file == null || !existsSafely(file)) {
            return true;
        }
        try {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                p.j(fileArrListFiles, "listFiles()");
                for (File file2 : fileArrListFiles) {
                    FileUtils.deleteFile(file2);
                }
            }
            boolValueOf = Boolean.valueOf(file.delete());
        } catch (Throwable unused) {
            boolValueOf = null;
        }
        return p.f(boolValueOf, Boolean.TRUE);
    }

    public static final void deleteFiles(@NotNull File file, @NotNull String str) {
        p.k(file, "<this>");
        p.k(str, "filePrefix");
        new PrefixCleanStrategy(str).clean(file);
    }

    public static final void deleteTempFiles(@NotNull File file) {
        p.k(file, "<this>");
        deleteFiles(file, "temp");
    }

    public static final boolean existsSafely(@NotNull File file) {
        Boolean boolValueOf;
        p.k(file, "<this>");
        try {
            boolValueOf = Boolean.valueOf(file.exists());
        } catch (Throwable unused) {
            boolValueOf = null;
        }
        return p.f(boolValueOf, Boolean.TRUE);
    }

    @Nullable
    public static final File getExternalDir(@NotNull Context context) {
        p.k(context, "<this>");
        if (FileUtils.canUseExternalFilesDir()) {
            return context.getExternalFilesDir(null);
        }
        return null;
    }

    @Nullable
    public static final File getExternalDirDirty(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return null;
            }
            p.j(externalStorageDirectory, "Environment.getExternalS…irectory() ?: return null");
            return new File(externalStorageDirectory, "/Android/data/" + context.getPackageName() + "/files");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean hasContent(@Nullable File file) {
        return file != null && existsSafely(file) && file.length() > 0;
    }

    @Nullable
    public static final String readSafely(@NotNull File file) {
        p.k(file, "<this>");
        try {
            return g.l(file, null, 1, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean renameToSafely(@NotNull File file, @NotNull File file2) {
        Boolean boolValueOf;
        p.k(file, "<this>");
        p.k(file2, TypedValues.TransitionType.S_TO);
        try {
            boolValueOf = Boolean.valueOf(file.renameTo(file2));
        } catch (Throwable unused) {
            boolValueOf = null;
        }
        return p.f(boolValueOf, Boolean.TRUE);
    }

    public static final boolean startWith(@NotNull File file, @NotNull String str) {
        p.k(file, "<this>");
        p.k(str, "prefix");
        String name = file.getName();
        p.j(name, "name");
        return a0.W(name, str, false, 2, null);
    }

    @NotNull
    public static final Uri toUri(@NotNull File file) {
        p.k(file, "<this>");
        Uri uriFromFile = Uri.fromFile(file);
        p.j(uriFromFile, "fromFile(this)");
        return uriFromFile;
    }

    @Nullable
    public static final Uri toUriSafely(@Nullable File file) {
        if (file == null) {
            return null;
        }
        try {
            return toUri(file);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean writeSafely(@NotNull File file, @NotNull String str) {
        p.k(file, "<this>");
        p.k(str, "text");
        Boolean bool = null;
        try {
            g.o(file, str, null, 2, null);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
        }
        return p.f(bool, Boolean.TRUE);
    }
}
