package z5;

import a6.k0;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: SimpleCacheSpan.java */
/* JADX INFO: loaded from: classes11.dex */
public final class m extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f98239h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f98240i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f98241j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public m(String str, long j10, long j11, long j12, @Nullable File file) {
        super(str, j10, j11, j12, file);
    }

    @Nullable
    public static m e(File file, long j10, long j11, h hVar) {
        File file2;
        String strK;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            File fileL = l(file, hVar);
            if (fileL == null) {
                return null;
            }
            file2 = fileL;
            name = fileL.getName();
        }
        Matcher matcher = f98241j.matcher(name);
        if (!matcher.matches() || (strK = hVar.k(Integer.parseInt(matcher.group(1)))) == null) {
            return null;
        }
        long length = j10 == -1 ? file2.length() : j10;
        if (length == 0) {
            return null;
        }
        return new m(strK, Long.parseLong(matcher.group(2)), length, j11 == -9223372036854775807L ? Long.parseLong(matcher.group(3)) : j11, file2);
    }

    @Nullable
    public static m f(File file, long j10, h hVar) {
        return e(file, j10, -9223372036854775807L, hVar);
    }

    public static m g(String str, long j10, long j11) {
        return new m(str, j10, j11, -9223372036854775807L, null);
    }

    public static m i(String str, long j10) {
        return new m(str, j10, -1L, -9223372036854775807L, null);
    }

    public static m j(String str, long j10) {
        return new m(str, j10, -1L, -9223372036854775807L, null);
    }

    public static File k(File file, int i10, long j10, long j11) {
        return new File(file, i10 + "." + j10 + "." + j11 + ".v3.exo");
    }

    @Nullable
    public static File l(File file, h hVar) {
        String strGroup;
        String name = file.getName();
        Matcher matcher = f98240i.matcher(name);
        if (matcher.matches()) {
            strGroup = k0.N0(matcher.group(1));
            if (strGroup == null) {
                return null;
            }
        } else {
            matcher = f98239h.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            strGroup = matcher.group(1);
        }
        File fileK = k((File) a6.a.h(file.getParentFile()), hVar.f(strGroup), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
        if (file.renameTo(fileK)) {
            return fileK;
        }
        return null;
    }

    public m d(File file, long j10) {
        a6.a.f(this.f98208e);
        return new m(this.f98205b, this.f98206c, this.f98207d, j10, file);
    }
}
