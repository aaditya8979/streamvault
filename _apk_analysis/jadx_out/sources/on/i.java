package on;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bo.d0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.NoSuchFileException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes3.dex */
public class i extends h {
    @NotNull
    public static final File t(@NotNull File file, @NotNull File file2, boolean z10, int i10) throws IOException {
        p.k(file, "<this>");
        p.k(file2, TypedValues.AttributesType.S_TARGET);
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists()) {
            if (!z10) {
                throw new FileAlreadyExistsException(file, file2, "The destination file already exists.");
            }
            if (!file2.delete()) {
                throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    a.a(fileInputStream, fileOutputStream, i10);
                    b.a(fileOutputStream, null);
                    b.a(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } else if (!file2.mkdirs()) {
            throw new FileSystemException(file, file2, "Failed to create target directory.");
        }
        return file2;
    }

    public static /* synthetic */ File u(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return t(file, file2, z10, i10);
    }

    @NotNull
    public static final String v(@NotNull File file) {
        p.k(file, "<this>");
        String name = file.getName();
        p.j(name, "getName(...)");
        return d0.f1(name, '.', "");
    }

    @NotNull
    public static final File w(@NotNull File file, @NotNull File file2) {
        p.k(file, "<this>");
        p.k(file2, "relative");
        if (e.b(file2)) {
            return file2;
        }
        String string = file.toString();
        p.j(string, "toString(...)");
        if ((string.length() == 0) || d0.h0(string, File.separatorChar, false, 2, null)) {
            return new File(string + file2);
        }
        return new File(string + File.separatorChar + file2);
    }

    @NotNull
    public static final File x(@NotNull File file, @NotNull String str) {
        p.k(file, "<this>");
        p.k(str, "relative");
        return w(file, new File(str));
    }
}
